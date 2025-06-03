package com.google.android.exoplayer2.source;

public class CompositeSequenceableLoader
  implements SequenceableLoader
{
  public final SequenceableLoader[] loaders;
  
  public CompositeSequenceableLoader(SequenceableLoader[] paramArrayOfSequenceableLoader)
  {
    loaders = paramArrayOfSequenceableLoader;
  }
  
  public boolean continueLoading(long paramLong)
  {
    int i = 0;
    int m;
    int i3;
    do
    {
      long l1 = getNextLoadPositionUs();
      if (l1 == Long.MIN_VALUE) {
        break;
      }
      SequenceableLoader[] arrayOfSequenceableLoader = loaders;
      int j = arrayOfSequenceableLoader.length;
      int k = 0;
      int i2;
      for (m = k; k < j; m = i2)
      {
        SequenceableLoader localSequenceableLoader = arrayOfSequenceableLoader[k];
        long l2 = localSequenceableLoader.getNextLoadPositionUs();
        int n;
        if ((l2 != Long.MIN_VALUE) && (l2 <= paramLong)) {
          n = 1;
        } else {
          n = 0;
        }
        if (l2 != l1)
        {
          int i1 = m;
          if (n == 0) {}
        }
        else
        {
          i2 = m | localSequenceableLoader.continueLoading(paramLong);
        }
        k++;
      }
      i3 = i | m;
      i = i3;
    } while (m != 0);
    i = i3;
    return i;
  }
  
  public final long getBufferedPositionUs()
  {
    SequenceableLoader[] arrayOfSequenceableLoader = loaders;
    int i = arrayOfSequenceableLoader.length;
    int j = 0;
    for (long l1 = Long.MAX_VALUE; j < i; l1 = l3)
    {
      long l2 = arrayOfSequenceableLoader[j].getBufferedPositionUs();
      l3 = l1;
      if (l2 != Long.MIN_VALUE) {
        l3 = Math.min(l1, l2);
      }
      j++;
    }
    long l3 = l1;
    if (l1 == Long.MAX_VALUE) {
      l3 = Long.MIN_VALUE;
    }
    return l3;
  }
  
  public final long getNextLoadPositionUs()
  {
    SequenceableLoader[] arrayOfSequenceableLoader = loaders;
    int i = arrayOfSequenceableLoader.length;
    int j = 0;
    for (long l1 = Long.MAX_VALUE; j < i; l1 = l3)
    {
      long l2 = arrayOfSequenceableLoader[j].getNextLoadPositionUs();
      l3 = l1;
      if (l2 != Long.MIN_VALUE) {
        l3 = Math.min(l1, l2);
      }
      j++;
    }
    long l3 = l1;
    if (l1 == Long.MAX_VALUE) {
      l3 = Long.MIN_VALUE;
    }
    return l3;
  }
  
  public final void reevaluateBuffer(long paramLong)
  {
    SequenceableLoader[] arrayOfSequenceableLoader = loaders;
    int i = arrayOfSequenceableLoader.length;
    for (int j = 0; j < i; j++) {
      arrayOfSequenceableLoader[j].reevaluateBuffer(paramLong);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.CompositeSequenceableLoader
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */