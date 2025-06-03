package X2;

import W2.m;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

public final class V
  extends A
{
  public static final V t = new V(v.Y(), P.d());
  public final transient v s;
  
  public V(v paramv, Comparator paramComparator)
  {
    super(paramComparator);
    s = paramv;
  }
  
  public Comparator A0()
  {
    return q;
  }
  
  public v a()
  {
    return s;
  }
  
  public Object ceiling(Object paramObject)
  {
    int i = y0(paramObject, true);
    if (i == size()) {
      paramObject = null;
    } else {
      paramObject = s.get(i);
    }
    return paramObject;
  }
  
  public boolean contains(Object paramObject)
  {
    bool1 = false;
    bool2 = bool1;
    if (paramObject != null) {}
    try
    {
      int i = z0(paramObject);
      bool2 = bool1;
      if (i >= 0) {
        bool2 = true;
      }
    }
    catch (ClassCastException paramObject)
    {
      for (;;)
      {
        bool2 = bool1;
      }
    }
    return bool2;
  }
  
  public boolean containsAll(Collection paramCollection)
  {
    Object localObject = paramCollection;
    if ((paramCollection instanceof L)) {
      localObject = ((L)paramCollection).u();
    }
    g0 localg0;
    Iterator localIterator;
    if ((d0.b(comparator(), (Iterable)localObject)) && (((Collection)localObject).size() > 1))
    {
      localg0 = q();
      localIterator = ((Collection)localObject).iterator();
      if (!localg0.hasNext()) {
        return false;
      }
      localObject = localIterator.next();
      paramCollection = localg0.next();
    }
    try
    {
      int i;
      do
      {
        for (;;)
        {
          i = t0(paramCollection, localObject);
          if (i < 0)
          {
            if (!localg0.hasNext()) {
              return false;
            }
            paramCollection = localg0.next();
          }
          else
          {
            if (i != 0) {
              break;
            }
            if (!localIterator.hasNext()) {
              return true;
            }
            localObject = localIterator.next();
          }
        }
      } while (i <= 0);
    }
    catch (NullPointerException|ClassCastException paramCollection)
    {
      for (;;) {}
    }
    return false;
    return super.containsAll((Collection)localObject);
  }
  
  public int d(Object[] paramArrayOfObject, int paramInt)
  {
    return s.d(paramArrayOfObject, paramInt);
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof Set)) {
      return false;
    }
    paramObject = (Set)paramObject;
    if (size() != ((Set)paramObject).size()) {
      return false;
    }
    if (isEmpty()) {
      return true;
    }
    if (d0.b(q, (Iterable)paramObject))
    {
      Iterator localIterator = ((Set)paramObject).iterator();
      try
      {
        paramObject = q();
        while (((Iterator)paramObject).hasNext())
        {
          Object localObject1 = ((Iterator)paramObject).next();
          Object localObject2 = localIterator.next();
          if (localObject2 != null)
          {
            int i = t0(localObject1, localObject2);
            if (i == 0) {
              break;
            }
          }
          else
          {
            return false;
          }
        }
        return true;
      }
      catch (ClassCastException|NoSuchElementException paramObject)
      {
        return false;
      }
    }
    return containsAll((Collection)paramObject);
  }
  
  public Object[] f()
  {
    return s.f();
  }
  
  public Object first()
  {
    if (!isEmpty()) {
      return s.get(0);
    }
    throw new NoSuchElementException();
  }
  
  public Object floor(Object paramObject)
  {
    int i = x0(paramObject, true) - 1;
    if (i == -1) {
      paramObject = null;
    } else {
      paramObject = s.get(i);
    }
    return paramObject;
  }
  
  public int g()
  {
    return s.g();
  }
  
  public A h0()
  {
    Object localObject = Collections.reverseOrder(q);
    if (isEmpty()) {
      localObject = A.j0((Comparator)localObject);
    } else {
      localObject = new V(s.f0(), (Comparator)localObject);
    }
    return (A)localObject;
  }
  
  public Object higher(Object paramObject)
  {
    int i = y0(paramObject, false);
    if (i == size()) {
      paramObject = null;
    } else {
      paramObject = s.get(i);
    }
    return paramObject;
  }
  
  public int i()
  {
    return s.i();
  }
  
  public boolean k()
  {
    return s.k();
  }
  
  public Object last()
  {
    if (!isEmpty()) {
      return s.get(size() - 1);
    }
    throw new NoSuchElementException();
  }
  
  public Object lower(Object paramObject)
  {
    int i = x0(paramObject, false) - 1;
    if (i == -1) {
      paramObject = null;
    } else {
      paramObject = s.get(i);
    }
    return paramObject;
  }
  
  public A m0(Object paramObject, boolean paramBoolean)
  {
    return w0(0, x0(paramObject, paramBoolean));
  }
  
  public A p0(Object paramObject1, boolean paramBoolean1, Object paramObject2, boolean paramBoolean2)
  {
    return s0(paramObject1, paramBoolean1).m0(paramObject2, paramBoolean2);
  }
  
  public g0 q()
  {
    return s.q();
  }
  
  public A s0(Object paramObject, boolean paramBoolean)
  {
    return w0(y0(paramObject, paramBoolean), size());
  }
  
  public int size()
  {
    return s.size();
  }
  
  public g0 v0()
  {
    return s.f0().q();
  }
  
  public V w0(int paramInt1, int paramInt2)
  {
    if ((paramInt1 == 0) && (paramInt2 == size())) {
      return this;
    }
    if (paramInt1 < paramInt2) {
      return new V(s.h0(paramInt1, paramInt2), q);
    }
    return A.j0(q);
  }
  
  public Object writeReplace()
  {
    return super.writeReplace();
  }
  
  public int x0(Object paramObject, boolean paramBoolean)
  {
    int i = Collections.binarySearch(s, m.j(paramObject), comparator());
    if (i >= 0)
    {
      int j = i;
      if (paramBoolean) {
        j = i + 1;
      }
      return j;
    }
    return i;
  }
  
  public int y0(Object paramObject, boolean paramBoolean)
  {
    int i = Collections.binarySearch(s, m.j(paramObject), comparator());
    if (i >= 0)
    {
      if (!paramBoolean) {
        i++;
      }
      return i;
    }
    return i;
  }
  
  public final int z0(Object paramObject)
  {
    return Collections.binarySearch(s, paramObject, A0());
  }
}

/* Location:
 * Qualified Name:     X2.V
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */