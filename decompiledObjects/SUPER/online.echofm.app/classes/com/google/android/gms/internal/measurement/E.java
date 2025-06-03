package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class E
{
  public Map a = new HashMap();
  public U b = new U();
  
  public E()
  {
    b(new y());
    b(new D());
    b(new F());
    b(new J());
    b(new L());
    b(new S());
    b(new X());
  }
  
  public final s a(f3 paramf3, s params)
  {
    C2.b(paramf3);
    if ((params instanceof v))
    {
      params = (v)params;
      ArrayList localArrayList = params.b();
      String str = params.a();
      if (a.containsKey(str)) {
        params = (A)a.get(str);
      } else {
        params = b;
      }
      return params.b(str, paramf3, localArrayList);
    }
    return params;
  }
  
  public final void b(A paramA)
  {
    Iterator localIterator = a.iterator();
    while (localIterator.hasNext())
    {
      String str = ((Z)localIterator.next()).toString();
      a.put(str, paramA);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.E
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */