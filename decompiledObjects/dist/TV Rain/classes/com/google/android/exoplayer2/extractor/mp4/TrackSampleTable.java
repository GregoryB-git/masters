package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;

final class TrackSampleTable
{
  public final long durationUs;
  public final int[] flags;
  public final int maximumSize;
  public final long[] offsets;
  public final int sampleCount;
  public final int[] sizes;
  public final long[] timestampsUs;
  public final Track track;
  
  public TrackSampleTable(Track paramTrack, long[] paramArrayOfLong1, int[] paramArrayOfInt1, int paramInt, long[] paramArrayOfLong2, int[] paramArrayOfInt2, long paramLong)
  {
    int i = paramArrayOfInt1.length;
    int j = paramArrayOfLong2.length;
    boolean bool1 = true;
    boolean bool2;
    if (i == j) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    Assertions.checkArgument(bool2);
    if (paramArrayOfLong1.length == paramArrayOfLong2.length) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    Assertions.checkArgument(bool2);
    if (paramArrayOfInt2.length == paramArrayOfLong2.length) {
      bool2 = bool1;
    } else {
      bool2 = false;
    }
    Assertions.checkArgument(bool2);
    track = paramTrack;
    offsets = paramArrayOfLong1;
    sizes = paramArrayOfInt1;
    maximumSize = paramInt;
    timestampsUs = paramArrayOfLong2;
    flags = paramArrayOfInt2;
    durationUs = paramLong;
    sampleCount = paramArrayOfLong1.length;
  }
  
  public int getIndexOfEarlierOrEqualSynchronizationSample(long paramLong)
  {
    for (int i = Util.binarySearchFloor(timestampsUs, paramLong, true, false); i >= 0; i--) {
      if ((flags[i] & 0x1) != 0) {
        return i;
      }
    }
    return -1;
  }
  
  public int getIndexOfLaterOrEqualSynchronizationSample(long paramLong)
  {
    for (int i = Util.binarySearchCeil(timestampsUs, paramLong, true, false); i < timestampsUs.length; i++) {
      if ((flags[i] & 0x1) != 0) {
        return i;
      }
    }
    return -1;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.mp4.TrackSampleTable
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */