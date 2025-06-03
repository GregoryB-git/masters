package com.facebook.share.widget;

public enum ShareDialog$Mode
{
  static
  {
    Mode localMode1 = new Mode("AUTOMATIC", 0);
    AUTOMATIC = localMode1;
    Mode localMode2 = new Mode("NATIVE", 1);
    NATIVE = localMode2;
    Mode localMode3 = new Mode("WEB", 2);
    WEB = localMode3;
    Mode localMode4 = new Mode("FEED", 3);
    FEED = localMode4;
    $VALUES = new Mode[] { localMode1, localMode2, localMode3, localMode4 };
  }
  
  private ShareDialog$Mode() {}
}

/* Location:
 * Qualified Name:     com.facebook.share.widget.ShareDialog.Mode
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */