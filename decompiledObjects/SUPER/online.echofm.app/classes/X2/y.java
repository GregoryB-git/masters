package X2;

import W2.m;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

public abstract class y
  extends t
  implements Set
{
  private static final long serialVersionUID = 912559L;
  public transient v p;
  
  public static int M(int paramInt)
  {
    int i = Math.max(paramInt, 2);
    boolean bool = true;
    if (i < 751619276)
    {
      paramInt = Integer.highestOneBit(i - 1) << 1;
      while (paramInt * 0.7D < i) {
        paramInt <<= 1;
      }
      return paramInt;
    }
    if (i >= 1073741824) {
      bool = false;
    }
    m.e(bool, "collection too large");
    return 1073741824;
  }
  
  public static y S(int paramInt, Object... paramVarArgs)
  {
    if (paramInt != 0)
    {
      if (paramInt != 1)
      {
        int i = M(paramInt);
        Object[] arrayOfObject = new Object[i];
        int j = i - 1;
        int k = 0;
        int m = k;
        int n = m;
        int i1 = m;
        m = k;
        if (m < paramInt)
        {
          localObject1 = O.a(paramVarArgs[m], m);
          int i2 = localObject1.hashCode();
          for (k = s.b(i2);; k++)
          {
            int i3 = k & j;
            Object localObject2 = arrayOfObject[i3];
            if (localObject2 == null)
            {
              paramVarArgs[n] = localObject1;
              arrayOfObject[i3] = localObject1;
              i1 += i2;
              n++;
            }
            else
            {
              if (!localObject2.equals(localObject1)) {
                continue;
              }
            }
            m++;
            break;
          }
        }
        Arrays.fill(paramVarArgs, n, paramInt, null);
        if (n == 1)
        {
          paramVarArgs = paramVarArgs[0];
          Objects.requireNonNull(paramVarArgs);
          return new b0(paramVarArgs);
        }
        if (M(n) < i / 2) {
          return S(n, paramVarArgs);
        }
        Object localObject1 = paramVarArgs;
        if (d0(n, paramVarArgs.length)) {
          localObject1 = Arrays.copyOf(paramVarArgs, n);
        }
        return new U((Object[])localObject1, i1, arrayOfObject, j, n);
      }
      paramVarArgs = paramVarArgs[0];
      Objects.requireNonNull(paramVarArgs);
      return Y(paramVarArgs);
    }
    return X();
  }
  
  public static y T(Collection paramCollection)
  {
    if (((paramCollection instanceof y)) && (!(paramCollection instanceof SortedSet)))
    {
      y localy = (y)paramCollection;
      if (!localy.k()) {
        return localy;
      }
    }
    paramCollection = paramCollection.toArray();
    return S(paramCollection.length, paramCollection);
  }
  
  public static y U(Object[] paramArrayOfObject)
  {
    int i = paramArrayOfObject.length;
    if (i != 0)
    {
      if (i != 1) {
        return S(paramArrayOfObject.length, (Object[])paramArrayOfObject.clone());
      }
      return Y(paramArrayOfObject[0]);
    }
    return X();
  }
  
  public static y X()
  {
    return U.w;
  }
  
  public static y Y(Object paramObject)
  {
    return new b0(paramObject);
  }
  
  public static y Z(Object paramObject1, Object paramObject2)
  {
    return S(2, new Object[] { paramObject1, paramObject2 });
  }
  
  public static y a0(Object paramObject1, Object paramObject2, Object paramObject3)
  {
    return S(3, new Object[] { paramObject1, paramObject2, paramObject3 });
  }
  
  public static y b0(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4, Object paramObject5)
  {
    return S(5, new Object[] { paramObject1, paramObject2, paramObject3, paramObject4, paramObject5 });
  }
  
  public static y c0(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4, Object paramObject5, Object paramObject6, Object... paramVarArgs)
  {
    boolean bool;
    if (paramVarArgs.length <= 2147483641) {
      bool = true;
    } else {
      bool = false;
    }
    m.e(bool, "the total number of elements must fit in an int");
    int i = paramVarArgs.length + 6;
    Object[] arrayOfObject = new Object[i];
    arrayOfObject[0] = paramObject1;
    arrayOfObject[1] = paramObject2;
    arrayOfObject[2] = paramObject3;
    arrayOfObject[3] = paramObject4;
    arrayOfObject[4] = paramObject5;
    arrayOfObject[5] = paramObject6;
    System.arraycopy(paramVarArgs, 0, arrayOfObject, 6, paramVarArgs.length);
    return S(i, arrayOfObject);
  }
  
  public static boolean d0(int paramInt1, int paramInt2)
  {
    boolean bool;
    if (paramInt1 < (paramInt2 >> 1) + (paramInt2 >> 2)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream)
  {
    throw new InvalidObjectException("Use SerializedForm");
  }
  
  public v V()
  {
    return v.s(toArray());
  }
  
  public boolean W()
  {
    return false;
  }
  
  public v a()
  {
    v localv1 = p;
    v localv2 = localv1;
    if (localv1 == null)
    {
      localv2 = V();
      p = localv2;
    }
    return localv2;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (((paramObject instanceof y)) && (W()) && (((y)paramObject).W()) && (hashCode() != paramObject.hashCode())) {
      return false;
    }
    return a0.a(this, paramObject);
  }
  
  public int hashCode()
  {
    return a0.d(this);
  }
  
  public abstract g0 q();
  
  public Object writeReplace()
  {
    return new b(toArray());
  }
  
  public static class a
    extends t.a
  {
    public Object[] d;
    public int e;
    
    public a()
    {
      super();
    }
    
    public a h(Object paramObject)
    {
      m.j(paramObject);
      if ((d != null) && (y.M(b) <= d.length))
      {
        k(paramObject);
        return this;
      }
      d = null;
      super.d(paramObject);
      return this;
    }
    
    public a i(Object... paramVarArgs)
    {
      if (d != null)
      {
        int i = paramVarArgs.length;
        for (int j = 0; j < i; j++) {
          h(paramVarArgs[j]);
        }
      }
      super.e(paramVarArgs);
      return this;
    }
    
    public a j(Iterable paramIterable)
    {
      m.j(paramIterable);
      if (d != null)
      {
        paramIterable = paramIterable.iterator();
        while (paramIterable.hasNext()) {
          h(paramIterable.next());
        }
      }
      super.b(paramIterable);
      return this;
    }
    
    public final void k(Object paramObject)
    {
      Objects.requireNonNull(d);
      int i = d.length;
      int j = paramObject.hashCode();
      for (int k = s.b(j);; k++)
      {
        k &= i - 1;
        Object[] arrayOfObject = d;
        Object localObject = arrayOfObject[k];
        if (localObject == null)
        {
          arrayOfObject[k] = paramObject;
          e += j;
          super.d(paramObject);
          return;
        }
        if (localObject.equals(paramObject)) {
          return;
        }
      }
    }
    
    public y l()
    {
      int i = b;
      if (i != 0)
      {
        if (i != 1)
        {
          if ((d != null) && (y.M(i) == d.length))
          {
            if (y.s(b, a.length)) {}
            for (localObject = Arrays.copyOf(a, b);; localObject = a) {
              break;
            }
            i = e;
            Object[] arrayOfObject = d;
            localObject = new U((Object[])localObject, i, arrayOfObject, arrayOfObject.length - 1, b);
          }
          else
          {
            localObject = y.D(b, a);
            b = ((AbstractCollection)localObject).size();
          }
          c = true;
          d = null;
          return (y)localObject;
        }
        Object localObject = a[0];
        Objects.requireNonNull(localObject);
        return y.Y(localObject);
      }
      return y.X();
    }
  }
  
  public static class b
    implements Serializable
  {
    private static final long serialVersionUID = 0L;
    public final Object[] o;
    
    public b(Object[] paramArrayOfObject)
    {
      o = paramArrayOfObject;
    }
    
    public Object readResolve()
    {
      return y.U(o);
    }
  }
}

/* Location:
 * Qualified Name:     X2.y
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */