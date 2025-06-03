package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

public final class abe<T>
  extends yn<T>
{
  private final ym<T> a;
  private final ye<T> b;
  private final xu c;
  private final acx<T> d;
  private final yp e;
  private final abd f = new abd(this, (byte)0);
  private yn<T> g;
  
  public abe(ym<T> paramym, ye<T> paramye, xu paramxu, acx<T> paramacx, yp paramyp)
  {
    a = paramym;
    b = paramye;
    c = paramxu;
    d = paramacx;
    e = paramyp;
  }
  
  private final yn<T> a()
  {
    yn localyn = g;
    if (localyn != null) {
      return localyn;
    }
    localyn = c.a(e, d);
    g = localyn;
    return localyn;
  }
  
  public static yp a(acx<?> paramacx, Object paramObject)
  {
    boolean bool;
    if (paramacx.b() == paramacx.a()) {
      bool = true;
    } else {
      bool = false;
    }
    return new abg(paramObject, paramacx, bool, null);
  }
  
  public final T read(ada paramada)
    throws IOException
  {
    if (b == null) {
      return (T)a().read(paramada);
    }
    if ((aaa.a(paramada) instanceof yf)) {
      return null;
    }
    return (T)b.a();
  }
  
  public final void write(adb paramadb, T paramT)
    throws IOException
  {
    ym localym = a;
    if (localym == null)
    {
      a().write(paramadb, paramT);
      return;
    }
    if (paramT == null)
    {
      paramadb.f();
      return;
    }
    aaa.a(localym.a(paramT, d.b(), f), paramadb);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.abe
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */