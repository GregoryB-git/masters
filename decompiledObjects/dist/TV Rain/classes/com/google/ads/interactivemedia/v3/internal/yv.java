package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

final class yv
  implements Serializable, GenericArrayType
{
  private static final long serialVersionUID = 0L;
  private final Type a;
  
  public yv(Type paramType)
  {
    a = yw.a(paramType);
  }
  
  public final boolean equals(Object paramObject)
  {
    return ((paramObject instanceof GenericArrayType)) && (yw.a(this, (GenericArrayType)paramObject));
  }
  
  public final Type getGenericComponentType()
  {
    return a;
  }
  
  public final int hashCode()
  {
    return a.hashCode();
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(yw.c(a));
    localStringBuilder.append("[]");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.yv
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */