package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;

public class DefaultBitmapPoolParams
{
  private static final SparseIntArray DEFAULT_BUCKETS = new SparseIntArray(0);
  private static final int MAX_SIZE_SOFT_CAP = 0;
  
  public static PoolParams get()
  {
    return new PoolParams(0, getMaxSizeHardCap(), DEFAULT_BUCKETS);
  }
  
  private static int getMaxSizeHardCap()
  {
    int i = (int)Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
    if (i > 16777216) {
      return i / 4 * 3;
    }
    return i / 2;
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.memory.DefaultBitmapPoolParams
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */