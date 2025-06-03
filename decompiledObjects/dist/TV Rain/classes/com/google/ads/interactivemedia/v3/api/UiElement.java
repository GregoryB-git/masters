package com.google.ads.interactivemedia.v3.api;

import com.google.ads.interactivemedia.v3.impl.data.al;

public abstract interface UiElement
{
  public static final UiElement AD_ATTRIBUTION = new al("adAttribution");
  public static final UiElement COUNTDOWN = new al("countdown");
  
  public abstract String getName();
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.api.UiElement
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */