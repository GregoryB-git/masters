package b1;

import ec.i;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import lc.h;
import va.a;

public final class s
{
  public static final HashMap a = new HashMap();
  public static final HashMap b = new HashMap();
  
  public static g a(Constructor paramConstructor, Object paramObject)
  {
    try
    {
      paramConstructor = paramConstructor.newInstance(new Object[] { paramObject });
      i.d(paramConstructor, "{\n            constructo…tance(`object`)\n        }");
      paramConstructor = (g)paramConstructor;
      return paramConstructor;
    }
    catch (InvocationTargetException paramConstructor)
    {
      throw new RuntimeException(paramConstructor);
    }
    catch (InstantiationException paramConstructor)
    {
      throw new RuntimeException(paramConstructor);
    }
    catch (IllegalAccessException paramConstructor)
    {
      throw new RuntimeException(paramConstructor);
    }
  }
  
  public static final String b(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(h.m0(paramString, ".", "_"));
    localStringBuilder.append("_LifecycleAdapter");
    return localStringBuilder.toString();
  }
  
  public static int c(Class paramClass)
  {
    Object localObject1 = (Integer)a.get(paramClass);
    if (localObject1 != null) {
      return ((Integer)localObject1).intValue();
    }
    localObject1 = paramClass.getCanonicalName();
    int i = 1;
    int j;
    Class[] arrayOfClass;
    Object localObject3;
    Object localObject4;
    Object localObject2;
    if (localObject1 == null)
    {
      j = i;
    }
    else
    {
      arrayOfClass = null;
      try
      {
        localObject1 = paramClass.getPackage();
        localObject3 = paramClass.getCanonicalName();
        if (localObject1 != null) {
          localObject1 = ((Package)localObject1).getName();
        } else {
          localObject1 = "";
        }
        i.d(localObject1, "fullPackage");
        if (((String)localObject1).length() == 0) {
          j = 1;
        } else {
          j = 0;
        }
        if (j == 0)
        {
          i.d(localObject3, "name");
          localObject3 = ((String)localObject3).substring(((String)localObject1).length() + 1);
          i.d(localObject3, "this as java.lang.String).substring(startIndex)");
        }
        i.d(localObject3, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
        localObject3 = b((String)localObject3);
        if (((String)localObject1).length() == 0) {
          j = 1;
        } else {
          j = 0;
        }
        if (j != 0)
        {
          localObject1 = localObject3;
        }
        else
        {
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>();
          ((StringBuilder)localObject4).append((String)localObject1);
          ((StringBuilder)localObject4).append('.');
          ((StringBuilder)localObject4).append((String)localObject3);
          localObject1 = ((StringBuilder)localObject4).toString();
        }
        localObject3 = Class.forName((String)localObject1).getDeclaredConstructor(new Class[] { paramClass });
        localObject1 = localObject3;
        if (!((AccessibleObject)localObject3).isAccessible())
        {
          ((AccessibleObject)localObject3).setAccessible(true);
          localObject1 = localObject3;
        }
      }
      catch (NoSuchMethodException paramClass)
      {
        throw new RuntimeException(paramClass);
      }
      catch (ClassNotFoundException localClassNotFoundException)
      {
        localObject2 = null;
      }
      if (localObject2 != null)
      {
        localObject3 = b;
        localObject2 = a.f(localObject2);
      }
    }
    for (;;)
    {
      ((HashMap)localObject3).put(paramClass, localObject2);
      break label615;
      localObject2 = b.c;
      localObject3 = (Boolean)b.get(paramClass);
      boolean bool;
      if (localObject3 != null) {
        bool = ((Boolean)localObject3).booleanValue();
      }
      try
      {
        localObject3 = paramClass.getDeclaredMethods();
        int k = localObject3.length;
        for (j = 0; j < k; j++) {
          if ((y)localObject3[j].getAnnotation(y.class) != null)
          {
            ((b)localObject2).a(paramClass, (Method[])localObject3);
            bool = true;
            break label375;
          }
        }
        b.put(paramClass, Boolean.FALSE);
        bool = false;
        label375:
        if (bool)
        {
          j = i;
        }
        else
        {
          localObject3 = paramClass.getSuperclass();
          if ((localObject3 != null) && (n.class.isAssignableFrom((Class)localObject3))) {
            j = 1;
          } else {
            j = 0;
          }
          localObject2 = arrayOfClass;
          if (j != 0)
          {
            i.d(localObject3, "superclass");
            if (c((Class)localObject3) == 1)
            {
              j = i;
            }
            else
            {
              localObject2 = b.get(localObject3);
              i.b(localObject2);
              localObject2 = new ArrayList((Collection)localObject2);
            }
          }
          else
          {
            arrayOfClass = paramClass.getInterfaces();
            i.d(arrayOfClass, "klass.interfaces");
            int m = arrayOfClass.length;
            for (j = 0; j < m; j++)
            {
              localObject4 = arrayOfClass[j];
              if ((localObject4 != null) && (n.class.isAssignableFrom((Class)localObject4))) {
                k = 1;
              } else {
                k = 0;
              }
              if (k != 0)
              {
                i.d(localObject4, "intrface");
                if (c((Class)localObject4) == 1)
                {
                  j = i;
                  break label617;
                }
                localObject3 = localObject2;
                if (localObject2 == null) {
                  localObject3 = new ArrayList();
                }
                localObject2 = b.get(localObject4);
                i.b(localObject2);
                ((List)localObject3).addAll((Collection)localObject2);
                localObject2 = localObject3;
              }
            }
            j = i;
            if (localObject2 != null)
            {
              localObject3 = b;
              continue;
              label615:
              j = 2;
            }
          }
        }
        label617:
        a.put(paramClass, Integer.valueOf(j));
        return j;
      }
      catch (NoClassDefFoundError paramClass)
      {
        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", paramClass);
      }
    }
  }
}

/* Location:
 * Qualified Name:     b1.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */