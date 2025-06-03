package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;

public final class pg
{
  private final rt a;
  private final ts b;
  private fj<?> c;
  private uy<? extends aaa> d;
  private ly e;
  private un f;
  private long g;
  
  private pg(rt paramrt, ts paramts)
  {
    a = ((rt)rp.a(paramrt));
    b = paramts;
    c = h.h();
    f = new un();
    g = 30000L;
    e = new ly();
  }
  
  public pg(ts paramts)
  {
    this(new rt(paramts), paramts);
  }
  
  public final pc a(Uri paramUri)
  {
    if (d == null) {
      d = new pw();
    }
    return new pc(null, (Uri)rp.a(paramUri), b, d, a, e, c, f, g, false, null, (byte)0);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.pg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */