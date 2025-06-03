package com.google.ads.interactivemedia.v3.api;

import java.util.List;

public abstract interface AdsManager
  extends BaseManager
{
  public abstract void clicked();
  
  public abstract void discardAdBreak();
  
  public abstract void focus();
  
  @Deprecated
  public abstract void focusSkipButton();
  
  public abstract List<Float> getAdCuePoints();
  
  public abstract void pause();
  
  @Deprecated
  public abstract void requestNextAdBreak();
  
  public abstract void resume();
  
  public abstract void skip();
  
  public abstract void start();
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.api.AdsManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */