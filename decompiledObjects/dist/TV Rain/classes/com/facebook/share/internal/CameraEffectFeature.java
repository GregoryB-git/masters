package com.facebook.share.internal;

import com.facebook.internal.DialogFeature;

public enum CameraEffectFeature
  implements DialogFeature
{
  private int minVersion;
  
  static
  {
    CameraEffectFeature localCameraEffectFeature = new CameraEffectFeature("SHARE_CAMERA_EFFECT", 0, 20170417);
    SHARE_CAMERA_EFFECT = localCameraEffectFeature;
    $VALUES = new CameraEffectFeature[] { localCameraEffectFeature };
  }
  
  private CameraEffectFeature(int paramInt)
  {
    minVersion = paramInt;
  }
  
  public String getAction()
  {
    return "com.facebook.platform.action.request.CAMERA_EFFECT";
  }
  
  public int getMinVersion()
  {
    return minVersion;
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.internal.CameraEffectFeature
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */