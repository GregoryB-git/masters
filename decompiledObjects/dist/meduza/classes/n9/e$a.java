package n9;

import com.google.firebase.firestore.c;
import d9.m0;
import d9.s0;
import d9.w0;
import d9.z;
import g;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

public final class e$a<T>
{
  public final Class<T> a;
  public final HashMap b;
  public final HashMap c;
  public final HashMap d;
  public final HashMap e;
  public final HashSet<String> f;
  public final HashSet<String> g;
  
  public e$a(Class<T> paramClass)
  {
    a = paramClass;
    paramClass.isAnnotationPresent(w0.class);
    paramClass.isAnnotationPresent(z.class);
    b = new HashMap();
    d = new HashMap();
    c = new HashMap();
    e = new HashMap();
    f = new HashSet();
    g = new HashSet();
    try
    {
      paramClass.getDeclaredConstructor(new Class[0]).setAccessible(true);
      int k;
      Object localObject3;
      for (localObject2 : paramClass.getMethods())
      {
        if (((!((Method)localObject2).getName().startsWith("get")) && (!((Method)localObject2).getName().startsWith("is"))) || (((Method)localObject2).getDeclaringClass().equals(Object.class)) || (!Modifier.isPublic(((Method)localObject2).getModifiers())) || (Modifier.isStatic(((Method)localObject2).getModifiers())) || (((Method)localObject2).getReturnType().equals(Void.TYPE)) || (((Method)localObject2).getParameterTypes().length != 0) || (((Method)localObject2).isBridge()) || (((AccessibleObject)localObject2).isAnnotationPresent(d9.m.class))) {
          k = 0;
        } else {
          k = 1;
        }
        if (k != 0)
        {
          localObject3 = f((Method)localObject2);
          a((String)localObject3);
          ((AccessibleObject)localObject2).setAccessible(true);
          if (!c.containsKey(localObject3))
          {
            c.put(localObject3, localObject2);
            if (((AccessibleObject)localObject2).isAnnotationPresent(s0.class))
            {
              localObject3 = ((Method)localObject2).getReturnType();
              if ((localObject3 != Date.class) && (localObject3 != u7.m.class))
              {
                paramClass = f.l("Method ");
                paramClass.append(((Method)localObject2).getName());
                paramClass.append(" is annotated with @ServerTimestamp but returns ");
                paramClass.append(localObject3);
                paramClass.append(" instead of Date or Timestamp.");
                throw new IllegalArgumentException(paramClass.toString());
              }
              f.add(f((Method)localObject2));
            }
            if (((AccessibleObject)localObject2).isAnnotationPresent(d9.f.class))
            {
              c("Method", "returns", ((Method)localObject2).getReturnType());
              g.add(f((Method)localObject2));
            }
          }
          else
          {
            localObject3 = f.l("Found conflicting getters for name ");
            ((StringBuilder)localObject3).append(((Method)localObject2).getName());
            ((StringBuilder)localObject3).append(" on class ");
            ((StringBuilder)localObject3).append(paramClass.getName());
            throw new RuntimeException(((StringBuilder)localObject3).toString());
          }
        }
      }
      for (localObject3 : paramClass.getFields())
      {
        if ((((Field)localObject3).getDeclaringClass().equals(Object.class)) || (!Modifier.isPublic(((Field)localObject3).getModifiers())) || (Modifier.isStatic(((Field)localObject3).getModifiers())) || (Modifier.isTransient(((Field)localObject3).getModifiers())) || (((Field)localObject3).isAnnotationPresent(d9.m.class))) {
          k = 0;
        } else {
          k = 1;
        }
        if (k != 0)
        {
          a(e((Field)localObject3));
          b((Field)localObject3);
        }
      }
      ??? = new HashMap();
      Object localObject2 = paramClass;
      do
      {
        String str;
        for (localObject3 : ((Class)localObject2).getDeclaredMethods())
        {
          if ((!((Method)localObject3).getName().startsWith("set")) || (((Method)localObject3).getDeclaringClass().equals(Object.class)) || (Modifier.isStatic(((Method)localObject3).getModifiers())) || (!((Method)localObject3).getReturnType().equals(Void.TYPE)) || (((Method)localObject3).getParameterTypes().length != 1) || (((AccessibleObject)localObject3).isAnnotationPresent(d9.m.class))) {
            k = 0;
          } else {
            k = 1;
          }
          if (k != 0)
          {
            str = f((Method)localObject3);
            Object localObject5 = (String)b.get(str.toLowerCase(Locale.US));
            if (localObject5 != null) {
              if (((String)localObject5).equals(str))
              {
                if (((Method)localObject3).isBridge())
                {
                  ((HashMap)???).put(str, localObject3);
                }
                else
                {
                  localObject5 = (Method)d.get(str);
                  Method localMethod = (Method)((HashMap)???).get(str);
                  if (localObject5 == null)
                  {
                    ((AccessibleObject)localObject3).setAccessible(true);
                    d.put(str, localObject3);
                    if (!((AccessibleObject)localObject3).isAnnotationPresent(s0.class))
                    {
                      if (((AccessibleObject)localObject3).isAnnotationPresent(d9.f.class))
                      {
                        c("Method", "accepts", localObject3.getParameterTypes()[0]);
                        g.add(f((Method)localObject3));
                      }
                    }
                    else
                    {
                      paramClass = f.l("Method ");
                      paramClass.append(((Method)localObject3).getName());
                      paramClass.append(" is annotated with @ServerTimestamp but should not be. @ServerTimestamp can only be applied to fields and getters, not setters.");
                      throw new IllegalArgumentException(paramClass.toString());
                    }
                  }
                  else if ((!d((Method)localObject3, (Method)localObject5)) && ((localMethod == null) || (!d((Method)localObject3, localMethod))))
                  {
                    if (localObject2 == paramClass)
                    {
                      localObject2 = f.l("Class ");
                      ((StringBuilder)localObject2).append(paramClass.getName());
                      ((StringBuilder)localObject2).append(" has multiple setter overloads with name ");
                      ((StringBuilder)localObject2).append(((Method)localObject3).getName());
                      throw new RuntimeException(((StringBuilder)localObject2).toString());
                    }
                    paramClass = f.l("Found conflicting setters with name: ");
                    paramClass.append(((Method)localObject3).getName());
                    paramClass.append(" (conflicts with ");
                    paramClass.append(((Method)localObject5).getName());
                    paramClass.append(" defined on ");
                    paramClass.append(((Method)localObject5).getDeclaringClass().getName());
                    paramClass.append(")");
                    throw new RuntimeException(paramClass.toString());
                  }
                }
              }
              else
              {
                paramClass = f.l("Found setter on ");
                paramClass.append(((Class)localObject2).getName());
                paramClass.append(" with invalid case-sensitive name: ");
                paramClass.append(((Method)localObject3).getName());
                throw new RuntimeException(paramClass.toString());
              }
            }
          }
        }
        for (str : ((Class)localObject2).getDeclaredFields())
        {
          localObject3 = e(str);
          if ((b.containsKey(((String)localObject3).toLowerCase(Locale.US))) && (!e.containsKey(localObject3)))
          {
            str.setAccessible(true);
            e.put(localObject3, str);
            b(str);
          }
        }
        localObject3 = ((Class)localObject2).getSuperclass();
        if (localObject3 == null) {
          break;
        }
        localObject2 = localObject3;
      } while (!localObject3.equals(Object.class));
      if (!b.isEmpty())
      {
        localObject3 = g.iterator();
        while (((Iterator)localObject3).hasNext())
        {
          localObject2 = (String)((Iterator)localObject3).next();
          if ((!d.containsKey(localObject2)) && (!e.containsKey(localObject2)))
          {
            localObject2 = f.m("@DocumentId is annotated on property ", (String)localObject2, " of class ");
            ((StringBuilder)localObject2).append(paramClass.getName());
            ((StringBuilder)localObject2).append(" but no field or public setter was found");
            throw new RuntimeException(((StringBuilder)localObject2).toString());
          }
        }
        return;
      }
      localObject2 = f.l("No properties to serialize found on class ");
      ((StringBuilder)localObject2).append(paramClass.getName());
      throw new RuntimeException(((StringBuilder)localObject2).toString());
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      for (;;) {}
    }
  }
  
  public static void c(String paramString1, String paramString2, Class paramClass)
  {
    if ((paramClass != String.class) && (paramClass != c.class))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(paramString1);
      localStringBuilder.append(" is annotated with @DocumentId but ");
      localStringBuilder.append(paramString2);
      localStringBuilder.append(" ");
      localStringBuilder.append(paramClass);
      localStringBuilder.append(" instead of String or DocumentReference.");
      throw new IllegalArgumentException(localStringBuilder.toString());
    }
  }
  
  public static boolean d(Method paramMethod1, Method paramMethod2)
  {
    e.a("Expected override from a base class", paramMethod1.getDeclaringClass().isAssignableFrom(paramMethod2.getDeclaringClass()));
    e.a("Expected void return type", paramMethod1.getReturnType().equals(Void.TYPE));
    e.a("Expected void return type", paramMethod2.getReturnType().equals(Void.TYPE));
    Class[] arrayOfClass1 = paramMethod1.getParameterTypes();
    Class[] arrayOfClass2 = paramMethod2.getParameterTypes();
    int i = arrayOfClass1.length;
    boolean bool1 = false;
    if (i == 1) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    e.a("Expected exactly one parameter", bool2);
    if (arrayOfClass2.length == 1) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    e.a("Expected exactly one parameter", bool2);
    boolean bool2 = bool1;
    if (paramMethod1.getName().equals(paramMethod2.getName()))
    {
      bool2 = bool1;
      if (arrayOfClass1[0].equals(arrayOfClass2[0])) {
        bool2 = true;
      }
    }
    return bool2;
  }
  
  public static String e(Field paramField)
  {
    String str;
    if (paramField.isAnnotationPresent(m0.class)) {
      str = ((m0)paramField.getAnnotation(m0.class)).value();
    } else {
      str = null;
    }
    if (str == null) {
      str = paramField.getName();
    }
    return str;
  }
  
  public static String f(Method paramMethod)
  {
    boolean bool = paramMethod.isAnnotationPresent(m0.class);
    Object localObject = null;
    String str1;
    if (bool) {
      str1 = ((m0)paramMethod.getAnnotation(m0.class)).value();
    } else {
      str1 = null;
    }
    String str2;
    if (str1 == null)
    {
      str2 = paramMethod.getName();
      int i = 0;
      int j = 0;
      paramMethod = (Method)localObject;
      while (j < 3)
      {
        str1 = new String[] { "get", "set", "is" }[j];
        if (str2.startsWith(str1)) {
          paramMethod = str1;
        }
        j++;
      }
      if (paramMethod != null)
      {
        paramMethod = str2.substring(paramMethod.length()).toCharArray();
        for (j = i; (j < paramMethod.length) && (Character.isUpperCase(paramMethod[j])); j++) {
          paramMethod[j] = Character.toLowerCase(paramMethod[j]);
        }
        str1 = new String(paramMethod);
      }
    }
    else
    {
      return str1;
    }
    throw new IllegalArgumentException(g.d("Unknown Bean prefix for method: ", str2));
  }
  
  public final void a(String paramString)
  {
    Object localObject = b;
    Locale localLocale = Locale.US;
    localObject = (String)((HashMap)localObject).put(paramString.toLowerCase(localLocale), paramString);
    if ((localObject != null) && (!paramString.equals(localObject)))
    {
      localObject = f.l("Found two getters or fields with conflicting case sensitivity for property: ");
      ((StringBuilder)localObject).append(paramString.toLowerCase(localLocale));
      throw new RuntimeException(((StringBuilder)localObject).toString());
    }
  }
  
  public final void b(Field paramField)
  {
    if (paramField.isAnnotationPresent(s0.class))
    {
      Class localClass = paramField.getType();
      if ((localClass != Date.class) && (localClass != u7.m.class))
      {
        StringBuilder localStringBuilder = f.l("Field ");
        localStringBuilder.append(paramField.getName());
        localStringBuilder.append(" is annotated with @ServerTimestamp but is ");
        localStringBuilder.append(localClass);
        localStringBuilder.append(" instead of Date or Timestamp.");
        throw new IllegalArgumentException(localStringBuilder.toString());
      }
      f.add(e(paramField));
    }
    if (paramField.isAnnotationPresent(d9.f.class))
    {
      c("Field", "is", paramField.getType());
      g.add(e(paramField));
    }
  }
}

/* Location:
 * Qualified Name:     n9.e.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */