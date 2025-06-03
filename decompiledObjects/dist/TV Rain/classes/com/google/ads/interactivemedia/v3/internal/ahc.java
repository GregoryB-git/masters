package com.google.ads.interactivemedia.v3.internal;

final class ahc
  extends ahd
{
  public static final ahc a = new ahc();
  private static final int b = Integer.numberOfLeadingZeros(31);
  
  public ahc()
  {
    super("CharMatcher.whitespace()");
  }
  
  public final boolean a(char paramChar)
  {
    return " 　\r   　 \013　   　 \t     \f 　 　　 \n 　".charAt(1682554634 * paramChar >>> b) == paramChar;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ahc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */