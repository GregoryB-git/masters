package com.facebook.share.internal;

import com.facebook.internal.DialogFeature;

public enum ShareStoryFeature
  implements DialogFeature
{
  private int minVersion;
  
  static
  {
    ShareStoryFeature localShareStoryFeature = new ShareStoryFeature("SHARE_STORY_ASSET", 0, 20170417);
    SHARE_STORY_ASSET = localShareStoryFeature;
    $VALUES = new ShareStoryFeature[] { localShareStoryFeature };
  }
  
  private ShareStoryFeature(int paramInt)
  {
    minVersion = paramInt;
  }
  
  public String getAction()
  {
    return "com.facebook.platform.action.request.SHARE_STORY";
  }
  
  public int getMinVersion()
  {
    return minVersion;
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.internal.ShareStoryFeature
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */