package o7;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import x6.b;

public abstract class t<E>
  extends r<E>
  implements List<E>, RandomAccess
{
  public static final b b = new b(0, l0.e);
  
  public static l0 o(int paramInt, Object[] paramArrayOfObject)
  {
    if (paramInt == 0) {
      return l0.e;
    }
    return new l0(paramArrayOfObject, paramInt);
  }
  
  public static <E> t<E> p(Collection<? extends E> paramCollection)
  {
    if ((paramCollection instanceof r))
    {
      t localt = ((r)paramCollection).a();
      paramCollection = localt;
      if (localt.m())
      {
        paramCollection = localt.toArray();
        paramCollection = o(paramCollection.length, paramCollection);
      }
      return paramCollection;
    }
    paramCollection = paramCollection.toArray();
    b.w(paramCollection.length, paramCollection);
    return o(paramCollection.length, paramCollection);
  }
  
  public static l0 q(Object[] paramArrayOfObject)
  {
    if (paramArrayOfObject.length == 0)
    {
      paramArrayOfObject = l0.e;
    }
    else
    {
      paramArrayOfObject = (Object[])paramArrayOfObject.clone();
      b.w(paramArrayOfObject.length, paramArrayOfObject);
      paramArrayOfObject = o(paramArrayOfObject.length, paramArrayOfObject);
    }
    return paramArrayOfObject;
  }
  
  public static l0 s(Long paramLong1, Long paramLong2, Long paramLong3, Long paramLong4, Long paramLong5)
  {
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = paramLong1;
    arrayOfObject[1] = paramLong2;
    arrayOfObject[2] = paramLong3;
    arrayOfObject[3] = paramLong4;
    arrayOfObject[4] = paramLong5;
    b.w(5, arrayOfObject);
    return o(5, arrayOfObject);
  }
  
  public static l0 t(Object paramObject)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramObject;
    b.w(1, arrayOfObject);
    return o(1, arrayOfObject);
  }
  
  public static l0 u(Object paramObject1, Object paramObject2)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramObject1;
    arrayOfObject[1] = paramObject2;
    b.w(2, arrayOfObject);
    return o(2, arrayOfObject);
  }
  
  @Deprecated
  public final t<E> a()
  {
    return this;
  }
  
  @Deprecated
  public final void add(int paramInt, E paramE)
  {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public final boolean addAll(int paramInt, Collection<? extends E> paramCollection)
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
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    boolean bool2;
    if (paramObject == this)
    {
      bool2 = bool1;
    }
    else
    {
      Object localObject;
      if ((paramObject instanceof List))
      {
        localObject = (List)paramObject;
        int i = size();
        if (i == ((List)localObject).size())
        {
          if ((localObject instanceof RandomAccess)) {
            for (int j = 0;; j++)
            {
              bool2 = bool1;
              if (j >= i) {
                return bool2;
              }
              if (!b.Q(get(j), ((List)localObject).get(j))) {
                break;
              }
            }
          }
          paramObject = iterator();
          localObject = ((List)localObject).iterator();
          do
          {
            if (!((Iterator)paramObject).hasNext()) {
              break;
            }
          } while ((((Iterator)localObject).hasNext()) && (b.Q(((Iterator)paramObject).next(), ((Iterator)localObject).next())));
        }
      }
      return false;
      bool2 = ((Iterator)localObject).hasNext() ^ true;
    }
    return bool2;
  }
  
  public int h(int paramInt, Object[] paramArrayOfObject)
  {
    int i = size();
    for (int j = 0; j < i; j++) {
      paramArrayOfObject[(paramInt + j)] = get(j);
    }
    return paramInt + i;
  }
  
  public final int hashCode()
  {
    int i = size();
    int j = 1;
    for (int k = 0; k < i; k++) {
      j = get(k).hashCode() + j * 31;
    }
    return j;
  }
  
  public int indexOf(Object paramObject)
  {
    int i = -1;
    int j;
    if (paramObject == null)
    {
      j = i;
    }
    else
    {
      int k = size();
      for (int m = 0;; m++)
      {
        j = i;
        if (m >= k) {
          break;
        }
        if (paramObject.equals(get(m)))
        {
          j = m;
          break;
        }
      }
    }
    return j;
  }
  
  public Iterator iterator()
  {
    return r(0);
  }
  
  public int lastIndexOf(Object paramObject)
  {
    int i = -1;
    int j;
    if (paramObject == null) {
      j = i;
    } else {
      for (int k = size() - 1;; k--)
      {
        j = i;
        if (k < 0) {
          break;
        }
        if (paramObject.equals(get(k)))
        {
          j = k;
          break;
        }
      }
    }
    return j;
  }
  
  public ListIterator listIterator()
  {
    return r(0);
  }
  
  public final x0<E> n()
  {
    return r(0);
  }
  
  public final b r(int paramInt)
  {
    b.D(paramInt, size());
    if (isEmpty()) {
      return b;
    }
    return new b(paramInt, this);
  }
  
  @Deprecated
  public final E remove(int paramInt)
  {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public final E set(int paramInt, E paramE)
  {
    throw new UnsupportedOperationException();
  }
  
  public t<E> x(int paramInt1, int paramInt2)
  {
    b.E(paramInt1, paramInt2, size());
    paramInt2 -= paramInt1;
    if (paramInt2 == size()) {
      return this;
    }
    if (paramInt2 == 0) {
      return l0.e;
    }
    return new c(paramInt1, paramInt2);
  }
  
  public static final class a<E>
    extends r.a<E>
  {
    public final void c(Object paramObject)
    {
      paramObject.getClass();
      b(b + 1);
      Object[] arrayOfObject = a;
      int i = b;
      b = (i + 1);
      arrayOfObject[i] = paramObject;
    }
    
    public final void d(List paramList)
    {
      if ((paramList instanceof Collection))
      {
        int i = b;
        b(paramList.size() + i);
        if ((paramList instanceof r))
        {
          r localr = (r)paramList;
          paramList = a;
          b = localr.h(b, paramList);
          return;
        }
      }
      paramList = paramList.iterator();
      while (paramList.hasNext()) {
        c(paramList.next());
      }
    }
    
    public final l0 e()
    {
      c = true;
      Object[] arrayOfObject = a;
      return t.o(b, arrayOfObject);
    }
  }
  
  public static final class b<E>
    extends a<E>
  {
    public final t<E> c;
    
    public b(int paramInt, t paramt)
    {
      super(paramInt);
      c = paramt;
    }
    
    public final E b(int paramInt)
    {
      return (E)c.get(paramInt);
    }
  }
  
  public final class c
    extends t<E>
  {
    public final transient int c;
    public final transient int d;
    
    public c(int paramInt1, int paramInt2)
    {
      c = paramInt1;
      d = paramInt2;
    }
    
    public final E get(int paramInt)
    {
      b.v(paramInt, d);
      return (E)t.this.get(paramInt + c);
    }
    
    public final Object[] i()
    {
      return t.this.i();
    }
    
    public final Iterator iterator()
    {
      return r(0);
    }
    
    public final int k()
    {
      return t.this.l() + c + d;
    }
    
    public final int l()
    {
      return t.this.l() + c;
    }
    
    public final ListIterator listIterator()
    {
      return r(0);
    }
    
    public final boolean m()
    {
      return true;
    }
    
    public final int size()
    {
      return d;
    }
    
    public final t<E> x(int paramInt1, int paramInt2)
    {
      b.E(paramInt1, paramInt2, d);
      t localt = t.this;
      int i = c;
      return localt.x(paramInt1 + i, paramInt2 + i);
    }
  }
}

/* Location:
 * Qualified Name:     o7.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */