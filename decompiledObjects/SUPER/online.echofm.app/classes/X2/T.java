package X2;

import W2.m;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;

public final class T
  extends w
{
  private static final long serialVersionUID = 0L;
  public static final w v = new T(null, new Object[0], 0);
  public final transient Object s;
  public final transient Object[] t;
  public final transient int u;
  
  public T(Object paramObject, Object[] paramArrayOfObject, int paramInt)
  {
    s = paramObject;
    t = paramArrayOfObject;
    u = paramInt;
  }
  
  public static T l(int paramInt, Object[] paramArrayOfObject, w.a parama)
  {
    if (paramInt == 0) {
      return (T)v;
    }
    if (paramInt == 1)
    {
      parama = paramArrayOfObject[0];
      Objects.requireNonNull(parama);
      localObject1 = paramArrayOfObject[1];
      Objects.requireNonNull(localObject1);
      i.a(parama, localObject1);
      return new T(null, paramArrayOfObject, 1);
    }
    m.l(paramInt, paramArrayOfObject.length >> 1);
    Object localObject2 = m(paramArrayOfObject, paramInt, y.M(paramInt), 0);
    Object localObject1 = localObject2;
    Object[] arrayOfObject = paramArrayOfObject;
    if ((localObject2 instanceof Object[]))
    {
      arrayOfObject = (Object[])localObject2;
      localObject1 = (w.a.a)arrayOfObject[2];
      if (parama != null)
      {
        e = ((w.a.a)localObject1);
        localObject1 = arrayOfObject[0];
        paramInt = ((Integer)arrayOfObject[1]).intValue();
        arrayOfObject = Arrays.copyOf(paramArrayOfObject, paramInt * 2);
      }
      else
      {
        throw ((w.a.a)localObject1).a();
      }
    }
    return new T(localObject1, arrayOfObject, paramInt);
  }
  
  public static Object m(Object[] paramArrayOfObject, int paramInt1, int paramInt2, int paramInt3)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    Object localObject3 = null;
    if (paramInt1 == 1)
    {
      localObject3 = paramArrayOfObject[paramInt3];
      Objects.requireNonNull(localObject3);
      paramArrayOfObject = paramArrayOfObject[(paramInt3 ^ 0x1)];
      Objects.requireNonNull(paramArrayOfObject);
      i.a(localObject3, paramArrayOfObject);
      return null;
    }
    int i = paramInt2 - 1;
    int k;
    int m;
    int n;
    if (paramInt2 <= 128)
    {
      localObject4 = new byte[paramInt2];
      Arrays.fill((byte[])localObject4, (byte)-1);
      paramInt2 = 0;
      j = paramInt2;
      if (paramInt2 < paramInt1)
      {
        k = paramInt2 * 2 + paramInt3;
        m = j * 2 + paramInt3;
        localObject2 = paramArrayOfObject[k];
        Objects.requireNonNull(localObject2);
        localObject1 = paramArrayOfObject[(k ^ 0x1)];
        Objects.requireNonNull(localObject1);
        i.a(localObject2, localObject1);
        for (k = s.b(localObject2.hashCode());; k = n + 1)
        {
          n = k & i;
          k = localObject4[n] & 0xFF;
          if (k == 255)
          {
            localObject4[n] = ((byte)(byte)m);
            if (j < paramInt2)
            {
              paramArrayOfObject[m] = localObject2;
              paramArrayOfObject[(m ^ 0x1)] = localObject1;
            }
            j++;
          }
          else
          {
            if (!localObject2.equals(paramArrayOfObject[k])) {
              continue;
            }
            k ^= 0x1;
            localObject3 = paramArrayOfObject[k];
            Objects.requireNonNull(localObject3);
            localObject3 = new w.a.a(localObject2, localObject1, localObject3);
            paramArrayOfObject[k] = localObject1;
          }
          paramInt2++;
          break;
        }
      }
      if (j == paramInt1) {
        paramArrayOfObject = (Object[])localObject4;
      } else {
        paramArrayOfObject = new Object[] { localObject4, Integer.valueOf(j), localObject3 };
      }
      return paramArrayOfObject;
    }
    if (paramInt2 <= 32768)
    {
      localObject4 = new short[paramInt2];
      Arrays.fill((short[])localObject4, (short)-1);
      paramInt2 = 0;
      j = paramInt2;
      localObject3 = localObject1;
      if (paramInt2 < paramInt1)
      {
        k = paramInt2 * 2 + paramInt3;
        m = j * 2 + paramInt3;
        localObject2 = paramArrayOfObject[k];
        Objects.requireNonNull(localObject2);
        localObject1 = paramArrayOfObject[(k ^ 0x1)];
        Objects.requireNonNull(localObject1);
        i.a(localObject2, localObject1);
        for (k = s.b(localObject2.hashCode());; k++)
        {
          k &= i;
          n = localObject4[k] & 0xFFFF;
          if (n == 65535)
          {
            localObject4[k] = ((short)(short)m);
            if (j < paramInt2)
            {
              paramArrayOfObject[m] = localObject2;
              paramArrayOfObject[(m ^ 0x1)] = localObject1;
            }
            j++;
          }
          else
          {
            if (!localObject2.equals(paramArrayOfObject[n])) {
              continue;
            }
            k = n ^ 0x1;
            localObject3 = paramArrayOfObject[k];
            Objects.requireNonNull(localObject3);
            localObject3 = new w.a.a(localObject2, localObject1, localObject3);
            paramArrayOfObject[k] = localObject1;
          }
          paramInt2++;
          break;
        }
      }
      if (j == paramInt1) {
        paramArrayOfObject = (Object[])localObject4;
      } else {
        paramArrayOfObject = new Object[] { localObject4, Integer.valueOf(j), localObject3 };
      }
      return paramArrayOfObject;
    }
    Object localObject4 = new int[paramInt2];
    Arrays.fill((int[])localObject4, -1);
    paramInt2 = 0;
    int j = paramInt2;
    localObject3 = localObject2;
    if (paramInt2 < paramInt1)
    {
      k = paramInt2 * 2 + paramInt3;
      m = j * 2 + paramInt3;
      localObject2 = paramArrayOfObject[k];
      Objects.requireNonNull(localObject2);
      localObject1 = paramArrayOfObject[(k ^ 0x1)];
      Objects.requireNonNull(localObject1);
      i.a(localObject2, localObject1);
      for (k = s.b(localObject2.hashCode());; k++)
      {
        k &= i;
        n = localObject4[k];
        if (n == -1)
        {
          localObject4[k] = m;
          if (j < paramInt2)
          {
            paramArrayOfObject[m] = localObject2;
            paramArrayOfObject[(m ^ 0x1)] = localObject1;
          }
          j++;
        }
        else
        {
          if (!localObject2.equals(paramArrayOfObject[n])) {
            continue;
          }
          k = n ^ 0x1;
          localObject3 = paramArrayOfObject[k];
          Objects.requireNonNull(localObject3);
          localObject3 = new w.a.a(localObject2, localObject1, localObject3);
          paramArrayOfObject[k] = localObject1;
        }
        paramInt2++;
        break;
      }
    }
    if (j == paramInt1) {
      paramArrayOfObject = (Object[])localObject4;
    } else {
      paramArrayOfObject = new Object[] { localObject4, Integer.valueOf(j), localObject3 };
    }
    return paramArrayOfObject;
  }
  
  public static Object n(Object paramObject1, Object[] paramArrayOfObject, int paramInt1, int paramInt2, Object paramObject2)
  {
    Object localObject1 = null;
    if (paramObject2 == null) {
      return null;
    }
    if (paramInt1 == 1)
    {
      Object localObject2 = paramArrayOfObject[paramInt2];
      Objects.requireNonNull(localObject2);
      paramObject1 = localObject1;
      if (localObject2.equals(paramObject2))
      {
        paramObject1 = paramArrayOfObject[(paramInt2 ^ 0x1)];
        Objects.requireNonNull(paramObject1);
      }
      return paramObject1;
    }
    if (paramObject1 == null) {
      return null;
    }
    int i;
    if ((paramObject1 instanceof byte[]))
    {
      paramObject1 = (byte[])paramObject1;
      paramInt2 = paramObject1.length;
      for (paramInt1 = s.b(paramObject2.hashCode());; paramInt1 = i + 1)
      {
        i = paramInt1 & paramInt2 - 1;
        paramInt1 = paramObject1[i] & 0xFF;
        if (paramInt1 == 255) {
          return null;
        }
        if (paramObject2.equals(paramArrayOfObject[paramInt1])) {
          return paramArrayOfObject[(paramInt1 ^ 0x1)];
        }
      }
    }
    if ((paramObject1 instanceof short[]))
    {
      paramObject1 = (short[])paramObject1;
      paramInt2 = paramObject1.length;
      for (paramInt1 = s.b(paramObject2.hashCode());; paramInt1 = i + 1)
      {
        i = paramInt1 & paramInt2 - 1;
        paramInt1 = paramObject1[i] & 0xFFFF;
        if (paramInt1 == 65535) {
          return null;
        }
        if (paramObject2.equals(paramArrayOfObject[paramInt1])) {
          return paramArrayOfObject[(paramInt1 ^ 0x1)];
        }
      }
    }
    paramObject1 = (int[])paramObject1;
    paramInt2 = paramObject1.length;
    for (paramInt1 = s.b(paramObject2.hashCode());; paramInt1 = i + 1)
    {
      i = paramInt1 & paramInt2 - 1;
      paramInt1 = paramObject1[i];
      if (paramInt1 == -1) {
        return null;
      }
      if (paramObject2.equals(paramArrayOfObject[paramInt1])) {
        return paramArrayOfObject[(paramInt1 ^ 0x1)];
      }
    }
  }
  
  public y d()
  {
    return new a(this, t, 0, u);
  }
  
  public y e()
  {
    return new b(this, new c(t, 0, u));
  }
  
  public t f()
  {
    return new c(t, 1, u);
  }
  
  public Object get(Object paramObject)
  {
    Object localObject = n(s, t, u, 0, paramObject);
    paramObject = localObject;
    if (localObject == null) {
      paramObject = null;
    }
    return paramObject;
  }
  
  public boolean h()
  {
    return false;
  }
  
  public int size()
  {
    return u;
  }
  
  public Object writeReplace()
  {
    return super.writeReplace();
  }
  
  public static class a
    extends y
  {
    public final transient w q;
    public final transient Object[] r;
    public final transient int s;
    public final transient int t;
    
    public a(w paramw, Object[] paramArrayOfObject, int paramInt1, int paramInt2)
    {
      q = paramw;
      r = paramArrayOfObject;
      s = paramInt1;
      t = paramInt2;
    }
    
    public v V()
    {
      return new a();
    }
    
    public boolean contains(Object paramObject)
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
          if (localObject.equals(q.get(paramObject))) {
            bool3 = true;
          }
        }
      }
      return bool3;
    }
    
    public int d(Object[] paramArrayOfObject, int paramInt)
    {
      return a().d(paramArrayOfObject, paramInt);
    }
    
    public boolean k()
    {
      return true;
    }
    
    public g0 q()
    {
      return a().q();
    }
    
    public int size()
    {
      return t;
    }
    
    public Object writeReplace()
    {
      return super.writeReplace();
    }
    
    public class a
      extends v
    {
      public a() {}
      
      public Map.Entry j0(int paramInt)
      {
        m.h(paramInt, T.a.e0(T.a.this));
        Object localObject1 = T.a.f0(T.a.this);
        paramInt *= 2;
        Object localObject2 = localObject1[(T.a.g0(T.a.this) + paramInt)];
        Objects.requireNonNull(localObject2);
        localObject1 = T.a.f0(T.a.this)[(paramInt + (T.a.g0(T.a.this) ^ 0x1))];
        Objects.requireNonNull(localObject1);
        return new AbstractMap.SimpleImmutableEntry(localObject2, localObject1);
      }
      
      public boolean k()
      {
        return true;
      }
      
      public int size()
      {
        return T.a.e0(T.a.this);
      }
      
      public Object writeReplace()
      {
        return super.writeReplace();
      }
    }
  }
  
  public static final class b
    extends y
  {
    public final transient w q;
    public final transient v r;
    
    public b(w paramw, v paramv)
    {
      q = paramw;
      r = paramv;
    }
    
    public v a()
    {
      return r;
    }
    
    public boolean contains(Object paramObject)
    {
      boolean bool;
      if (q.get(paramObject) != null) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public int d(Object[] paramArrayOfObject, int paramInt)
    {
      return a().d(paramArrayOfObject, paramInt);
    }
    
    public boolean k()
    {
      return true;
    }
    
    public g0 q()
    {
      return a().q();
    }
    
    public int size()
    {
      return q.size();
    }
    
    public Object writeReplace()
    {
      return super.writeReplace();
    }
  }
  
  public static final class c
    extends v
  {
    public final transient Object[] q;
    public final transient int r;
    public final transient int s;
    
    public c(Object[] paramArrayOfObject, int paramInt1, int paramInt2)
    {
      q = paramArrayOfObject;
      r = paramInt1;
      s = paramInt2;
    }
    
    public Object get(int paramInt)
    {
      m.h(paramInt, s);
      Object localObject = q[(paramInt * 2 + r)];
      Objects.requireNonNull(localObject);
      return localObject;
    }
    
    public boolean k()
    {
      return true;
    }
    
    public int size()
    {
      return s;
    }
    
    public Object writeReplace()
    {
      return super.writeReplace();
    }
  }
}

/* Location:
 * Qualified Name:     X2.T
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */