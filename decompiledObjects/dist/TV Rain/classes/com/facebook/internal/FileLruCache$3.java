package com.facebook.internal;

import com.facebook.internal.instrument.crashshield.CrashShieldHandler;

class FileLruCache$3
  implements Runnable
{
  public FileLruCache$3(FileLruCache paramFileLruCache) {}
  
  public void run()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      FileLruCache.access$200(this$0);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.FileLruCache.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */