package com.google.android.exoplayer2.source.dash;

import com.google.android.exoplayer2.source.dash.manifest.AdaptationSet;
import com.google.android.exoplayer2.source.dash.manifest.Period;
import com.google.android.exoplayer2.source.dash.manifest.Representation;
import java.util.List;

final class DashMediaSource$PeriodSeekInfo
{
  public final long availableEndTimeUs;
  public final long availableStartTimeUs;
  public final boolean isIndexExplicit;
  
  private DashMediaSource$PeriodSeekInfo(boolean paramBoolean, long paramLong1, long paramLong2)
  {
    isIndexExplicit = paramBoolean;
    availableStartTimeUs = paramLong1;
    availableEndTimeUs = paramLong2;
  }
  
  public static PeriodSeekInfo createPeriodSeekInfo(Period paramPeriod, long paramLong)
  {
    int i = adaptationSets.size();
    int j = 0;
    while (j < i)
    {
      k = adaptationSets.get(j)).type;
      if ((k != 1) && (k != 2))
      {
        j++;
      }
      else
      {
        k = 1;
        break label68;
      }
    }
    int k = 0;
    label68:
    long l1 = Long.MAX_VALUE;
    int m = 0;
    j = m;
    int n = j;
    long l2 = 0L;
    while (m < i)
    {
      Object localObject = (AdaptationSet)adaptationSets.get(m);
      if ((k == 0) || (type != 3))
      {
        int i2;
        int i3;
        int i1;
        do
        {
          localObject = ((Representation)representations.get(0)).getIndex();
          if (localObject == null) {
            return new PeriodSeekInfo(true, 0L, paramLong);
          }
          i2 = j | ((DashSegmentIndex)localObject).isExplicit();
          i3 = ((DashSegmentIndex)localObject).getSegmentCount(paramLong);
          if (i3 == 0)
          {
            l1 = 0L;
            l2 = 0L;
            i1 = 1;
            j = i2;
            break;
          }
          j = i2;
        } while (i1 != 0);
        long l3 = ((DashSegmentIndex)localObject).getFirstSegmentNum();
        l2 = Math.max(l2, ((DashSegmentIndex)localObject).getTimeUs(l3));
        if (i3 != -1)
        {
          l3 = l3 + i3 - 1L;
          long l4 = ((DashSegmentIndex)localObject).getTimeUs(l3);
          l1 = Math.min(l1, ((DashSegmentIndex)localObject).getDurationUs(l3, paramLong) + l4);
          j = i2;
        }
        else
        {
          j = i2;
        }
      }
      m++;
    }
    return new PeriodSeekInfo(j, l2, l1);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.dash.DashMediaSource.PeriodSeekInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */