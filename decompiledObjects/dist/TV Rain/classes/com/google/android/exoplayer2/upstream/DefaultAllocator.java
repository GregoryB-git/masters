package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;

public final class DefaultAllocator
  implements Allocator
{
  private static final int AVAILABLE_EXTRA_CAPACITY = 100;
  private int allocatedCount;
  private Allocation[] availableAllocations;
  private int availableCount;
  private final int individualAllocationSize;
  private final byte[] initialAllocationBlock;
  private final Allocation[] singleAllocationReleaseHolder;
  private int targetBufferSize;
  private final boolean trimOnReset;
  
  public DefaultAllocator(boolean paramBoolean, int paramInt)
  {
    this(paramBoolean, paramInt, 0);
  }
  
  public DefaultAllocator(boolean paramBoolean, int paramInt1, int paramInt2)
  {
    int i = 0;
    boolean bool;
    if (paramInt1 > 0) {
      bool = true;
    } else {
      bool = false;
    }
    Assertions.checkArgument(bool);
    if (paramInt2 >= 0) {
      bool = true;
    } else {
      bool = false;
    }
    Assertions.checkArgument(bool);
    trimOnReset = paramBoolean;
    individualAllocationSize = paramInt1;
    availableCount = paramInt2;
    availableAllocations = new Allocation[paramInt2 + 100];
    if (paramInt2 > 0)
    {
      initialAllocationBlock = new byte[paramInt2 * paramInt1];
      while (i < paramInt2)
      {
        availableAllocations[i] = new Allocation(initialAllocationBlock, i * paramInt1);
        i++;
      }
    }
    initialAllocationBlock = null;
    singleAllocationReleaseHolder = new Allocation[1];
  }
  
  public Allocation allocate()
  {
    try
    {
      allocatedCount += 1;
      int i = availableCount;
      Allocation localAllocation;
      if (i > 0)
      {
        Allocation[] arrayOfAllocation = availableAllocations;
        i--;
        availableCount = i;
        localAllocation = arrayOfAllocation[i];
        arrayOfAllocation[i] = null;
      }
      else
      {
        localAllocation = new Allocation(new byte[individualAllocationSize], 0);
      }
      return localAllocation;
    }
    finally {}
  }
  
  public int getIndividualAllocationLength()
  {
    return individualAllocationSize;
  }
  
  public int getTotalBytesAllocated()
  {
    try
    {
      int i = allocatedCount;
      int j = individualAllocationSize;
      return i * j;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void release(Allocation paramAllocation)
  {
    try
    {
      Allocation[] arrayOfAllocation = singleAllocationReleaseHolder;
      arrayOfAllocation[0] = paramAllocation;
      release(arrayOfAllocation);
      return;
    }
    finally {}
  }
  
  public void release(Allocation[] paramArrayOfAllocation)
  {
    try
    {
      int i = availableCount;
      int j = paramArrayOfAllocation.length;
      Object localObject = availableAllocations;
      if (j + i >= localObject.length) {
        availableAllocations = ((Allocation[])Arrays.copyOf((Object[])localObject, Math.max(localObject.length * 2, i + paramArrayOfAllocation.length)));
      }
      j = paramArrayOfAllocation.length;
      for (i = 0; i < j; i++)
      {
        localObject = paramArrayOfAllocation[i];
        Allocation[] arrayOfAllocation = availableAllocations;
        int k = availableCount;
        availableCount = (k + 1);
        arrayOfAllocation[k] = localObject;
      }
      allocatedCount -= paramArrayOfAllocation.length;
      notifyAll();
      return;
    }
    finally {}
  }
  
  public void reset()
  {
    try
    {
      if (trimOnReset) {
        setTargetBufferSize(0);
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void setTargetBufferSize(int paramInt)
  {
    try
    {
      int i;
      if (paramInt < targetBufferSize) {
        i = 1;
      } else {
        i = 0;
      }
      targetBufferSize = paramInt;
      if (i != 0) {
        trim();
      }
      return;
    }
    finally {}
  }
  
  public void trim()
  {
    try
    {
      int i = Util.ceilDivide(targetBufferSize, individualAllocationSize);
      int j = allocatedCount;
      int k = 0;
      i = Math.max(0, i - j);
      int m = availableCount;
      if (i >= m) {
        return;
      }
      j = i;
      if (initialAllocationBlock != null)
      {
        j = m - 1;
        while (k <= j)
        {
          Allocation[] arrayOfAllocation = availableAllocations;
          Allocation localAllocation = arrayOfAllocation[k];
          Object localObject2 = data;
          byte[] arrayOfByte = initialAllocationBlock;
          if (localObject2 == arrayOfByte)
          {
            k++;
          }
          else
          {
            localObject2 = arrayOfAllocation[j];
            if (data != arrayOfByte)
            {
              j--;
            }
            else
            {
              arrayOfAllocation[k] = localObject2;
              arrayOfAllocation[j] = localAllocation;
              j--;
              k++;
            }
          }
        }
        k = Math.max(i, k);
        i = availableCount;
        j = k;
        if (k >= i) {
          return;
        }
      }
      Arrays.fill(availableAllocations, j, availableCount, null);
      availableCount = j;
      return;
    }
    finally {}
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.upstream.DefaultAllocator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */