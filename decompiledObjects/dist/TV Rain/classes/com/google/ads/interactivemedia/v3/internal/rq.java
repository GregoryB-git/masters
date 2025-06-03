package com.google.ads.interactivemedia.v3.internal;

import android.text.TextUtils;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class rq
  implements fw
{
  private static final Pattern a = Pattern.compile("LOCAL:([^,]+)");
  private static final Pattern b = Pattern.compile("MPEGTS:(\\d+)");
  private final String c;
  private final wi d;
  private final vy e;
  private fy f;
  private byte[] g;
  private int h;
  
  public rq(String paramString, wi paramwi)
  {
    c = paramString;
    d = paramwi;
    e = new vy();
    g = new byte['Ѐ'];
  }
  
  private final gi a(long paramLong)
  {
    gi localgi = f.a(0, 3);
    localgi.a(bw.a(null, "text/vtt", null, -1, 0, c, null, paramLong));
    f.a();
    return localgi;
  }
  
  public final int a(fz paramfz, gf paramgf)
    throws IOException, InterruptedException
  {
    int i = (int)paramfz.d();
    int j = h;
    paramgf = g;
    if (j == paramgf.length)
    {
      if (i != -1) {
        j = i;
      } else {
        j = paramgf.length;
      }
      g = Arrays.copyOf(paramgf, j * 3 / 2);
    }
    paramgf = g;
    j = h;
    j = paramfz.a(paramgf, j, paramgf.length - j);
    if (j != -1)
    {
      j = h + j;
      h = j;
      if ((i == -1) || (j != i)) {
        return 0;
      }
    }
    vy localvy = new vy(g);
    sm.a(localvy);
    long l1 = 0L;
    long l2 = l1;
    for (;;)
    {
      String str = localvy.s();
      if (TextUtils.isEmpty(str)) {
        break;
      }
      if (str.startsWith("X-TIMESTAMP-MAP"))
      {
        paramfz = a.matcher(str);
        if (!paramfz.find())
        {
          if (str.length() != 0) {
            paramfz = "X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(str);
          } else {
            paramfz = new String("X-TIMESTAMP-MAP doesn't contain local timestamp: ");
          }
          throw new ce(paramfz);
        }
        paramgf = b.matcher(str);
        if (!paramgf.find())
        {
          if (str.length() != 0) {
            paramfz = "X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(str);
          } else {
            paramfz = new String("X-TIMESTAMP-MAP doesn't contain media timestamp: ");
          }
          throw new ce(paramfz);
        }
        l2 = sm.a(paramfz.group(1));
        l1 = wi.d(Long.parseLong(paramgf.group(1)));
      }
    }
    paramfz = sm.c(localvy);
    if (paramfz == null)
    {
      a(0L);
    }
    else
    {
      long l3 = sm.a(paramfz.group(1));
      l2 = d.b(wi.e(l1 + l3 - l2));
      paramfz = a(l2 - l3);
      e.a(g, h);
      paramfz.a(e, h);
      paramfz.a(l2, 1, h, 0, null);
    }
    return -1;
  }
  
  public final void a(long paramLong1, long paramLong2)
  {
    throw new IllegalStateException();
  }
  
  public final void a(fy paramfy)
  {
    f = paramfy;
    paramfy.a(new gg(-9223372036854775807L));
  }
  
  public final boolean a(fz paramfz)
    throws IOException, InterruptedException
  {
    paramfz.b(g, 0, 6, false);
    e.a(g, 6);
    if (sm.b(e)) {
      return true;
    }
    paramfz.b(g, 6, 3, false);
    e.a(g, 9);
    return sm.b(e);
  }
  
  public final void c() {}
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.rq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */