package com.facebook.cache.common;

public class BaseCacheEventListener
  implements CacheEventListener
{
  public void onCleared() {}
  
  public void onEviction(CacheEvent paramCacheEvent) {}
  
  public void onHit(CacheEvent paramCacheEvent) {}
  
  public void onMiss(CacheEvent paramCacheEvent) {}
  
  public void onReadException(CacheEvent paramCacheEvent) {}
  
  public void onWriteAttempt(CacheEvent paramCacheEvent) {}
  
  public void onWriteException(CacheEvent paramCacheEvent) {}
  
  public void onWriteSuccess(CacheEvent paramCacheEvent) {}
}

/* Location:
 * Qualified Name:     com.facebook.cache.common.BaseCacheEventListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */