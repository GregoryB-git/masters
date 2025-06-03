package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public final class g
  implements m, s, Iterable
{
  public final SortedMap o = new TreeMap();
  public final Map p = new TreeMap();
  
  public g() {}
  
  public g(List paramList)
  {
    this();
    if (paramList != null) {
      for (int i = 0; i < paramList.size(); i++) {
        X(i, (s)paramList.get(i));
      }
    }
  }
  
  public g(s... paramVarArgs)
  {
    this(Arrays.asList(paramVarArgs));
  }
  
  public final int D()
  {
    return o.size();
  }
  
  public final s M(int paramInt)
  {
    if (paramInt < U())
    {
      if (Y(paramInt))
      {
        s locals = (s)o.get(Integer.valueOf(paramInt));
        if (locals != null) {
          return locals;
        }
      }
      return s.d;
    }
    throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
  }
  
  public final void S(int paramInt, s params)
  {
    if (paramInt >= 0)
    {
      if (paramInt >= U())
      {
        X(paramInt, params);
        return;
      }
      for (int i = ((Integer)o.lastKey()).intValue(); i >= paramInt; i--)
      {
        s locals = (s)o.get(Integer.valueOf(i));
        if (locals != null)
        {
          X(i + 1, locals);
          o.remove(Integer.valueOf(i));
        }
      }
      X(paramInt, params);
      return;
    }
    params = new StringBuilder("Invalid value index: ");
    params.append(paramInt);
    throw new IllegalArgumentException(params.toString());
  }
  
  public final void T(s params)
  {
    X(U(), params);
  }
  
  public final int U()
  {
    if (o.isEmpty()) {
      return 0;
    }
    return ((Integer)o.lastKey()).intValue() + 1;
  }
  
  public final String V(String paramString)
  {
    String str = paramString;
    if (paramString == null) {
      str = "";
    }
    paramString = new StringBuilder();
    if (!o.isEmpty())
    {
      for (int i = 0; i < U(); i++)
      {
        s locals = M(i);
        paramString.append(str);
        if ((!(locals instanceof z)) && (!(locals instanceof q))) {
          paramString.append(locals.g());
        }
      }
      paramString.delete(0, str.length());
    }
    return paramString.toString();
  }
  
  public final void W(int paramInt)
  {
    int i = ((Integer)o.lastKey()).intValue();
    if ((paramInt <= i) && (paramInt >= 0))
    {
      o.remove(Integer.valueOf(paramInt));
      int j = paramInt;
      Object localObject;
      if (paramInt == i)
      {
        localObject = o;
        paramInt--;
        if ((!((Map)localObject).containsKey(Integer.valueOf(paramInt))) && (paramInt >= 0)) {
          o.put(Integer.valueOf(paramInt), s.d);
        }
        return;
      }
      for (;;)
      {
        j++;
        if (j > ((Integer)o.lastKey()).intValue()) {
          break;
        }
        localObject = (s)o.get(Integer.valueOf(j));
        if (localObject != null)
        {
          o.put(Integer.valueOf(j - 1), localObject);
          o.remove(Integer.valueOf(j));
        }
      }
    }
  }
  
  public final void X(int paramInt, s params)
  {
    if (paramInt <= 32468)
    {
      if (paramInt >= 0)
      {
        if (params == null)
        {
          o.remove(Integer.valueOf(paramInt));
          return;
        }
        o.put(Integer.valueOf(paramInt), params);
        return;
      }
      params = new StringBuilder("Out of bounds index: ");
      params.append(paramInt);
      throw new IndexOutOfBoundsException(params.toString());
    }
    throw new IllegalStateException("Array too large");
  }
  
  public final boolean Y(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt <= ((Integer)o.lastKey()).intValue())) {
      return o.containsKey(Integer.valueOf(paramInt));
    }
    StringBuilder localStringBuilder = new StringBuilder("Out of bounds index: ");
    localStringBuilder.append(paramInt);
    throw new IndexOutOfBoundsException(localStringBuilder.toString());
  }
  
  public final Iterator Z()
  {
    return o.keySet().iterator();
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
  
  public final List a0()
  {
    ArrayList localArrayList = new ArrayList(U());
    for (int i = 0; i < U(); i++) {
      localArrayList.add(M(i));
    }
    return localArrayList;
  }
  
  public final void b0()
  {
    o.clear();
  }
  
  public final s c()
  {
    g localg = new g();
    Iterator localIterator = o.entrySet().iterator();
    if (localIterator.hasNext())
    {
      Object localObject = (Map.Entry)localIterator.next();
      SortedMap localSortedMap;
      Integer localInteger;
      if ((((Map.Entry)localObject).getValue() instanceof m))
      {
        localSortedMap = o;
        localInteger = (Integer)((Map.Entry)localObject).getKey();
      }
      for (localObject = (s)((Map.Entry)localObject).getValue();; localObject = ((s)((Map.Entry)localObject).getValue()).c())
      {
        localSortedMap.put(localInteger, localObject);
        break;
        localSortedMap = o;
        localInteger = (Integer)((Map.Entry)localObject).getKey();
      }
    }
    return localg;
  }
  
  public final Boolean d()
  {
    return Boolean.TRUE;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof g)) {
      return false;
    }
    paramObject = (g)paramObject;
    if (U() != ((g)paramObject).U()) {
      return false;
    }
    if (o.isEmpty()) {
      return o.isEmpty();
    }
    for (int i = ((Integer)o.firstKey()).intValue(); i <= ((Integer)o.lastKey()).intValue(); i++) {
      if (!M(i).equals(((g)paramObject).M(i))) {
        return false;
      }
    }
    return true;
  }
  
  public final Double f()
  {
    if (o.size() == 1) {
      return M(0).f();
    }
    if (o.size() <= 0) {
      return Double.valueOf(0.0D);
    }
    return Double.valueOf(NaN.0D);
  }
  
  public final String g()
  {
    return toString();
  }
  
  public final int hashCode()
  {
    return o.hashCode() * 31;
  }
  
  public final s i(String paramString)
  {
    if ("length".equals(paramString)) {
      return new k(Double.valueOf(U()));
    }
    if (q(paramString))
    {
      paramString = (s)p.get(paramString);
      if (paramString != null) {
        return paramString;
      }
    }
    return s.d;
  }
  
  public final Iterator iterator()
  {
    return new i(this);
  }
  
  public final Iterator k()
  {
    return new f(this, o.keySet().iterator(), p.keySet().iterator());
  }
  
  public final boolean q(String paramString)
  {
    return ("length".equals(paramString)) || (p.containsKey(paramString));
  }
  
  public final s s(String paramString, f3 paramf3, List paramList)
  {
    if ((!"concat".equals(paramString)) && (!"every".equals(paramString)) && (!"filter".equals(paramString)) && (!"forEach".equals(paramString)) && (!"indexOf".equals(paramString)) && (!"join".equals(paramString)) && (!"lastIndexOf".equals(paramString)) && (!"map".equals(paramString)) && (!"pop".equals(paramString)) && (!"push".equals(paramString)) && (!"reduce".equals(paramString)) && (!"reduceRight".equals(paramString)) && (!"reverse".equals(paramString)) && (!"shift".equals(paramString)) && (!"slice".equals(paramString)) && (!"some".equals(paramString)) && (!"sort".equals(paramString)) && (!"splice".equals(paramString)) && (!"toString".equals(paramString)) && (!"unshift".equals(paramString))) {
      return p.a(this, new u(paramString), paramf3, paramList);
    }
    return H.d(paramString, this, paramf3, paramList);
  }
  
  public final String toString()
  {
    return V(",");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */