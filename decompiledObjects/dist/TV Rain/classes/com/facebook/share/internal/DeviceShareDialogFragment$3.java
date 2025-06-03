package com.facebook.share.internal;

import android.app.Dialog;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;

class DeviceShareDialogFragment$3
  implements Runnable
{
  public DeviceShareDialogFragment$3(DeviceShareDialogFragment paramDeviceShareDialogFragment) {}
  
  public void run()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      DeviceShareDialogFragment.access$000(this$0).dismiss();
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.internal.DeviceShareDialogFragment.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */