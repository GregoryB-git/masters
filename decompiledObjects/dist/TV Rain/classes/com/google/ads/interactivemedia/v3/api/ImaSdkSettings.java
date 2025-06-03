package com.google.ads.interactivemedia.v3.api;

public abstract interface ImaSdkSettings
{
  public static final int DEFAULT_MAX_REDIRECTS = 4;
  
  public abstract boolean doesRestrictToCustomPlayer();
  
  public abstract boolean getAutoPlayAdBreaks();
  
  public abstract String getLanguage();
  
  public abstract int getMaxRedirects();
  
  public abstract String getPlayerType();
  
  public abstract String getPlayerVersion();
  
  public abstract String getPpid();
  
  public abstract boolean isDebugMode();
  
  public abstract void setAutoPlayAdBreaks(boolean paramBoolean);
  
  public abstract void setDebugMode(boolean paramBoolean);
  
  public abstract void setLanguage(String paramString);
  
  public abstract void setMaxRedirects(int paramInt);
  
  public abstract void setPlayerType(String paramString);
  
  public abstract void setPlayerVersion(String paramString);
  
  public abstract void setPpid(String paramString);
  
  public abstract void setRestrictToCustomPlayer(boolean paramBoolean);
  
  public abstract String toString();
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.api.ImaSdkSettings
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */