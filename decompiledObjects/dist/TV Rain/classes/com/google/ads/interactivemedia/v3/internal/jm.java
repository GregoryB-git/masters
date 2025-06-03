package com.google.ads.interactivemedia.v3.internal;

import java.util.List;

final class jm
{
  private final List<bw> a;
  private final gi[] b;
  
  public jm(List<bw> paramList)
  {
    a = paramList;
    b = new gi[paramList.size()];
  }
  
  public final void a(long paramLong, vy paramvy)
  {
    if (paramvy.b() < 9) {
      return;
    }
    int i = paramvy.l();
    int j = paramvy.l();
    int k = paramvy.e();
    if ((i == 434) && (j == 1195456820) && (k == 3)) {
      rp.b(paramLong, paramvy, b);
    }
  }
  
  public final void a(fy paramfy, jn paramjn)
  {
    for (int i = 0; i < b.length; i++)
    {
      paramjn.a();
      gi localgi = paramfy.a(paramjn.b(), 3);
      bw localbw = (bw)a.get(i);
      String str1 = i;
      boolean bool;
      if ((!"application/cea-608".equals(str1)) && (!"application/cea-708".equals(str1))) {
        bool = false;
      } else {
        bool = true;
      }
      String str2 = String.valueOf(str1);
      if (str2.length() != 0) {
        str2 = "Invalid closed caption mime type provided: ".concat(str2);
      } else {
        str2 = new String("Invalid closed caption mime type provided: ");
      }
      rp.a(bool, str2);
      localgi.a(bw.a(paramjn.c(), str1, null, -1, c, y, z, null, Long.MAX_VALUE, k));
      b[i] = localgi;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.jm
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */