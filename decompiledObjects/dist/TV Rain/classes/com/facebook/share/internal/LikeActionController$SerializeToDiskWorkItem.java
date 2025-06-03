package com.facebook.share.internal;

import com.facebook.internal.instrument.crashshield.CrashShieldHandler;

class LikeActionController$SerializeToDiskWorkItem
  implements Runnable
{
  private String cacheKey;
  private String controllerJson;
  
  public LikeActionController$SerializeToDiskWorkItem(String paramString1, String paramString2)
  {
    cacheKey = paramString1;
    controllerJson = paramString2;
  }
  
  public void run()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      LikeActionController.access$2600(cacheKey, controllerJson);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.internal.LikeActionController.SerializeToDiskWorkItem
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */