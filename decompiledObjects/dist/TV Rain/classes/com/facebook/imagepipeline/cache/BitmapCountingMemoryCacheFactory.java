package com.facebook.imagepipeline.cache;

import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.Supplier;
import com.facebook.common.memory.MemoryTrimmableRegistry;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import com.facebook.imagepipeline.image.CloseableImage;

public class BitmapCountingMemoryCacheFactory
{
  public static CountingMemoryCache<CacheKey, CloseableImage> get(Supplier<MemoryCacheParams> paramSupplier, MemoryTrimmableRegistry paramMemoryTrimmableRegistry, PlatformBitmapFactory paramPlatformBitmapFactory, boolean paramBoolean)
  {
    return get(paramSupplier, paramMemoryTrimmableRegistry, paramPlatformBitmapFactory, paramBoolean, new BitmapMemoryCacheTrimStrategy());
  }
  
  public static CountingMemoryCache<CacheKey, CloseableImage> get(Supplier<MemoryCacheParams> paramSupplier, MemoryTrimmableRegistry paramMemoryTrimmableRegistry, PlatformBitmapFactory paramPlatformBitmapFactory, boolean paramBoolean, CountingMemoryCache.CacheTrimStrategy paramCacheTrimStrategy)
  {
    paramSupplier = new CountingMemoryCache(new ValueDescriptor()
    {
      public int getSizeInBytes(CloseableImage paramAnonymousCloseableImage)
      {
        return paramAnonymousCloseableImage.getSizeInBytes();
      }
    }, paramCacheTrimStrategy, paramSupplier, paramPlatformBitmapFactory, paramBoolean);
    paramMemoryTrimmableRegistry.registerMemoryTrimmable(paramSupplier);
    return paramSupplier;
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.cache.BitmapCountingMemoryCacheFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */