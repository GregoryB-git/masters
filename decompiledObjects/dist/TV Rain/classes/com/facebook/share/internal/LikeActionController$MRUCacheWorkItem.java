package com.facebook.share.internal;

import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

class LikeActionController$MRUCacheWorkItem
  implements Runnable
{
  private static ArrayList<String> mruCachedItems = new ArrayList();
  private String cacheItem;
  private boolean shouldTrim;
  
  public LikeActionController$MRUCacheWorkItem(String paramString, boolean paramBoolean)
  {
    cacheItem = paramString;
    shouldTrim = paramBoolean;
  }
  
  public void run()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      Object localObject = cacheItem;
      if (localObject != null)
      {
        mruCachedItems.remove(localObject);
        mruCachedItems.add(0, cacheItem);
      }
      if ((shouldTrim) && (mruCachedItems.size() >= 128)) {
        while (64 < mruCachedItems.size())
        {
          localObject = mruCachedItems;
          localObject = (String)((ArrayList)localObject).remove(((ArrayList)localObject).size() - 1);
          LikeActionController.access$400().remove(localObject);
        }
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.internal.LikeActionController.MRUCacheWorkItem
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */