package com.google.ads.interactivemedia.v3.api;

import com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer;

public abstract interface AdDisplayContainer
  extends BaseDisplayContainer
{
  public abstract VideoAdPlayer getPlayer();
  
  public abstract void setPlayer(VideoAdPlayer paramVideoAdPlayer);
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.api.AdDisplayContainer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */