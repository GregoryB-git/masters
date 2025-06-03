package com.facebook.share.internal;

import com.facebook.internal.instrument.crashshield.CrashShieldHandler;

final class LikeActionController$2
  implements Runnable
{
  public LikeActionController$2(LikeActionController paramLikeActionController) {}
  
  public void run()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      LikeActionController.access$200(val$controllerToRefresh);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.internal.LikeActionController.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */