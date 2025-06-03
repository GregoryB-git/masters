package com.google.ads.interactivemedia.v3.api;

import java.util.List;
import java.util.Set;

public abstract interface AdsRenderingSettings
{
  public abstract int getBitrateKbps();
  
  public abstract boolean getDisableUi();
  
  public abstract boolean getEnablePreloading();
  
  public abstract boolean getFocusSkipButtonWhenAvailable();
  
  public abstract List<String> getMimeTypes();
  
  public abstract boolean isRenderCompanions();
  
  public abstract void setBitrateKbps(int paramInt);
  
  public abstract void setDisableUi(boolean paramBoolean);
  
  public abstract void setEnablePreloading(boolean paramBoolean);
  
  public abstract void setFocusSkipButtonWhenAvailable(boolean paramBoolean);
  
  public abstract void setLoadVideoTimeout(int paramInt);
  
  public abstract void setMimeTypes(List<String> paramList);
  
  public abstract void setPlayAdsAfterTime(double paramDouble);
  
  public abstract void setRenderCompanions(boolean paramBoolean);
  
  public abstract void setUiElements(Set<UiElement> paramSet);
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.api.AdsRenderingSettings
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */