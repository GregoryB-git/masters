package androidx.lifecycle;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class a
{
  public static a c = new a();
  public final Map a = new HashMap();
  public final Map b = new HashMap();
  
  public final a a(Class paramClass, Method[] paramArrayOfMethod)
  {
    Object localObject1 = paramClass.getSuperclass();
    HashMap localHashMap = new HashMap();
    if (localObject1 != null)
    {
      localObject1 = c((Class)localObject1);
      if (localObject1 != null) {
        localHashMap.putAll(b);
      }
    }
    Object localObject2 = paramClass.getInterfaces();
    int i = localObject2.length;
    Object localObject3;
    for (int j = 0; j < i; j++)
    {
      localObject3 = cb.entrySet().iterator();
      while (((Iterator)localObject3).hasNext())
      {
        localObject1 = (Map.Entry)((Iterator)localObject3).next();
        e(localHashMap, (b)((Map.Entry)localObject1).getKey(), (d.b)((Map.Entry)localObject1).getValue(), paramClass);
      }
    }
    if (paramArrayOfMethod == null) {
      paramArrayOfMethod = b(paramClass);
    }
    int k = paramArrayOfMethod.length;
    i = 0;
    j = i;
    while (i < k)
    {
      localObject1 = paramArrayOfMethod[i];
      localObject2 = (n)((Method)localObject1).getAnnotation(n.class);
      if (localObject2 != null)
      {
        localObject3 = ((Method)localObject1).getParameterTypes();
        if (localObject3.length > 0)
        {
          if (localObject3[0].isAssignableFrom(h.class)) {
            j = 1;
          } else {
            throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
          }
        }
        else {
          j = 0;
        }
        localObject2 = ((n)localObject2).value();
        if (localObject3.length > 1) {
          if (localObject3[1].isAssignableFrom(d.b.class))
          {
            if (localObject2 == d.b.ON_ANY) {
              j = 2;
            } else {
              throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
            }
          }
          else {
            throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
          }
        }
        if (localObject3.length <= 2)
        {
          e(localHashMap, new b(j, (Method)localObject1), (d.b)localObject2, paramClass);
          j = 1;
        }
      }
      else
      {
        i++;
        continue;
      }
      throw new IllegalArgumentException("cannot have more than 2 params");
    }
    paramArrayOfMethod = new a(localHashMap);
    a.put(paramClass, paramArrayOfMethod);
    b.put(paramClass, Boolean.valueOf(j));
    return paramArrayOfMethod;
  }
  
  public final Method[] b(Class paramClass)
  {
    try
    {
      paramClass = paramClass.getDeclaredMethods();
      return paramClass;
    }
    catch (NoClassDefFoundError paramClass)
    {
      throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", paramClass);
    }
  }
  
  public a c(Class paramClass)
  {
    a locala = (a)a.get(paramClass);
    if (locala != null) {
      return locala;
    }
    return a(paramClass, null);
  }
  
  public boolean d(Class paramClass)
  {
    Object localObject = (Boolean)b.get(paramClass);
    if (localObject != null) {
      return ((Boolean)localObject).booleanValue();
    }
    localObject = b(paramClass);
    int i = localObject.length;
    for (int j = 0; j < i; j++) {
      if ((n)localObject[j].getAnnotation(n.class) != null)
      {
        a(paramClass, (Method[])localObject);
        return true;
      }
    }
    b.put(paramClass, Boolean.FALSE);
    return false;
  }
  
  public final void e(Map paramMap, b paramb, d.b paramb1, Class paramClass)
  {
    d.b localb = (d.b)paramMap.get(paramb);
    if ((localb != null) && (paramb1 != localb))
    {
      paramb = b;
      paramMap = new StringBuilder();
      paramMap.append("Method ");
      paramMap.append(paramb.getName());
      paramMap.append(" in ");
      paramMap.append(paramClass.getName());
      paramMap.append(" already declared with different @OnLifecycleEvent value: previous value ");
      paramMap.append(localb);
      paramMap.append(", new value ");
      paramMap.append(paramb1);
      throw new IllegalArgumentException(paramMap.toString());
    }
    if (localb == null) {
      paramMap.put(paramb, paramb1);
    }
  }
  
  public static class a
  {
    public final Map a;
    public final Map b;
    
    public a(Map paramMap)
    {
      b = paramMap;
      a = new HashMap();
      Iterator localIterator = paramMap.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        d.b localb = (d.b)localEntry.getValue();
        List localList = (List)a.get(localb);
        paramMap = localList;
        if (localList == null)
        {
          paramMap = new ArrayList();
          a.put(localb, paramMap);
        }
        paramMap.add(localEntry.getKey());
      }
    }
    
    public static void b(List paramList, h paramh, d.b paramb, Object paramObject)
    {
      if (paramList != null) {
        for (int i = paramList.size() - 1; i >= 0; i--) {
          ((a.b)paramList.get(i)).a(paramh, paramb, paramObject);
        }
      }
    }
    
    public void a(h paramh, d.b paramb, Object paramObject)
    {
      b((List)a.get(paramb), paramh, paramb, paramObject);
      b((List)a.get(d.b.ON_ANY), paramh, paramb, paramObject);
    }
  }
  
  public static final class b
  {
    public final int a;
    public final Method b;
    
    public b(int paramInt, Method paramMethod)
    {
      a = paramInt;
      b = paramMethod;
      paramMethod.setAccessible(true);
    }
    
    public void a(h paramh, d.b paramb, Object paramObject)
    {
      try
      {
        int i = a;
        if (i == 0) {
          break label78;
        }
        if (i != 1)
        {
          if (i != 2) {
            break label91;
          }
          b.invoke(paramObject, new Object[] { paramh, paramb });
        }
      }
      catch (IllegalAccessException paramh)
      {
        break label92;
      }
      catch (InvocationTargetException paramh)
      {
        break label101;
      }
      b.invoke(paramObject, new Object[] { paramh });
      break label91;
      label78:
      b.invoke(paramObject, new Object[0]);
      label91:
      return;
      label92:
      throw new RuntimeException(paramh);
      label101:
      throw new RuntimeException("Failed to call observer method", paramh.getCause());
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool = true;
      if (this == paramObject) {
        return true;
      }
      if (!(paramObject instanceof b)) {
        return false;
      }
      paramObject = (b)paramObject;
      if ((a != a) || (!b.getName().equals(b.getName()))) {
        bool = false;
      }
      return bool;
    }
    
    public int hashCode()
    {
      return a * 31 + b.getName().hashCode();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.lifecycle.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */