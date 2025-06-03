package com.facebook.share.model;

@Deprecated
public enum AppInviteContent$Builder$Destination
{
  private final String name;
  
  static
  {
    Destination localDestination1 = new Destination("FACEBOOK", 0, "facebook");
    FACEBOOK = localDestination1;
    Destination localDestination2 = new Destination("MESSENGER", 1, "messenger");
    MESSENGER = localDestination2;
    $VALUES = new Destination[] { localDestination1, localDestination2 };
  }
  
  private AppInviteContent$Builder$Destination(String paramString)
  {
    name = paramString;
  }
  
  public boolean equalsName(String paramString)
  {
    boolean bool;
    if (paramString == null) {
      bool = false;
    } else {
      bool = name.equals(paramString);
    }
    return bool;
  }
  
  public String toString()
  {
    return name;
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.model.AppInviteContent.Builder.Destination
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */