package com.google.ads.interactivemedia.v3.api;

public abstract interface AdErrorEvent
{
  public abstract AdError getError();
  
  public abstract Object getUserRequestContext();
  
  public static abstract interface AdErrorListener
  {
    public abstract void onAdError(AdErrorEvent paramAdErrorEvent);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.api.AdErrorEvent
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */