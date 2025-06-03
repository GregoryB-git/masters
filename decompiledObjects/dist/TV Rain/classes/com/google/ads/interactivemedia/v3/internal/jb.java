package com.google.ads.interactivemedia.v3.internal;

import java.util.List;

public final class jb
{
  private final List<bw> a;
  private final gi[] b;
  
  public jb(List<bw> paramList)
  {
    a = paramList;
    b = new gi[paramList.size()];
  }
  
  public final void a(long paramLong, vy paramvy)
  {
    rp.a(paramLong, paramvy, b);
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
      str2 = a;
      if (str2 == null) {
        str2 = paramjn.c();
      }
      localgi.a(bw.a(str2, str1, null, -1, c, y, z, null, Long.MAX_VALUE, k));
      b[i] = localgi;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.jb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */