package ma;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public final class s<T extends a<T>>
{
  public static final s d = new s(0);
  public final l1<T, Object> a;
  public boolean b;
  public boolean c;
  
  public s()
  {
    int i = l1.o;
    a = new k1(16);
  }
  
  public s(int paramInt)
  {
    a = localk1;
    m();
    m();
  }
  
  public static Object b(Object paramObject)
  {
    if ((paramObject instanceof byte[]))
    {
      byte[] arrayOfByte = (byte[])paramObject;
      paramObject = new byte[arrayOfByte.length];
      System.arraycopy(arrayOfByte, 0, paramObject, 0, arrayOfByte.length);
      return paramObject;
    }
    return paramObject;
  }
  
  public static int c(v1 paramv1, int paramInt, Object paramObject)
  {
    int i = k.N(paramInt);
    paramInt = i;
    if (paramv1 == v1.d) {
      paramInt = i * 2;
    }
    return d(paramv1, paramObject) + paramInt;
  }
  
  public static int d(v1 paramv1, Object paramObject)
  {
    int i;
    switch (paramv1.ordinal())
    {
    default: 
      throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
    case 17: 
      long l = ((Long)paramObject).longValue();
      return k.R(l >> 63 ^ l << 1);
    case 16: 
      i = ((Integer)paramObject).intValue();
      return k.P(i >> 31 ^ i << 1);
    case 13: 
      if ((paramObject instanceof a0.a)) {
        return k.E(((a0.a)paramObject).a());
      }
      return k.E(((Integer)paramObject).intValue());
    case 12: 
      return k.P(((Integer)paramObject).intValue());
    case 11: 
      if ((paramObject instanceof h))
      {
        paramObject = (h)paramObject;
        paramv1 = k.c;
        i = ((h)paramObject).size();
        return k.P(i) + i;
      }
      paramv1 = (byte[])paramObject;
      paramObject = k.c;
      i = paramv1.length;
      return k.P(i) + i;
    case 10: 
      if ((paramObject instanceof e0)) {
        return k.G((e0)paramObject);
      }
      paramv1 = (s0)paramObject;
      paramObject = k.c;
      i = paramv1.d();
      return k.P(i) + i;
    case 9: 
      paramObject = (s0)paramObject;
      paramv1 = k.c;
      return ((s0)paramObject).d();
    case 8: 
      if ((paramObject instanceof h))
      {
        paramObject = (h)paramObject;
        paramv1 = k.c;
        i = ((h)paramObject).size();
        return k.P(i) + i;
      }
      return k.M((String)paramObject);
    case 7: 
      ((Boolean)paramObject).booleanValue();
      paramv1 = k.c;
      return 1;
    case 6: 
    case 14: 
      ((Integer)paramObject).intValue();
      break;
    case 5: 
    case 15: 
      ((Long)paramObject).longValue();
      break;
    case 4: 
      return k.E(((Integer)paramObject).intValue());
    case 3: 
      return k.R(((Long)paramObject).longValue());
    case 2: 
      return k.R(((Long)paramObject).longValue());
    case 1: 
      ((Float)paramObject).floatValue();
      paramv1 = k.c;
      return 4;
    }
    ((Double)paramObject).doubleValue();
    paramv1 = k.c;
    return 8;
  }
  
  public static int e(a<?> parama, Object paramObject)
  {
    parama.c();
    parama.a();
    parama.b();
    return c(null, 0, paramObject);
  }
  
  public static int g(Map.Entry paramEntry)
  {
    a locala = (a)paramEntry.getKey();
    Object localObject = paramEntry.getValue();
    if (locala.d() == w1.r)
    {
      locala.b();
      locala.e();
      boolean bool = localObject instanceof e0;
      ((a)paramEntry.getKey()).a();
      if (bool)
      {
        paramEntry = (e0)localObject;
        i = k.N(1);
        j = k.O(2, 0);
        k = k.N(3);
        return k.G(paramEntry) + k + (j + i * 2);
      }
      paramEntry = (s0)localObject;
      int k = k.N(1);
      int i = k.O(2, 0);
      int j = k.N(3);
      int m = paramEntry.d();
      return k.P(m) + m + j + (i + k * 2);
    }
    return e(locala, localObject);
  }
  
  public static <T extends a<T>> boolean k(Map.Entry<T, Object> paramEntry)
  {
    a locala = (a)paramEntry.getKey();
    w1 localw11 = locala.d();
    w1 localw12 = w1.r;
    boolean bool = true;
    if (localw11 == localw12)
    {
      locala.b();
      paramEntry = paramEntry.getValue();
      if ((paramEntry instanceof t0)) {
        bool = ((t0)paramEntry).f();
      } else {
        if (!(paramEntry instanceof e0)) {
          break label73;
        }
      }
      return bool;
      label73:
      throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }
    return true;
  }
  
  public static void p(a parama, Object paramObject)
  {
    parama.c();
    parama = a0.a;
    paramObject.getClass();
    throw null;
  }
  
  public static void q(k paramk, v1 paramv1, int paramInt, Object paramObject)
  {
    if (paramv1 == v1.d)
    {
      paramv1 = (s0)paramObject;
      paramk.k0(paramInt, 3);
      paramv1.i(paramk);
      paramk.k0(paramInt, 4);
    }
    else
    {
      paramk.k0(paramInt, b);
      switch (paramv1.ordinal())
      {
      default: 
        break;
      case 17: 
        long l = ((Long)paramObject).longValue();
        paramk.o0(l >> 63 ^ l << 1);
        break;
      case 16: 
        paramInt = ((Integer)paramObject).intValue();
        paramk.m0(paramInt >> 31 ^ paramInt << 1);
        break;
      case 15: 
        paramk.b0(((Long)paramObject).longValue());
        break;
      case 14: 
        paramk.Z(((Integer)paramObject).intValue());
        break;
      case 13: 
        if ((paramObject instanceof a0.a)) {
          paramInt = ((a0.a)paramObject).a();
        } else {
          paramInt = ((Integer)paramObject).intValue();
        }
        paramk.d0(paramInt);
        break;
      case 12: 
        paramk.m0(((Integer)paramObject).intValue());
        break;
      case 11: 
        if (!(paramObject instanceof h))
        {
          paramv1 = (byte[])paramObject;
          paramk.V(paramv1, paramv1.length);
        }
        break;
      case 10: 
        paramk.f0((s0)paramObject);
        break;
      case 9: 
        ((s0)paramObject).i(paramk);
        break;
      case 8: 
        if ((paramObject instanceof h)) {
          paramk.X((h)paramObject);
        } else {
          paramk.j0((String)paramObject);
        }
        break;
      case 7: 
        paramk.T((byte)((Boolean)paramObject).booleanValue());
        break;
      case 6: 
        paramk.Z(((Integer)paramObject).intValue());
        break;
      case 5: 
        paramk.b0(((Long)paramObject).longValue());
        break;
      case 4: 
        paramk.d0(((Integer)paramObject).intValue());
        break;
      case 3: 
        paramk.o0(((Long)paramObject).longValue());
        break;
      case 2: 
        paramk.o0(((Long)paramObject).longValue());
        break;
      case 1: 
        paramk.Z(Float.floatToRawIntBits(((Float)paramObject).floatValue()));
        break;
      }
      paramk.b0(Double.doubleToRawLongBits(((Double)paramObject).doubleValue()));
    }
  }
  
  public final s<T> a()
  {
    s locals = new s();
    for (int i = 0; i < a.e(); i++)
    {
      localObject = a.d(i);
      locals.o((a)((Map.Entry)localObject).getKey(), ((Map.Entry)localObject).getValue());
    }
    Object localObject = a.f().iterator();
    while (((Iterator)localObject).hasNext())
    {
      Map.Entry localEntry = (Map.Entry)((Iterator)localObject).next();
      locals.o((a)localEntry.getKey(), localEntry.getValue());
    }
    c = c;
    return locals;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof s)) {
      return false;
    }
    paramObject = (s)paramObject;
    return a.equals(a);
  }
  
  public final Object f(T paramT)
  {
    Object localObject = a.get(paramT);
    paramT = (T)localObject;
    if ((localObject instanceof e0)) {
      paramT = ((e0)localObject).a(null);
    }
    return paramT;
  }
  
  public final int h()
  {
    int i = 0;
    int j = 0;
    while (i < a.e())
    {
      localObject = a.d(i);
      j += e((a)((Map.Entry)localObject).getKey(), ((Map.Entry)localObject).getValue());
      i++;
    }
    Object localObject = a.f().iterator();
    while (((Iterator)localObject).hasNext())
    {
      Map.Entry localEntry = (Map.Entry)((Iterator)localObject).next();
      j += e((a)localEntry.getKey(), localEntry.getValue());
    }
    return j;
  }
  
  public final int hashCode()
  {
    return a.hashCode();
  }
  
  public final boolean i()
  {
    return a.isEmpty();
  }
  
  public final boolean j()
  {
    for (int i = 0; i < a.e(); i++) {
      if (!k(a.d(i))) {
        return false;
      }
    }
    Iterator localIterator = a.f().iterator();
    while (localIterator.hasNext()) {
      if (!k((Map.Entry)localIterator.next())) {
        return false;
      }
    }
    return true;
  }
  
  public final Iterator<Map.Entry<T, Object>> l()
  {
    if (c) {
      return new e0.b(a.entrySet().iterator());
    }
    return a.entrySet().iterator();
  }
  
  public final void m()
  {
    if (b) {
      return;
    }
    for (int i = 0; i < a.e(); i++)
    {
      Object localObject = a.d(i);
      if ((((Map.Entry)localObject).getValue() instanceof w))
      {
        w localw = (w)((Map.Entry)localObject).getValue();
        localw.getClass();
        localObject = d1.c;
        localObject.getClass();
        ((d1)localObject).a(localw.getClass()).b(localw);
        localw.z();
      }
    }
    a.h();
    b = true;
  }
  
  public final void n(Map.Entry<T, Object> paramEntry)
  {
    a locala = (a)paramEntry.getKey();
    Object localObject = paramEntry.getValue();
    paramEntry = (Map.Entry<T, Object>)localObject;
    if ((localObject instanceof e0)) {
      paramEntry = ((e0)localObject).a(null);
    }
    locala.b();
    if (locala.d() == w1.r)
    {
      localObject = f(locala);
      if (localObject != null)
      {
        paramEntry = locala.k(((s0)localObject).a(), (s0)paramEntry).k();
        localObject = a;
        break label107;
      }
    }
    localObject = a;
    paramEntry = b(paramEntry);
    label107:
    ((l1)localObject).i(locala, paramEntry);
  }
  
  public final void o(T paramT, Object paramObject)
  {
    paramT.b();
    p(paramT, paramObject);
    throw null;
  }
  
  public static abstract interface a<T extends a<T>>
    extends Comparable<T>
  {
    public abstract void a();
    
    public abstract void b();
    
    public abstract void c();
    
    public abstract w1 d();
    
    public abstract void e();
    
    public abstract w.a k(s0.a parama, s0 params0);
  }
}

/* Location:
 * Qualified Name:     ma.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */