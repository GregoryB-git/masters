package kotlin.jvm.internal;

import W5.C;
import g6.b;
import g6.f;
import g6.g;
import g6.h;
import g6.j;
import g6.k;
import g6.l;
import g6.n;
import g6.o;
import g6.p;
import g6.r;
import g6.s;
import g6.t;
import g6.u;
import g6.v;
import g6.w;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class e
  implements m6.c, d
{
  public static final a p = new a(null);
  public static final Map q;
  public static final HashMap r;
  public static final HashMap s;
  public static final HashMap t;
  public static final Map u;
  public final Class o;
  
  static
  {
    int i = 0;
    Object localObject1 = (Iterable)W5.m.i(new Class[] { g6.a.class, l.class, p.class, g6.q.class, r.class, s.class, t.class, u.class, v.class, w.class, b.class, g6.c.class, g6.d.class, g6.e.class, f.class, g.class, h.class, g6.i.class, j.class, k.class, g6.m.class, n.class, o.class });
    Object localObject2 = new ArrayList(W5.m.l((Iterable)localObject1, 10));
    Object localObject3 = ((Iterable)localObject1).iterator();
    while (((Iterator)localObject3).hasNext())
    {
      localObject1 = ((Iterator)localObject3).next();
      if (i < 0) {
        W5.m.k();
      }
      ((Collection)localObject2).add(V5.q.a((Class)localObject1, Integer.valueOf(i)));
      i++;
    }
    q = C.k((Iterable)localObject2);
    localObject3 = new HashMap();
    ((HashMap)localObject3).put("boolean", "kotlin.Boolean");
    ((HashMap)localObject3).put("char", "kotlin.Char");
    ((HashMap)localObject3).put("byte", "kotlin.Byte");
    ((HashMap)localObject3).put("short", "kotlin.Short");
    ((HashMap)localObject3).put("int", "kotlin.Int");
    ((HashMap)localObject3).put("float", "kotlin.Float");
    ((HashMap)localObject3).put("long", "kotlin.Long");
    ((HashMap)localObject3).put("double", "kotlin.Double");
    r = (HashMap)localObject3;
    localObject1 = new HashMap();
    ((HashMap)localObject1).put("java.lang.Boolean", "kotlin.Boolean");
    ((HashMap)localObject1).put("java.lang.Character", "kotlin.Char");
    ((HashMap)localObject1).put("java.lang.Byte", "kotlin.Byte");
    ((HashMap)localObject1).put("java.lang.Short", "kotlin.Short");
    ((HashMap)localObject1).put("java.lang.Integer", "kotlin.Int");
    ((HashMap)localObject1).put("java.lang.Float", "kotlin.Float");
    ((HashMap)localObject1).put("java.lang.Long", "kotlin.Long");
    ((HashMap)localObject1).put("java.lang.Double", "kotlin.Double");
    s = (HashMap)localObject1;
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
    Intrinsics.checkNotNullExpressionValue(localObject1, "<get-values>(...)");
    localObject1 = ((Iterable)localObject1).iterator();
    Object localObject4;
    while (((Iterator)localObject1).hasNext())
    {
      localObject3 = (String)((Iterator)localObject1).next();
      localObject4 = new StringBuilder();
      ((StringBuilder)localObject4).append("kotlin.jvm.internal.");
      Intrinsics.b(localObject3);
      ((StringBuilder)localObject4).append(kotlin.text.i.e0((String)localObject3, '.', null, 2, null));
      ((StringBuilder)localObject4).append("CompanionObject");
      String str = ((StringBuilder)localObject4).toString();
      localObject4 = new StringBuilder();
      ((StringBuilder)localObject4).append((String)localObject3);
      ((StringBuilder)localObject4).append(".Companion");
      localObject3 = V5.q.a(str, ((StringBuilder)localObject4).toString());
      ((Map)localObject2).put(((V5.m)localObject3).c(), ((V5.m)localObject3).d());
    }
    localObject1 = q.entrySet().iterator();
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
    t = (HashMap)localObject2;
    localObject1 = new LinkedHashMap(C.a(((Map)localObject2).size()));
    localObject2 = ((Map)localObject2).entrySet().iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = (Map.Entry)((Iterator)localObject2).next();
      ((Map)localObject1).put(((Map.Entry)localObject3).getKey(), kotlin.text.i.e0((String)((Map.Entry)localObject3).getValue(), '.', null, 2, null));
    }
    u = (Map)localObject1;
  }
  
  public e(Class paramClass)
  {
    o = paramClass;
  }
  
  public String a()
  {
    return p.a(b());
  }
  
  public Class b()
  {
    return o;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool;
    if (((paramObject instanceof e)) && (Intrinsics.a(f6.a.a(this), f6.a.a((m6.c)paramObject)))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public int hashCode()
  {
    return f6.a.a(this).hashCode();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(b().toString());
    localStringBuilder.append(" (Kotlin reflection is not available)");
    return localStringBuilder.toString();
  }
  
  public static final class a
  {
    public final String a(Class paramClass)
    {
      Intrinsics.checkNotNullParameter(paramClass, "jClass");
      boolean bool = paramClass.isAnonymousClass();
      Object localObject1 = null;
      Object localObject2 = null;
      if (bool)
      {
        localObject2 = localObject1;
      }
      else
      {
        Object localObject3;
        if (paramClass.isLocalClass())
        {
          localObject3 = paramClass.getSimpleName();
          localObject2 = paramClass.getEnclosingMethod();
          if (localObject2 != null)
          {
            Intrinsics.b(localObject3);
            localObject1 = new StringBuilder();
            ((StringBuilder)localObject1).append(((Method)localObject2).getName());
            ((StringBuilder)localObject1).append('$');
            localObject1 = kotlin.text.i.c0((String)localObject3, ((StringBuilder)localObject1).toString(), null, 2, null);
            localObject2 = localObject1;
            if (localObject1 == null) {}
          }
        }
        for (;;)
        {
          break;
          localObject2 = paramClass.getEnclosingConstructor();
          Intrinsics.b(localObject3);
          if (localObject2 != null)
          {
            paramClass = new StringBuilder();
            paramClass.append(((Constructor)localObject2).getName());
            paramClass.append('$');
            localObject2 = kotlin.text.i.c0((String)localObject3, paramClass.toString(), null, 2, null);
          }
          else
          {
            localObject2 = kotlin.text.i.b0((String)localObject3, '$', null, 2, null);
            break;
            if (paramClass.isArray())
            {
              localObject3 = paramClass.getComponentType();
              bool = ((Class)localObject3).isPrimitive();
              localObject1 = "Array";
              paramClass = (Class)localObject2;
              if (bool)
              {
                localObject3 = (String)e.c().get(((Class)localObject3).getName());
                paramClass = (Class)localObject2;
                if (localObject3 != null)
                {
                  paramClass = new StringBuilder();
                  paramClass.append((String)localObject3);
                  paramClass.append("Array");
                  paramClass = paramClass.toString();
                }
              }
              localObject2 = paramClass;
              if (paramClass == null) {
                localObject2 = localObject1;
              }
            }
            else
            {
              localObject1 = (String)e.c().get(paramClass.getName());
              localObject2 = localObject1;
              if (localObject1 == null) {
                localObject2 = paramClass.getSimpleName();
              }
            }
          }
        }
      }
      return (String)localObject2;
    }
  }
}

/* Location:
 * Qualified Name:     kotlin.jvm.internal.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */