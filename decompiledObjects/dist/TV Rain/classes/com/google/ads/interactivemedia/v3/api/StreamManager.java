package com.google.ads.interactivemedia.v3.api;

import java.util.List;

public abstract interface StreamManager
  extends BaseManager
{
  public abstract double getContentTimeForStreamTime(double paramDouble);
  
  public abstract List<CuePoint> getCuePoints();
  
  public abstract CuePoint getPreviousCuePointForStreamTime(double paramDouble);
  
  public abstract String getStreamId();
  
  public abstract double getStreamTimeForContentTime(double paramDouble);
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.api.StreamManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */