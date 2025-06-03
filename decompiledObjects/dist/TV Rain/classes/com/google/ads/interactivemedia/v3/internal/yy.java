package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

final class yy
  implements Serializable, ParameterizedType
{
  private static final long serialVersionUID = 0L;
  private final Type a;
  private final Type b;
  private final Type[] c;
  
  public yy(Type paramType1, Type paramType2, Type... paramVarArgs)
  {
    boolean bool1 = paramType2 instanceof Class;
    int i = 0;
    if (bool1)
    {
      Class localClass = (Class)paramType2;
      bool1 = Modifier.isStatic(localClass.getModifiers());
      boolean bool2 = true;
      if ((!bool1) && (localClass.getEnclosingClass() != null)) {
        j = 0;
      } else {
        j = 1;
      }
      bool1 = bool2;
      if (paramType1 == null) {
        if (j != 0) {
          bool1 = bool2;
        } else {
          bool1 = false;
        }
      }
      uw.a(bool1);
    }
    if (paramType1 == null) {
      paramType1 = null;
    } else {
      paramType1 = yw.a(paramType1);
    }
    a = paramType1;
    b = yw.a(paramType2);
    paramType1 = (Type[])paramVarArgs.clone();
    c = paramType1;
    int k = paramType1.length;
    for (int j = i; j < k; j++)
    {
      uw.a(c[j]);
      yw.d(c[j]);
      paramType1 = c;
      paramType1[j] = yw.a(paramType1[j]);
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    return ((paramObject instanceof ParameterizedType)) && (yw.a(this, (ParameterizedType)paramObject));
  }
  
  public final Type[] getActualTypeArguments()
  {
    return (Type[])c.clone();
  }
  
  public final Type getOwnerType()
  {
    return a;
  }
  
  public final Type getRawType()
  {
    return b;
  }
  
  public final int hashCode()
  {
    int i = Arrays.hashCode(c);
    int j = b.hashCode();
    Type localType = a;
    int k;
    if (localType != null) {
      k = localType.hashCode();
    } else {
      k = 0;
    }
    return i ^ j ^ k;
  }
  
  public final String toString()
  {
    int i = c.length;
    if (i == 0) {
      return yw.c(b);
    }
    StringBuilder localStringBuilder = new StringBuilder((i + 1) * 30);
    localStringBuilder.append(yw.c(b));
    localStringBuilder.append("<");
    localStringBuilder.append(yw.c(c[0]));
    for (int j = 1; j < i; j++)
    {
      localStringBuilder.append(", ");
      localStringBuilder.append(yw.c(c[j]));
    }
    localStringBuilder.append(">");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.yy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */