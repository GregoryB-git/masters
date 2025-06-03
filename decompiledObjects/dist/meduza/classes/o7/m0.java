package o7;

import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import x6.b;

public final class m0<K, V>
  extends u<K, V>
{
  public static final m0 o = new m0(null, new Object[0], 0);
  public final transient Object d;
  public final transient Object[] e;
  public final transient int f;
  
  public m0(Object paramObject, Object[] paramArrayOfObject, int paramInt)
  {
    d = paramObject;
    e = paramArrayOfObject;
    f = paramInt;
  }
  
  public final a c()
  {
    return new a(this, e, f);
  }
  
  public final b d()
  {
    return new b(this, new c(e, 0, f));
  }
  
  public final c e()
  {
    return new c(e, 1, f);
  }
  
  public final void f() {}
  
  public final V get(Object paramObject)
  {
    Object localObject = d;
    Object[] arrayOfObject = e;
    int i = f;
    if (paramObject != null)
    {
      if (i != 1) {
        break label63;
      }
      localObject = arrayOfObject[0];
      Objects.requireNonNull(localObject);
      if (localObject.equals(paramObject))
      {
        paramObject = arrayOfObject[1];
        Objects.requireNonNull(paramObject);
        break label298;
      }
    }
    label63:
    while (localObject == null)
    {
      paramObject = null;
      break;
    }
    int k;
    if ((localObject instanceof byte[]))
    {
      localObject = (byte[])localObject;
      j = localObject.length;
      for (i = b.r0(paramObject.hashCode());; i = k + 1)
      {
        k = i & j - 1;
        i = localObject[k] & 0xFF;
        if (i == 255) {
          break;
        }
        if (paramObject.equals(arrayOfObject[i]))
        {
          paramObject = arrayOfObject[(i ^ 0x1)];
          break label298;
        }
      }
    }
    if ((localObject instanceof short[]))
    {
      localObject = (short[])localObject;
      j = localObject.length;
      for (i = b.r0(paramObject.hashCode());; i = k + 1)
      {
        k = i & j - 1;
        i = localObject[k] & 0xFFFF;
        if (i == 65535) {
          break;
        }
        if (paramObject.equals(arrayOfObject[i]))
        {
          paramObject = arrayOfObject[(i ^ 0x1)];
          break label298;
        }
      }
    }
    localObject = (int[])localObject;
    int j = localObject.length;
    for (i = b.r0(paramObject.hashCode());; i = k + 1)
    {
      k = i & j - 1;
      i = localObject[k];
      if (i == -1) {
        break;
      }
      if (paramObject.equals(arrayOfObject[i]))
      {
        paramObject = arrayOfObject[(i ^ 0x1)];
        label298:
        if (paramObject == null) {
          return null;
        }
        return (V)paramObject;
      }
    }
  }
  
  public final int size()
  {
    return f;
  }
  
  public static final class a<K, V>
    extends x<Map.Entry<K, V>>
  {
    public final transient u<K, V> d;
    public final transient Object[] e;
    public final transient int f;
    public final transient int o;
    
    public a(u paramu, Object[] paramArrayOfObject, int paramInt)
    {
      d = paramu;
      e = paramArrayOfObject;
      f = 0;
      o = paramInt;
    }
    
    public final boolean contains(Object paramObject)
    {
      boolean bool1 = paramObject instanceof Map.Entry;
      boolean bool2 = false;
      boolean bool3 = bool2;
      if (bool1)
      {
        Object localObject = (Map.Entry)paramObject;
        paramObject = ((Map.Entry)localObject).getKey();
        localObject = ((Map.Entry)localObject).getValue();
        bool3 = bool2;
        if (localObject != null)
        {
          bool3 = bool2;
          if (localObject.equals(d.get(paramObject))) {
            bool3 = true;
          }
        }
      }
      return bool3;
    }
    
    public final int h(int paramInt, Object[] paramArrayOfObject)
    {
      return a().h(paramInt, paramArrayOfObject);
    }
    
    public final boolean m()
    {
      return true;
    }
    
    public final x0<Map.Entry<K, V>> n()
    {
      return a().r(0);
    }
    
    public final t<Map.Entry<K, V>> r()
    {
      return new a();
    }
    
    public final int size()
    {
      return o;
    }
    
    public final class a
      extends t<Map.Entry<K, V>>
    {
      public a() {}
      
      public final Object get(int paramInt)
      {
        b.v(paramInt, o);
        Object localObject1 = m0.a.this;
        Object localObject2 = e;
        paramInt *= 2;
        localObject2 = localObject2[(f + paramInt)];
        Objects.requireNonNull(localObject2);
        localObject1 = m0.a.this;
        localObject1 = e[(paramInt + (f ^ 0x1))];
        Objects.requireNonNull(localObject1);
        return new AbstractMap.SimpleImmutableEntry(localObject2, localObject1);
      }
      
      public final boolean m()
      {
        return true;
      }
      
      public final int size()
      {
        return o;
      }
    }
  }
  
  public static final class b<K>
    extends x<K>
  {
    public final transient u<K, ?> d;
    public final transient t<K> e;
    
    public b(u paramu, m0.c paramc)
    {
      d = paramu;
      e = paramc;
    }
    
    public final t<K> a()
    {
      return e;
    }
    
    public final boolean contains(Object paramObject)
    {
      boolean bool;
      if (d.get(paramObject) != null) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public final int h(int paramInt, Object[] paramArrayOfObject)
    {
      return e.h(paramInt, paramArrayOfObject);
    }
    
    public final boolean m()
    {
      return true;
    }
    
    public final x0<K> n()
    {
      return e.r(0);
    }
    
    public final int size()
    {
      return d.size();
    }
  }
  
  public static final class c
    extends t<Object>
  {
    public final transient Object[] c;
    public final transient int d;
    public final transient int e;
    
    public c(Object[] paramArrayOfObject, int paramInt1, int paramInt2)
    {
      c = paramArrayOfObject;
      d = paramInt1;
      e = paramInt2;
    }
    
    public final Object get(int paramInt)
    {
      b.v(paramInt, e);
      Object localObject = c[(paramInt * 2 + d)];
      Objects.requireNonNull(localObject);
      return localObject;
    }
    
    public final boolean m()
    {
      return true;
    }
    
    public final int size()
    {
      return e;
    }
  }
}

/* Location:
 * Qualified Name:     o7.m0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */