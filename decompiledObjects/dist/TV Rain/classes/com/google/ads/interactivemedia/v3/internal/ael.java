package com.google.ads.interactivemedia.v3.internal;

import a;
import com.google.ads.interactivemedia.v3.api.ImaSdkSettings;

public final class ael
  implements ImaSdkSettings
{
  private boolean autoPlayAdBreaks = true;
  private boolean debugMode = false;
  private transient String language = "en";
  private int numRedirects = 4;
  private String playerType;
  private String playerVersion;
  private String ppid;
  private transient boolean restrictToCustomPlayer;
  private final boolean supportsMultipleVideoDisplayChannels = true;
  
  public final boolean doesRestrictToCustomPlayer()
  {
    return restrictToCustomPlayer;
  }
  
  public final boolean getAutoPlayAdBreaks()
  {
    return autoPlayAdBreaks;
  }
  
  public final String getLanguage()
  {
    return language;
  }
  
  public final int getMaxRedirects()
  {
    return numRedirects;
  }
  
  public final String getPlayerType()
  {
    return playerType;
  }
  
  public final String getPlayerVersion()
  {
    return playerVersion;
  }
  
  public final String getPpid()
  {
    return ppid;
  }
  
  public final boolean isDebugMode()
  {
    return debugMode;
  }
  
  public final void setAutoPlayAdBreaks(boolean paramBoolean)
  {
    autoPlayAdBreaks = paramBoolean;
  }
  
  public final void setDebugMode(boolean paramBoolean)
  {
    debugMode = paramBoolean;
  }
  
  public final void setLanguage(String paramString)
  {
    language = paramString;
  }
  
  public final void setMaxRedirects(int paramInt)
  {
    numRedirects = paramInt;
  }
  
  public final void setPlayerType(String paramString)
  {
    playerType = paramString;
  }
  
  public final void setPlayerVersion(String paramString)
  {
    playerVersion = paramString;
  }
  
  public final void setPpid(String paramString)
  {
    ppid = paramString;
  }
  
  public final void setRestrictToCustomPlayer(boolean paramBoolean)
  {
    restrictToCustomPlayer = paramBoolean;
  }
  
  public final String toString()
  {
    String str1 = ppid;
    int i = numRedirects;
    String str2 = playerType;
    String str3 = playerVersion;
    String str4 = language;
    boolean bool1 = restrictToCustomPlayer;
    boolean bool2 = autoPlayAdBreaks;
    StringBuilder localStringBuilder = new StringBuilder(a.b(str4, a.b(str3, a.b(str2, a.b(str1, 136)))));
    localStringBuilder.append("ImaSdkSettings [ppid=");
    localStringBuilder.append(str1);
    localStringBuilder.append(", numRedirects=");
    localStringBuilder.append(i);
    a.C(localStringBuilder, ", playerType=", str2, ", playerVersion=", str3);
    localStringBuilder.append(", language=");
    localStringBuilder.append(str4);
    localStringBuilder.append(", restrictToCustom=");
    localStringBuilder.append(bool1);
    localStringBuilder.append(", autoPlayAdBreaks=");
    localStringBuilder.append(bool2);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ael
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */