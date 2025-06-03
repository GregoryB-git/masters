package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

final class yx
  implements Serializable, WildcardType
{
  private static final long serialVersionUID = 0L;
  private final Type a;
  private final Type b;
  
  public yx(Type[] paramArrayOfType1, Type[] paramArrayOfType2)
  {
    int i = paramArrayOfType2.length;
    boolean bool1 = true;
    boolean bool2;
    if (i <= 1) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    uw.a(bool2);
    if (paramArrayOfType1.length == 1) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    uw.a(bool2);
    if (paramArrayOfType2.length == 1)
    {
      uw.a(paramArrayOfType2[0]);
      yw.d(paramArrayOfType2[0]);
      if (paramArrayOfType1[0] == Object.class) {
        bool2 = bool1;
      } else {
        bool2 = false;
      }
      uw.a(bool2);
      b = yw.a(paramArrayOfType2[0]);
      a = Object.class;
      return;
    }
    uw.a(paramArrayOfType1[0]);
    yw.d(paramArrayOfType1[0]);
    b = null;
    a = yw.a(paramArrayOfType1[0]);
  }
  
  public final boolean equals(Object paramObject)
  {
    return ((paramObject instanceof WildcardType)) && (yw.a(this, (WildcardType)paramObject));
  }
  
  public final Type[] getLowerBounds()
  {
    Type localType = b;
    if (localType != null) {
      return new Type[] { localType };
    }
    return yw.a;
  }
  
  public final Type[] getUpperBounds()
  {
    return new Type[] { a };
  }
  
  public final int hashCode()
  {
    Type localType = b;
    int i;
    if (localType != null) {
      i = localType.hashCode() + 31;
    } else {
      i = 1;
    }
    return i ^ a.hashCode() + 31;
  }
  
  public final String toString()
  {
    if (b != null)
    {
      localStringBuilder = new StringBuilder("? super ");
      localStringBuilder.append(yw.c(b));
      return localStringBuilder.toString();
    }
    if (a == Object.class) {
      return "?";
    }
    StringBuilder localStringBuilder = new StringBuilder("? extends ");
    localStringBuilder.append(yw.c(a));
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.yx
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */