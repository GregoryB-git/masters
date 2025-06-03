package com.google.android.exoplayer2.source;

public final class ShuffleOrder$UnshuffledShuffleOrder
  implements ShuffleOrder
{
  private final int length;
  
  public ShuffleOrder$UnshuffledShuffleOrder(int paramInt)
  {
    length = paramInt;
  }
  
  public ShuffleOrder cloneAndClear()
  {
    return new UnshuffledShuffleOrder(0);
  }
  
  public ShuffleOrder cloneAndInsert(int paramInt1, int paramInt2)
  {
    return new UnshuffledShuffleOrder(length + paramInt2);
  }
  
  public ShuffleOrder cloneAndRemove(int paramInt)
  {
    return new UnshuffledShuffleOrder(length - 1);
  }
  
  public int getFirstIndex()
  {
    int i;
    if (length > 0) {
      i = 0;
    } else {
      i = -1;
    }
    return i;
  }
  
  public int getLastIndex()
  {
    int i = length;
    if (i > 0) {
      i--;
    } else {
      i = -1;
    }
    return i;
  }
  
  public int getLength()
  {
    return length;
  }
  
  public int getNextIndex(int paramInt)
  {
    
    if (paramInt >= length) {
      paramInt = -1;
    }
    return paramInt;
  }
  
  public int getPreviousIndex(int paramInt)
  {
    int i = -1;
    int j = paramInt - 1;
    paramInt = i;
    if (j >= 0) {
      paramInt = j;
    }
    return paramInt;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.ShuffleOrder.UnshuffledShuffleOrder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */