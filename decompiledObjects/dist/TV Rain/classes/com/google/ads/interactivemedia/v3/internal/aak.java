package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.Type;
import java.util.Collection;

public final class aak
  implements yp
{
  private final za a;
  
  public aak(za paramza)
  {
    a = paramza;
  }
  
  public final <T> yn<T> a(xu paramxu, acx<T> paramacx)
  {
    Type localType = paramacx.b();
    Class localClass = paramacx.a();
    if (!Collection.class.isAssignableFrom(localClass)) {
      return null;
    }
    localType = yw.a(localType, localClass);
    return new aaj(paramxu, localType, paramxu.a(acx.a(localType)), a.a(paramacx));
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.aak
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */