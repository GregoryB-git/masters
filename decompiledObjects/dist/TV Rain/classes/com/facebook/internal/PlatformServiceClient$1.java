package com.facebook.internal;

import android.os.Handler;
import android.os.Message;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;

class PlatformServiceClient$1
  extends Handler
{
  public PlatformServiceClient$1(PlatformServiceClient paramPlatformServiceClient) {}
  
  public void handleMessage(Message paramMessage)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      this$0.handleMessage(paramMessage);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramMessage, this);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.PlatformServiceClient.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */