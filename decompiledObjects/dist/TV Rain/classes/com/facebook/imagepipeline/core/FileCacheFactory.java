package com.facebook.imagepipeline.core;

import com.facebook.cache.disk.DiskCacheConfig;
import com.facebook.cache.disk.FileCache;

public abstract interface FileCacheFactory
{
  public abstract FileCache get(DiskCacheConfig paramDiskCacheConfig);
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.core.FileCacheFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */