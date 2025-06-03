package com.google.ads.interactivemedia.v3.api;

import android.view.View;
import android.view.ViewGroup;
import java.util.Collection;

public abstract interface BaseDisplayContainer
{
  public abstract void destroy();
  
  public abstract ViewGroup getAdContainer();
  
  public abstract Collection<CompanionAdSlot> getCompanionSlots();
  
  public abstract void registerVideoControlsOverlay(View paramView);
  
  public abstract void setAdContainer(ViewGroup paramViewGroup);
  
  public abstract void setCompanionSlots(Collection<CompanionAdSlot> paramCollection);
  
  public abstract void unregisterAllVideoControlsOverlays();
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.api.BaseDisplayContainer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */