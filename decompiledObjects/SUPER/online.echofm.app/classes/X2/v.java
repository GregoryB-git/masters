package X2;

import W2.m;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

public abstract class v
  extends t
  implements List, RandomAccess
{
  public static final h0 p = new b(S.s, 0);
  private static final long serialVersionUID = -889275714L;
  
  public static v D(Object[] paramArrayOfObject, int paramInt)
  {
    if (paramInt == 0) {
      return Y();
    }
    return new S(paramArrayOfObject, paramInt);
  }
  
  public static a M()
  {
    return new a();
  }
  
  public static a S(int paramInt)
  {
    i.b(paramInt, "expectedSize");
    return new a(paramInt);
  }
  
  public static v T(Object... paramVarArgs)
  {
    return s(O.b(paramVarArgs));
  }
  
  public static v U(Collection paramCollection)
  {
    if ((paramCollection instanceof t))
    {
      v localv = ((t)paramCollection).a();
      paramCollection = localv;
      if (localv.k()) {
        paramCollection = s(localv.toArray());
      }
      return paramCollection;
    }
    return T(paramCollection.toArray());
  }
  
  public static v V(Object[] paramArrayOfObject)
  {
    if (paramArrayOfObject.length == 0) {
      paramArrayOfObject = Y();
    } else {
      paramArrayOfObject = T((Object[])paramArrayOfObject.clone());
    }
    return paramArrayOfObject;
  }
  
  public static v Y()
  {
    return S.s;
  }
  
  public static v Z(Object paramObject)
  {
    return T(new Object[] { paramObject });
  }
  
  public static v a0(Object paramObject1, Object paramObject2)
  {
    return T(new Object[] { paramObject1, paramObject2 });
  }
  
  public static v b0(Object paramObject1, Object paramObject2, Object paramObject3)
  {
    return T(new Object[] { paramObject1, paramObject2, paramObject3 });
  }
  
  public static v c0(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4, Object paramObject5)
  {
    return T(new Object[] { paramObject1, paramObject2, paramObject3, paramObject4, paramObject5 });
  }
  
  public static v d0(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4, Object paramObject5, Object paramObject6, Object paramObject7)
  {
    return T(new Object[] { paramObject1, paramObject2, paramObject3, paramObject4, paramObject5, paramObject6, paramObject7 });
  }
  
  public static v e0(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4, Object paramObject5, Object paramObject6, Object paramObject7, Object paramObject8, Object paramObject9, Object paramObject10, Object paramObject11, Object paramObject12, Object... paramVarArgs)
  {
    boolean bool;
    if (paramVarArgs.length <= 2147483635) {
      bool = true;
    } else {
      bool = false;
    }
    m.e(bool, "the total number of elements must fit in an int");
    Object[] arrayOfObject = new Object[paramVarArgs.length + 12];
    arrayOfObject[0] = paramObject1;
    arrayOfObject[1] = paramObject2;
    arrayOfObject[2] = paramObject3;
    arrayOfObject[3] = paramObject4;
    arrayOfObject[4] = paramObject5;
    arrayOfObject[5] = paramObject6;
    arrayOfObject[6] = paramObject7;
    arrayOfObject[7] = paramObject8;
    arrayOfObject[8] = paramObject9;
    arrayOfObject[9] = paramObject10;
    arrayOfObject[10] = paramObject11;
    arrayOfObject[11] = paramObject12;
    System.arraycopy(paramVarArgs, 0, arrayOfObject, 12, paramVarArgs.length);
    return T(arrayOfObject);
  }
  
  public static v g0(Comparator paramComparator, Iterable paramIterable)
  {
    m.j(paramComparator);
    paramIterable = B.k(paramIterable);
    O.b(paramIterable);
    Arrays.sort(paramIterable, paramComparator);
    return s(paramIterable);
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream)
  {
    throw new InvalidObjectException("Use SerializedForm");
  }
  
  public static v s(Object[] paramArrayOfObject)
  {
    return D(paramArrayOfObject, paramArrayOfObject.length);
  }
  
  public h0 W()
  {
    return X(0);
  }
  
  public h0 X(int paramInt)
  {
    m.l(paramInt, size());
    if (isEmpty()) {
      return p;
    }
    return new b(this, paramInt);
  }
  
  public final v a()
  {
    return this;
  }
  
  public final void add(int paramInt, Object paramObject)
  {
    throw new UnsupportedOperationException();
  }
  
  public final boolean addAll(int paramInt, Collection paramCollection)
  {
    throw new UnsupportedOperationException();
  }
  
  public boolean contains(Object paramObject)
  {
    boolean bool;
    if (indexOf(paramObject) >= 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public int d(Object[] paramArrayOfObject, int paramInt)
  {
    int i = size();
    for (int j = 0; j < i; j++) {
      paramArrayOfObject[(paramInt + j)] = get(j);
    }
    return paramInt + i;
  }
  
  public boolean equals(Object paramObject)
  {
    return E.c(this, paramObject);
  }
  
  public v f0()
  {
    Object localObject;
    if (size() <= 1) {
      localObject = this;
    } else {
      localObject = new c(this);
    }
    return (v)localObject;
  }
  
  public v h0(int paramInt1, int paramInt2)
  {
    m.n(paramInt1, paramInt2, size());
    int i = paramInt2 - paramInt1;
    if (i == size()) {
      return this;
    }
    if (i == 0) {
      return Y();
    }
    return i0(paramInt1, paramInt2);
  }
  
  public int hashCode()
  {
    int i = size();
    int j = 1;
    for (int k = 0; k < i; k++) {
      j = j * 31 + get(k).hashCode();
    }
    return j;
  }
  
  public v i0(int paramInt1, int paramInt2)
  {
    return new e(paramInt1, paramInt2 - paramInt1);
  }
  
  public int indexOf(Object paramObject)
  {
    int i;
    if (paramObject == null) {
      i = -1;
    } else {
      i = E.d(this, paramObject);
    }
    return i;
  }
  
  public int lastIndexOf(Object paramObject)
  {
    int i;
    if (paramObject == null) {
      i = -1;
    } else {
      i = E.f(this, paramObject);
    }
    return i;
  }
  
  public g0 q()
  {
    return W();
  }
  
  public final Object remove(int paramInt)
  {
    throw new UnsupportedOperationException();
  }
  
  public final Object set(int paramInt, Object paramObject)
  {
    throw new UnsupportedOperationException();
  }
  
  public Object writeReplace()
  {
    return new d(toArray());
  }
  
  public static final class a
    extends t.a
  {
    public a()
    {
      this(4);
    }
    
    public a(int paramInt)
    {
      super();
    }
    
    public a h(Object paramObject)
    {
      super.d(paramObject);
      return this;
    }
    
    public a i(Object... paramVarArgs)
    {
      super.e(paramVarArgs);
      return this;
    }
    
    public a j(Iterable paramIterable)
    {
      super.b(paramIterable);
      return this;
    }
    
    public v k()
    {
      c = true;
      return v.D(a, b);
    }
  }
  
  public static class b
    extends a
  {
    public final v q;
    
    public b(v paramv, int paramInt)
    {
      super(paramInt);
      q = paramv;
    }
    
    public Object b(int paramInt)
    {
      return q.get(paramInt);
    }
  }
  
  public static class c
    extends v
  {
    public final transient v q;
    
    public c(v paramv)
    {
      q = paramv;
    }
    
    public boolean contains(Object paramObject)
    {
      return q.contains(paramObject);
    }
    
    public v f0()
    {
      return q;
    }
    
    public Object get(int paramInt)
    {
      m.h(paramInt, size());
      return q.get(j0(paramInt));
    }
    
    public v h0(int paramInt1, int paramInt2)
    {
      m.n(paramInt1, paramInt2, size());
      return q.h0(k0(paramInt2), k0(paramInt1)).f0();
    }
    
    public int indexOf(Object paramObject)
    {
      int i = q.lastIndexOf(paramObject);
      if (i >= 0) {
        i = j0(i);
      } else {
        i = -1;
      }
      return i;
    }
    
    public final int j0(int paramInt)
    {
      return size() - 1 - paramInt;
    }
    
    public boolean k()
    {
      return q.k();
    }
    
    public final int k0(int paramInt)
    {
      return size() - paramInt;
    }
    
    public int lastIndexOf(Object paramObject)
    {
      int i = q.indexOf(paramObject);
      if (i >= 0) {
        i = j0(i);
      } else {
        i = -1;
      }
      return i;
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
  
  public static class d
    implements Serializable
  {
    private static final long serialVersionUID = 0L;
    public final Object[] o;
    
    public d(Object[] paramArrayOfObject)
    {
      o = paramArrayOfObject;
    }
    
    public Object readResolve()
    {
      return v.V(o);
    }
  }
  
  public class e
    extends v
  {
    public final transient int q;
    public final transient int r;
    
    public e(int paramInt1, int paramInt2)
    {
      q = paramInt1;
      r = paramInt2;
    }
    
    public Object[] f()
    {
      return v.this.f();
    }
    
    public int g()
    {
      return v.this.i() + q + r;
    }
    
    public Object get(int paramInt)
    {
      m.h(paramInt, r);
      return v.this.get(paramInt + q);
    }
    
    public v h0(int paramInt1, int paramInt2)
    {
      m.n(paramInt1, paramInt2, r);
      v localv = v.this;
      int i = q;
      return localv.h0(paramInt1 + i, paramInt2 + i);
    }
    
    public int i()
    {
      return v.this.i() + q;
    }
    
    public boolean k()
    {
      return true;
    }
    
    public int size()
    {
      return r;
    }
    
    public Object writeReplace()
    {
      return super.writeReplace();
    }
  }
}

/* Location:
 * Qualified Name:     X2.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */