package Z3;

import Q3.d;
import Q3.g;
import Q3.j;
import Q3.o;
import Q3.q;
import Y3.m;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public abstract class a
{
  public static final ConcurrentMap a = new ConcurrentHashMap();
  
  public static Object b(Object paramObject)
  {
    return e(paramObject);
  }
  
  public static Map c(Map paramMap)
  {
    paramMap = e(paramMap);
    m.f(paramMap instanceof Map);
    return (Map)paramMap;
  }
  
  public static a d(Class paramClass)
  {
    ConcurrentMap localConcurrentMap = a;
    a locala1 = (a)localConcurrentMap.get(paramClass);
    a locala2 = locala1;
    if (locala1 == null)
    {
      locala2 = new a(paramClass);
      localConcurrentMap.put(paramClass, locala2);
    }
    return locala2;
  }
  
  public static Object e(Object paramObject)
  {
    if (paramObject == null) {
      return null;
    }
    if ((paramObject instanceof Number))
    {
      if ((!(paramObject instanceof Float)) && (!(paramObject instanceof Double)))
      {
        if ((!(paramObject instanceof Long)) && (!(paramObject instanceof Integer))) {
          throw new d(String.format("Numbers of type %s are not supported, please use an int, long, float or double", new Object[] { paramObject.getClass().getSimpleName() }));
        }
        return paramObject;
      }
      paramObject = (Number)paramObject;
      double d = ((Number)paramObject).doubleValue();
      if ((d <= 9.223372036854776E18D) && (d >= -9.223372036854776E18D) && (Math.floor(d) == d)) {
        return Long.valueOf(((Number)paramObject).longValue());
      }
      return Double.valueOf(d);
    }
    if ((paramObject instanceof String)) {
      return paramObject;
    }
    if ((paramObject instanceof Boolean)) {
      return paramObject;
    }
    if (!(paramObject instanceof Character))
    {
      Object localObject1;
      if ((paramObject instanceof Map))
      {
        localObject1 = new HashMap();
        paramObject = ((Map)paramObject).entrySet().iterator();
        while (((Iterator)paramObject).hasNext())
        {
          Map.Entry localEntry = (Map.Entry)((Iterator)paramObject).next();
          Object localObject2 = localEntry.getKey();
          if ((localObject2 instanceof String)) {
            ((Map)localObject1).put((String)localObject2, e(localEntry.getValue()));
          } else {
            throw new d("Maps with non-string keys are not supported");
          }
        }
        return localObject1;
      }
      if ((paramObject instanceof Collection))
      {
        if ((paramObject instanceof List))
        {
          localObject1 = (List)paramObject;
          paramObject = new ArrayList(((List)localObject1).size());
          localObject1 = ((List)localObject1).iterator();
          while (((Iterator)localObject1).hasNext()) {
            ((List)paramObject).add(e(((Iterator)localObject1).next()));
          }
          return paramObject;
        }
        throw new d("Serializing Collections is not supported, please use Lists instead");
      }
      if (!paramObject.getClass().isArray())
      {
        if ((paramObject instanceof Enum)) {
          return ((Enum)paramObject).name();
        }
        return d(paramObject.getClass()).f(paramObject);
      }
      throw new d("Serializing Arrays is not supported, please use Lists instead");
    }
    throw new d("Characters are not supported, please use Strings");
  }
  
  public static class a
  {
    public final Class a;
    public final Constructor b;
    public final boolean c;
    public final boolean d;
    public final Map e;
    public final Map f;
    public final Map g;
    public final Map h;
    
    public a(Class paramClass)
    {
      a = paramClass;
      c = paramClass.isAnnotationPresent(q.class);
      d = (paramClass.isAnnotationPresent(j.class) ^ true);
      e = new HashMap();
      g = new HashMap();
      f = new HashMap();
      h = new HashMap();
      try
      {
        Constructor localConstructor = paramClass.getDeclaredConstructor(new Class[0]);
        localConstructor.setAccessible(true);
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        localObject1 = null;
      }
      b = ((Constructor)localObject1);
      Object localObject3;
      for (localObject1 : paramClass.getMethods()) {
        if (i((Method)localObject1))
        {
          localObject3 = e((Method)localObject1);
          a((String)localObject3);
          ((AccessibleObject)localObject1).setAccessible(true);
          if (!f.containsKey(localObject3))
          {
            f.put(localObject3, localObject1);
          }
          else
          {
            paramClass = new StringBuilder();
            paramClass.append("Found conflicting getters for name: ");
            paramClass.append(((Method)localObject1).getName());
            throw new d(paramClass.toString());
          }
        }
      }
      for (??? : paramClass.getFields()) {
        if (h((Field)???)) {
          a(d((Field)???));
        }
      }
      Object localObject1 = paramClass;
      do
      {
        for (??? : ((Class)localObject1).getDeclaredMethods()) {
          if (j((Method)???))
          {
            String str = e((Method)???);
            localObject3 = (String)e.get(str.toLowerCase(Locale.US));
            if (localObject3 != null) {
              if (((String)localObject3).equals(str))
              {
                localObject3 = (Method)g.get(str);
                if (localObject3 == null)
                {
                  ((AccessibleObject)???).setAccessible(true);
                  g.put(str, ???);
                }
                else if (!c((Method)???, (Method)localObject3))
                {
                  paramClass = new StringBuilder();
                  paramClass.append("Found a conflicting setters with name: ");
                  paramClass.append(((Method)???).getName());
                  paramClass.append(" (conflicts with ");
                  paramClass.append(((Method)localObject3).getName());
                  paramClass.append(" defined on ");
                  paramClass.append(((Method)localObject3).getDeclaringClass().getName());
                  paramClass.append(")");
                  throw new d(paramClass.toString());
                }
              }
              else
              {
                paramClass = new StringBuilder();
                paramClass.append("Found setter with invalid case-sensitive name: ");
                paramClass.append(((Method)???).getName());
                throw new d(paramClass.toString());
              }
            }
          }
        }
        for (??? : ((Class)localObject1).getDeclaredFields())
        {
          localObject3 = d((Field)???);
          if ((e.containsKey(((String)localObject3).toLowerCase(Locale.US))) && (!h.containsKey(localObject3)))
          {
            ((AccessibleObject)???).setAccessible(true);
            h.put(localObject3, ???);
          }
        }
        ??? = ((Class)localObject1).getSuperclass();
        if (??? == null) {
          break;
        }
        localObject1 = ???;
      } while (!???.equals(Object.class));
      if (!e.isEmpty()) {
        return;
      }
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("No properties to serialize found on class ");
      ((StringBuilder)localObject1).append(paramClass.getName());
      throw new d(((StringBuilder)localObject1).toString());
    }
    
    public static String b(AccessibleObject paramAccessibleObject)
    {
      if (paramAccessibleObject.isAnnotationPresent(o.class)) {
        return ((o)paramAccessibleObject.getAnnotation(o.class)).value();
      }
      return null;
    }
    
    public static boolean c(Method paramMethod1, Method paramMethod2)
    {
      m.g(paramMethod1.getDeclaringClass().isAssignableFrom(paramMethod2.getDeclaringClass()), "Expected override from a base class");
      Object localObject1 = paramMethod1.getReturnType();
      Object localObject2 = Void.TYPE;
      m.g(localObject1.equals(localObject2), "Expected void return type");
      m.g(paramMethod2.getReturnType().equals(localObject2), "Expected void return type");
      localObject1 = paramMethod1.getParameterTypes();
      localObject2 = paramMethod2.getParameterTypes();
      int i = localObject1.length;
      boolean bool1 = false;
      if (i == 1) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      m.g(bool2, "Expected exactly one parameter");
      if (localObject2.length == 1) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      m.g(bool2, "Expected exactly one parameter");
      boolean bool2 = bool1;
      if (paramMethod1.getName().equals(paramMethod2.getName()))
      {
        bool2 = bool1;
        if (localObject1[0].equals(localObject2[0])) {
          bool2 = true;
        }
      }
      return bool2;
    }
    
    public static String d(Field paramField)
    {
      String str = b(paramField);
      if (str != null) {
        paramField = str;
      } else {
        paramField = paramField.getName();
      }
      return paramField;
    }
    
    public static String e(Method paramMethod)
    {
      String str = b(paramMethod);
      if (str != null) {
        paramMethod = str;
      } else {
        paramMethod = g(paramMethod.getName());
      }
      return paramMethod;
    }
    
    public static String g(String paramString)
    {
      Object localObject = null;
      int i = 0;
      for (int j = 0; j < 3; j++)
      {
        String str = new String[] { "get", "set", "is" }[j];
        if (paramString.startsWith(str)) {
          localObject = str;
        }
      }
      if (localObject != null)
      {
        paramString = paramString.substring(((String)localObject).length()).toCharArray();
        for (j = i; (j < paramString.length) && (Character.isUpperCase(paramString[j])); j++) {
          paramString[j] = Character.toLowerCase(paramString[j]);
        }
        return new String(paramString);
      }
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Unknown Bean prefix for method: ");
      ((StringBuilder)localObject).append(paramString);
      throw new IllegalArgumentException(((StringBuilder)localObject).toString());
    }
    
    public static boolean h(Field paramField)
    {
      if (paramField.getDeclaringClass().equals(Object.class)) {
        return false;
      }
      if (!Modifier.isPublic(paramField.getModifiers())) {
        return false;
      }
      if (Modifier.isStatic(paramField.getModifiers())) {
        return false;
      }
      if (Modifier.isTransient(paramField.getModifiers())) {
        return false;
      }
      return !paramField.isAnnotationPresent(g.class);
    }
    
    public static boolean i(Method paramMethod)
    {
      if ((!paramMethod.getName().startsWith("get")) && (!paramMethod.getName().startsWith("is"))) {
        return false;
      }
      if (paramMethod.getDeclaringClass().equals(Object.class)) {
        return false;
      }
      if (!Modifier.isPublic(paramMethod.getModifiers())) {
        return false;
      }
      if (Modifier.isStatic(paramMethod.getModifiers())) {
        return false;
      }
      if (paramMethod.getReturnType().equals(Void.TYPE)) {
        return false;
      }
      if (paramMethod.getParameterTypes().length != 0) {
        return false;
      }
      return !paramMethod.isAnnotationPresent(g.class);
    }
    
    public static boolean j(Method paramMethod)
    {
      if (!paramMethod.getName().startsWith("set")) {
        return false;
      }
      if (paramMethod.getDeclaringClass().equals(Object.class)) {
        return false;
      }
      if (Modifier.isStatic(paramMethod.getModifiers())) {
        return false;
      }
      if (!paramMethod.getReturnType().equals(Void.TYPE)) {
        return false;
      }
      if (paramMethod.getParameterTypes().length != 1) {
        return false;
      }
      return !paramMethod.isAnnotationPresent(g.class);
    }
    
    public final void a(String paramString)
    {
      Object localObject = e;
      Locale localLocale = Locale.US;
      localObject = (String)((Map)localObject).put(paramString.toLowerCase(localLocale), paramString);
      if ((localObject != null) && (!paramString.equals(localObject)))
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Found two getters or fields with conflicting case sensitivity for property: ");
        ((StringBuilder)localObject).append(paramString.toLowerCase(localLocale));
        throw new d(((StringBuilder)localObject).toString());
      }
    }
    
    public Map f(Object paramObject)
    {
      if (a.isAssignableFrom(paramObject.getClass()))
      {
        HashMap localHashMap = new HashMap();
        Iterator localIterator = e.values().iterator();
        String str;
        for (;;)
        {
          if (!localIterator.hasNext()) {
            break label219;
          }
          str = (String)localIterator.next();
          if (f.containsKey(str))
          {
            localObject = (Method)f.get(str);
            try
            {
              localObject = ((Method)localObject).invoke(paramObject, new Object[0]);
            }
            catch (InvocationTargetException paramObject) {}catch (IllegalAccessException paramObject)
            {
              break label119;
            }
            throw new RuntimeException((Throwable)paramObject);
            label119:
            throw new RuntimeException((Throwable)paramObject);
          }
          localObject = (Field)h.get(str);
          if (localObject != null) {
            try
            {
              localObject = ((Field)localObject).get(paramObject);
              localHashMap.put(str, a.a(localObject));
            }
            catch (IllegalAccessException paramObject)
            {
              throw new RuntimeException((Throwable)paramObject);
            }
          }
        }
        paramObject = new StringBuilder();
        ((StringBuilder)paramObject).append("Bean property without field or getter:");
        ((StringBuilder)paramObject).append(str);
        throw new IllegalStateException(((StringBuilder)paramObject).toString());
        label219:
        return localHashMap;
      }
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Can't serialize object of class ");
      ((StringBuilder)localObject).append(paramObject.getClass());
      ((StringBuilder)localObject).append(" with BeanMapper for class ");
      ((StringBuilder)localObject).append(a);
      throw new IllegalArgumentException(((StringBuilder)localObject).toString());
    }
  }
}

/* Location:
 * Qualified Name:     Z3.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */