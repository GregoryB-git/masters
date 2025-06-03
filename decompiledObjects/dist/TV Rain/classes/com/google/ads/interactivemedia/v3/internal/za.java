package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;

public final class za
{
  private final Map<Type, yc<?>> a;
  private final acv b = acv.a();
  
  public za(Map<Type, yc<?>> paramMap)
  {
    a = paramMap;
  }
  
  private final <T> zy<T> a(Class<? super T> paramClass)
  {
    try
    {
      paramClass = paramClass.getDeclaredConstructor(new Class[0]);
      if (!paramClass.isAccessible()) {
        b.a(paramClass);
      }
      paramClass = new zi(this, paramClass);
      return paramClass;
    }
    catch (NoSuchMethodException paramClass) {}
    return null;
  }
  
  public final <T> zy<T> a(acx<T> paramacx)
  {
    Type localType = paramacx.b();
    Class localClass = paramacx.a();
    paramacx = (yc)a.get(localType);
    if (paramacx != null) {
      return new yz(this, paramacx, localType);
    }
    paramacx = (yc)a.get(localClass);
    if (paramacx != null) {
      return new zf(this, paramacx, localType);
    }
    paramacx = a(localClass);
    if (paramacx != null) {
      return paramacx;
    }
    if (Collection.class.isAssignableFrom(localClass))
    {
      if (SortedSet.class.isAssignableFrom(localClass)) {
        paramacx = new zh(this);
      } else if (EnumSet.class.isAssignableFrom(localClass)) {
        paramacx = new zk(this, localType);
      } else if (Set.class.isAssignableFrom(localClass)) {
        paramacx = new zj(this);
      } else if (Queue.class.isAssignableFrom(localClass)) {
        paramacx = new zm(this);
      } else {
        paramacx = new zl(this);
      }
    }
    else if (Map.class.isAssignableFrom(localClass))
    {
      if (ConcurrentNavigableMap.class.isAssignableFrom(localClass)) {
        paramacx = new zo(this);
      } else if (ConcurrentMap.class.isAssignableFrom(localClass)) {
        paramacx = new zc(this);
      } else if (SortedMap.class.isAssignableFrom(localClass)) {
        paramacx = new zb(this);
      } else if (((localType instanceof ParameterizedType)) && (!String.class.isAssignableFrom(acx.a(((ParameterizedType)localType).getActualTypeArguments()[0]).a()))) {
        paramacx = new ze(this);
      } else {
        paramacx = new zd(this);
      }
    }
    else {
      paramacx = null;
    }
    if (paramacx != null) {
      return paramacx;
    }
    return new zg(this, localClass, localType);
  }
  
  public final String toString()
  {
    return a.toString();
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.za
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */