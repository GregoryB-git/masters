package com.yandex.metrica;

public enum AdType
{
  static
  {
    BANNER = new AdType("BANNER", 1);
    REWARDED = new AdType("REWARDED", 2);
    INTERSTITIAL = new AdType("INTERSTITIAL", 3);
    MREC = new AdType("MREC", 4);
    OTHER = new AdType("OTHER", 5);
  }
  
  private AdType() {}
}

/* Location:
 * Qualified Name:     com.yandex.metrica.AdType
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */