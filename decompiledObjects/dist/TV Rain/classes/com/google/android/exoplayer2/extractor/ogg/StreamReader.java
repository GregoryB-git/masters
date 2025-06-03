package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekMap.Unseekable;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.IOException;

abstract class StreamReader
{
  private static final int STATE_END_OF_INPUT = 3;
  private static final int STATE_READ_HEADERS = 0;
  private static final int STATE_READ_PAYLOAD = 2;
  private static final int STATE_SKIP_HEADERS = 1;
  private long currentGranule;
  private ExtractorOutput extractorOutput;
  private boolean formatSet;
  private long lengthOfReadPacket;
  private final OggPacket oggPacket = new OggPacket();
  private OggSeeker oggSeeker;
  private long payloadStartPosition;
  private int sampleRate;
  private boolean seekMapSet;
  private SetupData setupData;
  private int state;
  private long targetGranule;
  private TrackOutput trackOutput;
  
  private int readHeaders(ExtractorInput paramExtractorInput)
    throws IOException, InterruptedException
  {
    boolean bool1 = true;
    while (bool1)
    {
      if (!oggPacket.populate(paramExtractorInput))
      {
        state = 3;
        return -1;
      }
      lengthOfReadPacket = (paramExtractorInput.getPosition() - payloadStartPosition);
      boolean bool2 = readHeaders(oggPacket.getPayload(), payloadStartPosition, setupData);
      bool1 = bool2;
      if (bool2)
      {
        payloadStartPosition = paramExtractorInput.getPosition();
        bool1 = bool2;
      }
    }
    Object localObject = setupData.format;
    sampleRate = sampleRate;
    if (!formatSet)
    {
      trackOutput.format((Format)localObject);
      formatSet = true;
    }
    localObject = setupData.oggSeeker;
    if (localObject != null)
    {
      oggSeeker = ((OggSeeker)localObject);
    }
    else if (paramExtractorInput.getLength() == -1L)
    {
      oggSeeker = new UnseekableOggSeeker(null);
    }
    else
    {
      localObject = oggPacket.getPageHeader();
      if ((type & 0x4) != 0) {
        bool1 = true;
      } else {
        bool1 = false;
      }
      oggSeeker = new DefaultOggSeeker(payloadStartPosition, paramExtractorInput.getLength(), this, headerSize + bodySize, granulePosition, bool1);
    }
    setupData = null;
    state = 2;
    oggPacket.trimPayload();
    return 0;
  }
  
  private int readPayload(ExtractorInput paramExtractorInput, PositionHolder paramPositionHolder)
    throws IOException, InterruptedException
  {
    long l1 = oggSeeker.read(paramExtractorInput);
    if (l1 >= 0L)
    {
      position = l1;
      return 1;
    }
    if (l1 < -1L) {
      onSeekEnd(-(l1 + 2L));
    }
    if (!seekMapSet)
    {
      paramPositionHolder = oggSeeker.createSeekMap();
      extractorOutput.seekMap(paramPositionHolder);
      seekMapSet = true;
    }
    if ((lengthOfReadPacket <= 0L) && (!oggPacket.populate(paramExtractorInput)))
    {
      state = 3;
      return -1;
    }
    lengthOfReadPacket = 0L;
    paramExtractorInput = oggPacket.getPayload();
    l1 = preparePayload(paramExtractorInput);
    if (l1 >= 0L)
    {
      long l2 = currentGranule;
      if (l2 + l1 >= targetGranule)
      {
        l2 = convertGranuleToTime(l2);
        trackOutput.sampleData(paramExtractorInput, paramExtractorInput.limit());
        trackOutput.sampleMetadata(l2, 1, paramExtractorInput.limit(), 0, null);
        targetGranule = -1L;
      }
    }
    currentGranule += l1;
    return 0;
  }
  
  public long convertGranuleToTime(long paramLong)
  {
    return paramLong * 1000000L / sampleRate;
  }
  
  public long convertTimeToGranule(long paramLong)
  {
    return sampleRate * paramLong / 1000000L;
  }
  
  public void init(ExtractorOutput paramExtractorOutput, TrackOutput paramTrackOutput)
  {
    extractorOutput = paramExtractorOutput;
    trackOutput = paramTrackOutput;
    reset(true);
  }
  
  public void onSeekEnd(long paramLong)
  {
    currentGranule = paramLong;
  }
  
  public abstract long preparePayload(ParsableByteArray paramParsableByteArray);
  
  public final int read(ExtractorInput paramExtractorInput, PositionHolder paramPositionHolder)
    throws IOException, InterruptedException
  {
    int i = state;
    if (i != 0)
    {
      if (i != 1)
      {
        if (i == 2) {
          return readPayload(paramExtractorInput, paramPositionHolder);
        }
        throw new IllegalStateException();
      }
      paramExtractorInput.skipFully((int)payloadStartPosition);
      state = 2;
      return 0;
    }
    return readHeaders(paramExtractorInput);
  }
  
  public abstract boolean readHeaders(ParsableByteArray paramParsableByteArray, long paramLong, SetupData paramSetupData)
    throws IOException, InterruptedException;
  
  public void reset(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      setupData = new SetupData();
      payloadStartPosition = 0L;
      state = 0;
    }
    else
    {
      state = 1;
    }
    targetGranule = -1L;
    currentGranule = 0L;
  }
  
  public final void seek(long paramLong1, long paramLong2)
  {
    oggPacket.reset();
    if (paramLong1 == 0L)
    {
      reset(seekMapSet ^ true);
    }
    else if (state != 0)
    {
      targetGranule = oggSeeker.startSeek(paramLong2);
      state = 2;
    }
  }
  
  public static class SetupData
  {
    public Format format;
    public OggSeeker oggSeeker;
  }
  
  public static final class UnseekableOggSeeker
    implements OggSeeker
  {
    public SeekMap createSeekMap()
    {
      return new SeekMap.Unseekable(-9223372036854775807L);
    }
    
    public long read(ExtractorInput paramExtractorInput)
      throws IOException, InterruptedException
    {
      return -1L;
    }
    
    public long startSeek(long paramLong)
    {
      return 0L;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.ogg.StreamReader
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */