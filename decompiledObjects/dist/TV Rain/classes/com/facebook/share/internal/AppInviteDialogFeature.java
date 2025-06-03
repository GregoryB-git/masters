package com.facebook.share.internal;

import com.facebook.internal.DialogFeature;

public enum AppInviteDialogFeature
  implements DialogFeature
{
  private int minVersion;
  
  static
  {
    AppInviteDialogFeature localAppInviteDialogFeature = new AppInviteDialogFeature("APP_INVITES_DIALOG", 0, 20140701);
    APP_INVITES_DIALOG = localAppInviteDialogFeature;
    $VALUES = new AppInviteDialogFeature[] { localAppInviteDialogFeature };
  }
  
  private AppInviteDialogFeature(int paramInt)
  {
    minVersion = paramInt;
  }
  
  public String getAction()
  {
    return "com.facebook.platform.action.request.APPINVITES_DIALOG";
  }
  
  public int getMinVersion()
  {
    return minVersion;
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.internal.AppInviteDialogFeature
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */