package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.MpegAudioHeader;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.ParsableByteArray;

public final class MpegAudioReader
  implements ElementaryStreamReader
{
  private static final int HEADER_SIZE = 4;
  private static final int STATE_FINDING_HEADER = 0;
  private static final int STATE_READING_FRAME = 2;
  private static final int STATE_READING_HEADER = 1;
  private String formatId;
  private int frameBytesRead;
  private long frameDurationUs;
  private int frameSize;
  private boolean hasOutputFormat;
  private final MpegAudioHeader header;
  private final ParsableByteArray headerScratch;
  private final String language;
  private boolean lastByteWasFF;
  private TrackOutput output;
  private int state = 0;
  private long timeUs;
  
  public MpegAudioReader()
  {
    this(null);
  }
  
  public MpegAudioReader(String paramString)
  {
    ParsableByteArray localParsableByteArray = new ParsableByteArray(4);
    headerScratch = localParsableByteArray;
    data[0] = ((byte)-1);
    header = new MpegAudioHeader();
    language = paramString;
  }
  
  private void findHeader(ParsableByteArray paramParsableByteArray)
  {
    byte[] arrayOfByte = data;
    int i = paramParsableByteArray.getPosition();
    int j = paramParsableByteArray.limit();
    while (i < j)
    {
      int k = arrayOfByte[i];
      boolean bool;
      if ((k & 0xFF) == 255) {
        bool = true;
      } else {
        bool = false;
      }
      if ((lastByteWasFF) && ((k & 0xE0) == 224)) {
        k = 1;
      } else {
        k = 0;
      }
      lastByteWasFF = bool;
      if (k != 0)
      {
        paramParsableByteArray.setPosition(i + 1);
        lastByteWasFF = false;
        headerScratch.data[1] = ((byte)arrayOfByte[i]);
        frameBytesRead = 2;
        state = 1;
        return;
      }
      i++;
    }
    paramParsableByteArray.setPosition(j);
  }
  
  private void readFrameRemainder(ParsableByteArray paramParsableByteArray)
  {
    int i = Math.min(paramParsableByteArray.bytesLeft(), frameSize - frameBytesRead);
    output.sampleData(paramParsableByteArray, i);
    int j = frameBytesRead + i;
    frameBytesRead = j;
    i = frameSize;
    if (j < i) {
      return;
    }
    output.sampleMetadata(timeUs, 1, i, 0, null);
    timeUs += frameDurationUs;
    frameBytesRead = 0;
    state = 0;
  }
  
  private void readHeaderRemainder(ParsableByteArray paramParsableByteArray)
  {
    int i = Math.min(paramParsableByteArray.bytesLeft(), 4 - frameBytesRead);
    paramParsableByteArray.readBytes(headerScratch.data, frameBytesRead, i);
    i = frameBytesRead + i;
    frameBytesRead = i;
    if (i < 4) {
      return;
    }
    headerScratch.setPosition(0);
    if (!MpegAudioHeader.populateHeader(headerScratch.readInt(), header))
    {
      frameBytesRead = 0;
      state = 1;
      return;
    }
    paramParsableByteArray = header;
    frameSize = frameSize;
    if (!hasOutputFormat)
    {
      long l = samplesPerFrame;
      i = sampleRate;
      frameDurationUs = (l * 1000000L / i);
      paramParsableByteArray = Format.createAudioSampleFormat(formatId, mimeType, null, -1, 4096, channels, i, null, null, 0, language);
      output.format(paramParsableByteArray);
      hasOutputFormat = true;
    }
    headerScratch.setPosition(0);
    output.sampleData(headerScratch, 4);
    state = 2;
  }
  
  public void consume(ParsableByteArray paramParsableByteArray)
  {
    while (paramParsableByteArray.bytesLeft() > 0)
    {
      int i = state;
      if (i != 0)
      {
        if (i != 1)
        {
          if (i == 2) {
            readFrameRemainder(paramParsableByteArray);
          } else {
            throw new IllegalStateException();
          }
        }
        else {
          readHeaderRemainder(paramParsableByteArray);
        }
      }
      else {
        findHeader(paramParsableByteArray);
      }
    }
  }
  
  public void createTracks(ExtractorOutput paramExtractorOutput, TsPayloadReader.TrackIdGenerator paramTrackIdGenerator)
  {
    paramTrackIdGenerator.generateNewId();
    formatId = paramTrackIdGenerator.getFormatId();
    output = paramExtractorOutput.track(paramTrackIdGenerator.getTrackId(), 1);
  }
  
  public void packetFinished() {}
  
  public void packetStarted(long paramLong, boolean paramBoolean)
  {
    timeUs = paramLong;
  }
  
  public void seek()
  {
    state = 0;
    frameBytesRead = 0;
    lastByteWasFF = false;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.ts.MpegAudioReader
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */