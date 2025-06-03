package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

final class abf<T>
  extends yn<T>
{
  private final xu a;
  private final yn<T> b;
  private final Type c;
  
  public abf(xu paramxu, yn<T> paramyn, Type paramType)
  {
    a = paramxu;
    b = paramyn;
    c = paramType;
  }
  
  public final T read(ada paramada)
    throws IOException
  {
    return (T)b.read(paramada);
  }
  
  public final void write(adb paramadb, T paramT)
    throws IOException
  {
    Object localObject1 = b;
    Object localObject2 = c;
    Object localObject3 = localObject2;
    if (paramT != null) {
      if ((localObject2 != Object.class) && (!(localObject2 instanceof TypeVariable)))
      {
        localObject3 = localObject2;
        if (!(localObject2 instanceof Class)) {}
      }
      else
      {
        localObject3 = paramT.getClass();
      }
    }
    if (localObject3 != c)
    {
      localObject2 = a.a(acx.a((Type)localObject3));
      localObject1 = localObject2;
      if ((localObject2 instanceof aay))
      {
        localObject3 = b;
        localObject1 = localObject2;
        if (!(localObject3 instanceof aay)) {
          localObject1 = localObject3;
        }
      }
    }
    ((yn)localObject1).write(paramadb, paramT);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.abf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */