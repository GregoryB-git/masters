package b1;

import f;
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

@Deprecated
public final class b
{
  public static b c = new b();
  public final HashMap a = new HashMap();
  public final HashMap b = new HashMap();
  
  public static void c(HashMap paramHashMap, b paramb, k.a parama, Class paramClass)
  {
    k.a locala = (k.a)paramHashMap.get(paramb);
    if ((locala != null) && (parama != locala))
    {
      paramHashMap = b;
      paramb = f.l("Method ");
      paramb.append(paramHashMap.getName());
      paramb.append(" in ");
      paramb.append(paramClass.getName());
      paramb.append(" already declared with different @OnLifecycleEvent value: previous value ");
      paramb.append(locala);
      paramb.append(", new value ");
      paramb.append(parama);
      throw new IllegalArgumentException(paramb.toString());
    }
    if (locala == null) {
      paramHashMap.put(paramb, parama);
    }
  }
  
  public final a a(Class<?> paramClass, Method[] paramArrayOfMethod)
  {
    Object localObject1 = paramClass.getSuperclass();
    HashMap localHashMap = new HashMap();
    if (localObject1 != null) {
      localHashMap.putAll(bb);
    }
    Object localObject2 = paramClass.getInterfaces();
    int i = localObject2.length;
    Object localObject3;
    for (int j = 0; j < i; j++)
    {
      localObject3 = bb.entrySet().iterator();
      while (((Iterator)localObject3).hasNext())
      {
        localObject1 = (Map.Entry)((Iterator)localObject3).next();
        c(localHashMap, (b)((Map.Entry)localObject1).getKey(), (k.a)((Map.Entry)localObject1).getValue(), paramClass);
      }
    }
    if (paramArrayOfMethod == null) {}
    try
    {
      paramArrayOfMethod = paramClass.getDeclaredMethods();
      int k = paramArrayOfMethod.length;
      i = 0;
      j = i;
      while (i < k)
      {
        localObject3 = paramArrayOfMethod[i];
        localObject2 = (y)((Method)localObject3).getAnnotation(y.class);
        if (localObject2 != null)
        {
          localObject1 = ((Method)localObject3).getParameterTypes();
          if (localObject1.length > 0)
          {
            if (o.class.isAssignableFrom(localObject1[0])) {
              j = 1;
            } else {
              throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
            }
          }
          else {
            j = 0;
          }
          localObject2 = ((y)localObject2).value();
          if (localObject1.length > 1) {
            if (k.a.class.isAssignableFrom(localObject1[1]))
            {
              if (localObject2 == k.a.ON_ANY) {
                j = 2;
              } else {
                throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
              }
            }
            else {
              throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
            }
          }
          if (localObject1.length <= 2)
          {
            c(localHashMap, new b(j, (Method)localObject3), (k.a)localObject2, paramClass);
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
    catch (NoClassDefFoundError paramClass)
    {
      throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", paramClass);
    }
  }
  
  public final a b(Class<?> paramClass)
  {
    a locala = (a)a.get(paramClass);
    if (locala != null) {
      return locala;
    }
    return a(paramClass, null);
  }
  
  @Deprecated
  public static final class a
  {
    public final HashMap a;
    public final Map<b.b, k.a> b;
    
    public a(HashMap paramHashMap)
    {
      b = paramHashMap;
      a = new HashMap();
      Iterator localIterator = paramHashMap.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        k.a locala = (k.a)localEntry.getValue();
        List localList = (List)a.get(locala);
        paramHashMap = localList;
        if (localList == null)
        {
          paramHashMap = new ArrayList();
          a.put(locala, paramHashMap);
        }
        paramHashMap.add((b.b)localEntry.getKey());
      }
    }
    
    public static void a(List<b.b> paramList, o paramo, k.a parama, Object paramObject)
    {
      if (paramList != null)
      {
        int i = paramList.size() - 1;
        while (i >= 0)
        {
          b.b localb = (b.b)paramList.get(i);
          localb.getClass();
          try
          {
            int j = a;
            if (j != 0)
            {
              if (j != 1)
              {
                if (j == 2) {
                  b.invoke(paramObject, new Object[] { paramo, parama });
                }
              }
              else {
                b.invoke(paramObject, new Object[] { paramo });
              }
            }
            else {
              b.invoke(paramObject, new Object[0]);
            }
            i--;
          }
          catch (IllegalAccessException paramList)
          {
            throw new RuntimeException(paramList);
          }
          catch (InvocationTargetException paramList)
          {
            throw new RuntimeException("Failed to call observer method", paramList.getCause());
          }
        }
      }
    }
  }
  
  @Deprecated
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
    
    public final boolean equals(Object paramObject)
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
    
    public final int hashCode()
    {
      int i = a;
      return b.getName().hashCode() + i * 31;
    }
  }
}

/* Location:
 * Qualified Name:     b1.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */