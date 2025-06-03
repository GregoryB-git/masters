package com.google.android.exoplayer2.source.dash.manifest;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.offline.FilterableManifest;
import com.google.android.exoplayer2.offline.StreamKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class DashManifest
  implements FilterableManifest<DashManifest>
{
  public final long availabilityStartTimeMs;
  public final long durationMs;
  public final boolean dynamic;
  public final Uri location;
  public final long minBufferTimeMs;
  public final long minUpdatePeriodMs;
  private final List<Period> periods;
  @Nullable
  public final ProgramInformation programInformation;
  public final long publishTimeMs;
  public final long suggestedPresentationDelayMs;
  public final long timeShiftBufferDepthMs;
  public final UtcTimingElement utcTiming;
  
  public DashManifest(long paramLong1, long paramLong2, long paramLong3, boolean paramBoolean, long paramLong4, long paramLong5, long paramLong6, long paramLong7, @Nullable ProgramInformation paramProgramInformation, UtcTimingElement paramUtcTimingElement, Uri paramUri, List<Period> paramList)
  {
    availabilityStartTimeMs = paramLong1;
    durationMs = paramLong2;
    minBufferTimeMs = paramLong3;
    dynamic = paramBoolean;
    minUpdatePeriodMs = paramLong4;
    timeShiftBufferDepthMs = paramLong5;
    suggestedPresentationDelayMs = paramLong6;
    publishTimeMs = paramLong7;
    programInformation = paramProgramInformation;
    utcTiming = paramUtcTimingElement;
    location = paramUri;
    if (paramList == null) {
      paramProgramInformation = Collections.emptyList();
    } else {
      paramProgramInformation = paramList;
    }
    periods = paramProgramInformation;
  }
  
  @Deprecated
  public DashManifest(long paramLong1, long paramLong2, long paramLong3, boolean paramBoolean, long paramLong4, long paramLong5, long paramLong6, long paramLong7, UtcTimingElement paramUtcTimingElement, Uri paramUri, List<Period> paramList)
  {
    this(paramLong1, paramLong2, paramLong3, paramBoolean, paramLong4, paramLong5, paramLong6, paramLong7, null, paramUtcTimingElement, paramUri, paramList);
  }
  
  private static ArrayList<AdaptationSet> copyAdaptationSets(List<AdaptationSet> paramList, LinkedList<StreamKey> paramLinkedList)
  {
    Object localObject = (StreamKey)paramLinkedList.poll();
    int i = periodIndex;
    ArrayList localArrayList1 = new ArrayList();
    StreamKey localStreamKey;
    do
    {
      int j = groupIndex;
      AdaptationSet localAdaptationSet = (AdaptationSet)paramList.get(j);
      List localList = representations;
      ArrayList localArrayList2 = new ArrayList();
      do
      {
        localArrayList2.add((Representation)localList.get(trackIndex));
        localStreamKey = (StreamKey)paramLinkedList.poll();
        if (periodIndex != i) {
          break;
        }
        localObject = localStreamKey;
      } while (groupIndex == j);
      localArrayList1.add(new AdaptationSet(id, type, localArrayList2, accessibilityDescriptors, supplementalProperties));
      localObject = localStreamKey;
    } while (periodIndex == i);
    paramLinkedList.addFirst(localStreamKey);
    return localArrayList1;
  }
  
  public final DashManifest copy(List<StreamKey> paramList)
  {
    LinkedList localLinkedList = new LinkedList(paramList);
    Collections.sort(localLinkedList);
    localLinkedList.add(new StreamKey(-1, -1, -1));
    ArrayList localArrayList1 = new ArrayList();
    long l1 = 0L;
    int i = 0;
    long l2;
    for (;;)
    {
      int j = getPeriodCount();
      l2 = -9223372036854775807L;
      if (i >= j) {
        break;
      }
      if (peekperiodIndex != i)
      {
        l3 = getPeriodDurationMs(i);
        l2 = l1;
        if (l3 != -9223372036854775807L) {
          l2 = l1 + l3;
        }
      }
      else
      {
        paramList = getPeriod(i);
        ArrayList localArrayList2 = copyAdaptationSets(adaptationSets, localLinkedList);
        localArrayList1.add(new Period(id, startMs - l1, localArrayList2, eventStreams));
        l2 = l1;
      }
      i++;
      l1 = l2;
    }
    long l3 = durationMs;
    if (l3 != -9223372036854775807L) {
      l2 = l3 - l1;
    }
    return new DashManifest(availabilityStartTimeMs, l2, minBufferTimeMs, dynamic, minUpdatePeriodMs, timeShiftBufferDepthMs, suggestedPresentationDelayMs, publishTimeMs, programInformation, utcTiming, location, localArrayList1);
  }
  
  public final Period getPeriod(int paramInt)
  {
    return (Period)periods.get(paramInt);
  }
  
  public final int getPeriodCount()
  {
    return periods.size();
  }
  
  public final long getPeriodDurationMs(int paramInt)
  {
    int i = periods.size();
    long l1 = -9223372036854775807L;
    if (paramInt == i - 1)
    {
      long l2 = durationMs;
      if (l2 != -9223372036854775807L) {
        l1 = l2 - periods.get(paramInt)).startMs;
      }
    }
    else
    {
      l1 = periods.get(paramInt + 1)).startMs - periods.get(paramInt)).startMs;
    }
    return l1;
  }
  
  public final long getPeriodDurationUs(int paramInt)
  {
    return C.msToUs(getPeriodDurationMs(paramInt));
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.dash.manifest.DashManifest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */