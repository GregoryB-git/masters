package com.google.ads.interactivemedia.v3.internal;

import java.util.Collections;
import java.util.List;

public final class il
  implements ik
{
  private final List<ji> a;
  private final gi[] b;
  private boolean c;
  private int d;
  private int e;
  private long f;
  
  public il(List<ji> paramList)
  {
    a = paramList;
    b = new gi[paramList.size()];
  }
  
  private final boolean a(vy paramvy, int paramInt)
  {
    if (paramvy.b() == 0) {
      return false;
    }
    if (paramvy.e() != paramInt) {
      c = false;
    }
    d -= 1;
    return c;
  }
  
  public final void a()
  {
    c = false;
  }
  
  public final void a(long paramLong, int paramInt)
  {
    if ((paramInt & 0x4) == 0) {
      return;
    }
    c = true;
    f = paramLong;
    e = 0;
    d = 2;
  }
  
  public final void a(fy paramfy, jn paramjn)
  {
    for (int i = 0; i < b.length; i++)
    {
      ji localji = (ji)a.get(i);
      paramjn.a();
      gi localgi = paramfy.a(paramjn.b(), 3);
      localgi.a(bw.a(paramjn.c(), "application/dvbsubs", null, -1, 0, Collections.singletonList(b), a, null));
      b[i] = localgi;
    }
  }
  
  public final void a(vy paramvy)
  {
    if (c)
    {
      if ((d == 2) && (!a(paramvy, 32))) {
        return;
      }
      int i = d;
      int j = 0;
      if ((i == 1) && (!a(paramvy, 0))) {
        return;
      }
      i = paramvy.d();
      int k = paramvy.b();
      gi[] arrayOfgi = b;
      int m = arrayOfgi.length;
      while (j < m)
      {
        gi localgi = arrayOfgi[j];
        paramvy.c(i);
        localgi.a(paramvy, k);
        j++;
      }
      e += k;
    }
  }
  
  public final void b()
  {
    if (c)
    {
      gi[] arrayOfgi = b;
      int i = arrayOfgi.length;
      for (int j = 0; j < i; j++) {
        arrayOfgi[j].a(f, 1, e, 0, null);
      }
      c = false;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.il
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */