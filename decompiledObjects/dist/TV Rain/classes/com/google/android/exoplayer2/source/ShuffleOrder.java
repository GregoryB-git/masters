package com.google.android.exoplayer2.source;

import java.util.Arrays;
import java.util.Random;

public abstract interface ShuffleOrder
{
  public abstract ShuffleOrder cloneAndClear();
  
  public abstract ShuffleOrder cloneAndInsert(int paramInt1, int paramInt2);
  
  public abstract ShuffleOrder cloneAndRemove(int paramInt);
  
  public abstract int getFirstIndex();
  
  public abstract int getLastIndex();
  
  public abstract int getLength();
  
  public abstract int getNextIndex(int paramInt);
  
  public abstract int getPreviousIndex(int paramInt);
  
  public static class DefaultShuffleOrder
    implements ShuffleOrder
  {
    private final int[] indexInShuffled;
    private final Random random;
    private final int[] shuffled;
    
    public DefaultShuffleOrder(int paramInt)
    {
      this(paramInt, new Random());
    }
    
    public DefaultShuffleOrder(int paramInt, long paramLong)
    {
      this(paramInt, new Random(paramLong));
    }
    
    private DefaultShuffleOrder(int paramInt, Random paramRandom)
    {
      this(createShuffledList(paramInt, paramRandom), paramRandom);
    }
    
    private DefaultShuffleOrder(int[] paramArrayOfInt, Random paramRandom)
    {
      shuffled = paramArrayOfInt;
      random = paramRandom;
      indexInShuffled = new int[paramArrayOfInt.length];
      for (int i = 0; i < paramArrayOfInt.length; i++) {
        indexInShuffled[paramArrayOfInt[i]] = i;
      }
    }
    
    private static int[] createShuffledList(int paramInt, Random paramRandom)
    {
      int[] arrayOfInt = new int[paramInt];
      int j;
      for (int i = 0; i < paramInt; i = j)
      {
        j = i + 1;
        int k = paramRandom.nextInt(j);
        arrayOfInt[i] = arrayOfInt[k];
        arrayOfInt[k] = i;
      }
      return arrayOfInt;
    }
    
    public ShuffleOrder cloneAndClear()
    {
      return new DefaultShuffleOrder(0, new Random(random.nextLong()));
    }
    
    public ShuffleOrder cloneAndInsert(int paramInt1, int paramInt2)
    {
      int[] arrayOfInt1 = new int[paramInt2];
      int[] arrayOfInt2 = new int[paramInt2];
      int i = 0;
      Object localObject;
      int m;
      for (int j = 0; j < paramInt2; j = k)
      {
        arrayOfInt1[j] = random.nextInt(shuffled.length + 1);
        localObject = random;
        k = j + 1;
        m = ((Random)localObject).nextInt(k);
        arrayOfInt2[j] = arrayOfInt2[m];
        arrayOfInt2[m] = (j + paramInt1);
      }
      Arrays.sort(arrayOfInt1);
      int[] arrayOfInt3 = new int[shuffled.length + paramInt2];
      int k = 0;
      j = k;
      for (;;)
      {
        localObject = shuffled;
        if (i >= localObject.length + paramInt2) {
          break;
        }
        if ((k < paramInt2) && (j == arrayOfInt1[k]))
        {
          arrayOfInt3[i] = arrayOfInt2[k];
          k++;
        }
        else
        {
          m = localObject[j];
          arrayOfInt3[i] = m;
          if (m >= paramInt1) {
            arrayOfInt3[i] = (m + paramInt2);
          }
          j++;
        }
        i++;
      }
      return new DefaultShuffleOrder(arrayOfInt3, new Random(random.nextLong()));
    }
    
    public ShuffleOrder cloneAndRemove(int paramInt)
    {
      int[] arrayOfInt1 = new int[shuffled.length - 1];
      int i = 0;
      int j = 0;
      for (;;)
      {
        int[] arrayOfInt2 = shuffled;
        if (i >= arrayOfInt2.length) {
          break;
        }
        int k = arrayOfInt2[i];
        if (k == paramInt)
        {
          j = 1;
        }
        else
        {
          int m;
          if (j != 0) {
            m = i - 1;
          } else {
            m = i;
          }
          int n = k;
          if (k > paramInt) {
            n = k - 1;
          }
          arrayOfInt1[m] = n;
        }
        i++;
      }
      return new DefaultShuffleOrder(arrayOfInt1, new Random(random.nextLong()));
    }
    
    public int getFirstIndex()
    {
      int[] arrayOfInt = shuffled;
      int i;
      if (arrayOfInt.length > 0) {
        i = arrayOfInt[0];
      } else {
        i = -1;
      }
      return i;
    }
    
    public int getLastIndex()
    {
      int[] arrayOfInt = shuffled;
      int i;
      if (arrayOfInt.length > 0) {
        i = arrayOfInt[(arrayOfInt.length - 1)];
      } else {
        i = -1;
      }
      return i;
    }
    
    public int getLength()
    {
      return shuffled.length;
    }
    
    public int getNextIndex(int paramInt)
    {
      paramInt = indexInShuffled[paramInt] + 1;
      int[] arrayOfInt = shuffled;
      if (paramInt < arrayOfInt.length) {
        paramInt = arrayOfInt[paramInt];
      } else {
        paramInt = -1;
      }
      return paramInt;
    }
    
    public int getPreviousIndex(int paramInt)
    {
      int i = indexInShuffled[paramInt];
      paramInt = -1;
      i--;
      if (i >= 0) {
        paramInt = shuffled[i];
      }
      return paramInt;
    }
  }
  
  public static final class UnshuffledShuffleOrder
    implements ShuffleOrder
  {
    private final int length;
    
    public UnshuffledShuffleOrder(int paramInt)
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
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.ShuffleOrder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */