package com.facebook.cache.common;

import java.io.IOException;
import javax.annotation.Nullable;

public abstract interface CacheEvent
{
  @Nullable
  public abstract CacheKey getCacheKey();
  
  public abstract long getCacheLimit();
  
  public abstract long getCacheSize();
  
  @Nullable
  public abstract CacheEventListener.EvictionReason getEvictionReason();
  
  @Nullable
  public abstract IOException getException();
  
  public abstract long getItemSize();
  
  @Nullable
  public abstract String getResourceId();
}

/* Location:
 * Qualified Name:     com.facebook.cache.common.CacheEvent
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */