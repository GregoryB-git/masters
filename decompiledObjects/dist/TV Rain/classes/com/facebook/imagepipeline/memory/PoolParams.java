package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import com.facebook.common.internal.Preconditions;
import javax.annotation.Nullable;

public class PoolParams
{
  public static final int IGNORE_THREADS = -1;
  public final SparseIntArray bucketSizes;
  public final int maxBucketSize;
  public final int maxNumThreads;
  public final int maxSizeHardCap;
  public final int maxSizeSoftCap;
  public final int minBucketSize;
  
  public PoolParams(int paramInt1, int paramInt2, @Nullable SparseIntArray paramSparseIntArray)
  {
    this(paramInt1, paramInt2, paramSparseIntArray, 0, Integer.MAX_VALUE, -1);
  }
  
  public PoolParams(int paramInt1, int paramInt2, @Nullable SparseIntArray paramSparseIntArray, int paramInt3, int paramInt4, int paramInt5)
  {
    boolean bool;
    if ((paramInt1 >= 0) && (paramInt2 >= paramInt1)) {
      bool = true;
    } else {
      bool = false;
    }
    Preconditions.checkState(bool);
    maxSizeSoftCap = paramInt1;
    maxSizeHardCap = paramInt2;
    bucketSizes = paramSparseIntArray;
    minBucketSize = paramInt3;
    maxBucketSize = paramInt4;
    maxNumThreads = paramInt5;
  }
  
  public PoolParams(int paramInt, @Nullable SparseIntArray paramSparseIntArray)
  {
    this(paramInt, paramInt, paramSparseIntArray, 0, Integer.MAX_VALUE, -1);
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.memory.PoolParams
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */