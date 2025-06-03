package com.facebook.imagepipeline.memory;

import com.facebook.infer.annotation.ThreadSafe;

public class BitmapCounterProvider
{
  private static final long KB = 1024L;
  public static final int MAX_BITMAP_COUNT = 384;
  public static final int MAX_BITMAP_TOTAL_SIZE = ;
  private static final long MB = 1048576L;
  private static volatile BitmapCounter sBitmapCounter;
  
  @ThreadSafe
  public static BitmapCounter get()
  {
    if (sBitmapCounter == null) {
      try
      {
        if (sBitmapCounter == null)
        {
          BitmapCounter localBitmapCounter = new com/facebook/imagepipeline/memory/BitmapCounter;
          localBitmapCounter.<init>(384, MAX_BITMAP_TOTAL_SIZE);
          sBitmapCounter = localBitmapCounter;
        }
      }
      finally {}
    }
    return sBitmapCounter;
  }
  
  private static int getMaxSizeHardCap()
  {
    int i = (int)Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
    if (i > 16777216L) {
      return i / 4 * 3;
    }
    return i / 2;
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.memory.BitmapCounterProvider
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */