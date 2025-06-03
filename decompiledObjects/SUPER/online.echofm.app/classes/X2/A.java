package X2;

import W2.m;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.NavigableSet;

public abstract class A
  extends y
  implements NavigableSet, c0
{
  private static final long serialVersionUID = 912559L;
  public final transient Comparator q;
  public transient A r;
  
  public A(Comparator paramComparator)
  {
    q = paramComparator;
  }
  
  public static A e0(Comparator paramComparator, int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0) {
      return j0(paramComparator);
    }
    O.c(paramVarArgs, paramInt);
    Arrays.sort(paramVarArgs, 0, paramInt, paramComparator);
    int i = 1;
    int k;
    for (int j = 1; i < paramInt; j = k)
    {
      localObject = paramVarArgs[i];
      k = j;
      if (paramComparator.compare(localObject, paramVarArgs[(j - 1)]) != 0)
      {
        paramVarArgs[j] = localObject;
        k = j + 1;
      }
      i++;
    }
    Arrays.fill(paramVarArgs, j, paramInt, null);
    Object localObject = paramVarArgs;
    if (j < paramVarArgs.length / 2) {
      localObject = Arrays.copyOf(paramVarArgs, j);
    }
    return new V(v.D((Object[])localObject, j), paramComparator);
  }
  
  public static A f0(Comparator paramComparator, Iterable paramIterable)
  {
    m.j(paramComparator);
    if ((d0.b(paramComparator, paramIterable)) && ((paramIterable instanceof A)))
    {
      A localA = (A)paramIterable;
      if (!localA.k()) {
        return localA;
      }
    }
    paramIterable = B.k(paramIterable);
    return e0(paramComparator, paramIterable.length, paramIterable);
  }
  
  public static A g0(Comparator paramComparator, Collection paramCollection)
  {
    return f0(paramComparator, paramCollection);
  }
  
  public static V j0(Comparator paramComparator)
  {
    if (P.d().equals(paramComparator)) {
      return V.t;
    }
    return new V(v.Y(), paramComparator);
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream)
  {
    throw new InvalidObjectException("Use SerializedForm");
  }
  
  public static int u0(Comparator paramComparator, Object paramObject1, Object paramObject2)
  {
    return paramComparator.compare(paramObject1, paramObject2);
  }
  
  public Comparator comparator()
  {
    return q;
  }
  
  public abstract A h0();
  
  public A i0()
  {
    A localA1 = r;
    A localA2 = localA1;
    if (localA1 == null)
    {
      localA2 = h0();
      r = localA2;
      r = this;
    }
    return localA2;
  }
  
  public A k0(Object paramObject)
  {
    return l0(paramObject, false);
  }
  
  public A l0(Object paramObject, boolean paramBoolean)
  {
    return m0(m.j(paramObject), paramBoolean);
  }
  
  public abstract A m0(Object paramObject, boolean paramBoolean);
  
  public A n0(Object paramObject1, Object paramObject2)
  {
    return o0(paramObject1, true, paramObject2, false);
  }
  
  public A o0(Object paramObject1, boolean paramBoolean1, Object paramObject2, boolean paramBoolean2)
  {
    m.j(paramObject1);
    m.j(paramObject2);
    boolean bool;
    if (q.compare(paramObject1, paramObject2) <= 0) {
      bool = true;
    } else {
      bool = false;
    }
    m.d(bool);
    return p0(paramObject1, paramBoolean1, paramObject2, paramBoolean2);
  }
  
  public abstract A p0(Object paramObject1, boolean paramBoolean1, Object paramObject2, boolean paramBoolean2);
  
  public final Object pollFirst()
  {
    throw new UnsupportedOperationException();
  }
  
  public final Object pollLast()
  {
    throw new UnsupportedOperationException();
  }
  
  public A q0(Object paramObject)
  {
    return r0(paramObject, true);
  }
  
  public A r0(Object paramObject, boolean paramBoolean)
  {
    return s0(m.j(paramObject), paramBoolean);
  }
  
  public abstract A s0(Object paramObject, boolean paramBoolean);
  
  public int t0(Object paramObject1, Object paramObject2)
  {
    return u0(q, paramObject1, paramObject2);
  }
  
  public Object writeReplace()
  {
    return new b(q, toArray());
  }
  
  public static final class a
    extends y.a
  {
    public final Comparator f;
    
    public a(Comparator paramComparator)
    {
      f = ((Comparator)m.j(paramComparator));
    }
    
    public a m(Object paramObject)
    {
      super.h(paramObject);
      return this;
    }
    
    public a n(Object... paramVarArgs)
    {
      super.i(paramVarArgs);
      return this;
    }
    
    public a o(Iterable paramIterable)
    {
      super.j(paramIterable);
      return this;
    }
    
    public A p()
    {
      Object localObject = a;
      localObject = A.e0(f, b, (Object[])localObject);
      b = ((AbstractCollection)localObject).size();
      c = true;
      return (A)localObject;
    }
  }
  
  public static class b
    implements Serializable
  {
    private static final long serialVersionUID = 0L;
    public final Comparator o;
    public final Object[] p;
    
    public b(Comparator paramComparator, Object[] paramArrayOfObject)
    {
      o = paramComparator;
      p = paramArrayOfObject;
    }
    
    public Object readResolve()
    {
      return new A.a(o).n(p).p();
    }
  }
}

/* Location:
 * Qualified Name:     X2.A
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */