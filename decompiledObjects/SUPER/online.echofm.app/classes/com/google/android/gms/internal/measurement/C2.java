package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class C2
{
  public static double a(double paramDouble)
  {
    if (Double.isNaN(paramDouble)) {
      return 0.0D;
    }
    if (!Double.isInfinite(paramDouble))
    {
      boolean bool = paramDouble < 0.0D;
      if ((bool) && (paramDouble != 0.0D))
      {
        int i;
        if (bool) {
          bool = true;
        } else {
          i = -1;
        }
        return i * Math.floor(Math.abs(paramDouble));
      }
    }
    return paramDouble;
  }
  
  public static int b(f3 paramf3)
  {
    int i = i(paramf3.c("runtime.counter").f().doubleValue() + 1.0D);
    if (i <= 1000000)
    {
      paramf3.h("runtime.counter", new k(Double.valueOf(i)));
      return i;
    }
    throw new IllegalStateException("Instructions allowed exceeded");
  }
  
  public static Z c(String paramString)
  {
    Z localZ;
    if ((paramString != null) && (!paramString.isEmpty())) {
      localZ = Z.c(Integer.parseInt(paramString));
    } else {
      localZ = null;
    }
    if (localZ != null) {
      return localZ;
    }
    throw new IllegalArgumentException(String.format("Unsupported commandId %s", new Object[] { paramString }));
  }
  
  public static Object d(s params)
  {
    if (s.e.equals(params)) {
      return null;
    }
    if (s.d.equals(params)) {
      return "";
    }
    if ((params instanceof r)) {
      return e((r)params);
    }
    if ((params instanceof g))
    {
      ArrayList localArrayList = new ArrayList();
      params = ((g)params).iterator();
      while (params.hasNext())
      {
        Object localObject = d((s)params.next());
        if (localObject != null) {
          localArrayList.add(localObject);
        }
      }
      return localArrayList;
    }
    if (!params.f().isNaN()) {
      return params.f();
    }
    return params.g();
  }
  
  public static Map e(r paramr)
  {
    HashMap localHashMap = new HashMap();
    Iterator localIterator = paramr.b().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      Object localObject = d(paramr.i(str));
      if (localObject != null) {
        localHashMap.put(str, localObject);
      }
    }
    return localHashMap;
  }
  
  public static void f(Z paramZ, int paramInt, List paramList)
  {
    g(paramZ.name(), paramInt, paramList);
  }
  
  public static void g(String paramString, int paramInt, List paramList)
  {
    if (paramList.size() == paramInt) {
      return;
    }
    throw new IllegalArgumentException(String.format("%s operation requires %s parameters found %s", new Object[] { paramString, Integer.valueOf(paramInt), Integer.valueOf(paramList.size()) }));
  }
  
  public static boolean h(s params1, s params2)
  {
    if (!params1.getClass().equals(params2.getClass())) {
      return false;
    }
    if ((!(params1 instanceof z)) && (!(params1 instanceof q)))
    {
      if ((params1 instanceof k))
      {
        if ((!Double.isNaN(params1.f().doubleValue())) && (!Double.isNaN(params2.f().doubleValue()))) {
          return params1.f().equals(params2.f());
        }
        return false;
      }
      if ((params1 instanceof u)) {
        return params1.g().equals(params2.g());
      }
      if ((params1 instanceof h)) {
        return params1.d().equals(params2.d());
      }
      return params1 == params2;
    }
    return true;
  }
  
  public static int i(double paramDouble)
  {
    if ((!Double.isNaN(paramDouble)) && (!Double.isInfinite(paramDouble)))
    {
      boolean bool = paramDouble < 0.0D;
      if (bool)
      {
        int i;
        if (bool) {
          bool = true;
        } else {
          i = -1;
        }
        return (int)(i * Math.floor(Math.abs(paramDouble)) % 4.294967296E9D);
      }
    }
    return 0;
  }
  
  public static void j(Z paramZ, int paramInt, List paramList)
  {
    k(paramZ.name(), paramInt, paramList);
  }
  
  public static void k(String paramString, int paramInt, List paramList)
  {
    if (paramList.size() >= paramInt) {
      return;
    }
    throw new IllegalArgumentException(String.format("%s operation requires at least %s parameters found %s", new Object[] { paramString, Integer.valueOf(paramInt), Integer.valueOf(paramList.size()) }));
  }
  
  public static boolean l(s params)
  {
    if (params == null) {
      return false;
    }
    params = params.f();
    return (!params.isNaN()) && (params.doubleValue() >= 0.0D) && (params.equals(Double.valueOf(Math.floor(params.doubleValue()))));
  }
  
  public static long m(double paramDouble)
  {
    return i(paramDouble) & 0xFFFFFFFF;
  }
  
  public static void n(String paramString, int paramInt, List paramList)
  {
    if (paramList.size() <= paramInt) {
      return;
    }
    throw new IllegalArgumentException(String.format("%s operation requires at most %s parameters found %s", new Object[] { paramString, Integer.valueOf(paramInt), Integer.valueOf(paramList.size()) }));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.C2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */