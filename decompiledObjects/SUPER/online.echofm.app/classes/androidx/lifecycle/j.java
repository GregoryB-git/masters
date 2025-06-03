package androidx.lifecycle;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class j
{
  public static Map a = new HashMap();
  public static Map b = new HashMap();
  
  public static c a(Constructor paramConstructor, Object paramObject)
  {
    try
    {
      android.support.v4.media.a.a(paramConstructor.newInstance(new Object[] { paramObject }));
      return null;
    }
    catch (InvocationTargetException paramConstructor) {}catch (InstantiationException paramConstructor)
    {
      break label38;
    }
    catch (IllegalAccessException paramConstructor) {}
    throw new RuntimeException(paramConstructor);
    label38:
    throw new RuntimeException(paramConstructor);
    throw new RuntimeException(paramConstructor);
  }
  
  public static Constructor b(Class paramClass)
  {
    label129:
    try
    {
      try
      {
        localObject = paramClass.getPackage();
        str = paramClass.getCanonicalName();
        if (localObject != null) {
          localObject = ((Package)localObject).getName();
        }
      }
      catch (NoSuchMethodException paramClass)
      {
        break label129;
      }
      Object localObject = "";
      if (!((String)localObject).isEmpty()) {
        str = str.substring(((String)localObject).length() + 1);
      }
      String str = c(str);
      if (((String)localObject).isEmpty())
      {
        localObject = str;
      }
      else
      {
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localStringBuilder.append((String)localObject);
        localStringBuilder.append(".");
        localStringBuilder.append(str);
        localObject = localStringBuilder.toString();
      }
      paramClass = Class.forName((String)localObject).getDeclaredConstructor(new Class[] { paramClass });
      if (!paramClass.isAccessible()) {
        paramClass.setAccessible(true);
      }
      return paramClass;
    }
    catch (ClassNotFoundException paramClass) {}
    throw new RuntimeException(paramClass);
    return null;
  }
  
  public static String c(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString.replace(".", "_"));
    localStringBuilder.append("_LifecycleAdapter");
    return localStringBuilder.toString();
  }
  
  public static int d(Class paramClass)
  {
    Integer localInteger = (Integer)a.get(paramClass);
    if (localInteger != null) {
      return localInteger.intValue();
    }
    int i = g(paramClass);
    a.put(paramClass, Integer.valueOf(i));
    return i;
  }
  
  public static boolean e(Class paramClass)
  {
    boolean bool;
    if ((paramClass != null) && (g.class.isAssignableFrom(paramClass))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static f f(Object paramObject)
  {
    if ((paramObject instanceof f)) {
      return (f)paramObject;
    }
    Object localObject = paramObject.getClass();
    if (d((Class)localObject) == 2)
    {
      localObject = (List)b.get(localObject);
      int i = ((List)localObject).size();
      int j = 0;
      if (i == 1)
      {
        a((Constructor)((List)localObject).get(0), paramObject);
        return new SingleGeneratedAdapterObserver(null);
      }
      c[] arrayOfc = new c[((List)localObject).size()];
      while (j < ((List)localObject).size())
      {
        a((Constructor)((List)localObject).get(j), paramObject);
        arrayOfc[j] = null;
        j++;
      }
      return new CompositeGeneratedAdaptersObserver(arrayOfc);
    }
    return new ReflectiveGenericLifecycleObserver(paramObject);
  }
  
  public static int g(Class paramClass)
  {
    if (paramClass.getCanonicalName() == null) {
      return 1;
    }
    Object localObject1 = b(paramClass);
    if (localObject1 != null)
    {
      b.put(paramClass, Collections.singletonList(localObject1));
      return 2;
    }
    if (a.c.d(paramClass)) {
      return 1;
    }
    localObject1 = paramClass.getSuperclass();
    Object localObject2;
    if (e((Class)localObject1))
    {
      if (d((Class)localObject1) == 1) {
        return 1;
      }
      localObject2 = new ArrayList((Collection)b.get(localObject1));
    }
    else
    {
      localObject2 = null;
    }
    Class[] arrayOfClass = paramClass.getInterfaces();
    int i = arrayOfClass.length;
    int j = 0;
    while (j < i)
    {
      Class localClass = arrayOfClass[j];
      if (!e(localClass))
      {
        localObject1 = localObject2;
      }
      else
      {
        if (d(localClass) == 1) {
          return 1;
        }
        localObject1 = localObject2;
        if (localObject2 == null) {
          localObject1 = new ArrayList();
        }
        ((List)localObject1).addAll((Collection)b.get(localClass));
      }
      j++;
      localObject2 = localObject1;
    }
    if (localObject2 != null)
    {
      b.put(paramClass, localObject2);
      return 2;
    }
    return 1;
  }
}

/* Location:
 * Qualified Name:     androidx.lifecycle.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */