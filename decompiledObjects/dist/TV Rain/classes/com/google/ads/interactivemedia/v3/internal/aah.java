package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.GenericArrayType;

final class aah
  implements yp
{
  public final <T> yn<T> a(xu paramxu, acx<T> paramacx)
  {
    paramacx = paramacx.b();
    boolean bool = paramacx instanceof GenericArrayType;
    if ((!bool) && ((!(paramacx instanceof Class)) || (!((Class)paramacx).isArray()))) {
      return null;
    }
    if (bool) {
      paramacx = ((GenericArrayType)paramacx).getGenericComponentType();
    } else {
      paramacx = ((Class)paramacx).getComponentType();
    }
    return new aai(paramxu, paramxu.a(acx.a(paramacx)), yw.b(paramacx));
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.aah
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */