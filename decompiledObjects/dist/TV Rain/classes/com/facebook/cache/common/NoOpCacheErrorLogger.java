package com.facebook.cache.common;

import javax.annotation.Nullable;

public class NoOpCacheErrorLogger
  implements CacheErrorLogger
{
  private static NoOpCacheErrorLogger sInstance;
  
  public static NoOpCacheErrorLogger getInstance()
  {
    try
    {
      if (sInstance == null)
      {
        localNoOpCacheErrorLogger = new com/facebook/cache/common/NoOpCacheErrorLogger;
        localNoOpCacheErrorLogger.<init>();
        sInstance = localNoOpCacheErrorLogger;
      }
      NoOpCacheErrorLogger localNoOpCacheErrorLogger = sInstance;
      return localNoOpCacheErrorLogger;
    }
    finally {}
  }
  
  public void logError(CacheErrorLogger.CacheErrorCategory paramCacheErrorCategory, Class<?> paramClass, String paramString, @Nullable Throwable paramThrowable) {}
}

/* Location:
 * Qualified Name:     com.facebook.cache.common.NoOpCacheErrorLogger
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */