package com.facebook;

import com.facebook.internal.instrument.crashshield.CrashShieldHandler;

class RequestProgress$1
  implements Runnable
{
  public RequestProgress$1(RequestProgress paramRequestProgress, GraphRequest.OnProgressCallback paramOnProgressCallback, long paramLong1, long paramLong2) {}
  
  public void run()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      val$callbackCopy.onProgress(val$currentCopy, val$maxProgressCopy);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.RequestProgress.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */