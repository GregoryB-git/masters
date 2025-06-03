package com.google.ads.interactivemedia.v3.internal;

final class acf
  implements yp
{
  public final <T> yn<T> a(xu paramxu, acx<T> paramacx)
  {
    paramacx = paramacx.a();
    if ((Enum.class.isAssignableFrom(paramacx)) && (paramacx != Enum.class))
    {
      paramxu = paramacx;
      if (!paramacx.isEnum()) {
        paramxu = paramacx.getSuperclass();
      }
      return new acu(paramxu);
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.acf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */