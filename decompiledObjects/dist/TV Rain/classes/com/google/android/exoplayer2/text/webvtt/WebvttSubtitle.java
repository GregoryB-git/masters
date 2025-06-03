package com.google.android.exoplayer2.text.webvtt;

import android.text.SpannableStringBuilder;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

final class WebvttSubtitle
  implements Subtitle
{
  private final long[] cueTimesUs;
  private final List<WebvttCue> cues;
  private final int numCues;
  private final long[] sortedCueTimesUs;
  
  public WebvttSubtitle(List<WebvttCue> paramList)
  {
    cues = paramList;
    int i = paramList.size();
    numCues = i;
    cueTimesUs = new long[i * 2];
    for (i = 0; i < numCues; i++)
    {
      WebvttCue localWebvttCue = (WebvttCue)paramList.get(i);
      int j = i * 2;
      long[] arrayOfLong = cueTimesUs;
      arrayOfLong[j] = startTime;
      arrayOfLong[(j + 1)] = endTime;
    }
    paramList = cueTimesUs;
    paramList = Arrays.copyOf(paramList, paramList.length);
    sortedCueTimesUs = paramList;
    Arrays.sort(paramList);
  }
  
  public List<Cue> getCues(long paramLong)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    int i = 0;
    Object localObject3 = localObject2;
    while (i < numCues)
    {
      long[] arrayOfLong = cueTimesUs;
      int j = i * 2;
      Object localObject4 = localObject1;
      Object localObject5 = localObject3;
      Object localObject6 = localObject2;
      if (arrayOfLong[j] <= paramLong)
      {
        localObject4 = localObject1;
        localObject5 = localObject3;
        localObject6 = localObject2;
        if (paramLong < arrayOfLong[(j + 1)])
        {
          localObject6 = localObject2;
          if (localObject2 == null) {
            localObject6 = new ArrayList();
          }
          localObject5 = (WebvttCue)cues.get(i);
          if (((WebvttCue)localObject5).isNormalCue())
          {
            if (localObject3 == null)
            {
              localObject4 = localObject1;
            }
            else if (localObject1 == null)
            {
              localObject4 = new SpannableStringBuilder();
              ((SpannableStringBuilder)localObject4).append(text).append("\n").append(text);
              localObject5 = localObject3;
            }
            else
            {
              ((SpannableStringBuilder)localObject1).append("\n").append(text);
              localObject4 = localObject1;
              localObject5 = localObject3;
            }
          }
          else
          {
            ((ArrayList)localObject6).add(localObject5);
            localObject5 = localObject3;
            localObject4 = localObject1;
          }
        }
      }
      i++;
      localObject1 = localObject4;
      localObject3 = localObject5;
      localObject2 = localObject6;
    }
    if (localObject1 != null) {
      ((ArrayList)localObject2).add(new WebvttCue((CharSequence)localObject1));
    } else if (localObject3 != null) {
      ((ArrayList)localObject2).add(localObject3);
    }
    if (localObject2 != null) {
      return (List<Cue>)localObject2;
    }
    return Collections.emptyList();
  }
  
  public long getEventTime(int paramInt)
  {
    boolean bool1 = true;
    boolean bool2;
    if (paramInt >= 0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    Assertions.checkArgument(bool2);
    if (paramInt < sortedCueTimesUs.length) {
      bool2 = bool1;
    } else {
      bool2 = false;
    }
    Assertions.checkArgument(bool2);
    return sortedCueTimesUs[paramInt];
  }
  
  public int getEventTimeCount()
  {
    return sortedCueTimesUs.length;
  }
  
  public int getNextEventTimeIndex(long paramLong)
  {
    int i = Util.binarySearchCeil(sortedCueTimesUs, paramLong, false, false);
    if (i >= sortedCueTimesUs.length) {
      i = -1;
    }
    return i;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.text.webvtt.WebvttSubtitle
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */