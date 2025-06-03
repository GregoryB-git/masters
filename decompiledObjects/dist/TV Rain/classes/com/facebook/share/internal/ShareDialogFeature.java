package com.facebook.share.internal;

import com.facebook.internal.DialogFeature;

public enum ShareDialogFeature
  implements DialogFeature
{
  private int minVersion;
  
  static
  {
    ShareDialogFeature localShareDialogFeature1 = new ShareDialogFeature("SHARE_DIALOG", 0, 20130618);
    SHARE_DIALOG = localShareDialogFeature1;
    ShareDialogFeature localShareDialogFeature2 = new ShareDialogFeature("PHOTOS", 1, 20140204);
    PHOTOS = localShareDialogFeature2;
    ShareDialogFeature localShareDialogFeature3 = new ShareDialogFeature("VIDEO", 2, 20141028);
    VIDEO = localShareDialogFeature3;
    ShareDialogFeature localShareDialogFeature4 = new ShareDialogFeature("MULTIMEDIA", 3, 20160327);
    MULTIMEDIA = localShareDialogFeature4;
    ShareDialogFeature localShareDialogFeature5 = new ShareDialogFeature("HASHTAG", 4, 20160327);
    HASHTAG = localShareDialogFeature5;
    ShareDialogFeature localShareDialogFeature6 = new ShareDialogFeature("LINK_SHARE_QUOTES", 5, 20160327);
    LINK_SHARE_QUOTES = localShareDialogFeature6;
    $VALUES = new ShareDialogFeature[] { localShareDialogFeature1, localShareDialogFeature2, localShareDialogFeature3, localShareDialogFeature4, localShareDialogFeature5, localShareDialogFeature6 };
  }
  
  private ShareDialogFeature(int paramInt)
  {
    minVersion = paramInt;
  }
  
  public String getAction()
  {
    return "com.facebook.platform.action.request.FEED_DIALOG";
  }
  
  public int getMinVersion()
  {
    return minVersion;
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.internal.ShareDialogFeature
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */