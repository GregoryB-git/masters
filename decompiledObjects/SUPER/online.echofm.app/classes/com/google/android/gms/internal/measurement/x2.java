package com.google.android.gms.internal.measurement;

import W2.s;
import android.content.Context;

public final class x2
  extends Z2
{
  public final Context a;
  public final s b;
  
  public x2(Context paramContext, s params)
  {
    if (paramContext != null)
    {
      a = paramContext;
      b = params;
      return;
    }
    throw new NullPointerException("Null context");
  }
  
  public final Context a()
  {
    return a;
  }
  
  public final s b()
  {
    return b;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof Z2))
    {
      Object localObject = (Z2)paramObject;
      if (a.equals(((Z2)localObject).a()))
      {
        paramObject = b;
        localObject = ((Z2)localObject).b();
        if (paramObject == null ? localObject == null : paramObject.equals(localObject)) {
          return true;
        }
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = a.hashCode();
    s locals = b;
    int j;
    if (locals == null) {
      j = 0;
    } else {
      j = locals.hashCode();
    }
    return (i ^ 0xF4243) * 1000003 ^ j;
  }
  
  public final String toString()
  {
    String str1 = String.valueOf(a);
    String str2 = String.valueOf(b);
    StringBuilder localStringBuilder = new StringBuilder("FlagsContext{context=");
    localStringBuilder.append(str1);
    localStringBuilder.append(", hermeticFileOverrides=");
    localStringBuilder.append(str2);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.x2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */