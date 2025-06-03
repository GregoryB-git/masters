package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.Collections;
import java.util.List;

public final class DvbSubtitleReader
  implements ElementaryStreamReader
{
  private int bytesToCheck;
  private final TrackOutput[] outputs;
  private int sampleBytesWritten;
  private long sampleTimeUs;
  private final List<TsPayloadReader.DvbSubtitleInfo> subtitleInfos;
  private boolean writingSample;
  
  public DvbSubtitleReader(List<TsPayloadReader.DvbSubtitleInfo> paramList)
  {
    subtitleInfos = paramList;
    outputs = new TrackOutput[paramList.size()];
  }
  
  private boolean checkNextByte(ParsableByteArray paramParsableByteArray, int paramInt)
  {
    if (paramParsableByteArray.bytesLeft() == 0) {
      return false;
    }
    if (paramParsableByteArray.readUnsignedByte() != paramInt) {
      writingSample = false;
    }
    bytesToCheck -= 1;
    return writingSample;
  }
  
  public void consume(ParsableByteArray paramParsableByteArray)
  {
    if (writingSample)
    {
      if ((bytesToCheck == 2) && (!checkNextByte(paramParsableByteArray, 32))) {
        return;
      }
      int i = bytesToCheck;
      int j = 0;
      if ((i == 1) && (!checkNextByte(paramParsableByteArray, 0))) {
        return;
      }
      i = paramParsableByteArray.getPosition();
      int k = paramParsableByteArray.bytesLeft();
      TrackOutput[] arrayOfTrackOutput = outputs;
      int m = arrayOfTrackOutput.length;
      while (j < m)
      {
        TrackOutput localTrackOutput = arrayOfTrackOutput[j];
        paramParsableByteArray.setPosition(i);
        localTrackOutput.sampleData(paramParsableByteArray, k);
        j++;
      }
      sampleBytesWritten += k;
    }
  }
  
  public void createTracks(ExtractorOutput paramExtractorOutput, TsPayloadReader.TrackIdGenerator paramTrackIdGenerator)
  {
    for (int i = 0; i < outputs.length; i++)
    {
      TsPayloadReader.DvbSubtitleInfo localDvbSubtitleInfo = (TsPayloadReader.DvbSubtitleInfo)subtitleInfos.get(i);
      paramTrackIdGenerator.generateNewId();
      TrackOutput localTrackOutput = paramExtractorOutput.track(paramTrackIdGenerator.getTrackId(), 3);
      localTrackOutput.format(Format.createImageSampleFormat(paramTrackIdGenerator.getFormatId(), "application/dvbsubs", null, -1, 0, Collections.singletonList(initializationData), language, null));
      outputs[i] = localTrackOutput;
    }
  }
  
  public void packetFinished()
  {
    if (writingSample)
    {
      TrackOutput[] arrayOfTrackOutput = outputs;
      int i = arrayOfTrackOutput.length;
      for (int j = 0; j < i; j++) {
        arrayOfTrackOutput[j].sampleMetadata(sampleTimeUs, 1, sampleBytesWritten, 0, null);
      }
      writingSample = false;
    }
  }
  
  public void packetStarted(long paramLong, boolean paramBoolean)
  {
    if (!paramBoolean) {
      return;
    }
    writingSample = true;
    sampleTimeUs = paramLong;
    sampleBytesWritten = 0;
    bytesToCheck = 2;
  }
  
  public void seek()
  {
    writingSample = false;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.ts.DvbSubtitleReader
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */