package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.Type;

public final class acx<T>
{
  private final Class<? super T> a;
  private final Type b;
  private final int c;
  
  public acx()
  {
    Type localType = acx.class.getGenericSuperclass();
    if (!(localType instanceof Class))
    {
      localType = yw.a(((java.lang.reflect.ParameterizedType)localType).getActualTypeArguments()[0]);
      b = localType;
      a = yw.b(localType);
      c = localType.hashCode();
      return;
    }
    throw new RuntimeException("Missing type parameter.");
  }
  
  private acx(Type paramType)
  {
    paramType = yw.a((Type)uw.a(paramType));
    b = paramType;
    a = yw.b(paramType);
    c = paramType.hashCode();
  }
  
  public static <T> acx<T> a(Class<T> paramClass)
  {
    return new acx(paramClass);
  }
  
  public static acx<?> a(Type paramType)
  {
    return new acx(paramType);
  }
  
  public final Class<? super T> a()
  {
    return a;
  }
  
  public final Type b()
  {
    return b;
  }
  
  public final boolean equals(Object paramObject)
  {
    return ((paramObject instanceof acx)) && (yw.a(b, b));
  }
  
  public final int hashCode()
  {
    return c;
  }
  
  public final String toString()
  {
    return yw.c(b);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.acx
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */