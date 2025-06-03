package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public final class b
{
  public final TreeMap a = new TreeMap();
  public final TreeMap b = new TreeMap();
  
  public static int a(f3 paramf3, t paramt, s params)
  {
    paramf3 = paramt.b(paramf3, Collections.singletonList(params));
    if ((paramf3 instanceof k)) {
      return C2.i(paramf3.f().doubleValue());
    }
    return -1;
  }
  
  public final void b(f3 paramf3, d paramd)
  {
    X5 localX5 = new X5(paramd);
    Iterator localIterator = a.keySet().iterator();
    while (localIterator.hasNext())
    {
      Integer localInteger = (Integer)localIterator.next();
      localObject = (e)paramd.d().clone();
      int i = a(paramf3, (t)a.get(localInteger), localX5);
      if ((i == 2) || (i == -1)) {
        paramd.e((e)localObject);
      }
    }
    Object localObject = b.keySet().iterator();
    while (((Iterator)localObject).hasNext())
    {
      paramd = (Integer)((Iterator)localObject).next();
      a(paramf3, (t)b.get(paramd), localX5);
    }
  }
  
  public final void c(String paramString1, int paramInt, t paramt, String paramString2)
  {
    if ("create".equals(paramString2))
    {
      paramString1 = b;
    }
    else
    {
      if (!"edit".equals(paramString2)) {
        break label73;
      }
      paramString1 = a;
    }
    int i = paramInt;
    if (paramString1.containsKey(Integer.valueOf(paramInt))) {
      i = ((Integer)paramString1.lastKey()).intValue() + 1;
    }
    paramString1.put(Integer.valueOf(i), paramt);
    return;
    label73:
    paramString1 = new StringBuilder("Unknown callback type: ");
    paramString1.append(paramString2);
    throw new IllegalStateException(paramString1.toString());
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */