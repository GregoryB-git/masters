package com.facebook.imagepipeline.cache;

import com.facebook.common.logging.FLog;
import com.facebook.common.memory.MemoryTrimType;

public class BitmapMemoryCacheTrimStrategy
  implements CountingMemoryCache.CacheTrimStrategy
{
  private static final String TAG = "BitmapMemoryCacheTrimStrategy";
  
  public double getTrimRatio(MemoryTrimType paramMemoryTrimType)
  {
    int i = 1.$SwitchMap$com$facebook$common$memory$MemoryTrimType[paramMemoryTrimType.ordinal()];
    if (i != 1)
    {
      if ((i != 2) && (i != 3) && (i != 4))
      {
        FLog.wtf("BitmapMemoryCacheTrimStrategy", "unknown trim type: %s", new Object[] { paramMemoryTrimType });
        return 0.0D;
      }
      return 1.0D;
    }
    return MemoryTrimType.OnCloseToDalvikHeapLimit.getSuggestedTrimRatio();
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.cache.BitmapMemoryCacheTrimStrategy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */