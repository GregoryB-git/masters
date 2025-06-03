package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

final class zq
  extends yn
{
  private yn a;
  
  public zq(zn paramzn, boolean paramBoolean1, boolean paramBoolean2, xu paramxu, acx paramacx) {}
  
  private final yn a()
  {
    yn localyn = a;
    if (localyn != null) {
      return localyn;
    }
    localyn = d.a(f, e);
    a = localyn;
    return localyn;
  }
  
  public final Object read(ada paramada)
    throws IOException
  {
    if (b)
    {
      paramada.n();
      return null;
    }
    return a().read(paramada);
  }
  
  public final void write(adb paramadb, Object paramObject)
    throws IOException
  {
    if (c)
    {
      paramadb.f();
      return;
    }
    a().write(paramadb, paramObject);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.zq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */