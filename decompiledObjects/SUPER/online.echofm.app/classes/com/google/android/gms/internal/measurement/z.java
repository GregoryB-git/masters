package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

public final class z
  implements s
{
  public final s c()
  {
    return s.d;
  }
  
  public final Boolean d()
  {
    return Boolean.FALSE;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    return paramObject instanceof z;
  }
  
  public final Double f()
  {
    return Double.valueOf(NaN.0D);
  }
  
  public final String g()
  {
    return "undefined";
  }
  
  public final Iterator k()
  {
    return null;
  }
  
  public final s s(String paramString, f3 paramf3, List paramList)
  {
    throw new IllegalStateException(String.format("Undefined has no function %s", new Object[] { paramString }));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.z
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */