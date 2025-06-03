package com.facebook.share.internal;

import com.facebook.internal.DialogFeature;

public enum MessageDialogFeature
  implements DialogFeature
{
  private int minVersion;
  
  static
  {
    MessageDialogFeature localMessageDialogFeature1 = new MessageDialogFeature("MESSAGE_DIALOG", 0, 20140204);
    MESSAGE_DIALOG = localMessageDialogFeature1;
    MessageDialogFeature localMessageDialogFeature2 = new MessageDialogFeature("PHOTOS", 1, 20140324);
    PHOTOS = localMessageDialogFeature2;
    MessageDialogFeature localMessageDialogFeature3 = new MessageDialogFeature("VIDEO", 2, 20141218);
    VIDEO = localMessageDialogFeature3;
    MessageDialogFeature localMessageDialogFeature4 = new MessageDialogFeature("MESSENGER_GENERIC_TEMPLATE", 3, 20171115);
    MESSENGER_GENERIC_TEMPLATE = localMessageDialogFeature4;
    MessageDialogFeature localMessageDialogFeature5 = new MessageDialogFeature("MESSENGER_OPEN_GRAPH_MUSIC_TEMPLATE", 4, 20171115);
    MESSENGER_OPEN_GRAPH_MUSIC_TEMPLATE = localMessageDialogFeature5;
    MessageDialogFeature localMessageDialogFeature6 = new MessageDialogFeature("MESSENGER_MEDIA_TEMPLATE", 5, 20171115);
    MESSENGER_MEDIA_TEMPLATE = localMessageDialogFeature6;
    $VALUES = new MessageDialogFeature[] { localMessageDialogFeature1, localMessageDialogFeature2, localMessageDialogFeature3, localMessageDialogFeature4, localMessageDialogFeature5, localMessageDialogFeature6 };
  }
  
  private MessageDialogFeature(int paramInt)
  {
    minVersion = paramInt;
  }
  
  public String getAction()
  {
    return "com.facebook.platform.action.request.MESSAGE_DIALOG";
  }
  
  public int getMinVersion()
  {
    return minVersion;
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.internal.MessageDialogFeature
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */