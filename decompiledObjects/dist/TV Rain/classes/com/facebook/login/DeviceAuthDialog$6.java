package com.facebook.login;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.facebook.internal.Utility.PermissionsLists;
import java.util.Date;

class DeviceAuthDialog$6
  implements DialogInterface.OnClickListener
{
  public DeviceAuthDialog$6(DeviceAuthDialog paramDeviceAuthDialog, String paramString1, Utility.PermissionsLists paramPermissionsLists, String paramString2, Date paramDate1, Date paramDate2) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    DeviceAuthDialog.access$900(this$0, val$userId, val$permissions, val$accessToken, val$expirationTime, val$dataAccessExpirationTime);
  }
}

/* Location:
 * Qualified Name:     com.facebook.login.DeviceAuthDialog.6
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */