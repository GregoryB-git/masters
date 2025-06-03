package com.facebook.login;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class DeviceAuthDialog$5
  implements DialogInterface.OnClickListener
{
  public DeviceAuthDialog$5(DeviceAuthDialog paramDeviceAuthDialog) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface = this$0.initializeContentView(false);
    DeviceAuthDialog.access$800(this$0).setContentView(paramDialogInterface);
    paramDialogInterface = this$0;
    paramDialogInterface.startLogin(DeviceAuthDialog.access$600(paramDialogInterface));
  }
}

/* Location:
 * Qualified Name:     com.facebook.login.DeviceAuthDialog.5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */