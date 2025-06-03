package com.google.android.exoplayer2.extractor.mp3;

import android.util.Pair;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.SeekMap.SeekPoints;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import com.google.android.exoplayer2.util.Util;

final class MlltSeeker
  implements Mp3Extractor.Seeker
{
  private final long durationUs;
  private final long[] referencePositions;
  private final long[] referenceTimesMs;
  
  private MlltSeeker(long[] paramArrayOfLong1, long[] paramArrayOfLong2)
  {
    referencePositions = paramArrayOfLong1;
    referenceTimesMs = paramArrayOfLong2;
    durationUs = C.msToUs(paramArrayOfLong2[(paramArrayOfLong2.length - 1)]);
  }
  
  public static MlltSeeker create(long paramLong, MlltFrame paramMlltFrame)
  {
    int i = bytesDeviations.length;
    int j = i + 1;
    long[] arrayOfLong1 = new long[j];
    long[] arrayOfLong2 = new long[j];
    arrayOfLong1[0] = paramLong;
    long l = 0L;
    arrayOfLong2[0] = 0L;
    for (j = 1; j <= i; j++)
    {
      int k = bytesBetweenReference;
      int[] arrayOfInt = bytesDeviations;
      int m = j - 1;
      paramLong += k + arrayOfInt[m];
      l += millisecondsBetweenReference + millisecondsDeviations[m];
      arrayOfLong1[j] = paramLong;
      arrayOfLong2[j] = l;
    }
    return new MlltSeeker(arrayOfLong1, arrayOfLong2);
  }
  
  private static Pair<Long, Long> linearlyInterpolate(long paramLong, long[] paramArrayOfLong1, long[] paramArrayOfLong2)
  {
    int i = Util.binarySearchFloor(paramArrayOfLong1, paramLong, true, true);
    long l1 = paramArrayOfLong1[i];
    long l2 = paramArrayOfLong2[i];
    i++;
    if (i == paramArrayOfLong1.length) {
      return Pair.create(Long.valueOf(l1), Long.valueOf(l2));
    }
    long l3 = paramArrayOfLong1[i];
    long l4 = paramArrayOfLong2[i];
    double d;
    if (l3 == l1) {
      d = 0.0D;
    } else {
      d = (paramLong - l1) / (l3 - l1);
    }
    return Pair.create(Long.valueOf(paramLong), Long.valueOf((d * (l4 - l2)) + l2));
  }
  
  public long getDataEndPosition()
  {
    return -1L;
  }
  
  public long getDurationUs()
  {
    return durationUs;
  }
  
  public SeekMap.SeekPoints getSeekPoints(long paramLong)
  {
    Pair localPair = linearlyInterpolate(C.usToMs(Util.constrainValue(paramLong, 0L, durationUs)), referenceTimesMs, referencePositions);
    return new SeekMap.SeekPoints(new SeekPoint(C.msToUs(((Long)first).longValue()), ((Long)second).longValue()));
  }
  
  public long getTimeUs(long paramLong)
  {
    return C.msToUs(((Long)linearlyInterpolatereferencePositions, referenceTimesMs).second).longValue());
  }
  
  public boolean isSeekable()
  {
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.mp3.MlltSeeker
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */