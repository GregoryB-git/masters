package o7;

import f;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;
import x6.b;

public abstract class u<K, V>
  implements Map<K, V>, Serializable
{
  public transient x<Map.Entry<K, V>> a;
  public transient x<K> b;
  public transient r<V> c;
  
  public static <K, V> u<K, V> b(Map<? extends K, ? extends V> paramMap)
  {
    if (((paramMap instanceof u)) && (!(paramMap instanceof SortedMap)))
    {
      paramMap = (u)paramMap;
      paramMap.f();
      return paramMap;
    }
    Object localObject1 = paramMap.entrySet();
    boolean bool = localObject1 instanceof Collection;
    int i;
    if (bool) {
      i = ((Collection)localObject1).size();
    } else {
      i = 4;
    }
    paramMap = new a(i);
    Object localObject2;
    if (bool)
    {
      i = b;
      i = (((Collection)localObject1).size() + i) * 2;
      localObject2 = a;
      if (i > localObject2.length) {
        a = Arrays.copyOf((Object[])localObject2, r.b.a(localObject2.length, i));
      }
    }
    localObject1 = ((Iterable)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (Map.Entry)((Iterator)localObject1).next();
      paramMap.b(((Map.Entry)localObject2).getKey(), ((Map.Entry)localObject2).getValue());
    }
    return paramMap.a();
  }
  
  public abstract m0.a c();
  
  @Deprecated
  public final void clear()
  {
    throw new UnsupportedOperationException();
  }
  
  public final boolean containsKey(Object paramObject)
  {
    boolean bool;
    if (get(paramObject) != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean containsValue(Object paramObject)
  {
    r localr = c;
    Object localObject = localr;
    if (localr == null)
    {
      localObject = e();
      c = ((r)localObject);
    }
    return ((r)localObject).contains(paramObject);
  }
  
  public abstract m0.b d();
  
  public abstract m0.c e();
  
  public final Set entrySet()
  {
    x localx = a;
    Object localObject = localx;
    if (localx == null)
    {
      localObject = c();
      a = ((x)localObject);
    }
    return (Set)localObject;
  }
  
  public final boolean equals(Object paramObject)
  {
    return e0.a(this, paramObject);
  }
  
  public abstract void f();
  
  public abstract V get(Object paramObject);
  
  public final V getOrDefault(Object paramObject, V paramV)
  {
    paramObject = get(paramObject);
    if (paramObject != null) {
      return (V)paramObject;
    }
    return paramV;
  }
  
  public final int hashCode()
  {
    x localx = a;
    Object localObject = localx;
    if (localx == null)
    {
      localObject = c();
      a = ((x)localObject);
    }
    return u0.c((Set)localObject);
  }
  
  public final boolean isEmpty()
  {
    boolean bool;
    if (size() == 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final Set keySet()
  {
    x localx = b;
    Object localObject = localx;
    if (localx == null)
    {
      localObject = d();
      b = ((x)localObject);
    }
    return (Set)localObject;
  }
  
  @Deprecated
  public final V put(K paramK, V paramV)
  {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public final void putAll(Map<? extends K, ? extends V> paramMap)
  {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public final V remove(Object paramObject)
  {
    throw new UnsupportedOperationException();
  }
  
  public final String toString()
  {
    int i = size();
    p2.m0.o(i, "size");
    StringBuilder localStringBuilder = new StringBuilder((int)Math.min(i * 8L, 1073741824L));
    localStringBuilder.append('{');
    Iterator localIterator = entrySet().iterator();
    i = 1;
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      if (i == 0) {
        localStringBuilder.append(", ");
      }
      i = 0;
      localStringBuilder.append(localEntry.getKey());
      localStringBuilder.append('=');
      localStringBuilder.append(localEntry.getValue());
    }
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public final Collection values()
  {
    r localr = c;
    Object localObject = localr;
    if (localr == null)
    {
      localObject = e();
      c = ((r)localObject);
    }
    return (Collection)localObject;
  }
  
  public static final class a<K, V>
  {
    public Object[] a;
    public int b;
    public a c;
    
    public a(int paramInt)
    {
      a = new Object[paramInt * 2];
      b = 0;
    }
    
    public final m0 a()
    {
      Object localObject1 = c;
      if (localObject1 == null)
      {
        int i = b;
        Object[] arrayOfObject = a;
        if (i == 0)
        {
          localObject1 = m0.o;
        }
        else
        {
          localObject1 = m0.o;
          Object localObject2 = null;
          Object localObject3 = null;
          localObject4 = null;
          localObject1 = null;
          if (i == 1)
          {
            Objects.requireNonNull(arrayOfObject[0]);
            Objects.requireNonNull(arrayOfObject[1]);
            localObject1 = new m0(null, arrayOfObject, 1);
          }
          else
          {
            b.D(i, arrayOfObject.length >> 1);
            int j = x.o(i);
            int m;
            if (i == 1)
            {
              Objects.requireNonNull(arrayOfObject[0]);
              Objects.requireNonNull(arrayOfObject[1]);
              localObject1 = localObject4;
            }
            else
            {
              int k = j - 1;
              int n;
              int i1;
              int i2;
              if (j <= 128)
              {
                localObject4 = new byte[j];
                Arrays.fill((byte[])localObject4, (byte)-1);
                j = 0;
                m = j;
                if (j < i)
                {
                  n = j * 2 + 0;
                  i1 = m * 2 + 0;
                  localObject3 = arrayOfObject[n];
                  Objects.requireNonNull(localObject3);
                  localObject2 = arrayOfObject[(n ^ 0x1)];
                  Objects.requireNonNull(localObject2);
                  for (n = b.r0(localObject3.hashCode());; n = i2 + 1)
                  {
                    i2 = n & k;
                    n = localObject4[i2] & 0xFF;
                    if (n == 255)
                    {
                      localObject4[i2] = ((byte)(byte)i1);
                      if (m < j)
                      {
                        arrayOfObject[i1] = localObject3;
                        arrayOfObject[(i1 ^ 0x1)] = localObject2;
                      }
                      m++;
                    }
                    else
                    {
                      if (!localObject3.equals(arrayOfObject[n])) {
                        continue;
                      }
                      n ^= 0x1;
                      localObject1 = arrayOfObject[n];
                      Objects.requireNonNull(localObject1);
                      localObject1 = new a(localObject3, localObject2, localObject1);
                      arrayOfObject[n] = localObject2;
                    }
                    j++;
                    break;
                  }
                }
                if (m == i) {
                  localObject1 = localObject4;
                }
              }
              for (;;)
              {
                break;
                localObject2 = new Object[3];
                localObject2[0] = localObject4;
                localObject2[1] = Integer.valueOf(m);
                localObject2[2] = localObject1;
                localObject1 = localObject2;
                break;
                if (j <= 32768)
                {
                  localObject4 = new short[j];
                  Arrays.fill((short[])localObject4, (short)-1);
                  j = 0;
                  m = j;
                  localObject1 = localObject2;
                  if (j < i)
                  {
                    n = j * 2 + 0;
                    i1 = m * 2 + 0;
                    localObject3 = arrayOfObject[n];
                    Objects.requireNonNull(localObject3);
                    localObject2 = arrayOfObject[(n ^ 0x1)];
                    Objects.requireNonNull(localObject2);
                    for (n = b.r0(localObject3.hashCode());; n++)
                    {
                      n &= k;
                      i2 = localObject4[n] & 0xFFFF;
                      if (i2 == 65535)
                      {
                        localObject4[n] = ((short)(short)i1);
                        if (m < j)
                        {
                          arrayOfObject[i1] = localObject3;
                          arrayOfObject[(i1 ^ 0x1)] = localObject2;
                        }
                        m++;
                      }
                      else
                      {
                        if (!localObject3.equals(arrayOfObject[i2])) {
                          continue;
                        }
                        n = i2 ^ 0x1;
                        localObject1 = arrayOfObject[n];
                        Objects.requireNonNull(localObject1);
                        localObject1 = new a(localObject3, localObject2, localObject1);
                        arrayOfObject[n] = localObject2;
                      }
                      j++;
                      break;
                    }
                  }
                  if (m == i)
                  {
                    localObject1 = localObject4;
                  }
                  else
                  {
                    localObject2 = new Object[3];
                    localObject2[0] = localObject4;
                    localObject2[1] = Integer.valueOf(m);
                    localObject2[2] = localObject1;
                    localObject1 = localObject2;
                  }
                }
                else
                {
                  localObject4 = new int[j];
                  Arrays.fill((int[])localObject4, -1);
                  j = 0;
                  m = j;
                  localObject1 = localObject3;
                  if (j < i)
                  {
                    n = j * 2 + 0;
                    i1 = m * 2 + 0;
                    localObject3 = arrayOfObject[n];
                    Objects.requireNonNull(localObject3);
                    localObject2 = arrayOfObject[(n ^ 0x1)];
                    Objects.requireNonNull(localObject2);
                    for (n = b.r0(localObject3.hashCode());; n = i2 + 1)
                    {
                      i2 = n & k;
                      n = localObject4[i2];
                      if (n == -1)
                      {
                        localObject4[i2] = i1;
                        if (m < j)
                        {
                          arrayOfObject[i1] = localObject3;
                          arrayOfObject[(i1 ^ 0x1)] = localObject2;
                        }
                        m++;
                      }
                      else
                      {
                        if (!localObject3.equals(arrayOfObject[n])) {
                          continue;
                        }
                        n ^= 0x1;
                        localObject1 = arrayOfObject[n];
                        Objects.requireNonNull(localObject1);
                        localObject1 = new a(localObject3, localObject2, localObject1);
                        arrayOfObject[n] = localObject2;
                      }
                      j++;
                      break;
                    }
                  }
                  if (m != i) {
                    break label834;
                  }
                  localObject1 = localObject4;
                }
              }
            }
            break label856;
            label834:
            localObject1 = new Object[] { localObject4, Integer.valueOf(m), localObject1 };
            label856:
            j = i;
            localObject2 = arrayOfObject;
            localObject4 = localObject1;
            if ((localObject1 instanceof Object[]))
            {
              localObject1 = (Object[])localObject1;
              c = ((a)localObject1[2]);
              localObject4 = localObject1[0];
              j = ((Integer)localObject1[1]).intValue();
              localObject2 = Arrays.copyOf(arrayOfObject, j * 2);
            }
            localObject1 = new m0(localObject4, (Object[])localObject2, j);
          }
        }
        Object localObject4 = c;
        if (localObject4 == null) {
          return (m0)localObject1;
        }
        throw ((a)localObject4).a();
      }
      throw ((a)localObject1).a();
    }
    
    public final void b(Object paramObject1, Object paramObject2)
    {
      int i = (b + 1) * 2;
      Object[] arrayOfObject = a;
      if (i > arrayOfObject.length) {
        a = Arrays.copyOf(arrayOfObject, r.b.a(arrayOfObject.length, i));
      }
      if (paramObject1 != null)
      {
        if (paramObject2 != null)
        {
          arrayOfObject = a;
          i = b;
          int j = i * 2;
          arrayOfObject[j] = paramObject1;
          arrayOfObject[(j + 1)] = paramObject2;
          b = (i + 1);
          return;
        }
        paramObject2 = new StringBuilder();
        ((StringBuilder)paramObject2).append("null value in entry: ");
        ((StringBuilder)paramObject2).append(paramObject1);
        ((StringBuilder)paramObject2).append("=null");
        throw new NullPointerException(((StringBuilder)paramObject2).toString());
      }
      paramObject1 = new StringBuilder();
      ((StringBuilder)paramObject1).append("null key in entry: null=");
      ((StringBuilder)paramObject1).append(paramObject2);
      throw new NullPointerException(((StringBuilder)paramObject1).toString());
    }
    
    public static final class a
    {
      public final Object a;
      public final Object b;
      public final Object c;
      
      public a(Object paramObject1, Object paramObject2, Object paramObject3)
      {
        a = paramObject1;
        b = paramObject2;
        c = paramObject3;
      }
      
      public final IllegalArgumentException a()
      {
        StringBuilder localStringBuilder = f.l("Multiple entries with same key: ");
        localStringBuilder.append(a);
        localStringBuilder.append("=");
        localStringBuilder.append(b);
        localStringBuilder.append(" and ");
        localStringBuilder.append(a);
        localStringBuilder.append("=");
        localStringBuilder.append(c);
        return new IllegalArgumentException(localStringBuilder.toString());
      }
    }
  }
}

/* Location:
 * Qualified Name:     o7.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */