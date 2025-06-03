package com.facebook.cache.common;

public enum CacheEventListener$EvictionReason
{
  static
  {
    EvictionReason localEvictionReason1 = new EvictionReason("CACHE_FULL", 0);
    CACHE_FULL = localEvictionReason1;
    EvictionReason localEvictionReason2 = new EvictionReason("CONTENT_STALE", 1);
    CONTENT_STALE = localEvictionReason2;
    EvictionReason localEvictionReason3 = new EvictionReason("USER_FORCED", 2);
    USER_FORCED = localEvictionReason3;
    EvictionReason localEvictionReason4 = new EvictionReason("CACHE_MANAGER_TRIMMED", 3);
    CACHE_MANAGER_TRIMMED = localEvictionReason4;
    $VALUES = new EvictionReason[] { localEvictionReason1, localEvictionReason2, localEvictionReason3, localEvictionReason4 };
  }
  
  private CacheEventListener$EvictionReason() {}
}

/* Location:
 * Qualified Name:     com.facebook.cache.common.CacheEventListener.EvictionReason
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */