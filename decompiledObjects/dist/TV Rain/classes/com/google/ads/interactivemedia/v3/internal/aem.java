package com.google.ads.interactivemedia.v3.internal;

public enum aem
{
  static
  {
    aem localaem1 = new aem("VERBOSE", 0);
    a = localaem1;
    aem localaem2 = new aem("ABRIDGED", 1);
    b = localaem2;
    aem localaem3 = new aem("LIFECYCLE", 2);
    c = localaem3;
    aem localaem4 = new aem("PROD", 3);
    d = localaem4;
    e = new aem[] { localaem1, localaem2, localaem3, localaem4 };
  }
  
  private aem() {}
  
  public static boolean a(aem paramaem)
  {
    return paramaem.ordinal() >= aej.a.ordinal();
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.aem
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */