package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

public final class l
  implements s
{
  public final s o;
  public final String p;
  
  public l(String paramString)
  {
    o = s.d;
    p = paramString;
  }
  
  public l(String paramString, s params)
  {
    o = params;
    p = paramString;
  }
  
  public final s a()
  {
    return o;
  }
  
  public final String b()
  {
    return p;
  }
  
  public final s c()
  {
    return new l(p, o.c());
  }
  
  public final Boolean d()
  {
    throw new IllegalStateException("Control is not a boolean");
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof l)) {
      return false;
    }
    String str = p;
    paramObject = (l)paramObject;
    return (str.equals(p)) && (o.equals(o));
  }
  
  public final Double f()
  {
    throw new IllegalStateException("Control is not a double");
  }
  
  public final String g()
  {
    throw new IllegalStateException("Control is not a String");
  }
  
  public final int hashCode()
  {
    return p.hashCode() * 31 + o.hashCode();
  }
  
  public final Iterator k()
  {
    return null;
  }
  
  public final s s(String paramString, f3 paramf3, List paramList)
  {
    throw new IllegalStateException("Control does not have functions");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */