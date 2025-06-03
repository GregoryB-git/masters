package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;

public final class Id3Reader
  implements ElementaryStreamReader
{
  private static final int ID3_HEADER_SIZE = 10;
  private static final String TAG = "Id3Reader";
  private final ParsableByteArray id3Header = new ParsableByteArray(10);
  private TrackOutput output;
  private int sampleBytesRead;
  private int sampleSize;
  private long sampleTimeUs;
  private boolean writingSample;
  
  public void consume(ParsableByteArray paramParsableByteArray)
  {
    if (!writingSample) {
      return;
    }
    int i = paramParsableByteArray.bytesLeft();
    int j = sampleBytesRead;
    if (j < 10)
    {
      j = Math.min(i, 10 - j);
      System.arraycopy(data, paramParsableByteArray.getPosition(), id3Header.data, sampleBytesRead, j);
      if (sampleBytesRead + j == 10)
      {
        id3Header.setPosition(0);
        if ((73 == id3Header.readUnsignedByte()) && (68 == id3Header.readUnsignedByte()) && (51 == id3Header.readUnsignedByte()))
        {
          id3Header.skipBytes(3);
          sampleSize = (id3Header.readSynchSafeInt() + 10);
        }
        else
        {
          Log.w("Id3Reader", "Discarding invalid ID3 tag");
          writingSample = false;
          return;
        }
      }
    }
    i = Math.min(i, sampleSize - sampleBytesRead);
    output.sampleData(paramParsableByteArray, i);
    sampleBytesRead += i;
  }
  
  public void createTracks(ExtractorOutput paramExtractorOutput, TsPayloadReader.TrackIdGenerator paramTrackIdGenerator)
  {
    paramTrackIdGenerator.generateNewId();
    paramExtractorOutput = paramExtractorOutput.track(paramTrackIdGenerator.getTrackId(), 4);
    output = paramExtractorOutput;
    paramExtractorOutput.format(Format.createSampleFormat(paramTrackIdGenerator.getFormatId(), "application/id3", null, -1, null));
  }
  
  public void packetFinished()
  {
    if (writingSample)
    {
      int i = sampleSize;
      if ((i != 0) && (sampleBytesRead == i))
      {
        output.sampleMetadata(sampleTimeUs, 1, i, 0, null);
        writingSample = false;
      }
    }
  }
  
  public void packetStarted(long paramLong, boolean paramBoolean)
  {
    if (!paramBoolean) {
      return;
    }
    writingSample = true;
    sampleTimeUs = paramLong;
    sampleSize = 0;
    sampleBytesRead = 0;
  }
  
  public void seek()
  {
    writingSample = false;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.ts.Id3Reader
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */