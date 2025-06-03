package com.facebook.share.internal;

import com.facebook.internal.DialogFeature;

@Deprecated
public enum LikeDialogFeature
  implements DialogFeature
{
  private int minVersion;
  
  static
  {
    LikeDialogFeature localLikeDialogFeature = new LikeDialogFeature("LIKE_DIALOG", 0, 20140701);
    LIKE_DIALOG = localLikeDialogFeature;
    $VALUES = new LikeDialogFeature[] { localLikeDialogFeature };
  }
  
  private LikeDialogFeature(int paramInt)
  {
    minVersion = paramInt;
  }
  
  public String getAction()
  {
    return "com.facebook.platform.action.request.LIKE_DIALOG";
  }
  
  public int getMinVersion()
  {
    return minVersion;
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.internal.LikeDialogFeature
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */