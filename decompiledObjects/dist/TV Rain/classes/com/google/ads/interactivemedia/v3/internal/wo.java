package com.google.ads.interactivemedia.v3.internal;

public final class wo
{
  public final String a;
  
  private wo(int paramInt1, int paramInt2, String paramString)
  {
    a = paramString;
  }
  
  public static wo a(vy paramvy)
  {
    paramvy.d(2);
    int i = paramvy.e();
    int j = i >> 1;
    i = paramvy.e() >> 3 & 0x1F | (i & 0x1) << 5;
    if ((j != 4) && (j != 5))
    {
      if (j == 8) {
        paramvy = "hev1";
      } else if (j == 9) {
        paramvy = "avc3";
      } else {
        return null;
      }
    }
    else {
      paramvy = "dvhe";
    }
    StringBuilder localStringBuilder = new StringBuilder(paramvy.length() + 26);
    localStringBuilder.append(paramvy);
    localStringBuilder.append(".0");
    localStringBuilder.append(j);
    localStringBuilder.append(".0");
    localStringBuilder.append(i);
    return new wo(j, i, localStringBuilder.toString());
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.wo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */