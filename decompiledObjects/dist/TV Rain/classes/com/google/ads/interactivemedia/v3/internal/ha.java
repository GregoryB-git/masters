package com.google.ads.interactivemedia.v3.internal;

class ha
{
  public final int a;
  
  public ha(int paramInt)
  {
    a = paramInt;
  }
  
  public static int a(int paramInt)
  {
    return paramInt >> 24 & 0xFF;
  }
  
  public static String b(int paramInt)
  {
    char c1 = (char)(paramInt >>> 24);
    char c2 = (char)(paramInt >> 16 & 0xFF);
    char c3 = (char)(paramInt >> 8 & 0xFF);
    char c4 = (char)(paramInt & 0xFF);
    StringBuilder localStringBuilder = new StringBuilder(4);
    localStringBuilder.append(c1);
    localStringBuilder.append(c2);
    localStringBuilder.append(c3);
    localStringBuilder.append(c4);
    return localStringBuilder.toString();
  }
  
  public String toString()
  {
    return b(a);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ha
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */