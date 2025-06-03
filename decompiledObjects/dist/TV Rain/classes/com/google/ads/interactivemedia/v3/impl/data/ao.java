package com.google.ads.interactivemedia.v3.impl.data;

public abstract class ao
{
  public abstract ap build();
  
  public abstract ao volume(float paramFloat);
  
  public ao volumePercentage(int paramInt)
  {
    return volume(paramInt / 100.0F);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.impl.data.ao
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */