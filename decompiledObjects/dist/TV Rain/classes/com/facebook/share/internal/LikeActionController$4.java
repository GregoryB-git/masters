package com.facebook.share.internal;

import com.facebook.FacebookException;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;

final class LikeActionController$4
  implements Runnable
{
  public LikeActionController$4(LikeActionController.CreationCallback paramCreationCallback, LikeActionController paramLikeActionController, FacebookException paramFacebookException) {}
  
  public void run()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      val$callback.onComplete(val$controller, val$error);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.internal.LikeActionController.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */