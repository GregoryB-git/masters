package com.google.ads.interactivemedia.v3.internal;

 enum afu
{
  static
  {
    afu localafu1 = new afu("IDLE", 0);
    a = localafu1;
    afu localafu2 = new afu("LOADED", 1);
    b = localafu2;
    afu localafu3 = new afu("PLAYING", 2);
    c = localafu3;
    afu localafu4 = new afu("PAUSED", 3);
    d = localafu4;
    e = new afu[] { localafu1, localafu2, localafu3, localafu4 };
  }
  
  private afu() {}
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.afu
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */