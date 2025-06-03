package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class f3
{
  public final f3 a;
  public E b;
  public Map c = new HashMap();
  public Map d = new HashMap();
  
  public f3(f3 paramf3, E paramE)
  {
    a = paramf3;
    b = paramE;
  }
  
  public final s a(g paramg)
  {
    Object localObject = s.d;
    Iterator localIterator = paramg.Z();
    while (localIterator.hasNext())
    {
      int i = ((Integer)localIterator.next()).intValue();
      s locals = b.a(this, paramg.M(i));
      localObject = locals;
      if ((locals instanceof l)) {
        localObject = locals;
      }
    }
    return (s)localObject;
  }
  
  public final s b(s params)
  {
    return b.a(this, params);
  }
  
  public final s c(String paramString)
  {
    f3 localf3 = this;
    do
    {
      if (c.containsKey(paramString)) {
        return (s)c.get(paramString);
      }
      localf3 = a;
    } while (localf3 != null);
    throw new IllegalArgumentException(String.format("%s is not defined", new Object[] { paramString }));
  }
  
  public final f3 d()
  {
    return new f3(this, b);
  }
  
  public final void e(String paramString, s params)
  {
    if (!d.containsKey(paramString))
    {
      if (params == null)
      {
        c.remove(paramString);
        return;
      }
      c.put(paramString, params);
    }
  }
  
  public final void f(String paramString, s params)
  {
    e(paramString, params);
    d.put(paramString, Boolean.TRUE);
  }
  
  public final boolean g(String paramString)
  {
    f3 localf3 = this;
    do
    {
      if (c.containsKey(paramString)) {
        return true;
      }
      localf3 = a;
    } while (localf3 != null);
    return false;
  }
  
  public final void h(String paramString, s params)
  {
    for (f3 localf31 = this; !c.containsKey(paramString); localf31 = a)
    {
      f3 localf32 = a;
      if ((localf32 == null) || (!localf32.g(paramString))) {
        break;
      }
    }
    if (!d.containsKey(paramString))
    {
      if (params == null)
      {
        c.remove(paramString);
        return;
      }
      c.put(paramString, params);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.f3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */