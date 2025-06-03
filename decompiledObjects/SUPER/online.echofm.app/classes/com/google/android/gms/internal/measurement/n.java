package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class n
  implements m, s
{
  public final String o;
  public final Map p = new HashMap();
  
  public n(String paramString)
  {
    o = paramString;
  }
  
  public final void a(String paramString, s params)
  {
    if (params == null)
    {
      p.remove(paramString);
      return;
    }
    p.put(paramString, params);
  }
  
  public abstract s b(f3 paramf3, List paramList);
  
  public s c()
  {
    return this;
  }
  
  public final Boolean d()
  {
    return Boolean.TRUE;
  }
  
  public final String e()
  {
    return o;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof n)) {
      return false;
    }
    paramObject = (n)paramObject;
    String str = o;
    if (str != null) {
      return str.equals(o);
    }
    return false;
  }
  
  public final Double f()
  {
    return Double.valueOf(NaN.0D);
  }
  
  public final String g()
  {
    return o;
  }
  
  public int hashCode()
  {
    String str = o;
    if (str != null) {
      return str.hashCode();
    }
    return 0;
  }
  
  public final s i(String paramString)
  {
    if (p.containsKey(paramString)) {
      return (s)p.get(paramString);
    }
    return s.d;
  }
  
  public final Iterator k()
  {
    return p.b(p);
  }
  
  public final boolean q(String paramString)
  {
    return p.containsKey(paramString);
  }
  
  public final s s(String paramString, f3 paramf3, List paramList)
  {
    if ("toString".equals(paramString)) {
      return new u(o);
    }
    return p.a(this, new u(paramString), paramf3, paramList);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */