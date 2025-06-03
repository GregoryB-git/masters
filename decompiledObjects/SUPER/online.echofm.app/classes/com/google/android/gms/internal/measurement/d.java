package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class d
{
  public e a;
  public e b;
  public List c;
  
  public d()
  {
    a = new e("", 0L, null);
    b = new e("", 0L, null);
    c = new ArrayList();
  }
  
  public d(e parame)
  {
    a = parame;
    b = ((e)parame.clone());
    c = new ArrayList();
  }
  
  public final e a()
  {
    return a;
  }
  
  public final void b(e parame)
  {
    a = parame;
    b = ((e)parame.clone());
    c.clear();
  }
  
  public final void c(String paramString, long paramLong, Map paramMap)
  {
    HashMap localHashMap = new HashMap();
    Iterator localIterator = paramMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localHashMap.put(str, e.c(str, a.b(str), paramMap.get(str)));
    }
    c.add(new e(paramString, paramLong, localHashMap));
  }
  
  public final e d()
  {
    return b;
  }
  
  public final void e(e parame)
  {
    b = parame;
  }
  
  public final List f()
  {
    return c;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */