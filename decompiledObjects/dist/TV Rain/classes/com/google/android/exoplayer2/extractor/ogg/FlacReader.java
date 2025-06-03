package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekMap.SeekPoints;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.util.FlacStreamInfo;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

final class FlacReader
  extends StreamReader
{
  private static final byte AUDIO_PACKET_TYPE = -1;
  private static final int FRAME_HEADER_SAMPLE_NUMBER_OFFSET = 4;
  private static final byte SEEKTABLE_PACKET_TYPE = 3;
  private FlacOggSeeker flacOggSeeker;
  private FlacStreamInfo streamInfo;
  
  private int getFlacFrameBlockSize(ParsableByteArray paramParsableByteArray)
  {
    int i = (data[2] & 0xFF) >> 4;
    int j;
    switch (i)
    {
    default: 
      return -1;
    case 8: 
    case 9: 
    case 10: 
    case 11: 
    case 12: 
    case 13: 
    case 14: 
    case 15: 
      j = 256;
      i -= 8;
    case 6: 
    case 7: 
    case 2: 
    case 3: 
    case 4: 
    case 5: 
      for (;;)
      {
        return j << i;
        paramParsableByteArray.skipBytes(4);
        paramParsableByteArray.readUtf8EncodedLong();
        if (i == 6) {
          i = paramParsableByteArray.readUnsignedByte();
        } else {
          i = paramParsableByteArray.readUnsignedShort();
        }
        paramParsableByteArray.setPosition(0);
        return i + 1;
        j = 576;
        i -= 2;
      }
    }
    return 192;
  }
  
  private static boolean isAudioPacket(byte[] paramArrayOfByte)
  {
    boolean bool = false;
    if (paramArrayOfByte[0] == -1) {
      bool = true;
    }
    return bool;
  }
  
  public static boolean verifyBitstreamType(ParsableByteArray paramParsableByteArray)
  {
    boolean bool;
    if ((paramParsableByteArray.bytesLeft() >= 5) && (paramParsableByteArray.readUnsignedByte() == 127) && (paramParsableByteArray.readUnsignedInt() == 1179402563L)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public long preparePayload(ParsableByteArray paramParsableByteArray)
  {
    if (!isAudioPacket(data)) {
      return -1L;
    }
    return getFlacFrameBlockSize(paramParsableByteArray);
  }
  
  public boolean readHeaders(ParsableByteArray paramParsableByteArray, long paramLong, StreamReader.SetupData paramSetupData)
    throws IOException, InterruptedException
  {
    Object localObject = data;
    if (streamInfo == null)
    {
      streamInfo = new FlacStreamInfo((byte[])localObject, 17);
      paramParsableByteArray = Arrays.copyOfRange((byte[])localObject, 9, paramParsableByteArray.limit());
      paramParsableByteArray[4] = ((byte)Byte.MIN_VALUE);
      paramParsableByteArray = Collections.singletonList(paramParsableByteArray);
      int i = streamInfo.bitRate();
      localObject = streamInfo;
      format = Format.createAudioSampleFormat(null, "audio/flac", null, -1, i, channels, sampleRate, paramParsableByteArray, null, 0, null);
    }
    else if ((localObject[0] & 0x7F) == 3)
    {
      paramSetupData = new FlacOggSeeker();
      flacOggSeeker = paramSetupData;
      paramSetupData.parseSeekTable(paramParsableByteArray);
    }
    else if (isAudioPacket((byte[])localObject))
    {
      paramParsableByteArray = flacOggSeeker;
      if (paramParsableByteArray != null)
      {
        paramParsableByteArray.setFirstFrameOffset(paramLong);
        oggSeeker = flacOggSeeker;
      }
      return false;
    }
    return true;
  }
  
  public void reset(boolean paramBoolean)
  {
    super.reset(paramBoolean);
    if (paramBoolean)
    {
      streamInfo = null;
      flacOggSeeker = null;
    }
  }
  
  public class FlacOggSeeker
    implements OggSeeker, SeekMap
  {
    private static final int METADATA_LENGTH_OFFSET = 1;
    private static final int SEEK_POINT_SIZE = 18;
    private long firstFrameOffset = -1L;
    private long pendingSeekGranule = -1L;
    private long[] seekPointGranules;
    private long[] seekPointOffsets;
    
    public FlacOggSeeker() {}
    
    public SeekMap createSeekMap()
    {
      return this;
    }
    
    public long getDurationUs()
    {
      return FlacReader.access$000(FlacReader.this).durationUs();
    }
    
    public SeekMap.SeekPoints getSeekPoints(long paramLong)
    {
      long l = convertTimeToGranule(paramLong);
      int i = Util.binarySearchFloor(seekPointGranules, l, true, true);
      l = convertGranuleToTime(seekPointGranules[i]);
      SeekPoint localSeekPoint = new SeekPoint(l, firstFrameOffset + seekPointOffsets[i]);
      if (l < paramLong)
      {
        long[] arrayOfLong = seekPointGranules;
        if (i != arrayOfLong.length - 1)
        {
          FlacReader localFlacReader = FlacReader.this;
          i++;
          return new SeekMap.SeekPoints(localSeekPoint, new SeekPoint(localFlacReader.convertGranuleToTime(arrayOfLong[i]), firstFrameOffset + seekPointOffsets[i]));
        }
      }
      return new SeekMap.SeekPoints(localSeekPoint);
    }
    
    public boolean isSeekable()
    {
      return true;
    }
    
    public void parseSeekTable(ParsableByteArray paramParsableByteArray)
    {
      paramParsableByteArray.skipBytes(1);
      int i = paramParsableByteArray.readUnsignedInt24() / 18;
      seekPointGranules = new long[i];
      seekPointOffsets = new long[i];
      for (int j = 0; j < i; j++)
      {
        seekPointGranules[j] = paramParsableByteArray.readLong();
        seekPointOffsets[j] = paramParsableByteArray.readLong();
        paramParsableByteArray.skipBytes(2);
      }
    }
    
    public long read(ExtractorInput paramExtractorInput)
      throws IOException, InterruptedException
    {
      long l = pendingSeekGranule;
      if (l >= 0L)
      {
        l = -(l + 2L);
        pendingSeekGranule = -1L;
        return l;
      }
      return -1L;
    }
    
    public void setFirstFrameOffset(long paramLong)
    {
      firstFrameOffset = paramLong;
    }
    
    public long startSeek(long paramLong)
    {
      paramLong = convertTimeToGranule(paramLong);
      int i = Util.binarySearchFloor(seekPointGranules, paramLong, true, true);
      pendingSeekGranule = seekPointGranules[i];
      return paramLong;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.ogg.FlacReader
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */