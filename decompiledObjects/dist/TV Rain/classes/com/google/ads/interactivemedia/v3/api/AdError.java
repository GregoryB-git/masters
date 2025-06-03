package com.google.ads.interactivemedia.v3.api;

import a;

public final class AdError
  extends Exception
{
  private final AdErrorCode a;
  private final AdErrorType b;
  
  public AdError(AdErrorType paramAdErrorType, int paramInt, String paramString) {}
  
  public AdError(AdErrorType paramAdErrorType, AdErrorCode paramAdErrorCode, String paramString)
  {
    super(paramString);
    b = paramAdErrorType;
    a = paramAdErrorCode;
  }
  
  public final AdErrorCode getErrorCode()
  {
    return a;
  }
  
  public final int getErrorCodeNumber()
  {
    return a.getErrorNumber();
  }
  
  public final AdErrorType getErrorType()
  {
    return b;
  }
  
  public final String getMessage()
  {
    return super.getMessage();
  }
  
  public final String toString()
  {
    String str1 = String.valueOf(b);
    String str2 = String.valueOf(a);
    String str3 = getMessage();
    int i = str1.length();
    return a.p(a.q(a.b(str3, str2.length() + (i + 45)), "AdError [errorType: ", str1, ", errorCode: ", str2), ", message: ", str3, "]");
  }
  
  public static enum AdErrorCode
  {
    private final int a;
    
    static
    {
      AdErrorCode localAdErrorCode1 = new AdErrorCode("INTERNAL_ERROR", 0, -1);
      INTERNAL_ERROR = localAdErrorCode1;
      AdErrorCode localAdErrorCode2 = new AdErrorCode("VAST_MALFORMED_RESPONSE", 1, 100);
      VAST_MALFORMED_RESPONSE = localAdErrorCode2;
      AdErrorCode localAdErrorCode3 = new AdErrorCode("UNKNOWN_AD_RESPONSE", 2, 1010);
      UNKNOWN_AD_RESPONSE = localAdErrorCode3;
      AdErrorCode localAdErrorCode4 = new AdErrorCode("VAST_TRAFFICKING_ERROR", 3, 200);
      VAST_TRAFFICKING_ERROR = localAdErrorCode4;
      AdErrorCode localAdErrorCode5 = new AdErrorCode("VAST_LOAD_TIMEOUT", 4, 301);
      VAST_LOAD_TIMEOUT = localAdErrorCode5;
      AdErrorCode localAdErrorCode6 = new AdErrorCode("VAST_TOO_MANY_REDIRECTS", 5, 302);
      VAST_TOO_MANY_REDIRECTS = localAdErrorCode6;
      AdErrorCode localAdErrorCode7 = new AdErrorCode("VIDEO_PLAY_ERROR", 6, 400);
      VIDEO_PLAY_ERROR = localAdErrorCode7;
      AdErrorCode localAdErrorCode8 = new AdErrorCode("VAST_MEDIA_LOAD_TIMEOUT", 7, 402);
      VAST_MEDIA_LOAD_TIMEOUT = localAdErrorCode8;
      AdErrorCode localAdErrorCode9 = new AdErrorCode("VAST_LINEAR_ASSET_MISMATCH", 8, 403);
      VAST_LINEAR_ASSET_MISMATCH = localAdErrorCode9;
      AdErrorCode localAdErrorCode10 = new AdErrorCode("OVERLAY_AD_PLAYING_FAILED", 9, 500);
      OVERLAY_AD_PLAYING_FAILED = localAdErrorCode10;
      AdErrorCode localAdErrorCode11 = new AdErrorCode("OVERLAY_AD_LOADING_FAILED", 10, 502);
      OVERLAY_AD_LOADING_FAILED = localAdErrorCode11;
      AdErrorCode localAdErrorCode12 = new AdErrorCode("VAST_NONLINEAR_ASSET_MISMATCH", 11, 503);
      VAST_NONLINEAR_ASSET_MISMATCH = localAdErrorCode12;
      AdErrorCode localAdErrorCode13 = new AdErrorCode("COMPANION_AD_LOADING_FAILED", 12, 603);
      COMPANION_AD_LOADING_FAILED = localAdErrorCode13;
      AdErrorCode localAdErrorCode14 = new AdErrorCode("UNKNOWN_ERROR", 13, 900);
      UNKNOWN_ERROR = localAdErrorCode14;
      AdErrorCode localAdErrorCode15 = new AdErrorCode("VAST_EMPTY_RESPONSE", 14, 1009);
      VAST_EMPTY_RESPONSE = localAdErrorCode15;
      AdErrorCode localAdErrorCode16 = new AdErrorCode("FAILED_TO_REQUEST_ADS", 15, 1005);
      FAILED_TO_REQUEST_ADS = localAdErrorCode16;
      AdErrorCode localAdErrorCode17 = new AdErrorCode("VAST_ASSET_NOT_FOUND", 16, 1007);
      VAST_ASSET_NOT_FOUND = localAdErrorCode17;
      AdErrorCode localAdErrorCode18 = new AdErrorCode("ADS_REQUEST_NETWORK_ERROR", 17, 1012);
      ADS_REQUEST_NETWORK_ERROR = localAdErrorCode18;
      AdErrorCode localAdErrorCode19 = new AdErrorCode("INVALID_ARGUMENTS", 18, 1101);
      INVALID_ARGUMENTS = localAdErrorCode19;
      AdErrorCode localAdErrorCode20 = new AdErrorCode("PLAYLIST_NO_CONTENT_TRACKING", 19, 1205);
      PLAYLIST_NO_CONTENT_TRACKING = localAdErrorCode20;
      b = new AdErrorCode[] { localAdErrorCode1, localAdErrorCode2, localAdErrorCode3, localAdErrorCode4, localAdErrorCode5, localAdErrorCode6, localAdErrorCode7, localAdErrorCode8, localAdErrorCode9, localAdErrorCode10, localAdErrorCode11, localAdErrorCode12, localAdErrorCode13, localAdErrorCode14, localAdErrorCode15, localAdErrorCode16, localAdErrorCode17, localAdErrorCode18, localAdErrorCode19, localAdErrorCode20 };
    }
    
    private AdErrorCode(int paramInt)
    {
      a = paramInt;
    }
    
    public final boolean equals(int paramInt)
    {
      return a == paramInt;
    }
    
    public final int getErrorNumber()
    {
      return a;
    }
    
    public final String toString()
    {
      String str = name();
      int i = a;
      StringBuilder localStringBuilder = new StringBuilder(a.b(str, 41));
      localStringBuilder.append("AdErrorCode [name: ");
      localStringBuilder.append(str);
      localStringBuilder.append(", number: ");
      localStringBuilder.append(i);
      localStringBuilder.append("]");
      return localStringBuilder.toString();
    }
  }
  
  public static enum AdErrorType
  {
    static
    {
      AdErrorType localAdErrorType1 = new AdErrorType("LOAD", 0);
      LOAD = localAdErrorType1;
      AdErrorType localAdErrorType2 = new AdErrorType("PLAY", 1);
      PLAY = localAdErrorType2;
      a = new AdErrorType[] { localAdErrorType1, localAdErrorType2 };
    }
    
    private AdErrorType() {}
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.api.AdError
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */