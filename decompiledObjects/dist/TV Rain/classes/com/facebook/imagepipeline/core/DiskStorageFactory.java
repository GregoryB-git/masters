package com.facebook.imagepipeline.core;

import com.facebook.cache.disk.DiskCacheConfig;
import com.facebook.cache.disk.DiskStorage;

public abstract interface DiskStorageFactory
{
  public abstract DiskStorage get(DiskCacheConfig paramDiskCacheConfig);
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.core.DiskStorageFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */