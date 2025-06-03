package com.google.android.exoplayer2.extractor.mp3;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.extractor.MpegAudioHeader;
import com.google.android.exoplayer2.extractor.SeekMap.SeekPoints;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;

final class VbriSeeker
  implements Mp3Extractor.Seeker
{
  private static final String TAG = "VbriSeeker";
  private final long dataEndPosition;
  private final long durationUs;
  private final long[] positions;
  private final long[] timesUs;
  
  private VbriSeeker(long[] paramArrayOfLong1, long[] paramArrayOfLong2, long paramLong1, long paramLong2)
  {
    timesUs = paramArrayOfLong1;
    positions = paramArrayOfLong2;
    durationUs = paramLong1;
    dataEndPosition = paramLong2;
  }
  
  @Nullable
  public static VbriSeeker create(long paramLong1, long paramLong2, MpegAudioHeader paramMpegAudioHeader, ParsableByteArray paramParsableByteArray)
  {
    paramParsableByteArray.skipBytes(10);
    int i = paramParsableByteArray.readInt();
    if (i <= 0) {
      return null;
    }
    int j = sampleRate;
    long l1 = i;
    if (j >= 32000) {
      i = 1152;
    } else {
      i = 576;
    }
    long l2 = Util.scaleLargeTimestamp(l1, 1000000L * i, j);
    int k = paramParsableByteArray.readUnsignedShort();
    j = paramParsableByteArray.readUnsignedShort();
    int m = paramParsableByteArray.readUnsignedShort();
    paramParsableByteArray.skipBytes(2);
    long l3 = paramLong2 + frameSize;
    paramMpegAudioHeader = new long[k];
    long[] arrayOfLong = new long[k];
    int n = 0;
    l1 = paramLong2;
    paramLong2 = l3;
    while (n < k)
    {
      paramMpegAudioHeader[n] = (n * l2 / k);
      arrayOfLong[n] = Math.max(l1, paramLong2);
      if (m != 1)
      {
        if (m != 2)
        {
          if (m != 3)
          {
            if (m != 4) {
              return null;
            }
            i = paramParsableByteArray.readUnsignedIntToInt();
          }
          else
          {
            i = paramParsableByteArray.readUnsignedInt24();
          }
        }
        else {
          i = paramParsableByteArray.readUnsignedShort();
        }
      }
      else {
        i = paramParsableByteArray.readUnsignedByte();
      }
      l1 += i * j;
      n++;
    }
    if ((paramLong1 != -1L) && (paramLong1 != l1))
    {
      paramParsableByteArray = new StringBuilder();
      paramParsableByteArray.append("VBRI data size mismatch: ");
      paramParsableByteArray.append(paramLong1);
      paramParsableByteArray.append(", ");
      paramParsableByteArray.append(l1);
      Log.w("VbriSeeker", paramParsableByteArray.toString());
    }
    return new VbriSeeker(paramMpegAudioHeader, arrayOfLong, l2, l1);
  }
  
  public long getDataEndPosition()
  {
    return dataEndPosition;
  }
  
  public long getDurationUs()
  {
    return durationUs;
  }
  
  public SeekMap.SeekPoints getSeekPoints(long paramLong)
  {
    int i = Util.binarySearchFloor(timesUs, paramLong, true, true);
    SeekPoint localSeekPoint = new SeekPoint(timesUs[i], positions[i]);
    if ((timeUs < paramLong) && (i != timesUs.length - 1))
    {
      long[] arrayOfLong = timesUs;
      i++;
      return new SeekMap.SeekPoints(localSeekPoint, new SeekPoint(arrayOfLong[i], positions[i]));
    }
    return new SeekMap.SeekPoints(localSeekPoint);
  }
  
  public long getTimeUs(long paramLong)
  {
    return timesUs[Util.binarySearchFloor(positions, paramLong, true, true)];
  }
  
  public boolean isSeekable()
  {
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.mp3.VbriSeeker
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */