package c3;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import k3.i;
import k3.o;
import n3.a;
import p3.C.c;
import p3.I;
import p3.y;
import p3.z;
import q3.k;

public final class v
{
  public final ConcurrentMap a;
  public c b;
  public final Class c;
  public final a d;
  public final boolean e;
  
  public v(ConcurrentMap paramConcurrentMap, c paramc, a parama, Class paramClass)
  {
    a = paramConcurrentMap;
    b = paramc;
    c = paramClass;
    d = parama;
    e = false;
  }
  
  public static c b(Object paramObject1, Object paramObject2, C.c paramc, ConcurrentMap paramConcurrentMap)
  {
    Object localObject = Integer.valueOf(paramc.a0());
    if (paramc.b0() == I.s) {
      localObject = null;
    }
    localObject = i.a().d(o.b(paramc.Z().a0(), paramc.Z().b0(), paramc.Z().Z(), paramc.b0(), (Integer)localObject), f.a());
    paramObject1 = new c(paramObject1, paramObject2, d.a(paramc), paramc.c0(), paramc.b0(), paramc.a0(), paramc.Z().a0(), (g)localObject);
    paramc = new ArrayList();
    paramc.add(paramObject1);
    paramObject2 = new d(((c)paramObject1).b(), null);
    paramc = (List)paramConcurrentMap.put(paramObject2, Collections.unmodifiableList(paramc));
    if (paramc != null)
    {
      localObject = new ArrayList();
      ((List)localObject).addAll(paramc);
      ((List)localObject).add(paramObject1);
      paramConcurrentMap.put(paramObject2, Collections.unmodifiableList((List)localObject));
    }
    return (c)paramObject1;
  }
  
  public static b j(Class paramClass)
  {
    return new b(paramClass, null);
  }
  
  public Collection c()
  {
    return a.values();
  }
  
  public a d()
  {
    return d;
  }
  
  public c e()
  {
    return b;
  }
  
  public List f(byte[] paramArrayOfByte)
  {
    paramArrayOfByte = (List)a.get(new d(paramArrayOfByte, null));
    if (paramArrayOfByte == null) {
      paramArrayOfByte = Collections.emptyList();
    }
    return paramArrayOfByte;
  }
  
  public Class g()
  {
    return c;
  }
  
  public List h()
  {
    return f(d.a);
  }
  
  public boolean i()
  {
    return d.b().isEmpty() ^ true;
  }
  
  public static class b
  {
    public final Class a;
    public ConcurrentMap b = new ConcurrentHashMap();
    public v.c c;
    public a d;
    
    public b(Class paramClass)
    {
      a = paramClass;
      d = a.b;
    }
    
    public b a(Object paramObject1, Object paramObject2, C.c paramc)
    {
      return c(paramObject1, paramObject2, paramc, false);
    }
    
    public b b(Object paramObject1, Object paramObject2, C.c paramc)
    {
      return c(paramObject1, paramObject2, paramc, true);
    }
    
    public final b c(Object paramObject1, Object paramObject2, C.c paramc, boolean paramBoolean)
    {
      if (b != null)
      {
        if ((paramObject1 == null) && (paramObject2 == null)) {
          throw new GeneralSecurityException("at least one of the `fullPrimitive` or `primitive` must be set");
        }
        if (paramc.c0() == z.q)
        {
          paramObject1 = v.a(paramObject1, paramObject2, paramc, b);
          if (paramBoolean) {
            if (c == null) {
              c = ((v.c)paramObject1);
            } else {
              throw new IllegalStateException("you cannot set two primary primitives");
            }
          }
          return this;
        }
        throw new GeneralSecurityException("only ENABLED key is allowed");
      }
      throw new IllegalStateException("addPrimitive cannot be called after build");
    }
    
    public v d()
    {
      Object localObject = b;
      if (localObject != null)
      {
        localObject = new v((ConcurrentMap)localObject, c, d, a, null);
        b = null;
        return (v)localObject;
      }
      throw new IllegalStateException("build cannot be called twice");
    }
    
    public b e(a parama)
    {
      if (b != null)
      {
        d = parama;
        return this;
      }
      throw new IllegalStateException("setAnnotations cannot be called after build");
    }
  }
  
  public static final class c
  {
    public final Object a;
    public final Object b;
    public final byte[] c;
    public final z d;
    public final I e;
    public final int f;
    public final String g;
    public final g h;
    
    public c(Object paramObject1, Object paramObject2, byte[] paramArrayOfByte, z paramz, I paramI, int paramInt, String paramString, g paramg)
    {
      a = paramObject1;
      b = paramObject2;
      c = Arrays.copyOf(paramArrayOfByte, paramArrayOfByte.length);
      d = paramz;
      e = paramI;
      f = paramInt;
      g = paramString;
      h = paramg;
    }
    
    public Object a()
    {
      return a;
    }
    
    public final byte[] b()
    {
      byte[] arrayOfByte = c;
      if (arrayOfByte == null) {
        return null;
      }
      return Arrays.copyOf(arrayOfByte, arrayOfByte.length);
    }
    
    public g c()
    {
      return h;
    }
    
    public int d()
    {
      return f;
    }
    
    public String e()
    {
      return g;
    }
    
    public I f()
    {
      return e;
    }
    
    public Object g()
    {
      return b;
    }
    
    public z h()
    {
      return d;
    }
  }
  
  public static class d
    implements Comparable
  {
    public final byte[] o;
    
    public d(byte[] paramArrayOfByte)
    {
      o = Arrays.copyOf(paramArrayOfByte, paramArrayOfByte.length);
    }
    
    public int c(d paramd)
    {
      byte[] arrayOfByte1 = o;
      int i = arrayOfByte1.length;
      byte[] arrayOfByte2 = o;
      if (i != arrayOfByte2.length) {
        return arrayOfByte1.length - arrayOfByte2.length;
      }
      for (i = 0;; i++)
      {
        arrayOfByte1 = o;
        if (i >= arrayOfByte1.length) {
          break;
        }
        int j = arrayOfByte1[i];
        int k = o[i];
        if (j != k) {
          return j - k;
        }
      }
      return 0;
    }
    
    public boolean equals(Object paramObject)
    {
      if (!(paramObject instanceof d)) {
        return false;
      }
      paramObject = (d)paramObject;
      return Arrays.equals(o, o);
    }
    
    public int hashCode()
    {
      return Arrays.hashCode(o);
    }
    
    public String toString()
    {
      return k.b(o);
    }
  }
}

/* Location:
 * Qualified Name:     c3.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */