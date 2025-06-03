package com.facebook.login;

import com.facebook.internal.instrument.crashshield.CrashShieldHandler;

class DeviceAuthDialog$3
  implements Runnable
{
  public DeviceAuthDialog$3(DeviceAuthDialog paramDeviceAuthDialog) {}
  
  public void run()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      DeviceAuthDialog.access$200(this$0);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.login.DeviceAuthDialog.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */