package com.facebook.login;

import android.view.View;
import android.view.View.OnClickListener;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;

class DeviceAuthDialog$2
  implements View.OnClickListener
{
  public DeviceAuthDialog$2(DeviceAuthDialog paramDeviceAuthDialog) {}
  
  public void onClick(View paramView)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      this$0.onCancel();
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramView, this);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.login.DeviceAuthDialog.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */