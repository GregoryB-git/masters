package com.google.ads.interactivemedia.v3.api;

import com.google.ads.interactivemedia.v3.api.player.VideoStreamPlayer;

public abstract interface StreamDisplayContainer
  extends BaseDisplayContainer
{
  public abstract VideoStreamPlayer getVideoStreamPlayer();
  
  public abstract void setVideoStreamPlayer(VideoStreamPlayer paramVideoStreamPlayer);
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.api.StreamDisplayContainer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */