package com.facebook.drawee.controller;

public enum AbstractDraweeControllerBuilder$CacheLevel
{
  static
  {
    CacheLevel localCacheLevel1 = new CacheLevel("FULL_FETCH", 0);
    FULL_FETCH = localCacheLevel1;
    CacheLevel localCacheLevel2 = new CacheLevel("DISK_CACHE", 1);
    DISK_CACHE = localCacheLevel2;
    CacheLevel localCacheLevel3 = new CacheLevel("BITMAP_MEMORY_CACHE", 2);
    BITMAP_MEMORY_CACHE = localCacheLevel3;
    $VALUES = new CacheLevel[] { localCacheLevel1, localCacheLevel2, localCacheLevel3 };
  }
  
  private AbstractDraweeControllerBuilder$CacheLevel() {}
}

/* Location:
 * Qualified Name:     com.facebook.drawee.controller.AbstractDraweeControllerBuilder.CacheLevel
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */