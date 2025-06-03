package com.google.android.exoplayer2.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SlidingPercentile
{
  private static final Comparator<Sample> INDEX_COMPARATOR = new b(0);
  private static final int MAX_RECYCLED_SAMPLES = 5;
  private static final int SORT_ORDER_BY_INDEX = 1;
  private static final int SORT_ORDER_BY_VALUE = 0;
  private static final int SORT_ORDER_NONE = -1;
  private static final Comparator<Sample> VALUE_COMPARATOR = new b(1);
  private int currentSortOrder;
  private final int maxWeight;
  private int nextSampleIndex;
  private int recycledSampleCount;
  private final Sample[] recycledSamples;
  private final ArrayList<Sample> samples;
  private int totalWeight;
  
  public SlidingPercentile(int paramInt)
  {
    maxWeight = paramInt;
    recycledSamples = new Sample[5];
    samples = new ArrayList();
    currentSortOrder = -1;
  }
  
  private void ensureSortedByIndex()
  {
    if (currentSortOrder != 1)
    {
      Collections.sort(samples, INDEX_COMPARATOR);
      currentSortOrder = 1;
    }
  }
  
  private void ensureSortedByValue()
  {
    if (currentSortOrder != 0)
    {
      Collections.sort(samples, VALUE_COMPARATOR);
      currentSortOrder = 0;
    }
  }
  
  public void addSample(int paramInt, float paramFloat)
  {
    ensureSortedByIndex();
    int i = recycledSampleCount;
    Object localObject;
    if (i > 0)
    {
      localObject = recycledSamples;
      i--;
      recycledSampleCount = i;
      localObject = localObject[i];
    }
    else
    {
      localObject = new Sample(null);
    }
    i = nextSampleIndex;
    nextSampleIndex = (i + 1);
    index = i;
    weight = paramInt;
    value = paramFloat;
    samples.add(localObject);
    totalWeight += paramInt;
    for (;;)
    {
      paramInt = totalWeight;
      i = maxWeight;
      if (paramInt <= i) {
        break;
      }
      paramInt -= i;
      localObject = (Sample)samples.get(0);
      i = weight;
      if (i <= paramInt)
      {
        totalWeight -= i;
        samples.remove(0);
        paramInt = recycledSampleCount;
        if (paramInt < 5)
        {
          Sample[] arrayOfSample = recycledSamples;
          recycledSampleCount = (paramInt + 1);
          arrayOfSample[paramInt] = localObject;
        }
      }
      else
      {
        weight = (i - paramInt);
        totalWeight -= paramInt;
      }
    }
  }
  
  public float getPercentile(float paramFloat)
  {
    ensureSortedByValue();
    float f = totalWeight;
    int i = 0;
    int j = 0;
    Object localObject;
    while (i < samples.size())
    {
      localObject = (Sample)samples.get(i);
      j += weight;
      if (j >= paramFloat * f) {
        return value;
      }
      i++;
    }
    if (samples.isEmpty())
    {
      paramFloat = NaN.0F;
    }
    else
    {
      localObject = samples;
      paramFloat = getsize1value;
    }
    return paramFloat;
  }
  
  public static class Sample
  {
    public int index;
    public float value;
    public int weight;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.util.SlidingPercentile
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */