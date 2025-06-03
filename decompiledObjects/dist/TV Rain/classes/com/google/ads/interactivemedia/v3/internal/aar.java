package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.Type;
import java.util.Map;

public final class aar
  implements yp
{
  public final boolean a;
  private final za b;
  
  public aar(za paramza, boolean paramBoolean)
  {
    b = paramza;
    a = paramBoolean;
  }
  
  public final <T> yn<T> a(xu paramxu, acx<T> paramacx)
  {
    Object localObject = paramacx.b();
    if (!Map.class.isAssignableFrom(paramacx.a())) {
      return null;
    }
    Type[] arrayOfType = yw.b((Type)localObject, yw.b((Type)localObject));
    localObject = arrayOfType[0];
    if ((localObject != Boolean.TYPE) && (localObject != Boolean.class)) {
      localObject = paramxu.a(acx.a((Type)localObject));
    } else {
      localObject = abi.c;
    }
    yn localyn = paramxu.a(acx.a(arrayOfType[1]));
    paramacx = b.a(paramacx);
    return new aau(this, paramxu, arrayOfType[0], (yn)localObject, arrayOfType[1], localyn, paramacx);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.aar
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */