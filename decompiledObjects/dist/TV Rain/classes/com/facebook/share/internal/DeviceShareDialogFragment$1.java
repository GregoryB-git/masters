package com.facebook.share.internal;

import android.app.Dialog;
import android.view.View;
import android.view.View.OnClickListener;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;

class DeviceShareDialogFragment$1
  implements View.OnClickListener
{
  public DeviceShareDialogFragment$1(DeviceShareDialogFragment paramDeviceShareDialogFragment) {}
  
  public void onClick(View paramView)
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
      CrashShieldHandler.handleThrowable(paramView, this);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.internal.DeviceShareDialogFragment.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */