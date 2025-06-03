package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

public final class h
  implements s
{
  public final boolean o;
  
  public h(Boolean paramBoolean)
  {
    if (paramBoolean == null) {}
    for (boolean bool = false;; bool = paramBoolean.booleanValue())
    {
      o = bool;
      return;
    }
  }
  
  public final s c()
  {
    return new h(Boolean.valueOf(o));
  }
  
  public final Boolean d()
  {
    return Boolean.valueOf(o);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof h)) {
      return false;
    }
    paramObject = (h)paramObject;
    return o == o;
  }
  
  public final Double f()
  {
    double d;
    if (o) {
      d = 1.0D;
    } else {
      d = 0.0D;
    }
    return Double.valueOf(d);
  }
  
  public final String g()
  {
    return Boolean.toString(o);
  }
  
  public final int hashCode()
  {
    return Boolean.valueOf(o).hashCode();
  }
  
  public final Iterator k()
  {
    return null;
  }
  
  public final s s(String paramString, f3 paramf3, List paramList)
  {
    if ("toString".equals(paramString)) {
      return new u(Boolean.toString(o));
    }
    throw new IllegalArgumentException(String.format("%s.%s is not a function.", new Object[] { Boolean.toString(o), paramString }));
  }
  
  public final String toString()
  {
    return String.valueOf(o);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */