package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.internal.agz;

@agz(a=d.class)
public abstract class a
{
  public static c builder()
  {
    return new f();
  }
  
  public abstract String appState();
  
  public abstract String eventId();
  
  public abstract long nativeTime();
  
  public abstract boolean nativeViewAttached();
  
  public abstract y nativeViewBounds();
  
  public abstract boolean nativeViewHidden();
  
  public abstract y nativeViewVisibleBounds();
  
  public abstract double nativeVolume();
  
  public abstract String queryId();
  
  public abstract String vastEvent();
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.impl.data.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */