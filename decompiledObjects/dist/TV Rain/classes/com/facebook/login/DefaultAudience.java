package com.facebook.login;

public enum DefaultAudience
{
  private final String nativeProtocolAudience;
  
  static
  {
    DefaultAudience localDefaultAudience1 = new DefaultAudience("NONE", 0, null);
    NONE = localDefaultAudience1;
    DefaultAudience localDefaultAudience2 = new DefaultAudience("ONLY_ME", 1, "only_me");
    ONLY_ME = localDefaultAudience2;
    DefaultAudience localDefaultAudience3 = new DefaultAudience("FRIENDS", 2, "friends");
    FRIENDS = localDefaultAudience3;
    DefaultAudience localDefaultAudience4 = new DefaultAudience("EVERYONE", 3, "everyone");
    EVERYONE = localDefaultAudience4;
    $VALUES = new DefaultAudience[] { localDefaultAudience1, localDefaultAudience2, localDefaultAudience3, localDefaultAudience4 };
  }
  
  private DefaultAudience(String paramString)
  {
    nativeProtocolAudience = paramString;
  }
  
  public String getNativeProtocolAudience()
  {
    return nativeProtocolAudience;
  }
}

/* Location:
 * Qualified Name:     com.facebook.login.DefaultAudience
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */