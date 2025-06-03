package ec;

import b.a0;
import dc.b;
import dc.e;
import dc.f;
import dc.h;
import dc.j;
import dc.l;
import dc.n;
import dc.o;
import dc.p;
import dc.q;
import dc.r;
import dc.s;
import dc.u;
import dc.w;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import sb.y;
import sb.z;

public final class d
  implements jc.c<Object>, c
{
  public static final Map<Class<? extends rb.a<?>>, Integer> b;
  public static final HashMap<String, String> c;
  public static final LinkedHashMap d;
  public final Class<?> a;
  
  static
  {
    int i = 0;
    Object localObject1 = va.a.g(new Class[] { dc.a.class, l.class, p.class, q.class, r.class, s.class, dc.t.class, u.class, dc.v.class, w.class, b.class, dc.c.class, dc.d.class, e.class, f.class, dc.g.class, h.class, dc.i.class, j.class, dc.k.class, dc.m.class, n.class, o.class });
    Object localObject2 = new ArrayList(sb.m.j((Iterable)localObject1));
    Object localObject3 = ((Iterable)localObject1).iterator();
    while (((Iterator)localObject3).hasNext())
    {
      localObject1 = ((Iterator)localObject3).next();
      if (i >= 0)
      {
        ((ArrayList)localObject2).add(new rb.d((Class)localObject1, Integer.valueOf(i)));
        i++;
      }
      else
      {
        throw new ArithmeticException("Index overflow has happened.");
      }
    }
    b = z.L0((ArrayList)localObject2);
    localObject3 = new HashMap();
    ((HashMap)localObject3).put("boolean", "kotlin.Boolean");
    ((HashMap)localObject3).put("char", "kotlin.Char");
    ((HashMap)localObject3).put("byte", "kotlin.Byte");
    ((HashMap)localObject3).put("short", "kotlin.Short");
    ((HashMap)localObject3).put("int", "kotlin.Int");
    ((HashMap)localObject3).put("float", "kotlin.Float");
    ((HashMap)localObject3).put("long", "kotlin.Long");
    ((HashMap)localObject3).put("double", "kotlin.Double");
    localObject1 = new HashMap();
    ((HashMap)localObject1).put("java.lang.Boolean", "kotlin.Boolean");
    ((HashMap)localObject1).put("java.lang.Character", "kotlin.Char");
    ((HashMap)localObject1).put("java.lang.Byte", "kotlin.Byte");
    ((HashMap)localObject1).put("java.lang.Short", "kotlin.Short");
    ((HashMap)localObject1).put("java.lang.Integer", "kotlin.Int");
    ((HashMap)localObject1).put("java.lang.Float", "kotlin.Float");
    ((HashMap)localObject1).put("java.lang.Long", "kotlin.Long");
    ((HashMap)localObject1).put("java.lang.Double", "kotlin.Double");
    localObject2 = new HashMap();
    ((HashMap)localObject2).put("java.lang.Object", "kotlin.Any");
    ((HashMap)localObject2).put("java.lang.String", "kotlin.String");
    ((HashMap)localObject2).put("java.lang.CharSequence", "kotlin.CharSequence");
    ((HashMap)localObject2).put("java.lang.Throwable", "kotlin.Throwable");
    ((HashMap)localObject2).put("java.lang.Cloneable", "kotlin.Cloneable");
    ((HashMap)localObject2).put("java.lang.Number", "kotlin.Number");
    ((HashMap)localObject2).put("java.lang.Comparable", "kotlin.Comparable");
    ((HashMap)localObject2).put("java.lang.Enum", "kotlin.Enum");
    ((HashMap)localObject2).put("java.lang.annotation.Annotation", "kotlin.Annotation");
    ((HashMap)localObject2).put("java.lang.Iterable", "kotlin.collections.Iterable");
    ((HashMap)localObject2).put("java.util.Iterator", "kotlin.collections.Iterator");
    ((HashMap)localObject2).put("java.util.Collection", "kotlin.collections.Collection");
    ((HashMap)localObject2).put("java.util.List", "kotlin.collections.List");
    ((HashMap)localObject2).put("java.util.Set", "kotlin.collections.Set");
    ((HashMap)localObject2).put("java.util.ListIterator", "kotlin.collections.ListIterator");
    ((HashMap)localObject2).put("java.util.Map", "kotlin.collections.Map");
    ((HashMap)localObject2).put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
    ((HashMap)localObject2).put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
    ((HashMap)localObject2).put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
    ((HashMap)localObject2).putAll((Map)localObject3);
    ((HashMap)localObject2).putAll((Map)localObject1);
    localObject1 = ((HashMap)localObject3).values();
    i.d(localObject1, "<get-values>(...)");
    localObject1 = ((Iterable)localObject1).iterator();
    Object localObject4;
    while (((Iterator)localObject1).hasNext())
    {
      localObject3 = (String)((Iterator)localObject1).next();
      localObject4 = new StringBuilder();
      ((StringBuilder)localObject4).append("kotlin.jvm.internal.");
      i.b(localObject3);
      ((StringBuilder)localObject4).append(lc.k.A0((String)localObject3, (String)localObject3));
      ((StringBuilder)localObject4).append("CompanionObject");
      String str = ((StringBuilder)localObject4).toString();
      localObject4 = new StringBuilder();
      ((StringBuilder)localObject4).append((String)localObject3);
      ((StringBuilder)localObject4).append(".Companion");
      ((HashMap)localObject2).put(str, ((StringBuilder)localObject4).toString());
    }
    localObject1 = b.entrySet().iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject4 = (Map.Entry)((Iterator)localObject1).next();
      localObject3 = (Class)((Map.Entry)localObject4).getKey();
      i = ((Number)((Map.Entry)localObject4).getValue()).intValue();
      localObject3 = ((Class)localObject3).getName();
      localObject4 = new StringBuilder();
      ((StringBuilder)localObject4).append("kotlin.Function");
      ((StringBuilder)localObject4).append(i);
      ((HashMap)localObject2).put(localObject3, ((StringBuilder)localObject4).toString());
    }
    c = (HashMap)localObject2;
    localObject1 = new LinkedHashMap(y.H0(((HashMap)localObject2).size()));
    localObject2 = ((HashMap)localObject2).entrySet().iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject4 = (Map.Entry)((Iterator)localObject2).next();
      localObject3 = ((Map.Entry)localObject4).getKey();
      localObject4 = (String)((Map.Entry)localObject4).getValue();
      i.b(localObject4);
      ((Map)localObject1).put(localObject3, lc.k.A0((String)localObject4, (String)localObject4));
    }
    d = (LinkedHashMap)localObject1;
  }
  
  public d(Class<?> paramClass)
  {
    a = paramClass;
  }
  
  public final String b()
  {
    Object localObject1 = a;
    i.e(localObject1, "jClass");
    boolean bool = ((Class)localObject1).isAnonymousClass();
    Object localObject2 = null;
    Object localObject3 = null;
    if (bool)
    {
      localObject3 = localObject2;
    }
    else if (((Class)localObject1).isLocalClass())
    {
      localObject3 = localObject2;
    }
    else if (((Class)localObject1).isArray())
    {
      localObject1 = ((Class)localObject1).getComponentType();
      localObject2 = localObject3;
      if (((Class)localObject1).isPrimitive())
      {
        localObject1 = (String)c.get(((Class)localObject1).getName());
        localObject2 = localObject3;
        if (localObject1 != null) {
          localObject2 = g.d((String)localObject1, "Array");
        }
      }
      localObject3 = localObject2;
      if (localObject2 == null) {
        localObject3 = "kotlin.Array";
      }
    }
    else
    {
      localObject2 = (String)c.get(((Class)localObject1).getName());
      localObject3 = localObject2;
      if (localObject2 == null) {
        localObject3 = ((Class)localObject1).getCanonicalName();
      }
    }
    return (String)localObject3;
  }
  
  public final boolean c(Object paramObject)
  {
    Class localClass = a;
    i.e(localClass, "jClass");
    Object localObject = b;
    i.c(localObject, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
    localObject = (Integer)((Map)localObject).get(localClass);
    boolean bool;
    if (localObject != null)
    {
      bool = v.b(((Number)localObject).intValue(), paramObject);
    }
    else
    {
      localObject = localClass;
      if (localClass.isPrimitive()) {
        localObject = a0.t(t.a(localClass));
      }
      bool = ((Class)localObject).isInstance(paramObject);
    }
    return bool;
  }
  
  public final Class<?> d()
  {
    return a;
  }
  
  public final String e()
  {
    Object localObject1 = a;
    i.e(localObject1, "jClass");
    boolean bool = ((Class)localObject1).isAnonymousClass();
    Object localObject2 = "Array";
    Object localObject3 = null;
    Object localObject4 = null;
    if (bool) {
      localObject3 = localObject4;
    }
    label156:
    do
    {
      localObject4 = localObject3;
      break label305;
      if (((Class)localObject1).isLocalClass())
      {
        localObject3 = ((Class)localObject1).getSimpleName();
        localObject4 = ((Class)localObject1).getEnclosingMethod();
        if (localObject4 != null)
        {
          localObject2 = new StringBuilder();
          ((StringBuilder)localObject2).append(((Method)localObject4).getName());
          ((StringBuilder)localObject2).append('$');
          localObject4 = ((StringBuilder)localObject2).toString();
        }
        else
        {
          localObject4 = ((Class)localObject1).getEnclosingConstructor();
          if (localObject4 == null) {
            break label156;
          }
          localObject2 = new StringBuilder();
          ((StringBuilder)localObject2).append(((Constructor)localObject4).getName());
          ((StringBuilder)localObject2).append('$');
          localObject4 = ((StringBuilder)localObject2).toString();
        }
        localObject4 = lc.k.z0((String)localObject3, (String)localObject4, (String)localObject3);
        break label305;
        int i = ((String)localObject3).indexOf('$', 0);
        if (i == -1)
        {
          localObject4 = localObject3;
          break label305;
        }
        localObject4 = ((String)localObject3).substring(i + 1, ((String)localObject3).length());
        i.d(localObject4, "substring(...)");
        break label305;
      }
      if (!((Class)localObject1).isArray()) {
        break;
      }
      localObject1 = ((Class)localObject1).getComponentType();
      localObject4 = localObject3;
      if (((Class)localObject1).isPrimitive())
      {
        localObject1 = (String)d.get(((Class)localObject1).getName());
        localObject4 = localObject3;
        if (localObject1 != null) {
          localObject4 = g.d((String)localObject1, "Array");
        }
      }
      localObject3 = localObject4;
    } while (localObject4 != null);
    localObject4 = localObject2;
    break label305;
    localObject3 = (String)d.get(((Class)localObject1).getName());
    localObject4 = localObject3;
    if (localObject3 == null) {
      localObject4 = ((Class)localObject1).getSimpleName();
    }
    label305:
    return (String)localObject4;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool;
    if (((paramObject instanceof d)) && (i.a(a0.t(this), a0.t((jc.c)paramObject)))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final int hashCode()
  {
    return a0.t(this).hashCode();
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(a);
    localStringBuilder.append(" (Kotlin reflection is not available)");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     ec.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */