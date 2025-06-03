package com.google.android.exoplayer2.trackselection;

import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.chunk.MediaChunk;
import com.google.android.exoplayer2.source.chunk.MediaChunkIterator;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import java.util.List;
import java.util.Random;

public final class RandomTrackSelection
  extends BaseTrackSelection
{
  private final Random random;
  private int selectedIndex;
  
  public RandomTrackSelection(TrackGroup paramTrackGroup, int... paramVarArgs)
  {
    super(paramTrackGroup, paramVarArgs);
    paramTrackGroup = new Random();
    random = paramTrackGroup;
    selectedIndex = paramTrackGroup.nextInt(length);
  }
  
  public RandomTrackSelection(TrackGroup paramTrackGroup, int[] paramArrayOfInt, long paramLong)
  {
    this(paramTrackGroup, paramArrayOfInt, new Random(paramLong));
  }
  
  public RandomTrackSelection(TrackGroup paramTrackGroup, int[] paramArrayOfInt, Random paramRandom)
  {
    super(paramTrackGroup, paramArrayOfInt);
    random = paramRandom;
    selectedIndex = paramRandom.nextInt(length);
  }
  
  public int getSelectedIndex()
  {
    return selectedIndex;
  }
  
  @Nullable
  public Object getSelectionData()
  {
    return null;
  }
  
  public int getSelectionReason()
  {
    return 3;
  }
  
  public void updateSelectedTrack(long paramLong1, long paramLong2, long paramLong3, List<? extends MediaChunk> paramList, MediaChunkIterator[] paramArrayOfMediaChunkIterator)
  {
    paramLong1 = SystemClock.elapsedRealtime();
    int i = 0;
    int j = 0;
    int m;
    for (int k = j; j < length; k = m)
    {
      m = k;
      if (!isBlacklisted(j, paramLong1)) {
        m = k + 1;
      }
      j++;
    }
    selectedIndex = random.nextInt(k);
    if (k != length)
    {
      m = 0;
      j = i;
      while (j < length)
      {
        k = m;
        if (!isBlacklisted(j, paramLong1))
        {
          if (selectedIndex == m)
          {
            selectedIndex = j;
            return;
          }
          k = m + 1;
        }
        j++;
        m = k;
      }
    }
  }
  
  public static final class Factory
    implements TrackSelection.Factory
  {
    private final Random random;
    
    public Factory()
    {
      random = new Random();
    }
    
    public Factory(int paramInt)
    {
      random = new Random(paramInt);
    }
    
    public RandomTrackSelection createTrackSelection(TrackGroup paramTrackGroup, BandwidthMeter paramBandwidthMeter, int... paramVarArgs)
    {
      return new RandomTrackSelection(paramTrackGroup, paramVarArgs, random);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.trackselection.RandomTrackSelection
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */