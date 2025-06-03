package com.facebook.share.internal;

import com.facebook.internal.DialogFeature;

public enum OpenGraphMessageDialogFeature
  implements DialogFeature
{
  private int minVersion;
  
  static
  {
    OpenGraphMessageDialogFeature localOpenGraphMessageDialogFeature = new OpenGraphMessageDialogFeature("OG_MESSAGE_DIALOG", 0, 20140204);
    OG_MESSAGE_DIALOG = localOpenGraphMessageDialogFeature;
    $VALUES = new OpenGraphMessageDialogFeature[] { localOpenGraphMessageDialogFeature };
  }
  
  private OpenGraphMessageDialogFeature(int paramInt)
  {
    minVersion = paramInt;
  }
  
  public String getAction()
  {
    return "com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG";
  }
  
  public int getMinVersion()
  {
    return minVersion;
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.internal.OpenGraphMessageDialogFeature
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */