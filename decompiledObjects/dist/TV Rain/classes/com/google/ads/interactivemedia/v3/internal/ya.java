package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

final class ya<T>
  extends yn<T>
{
  private yn<T> a;
  
  public final void a(yn<T> paramyn)
  {
    if (a == null)
    {
      a = paramyn;
      return;
    }
    throw new AssertionError();
  }
  
  public final T read(ada paramada)
    throws IOException
  {
    yn localyn = a;
    if (localyn != null) {
      return (T)localyn.read(paramada);
    }
    throw new IllegalStateException();
  }
  
  public final void write(adb paramadb, T paramT)
    throws IOException
  {
    yn localyn = a;
    if (localyn != null)
    {
      localyn.write(paramadb, paramT);
      return;
    }
    throw new IllegalStateException();
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ya
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */