package X2;

import W2.k;
import W2.m;
import W2.n;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public abstract class C
{
  public static boolean a(Collection paramCollection, Iterator paramIterator)
  {
    m.j(paramCollection);
    m.j(paramIterator);
    boolean bool = false;
    while (paramIterator.hasNext()) {
      bool |= paramCollection.add(paramIterator.next());
    }
    return bool;
  }
  
  public static boolean b(Iterator paramIterator, n paramn)
  {
    boolean bool;
    if (o(paramIterator, paramn) != -1) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static void c(Iterator paramIterator)
  {
    m.j(paramIterator);
    while (paramIterator.hasNext())
    {
      paramIterator.next();
      paramIterator.remove();
    }
  }
  
  public static boolean d(Iterator paramIterator, Object paramObject)
  {
    if (paramObject == null)
    {
      do
      {
        if (!paramIterator.hasNext()) {
          break;
        }
      } while (paramIterator.next() != null);
      return true;
    }
    while (paramIterator.hasNext()) {
      if (paramObject.equals(paramIterator.next())) {
        return true;
      }
    }
    return false;
  }
  
  public static boolean e(Iterator paramIterator1, Iterator paramIterator2)
  {
    while (paramIterator1.hasNext())
    {
      if (!paramIterator2.hasNext()) {
        return false;
      }
      if (!k.a(paramIterator1.next(), paramIterator2.next())) {
        return false;
      }
    }
    return paramIterator2.hasNext() ^ true;
  }
  
  public static g0 f()
  {
    return g();
  }
  
  public static h0 g()
  {
    return b.r;
  }
  
  public static Iterator h()
  {
    return c.o;
  }
  
  public static g0 i(Iterator paramIterator, final n paramn)
  {
    m.j(paramIterator);
    m.j(paramn);
    return new a(paramn);
  }
  
  public static Object j(Iterator paramIterator, n paramn)
  {
    m.j(paramIterator);
    m.j(paramn);
    while (paramIterator.hasNext())
    {
      Object localObject = paramIterator.next();
      if (paramn.apply(localObject)) {
        return localObject;
      }
    }
    throw new NoSuchElementException();
  }
  
  public static Object k(Iterator paramIterator)
  {
    Object localObject;
    do
    {
      localObject = paramIterator.next();
    } while (paramIterator.hasNext());
    return localObject;
  }
  
  public static Object l(Iterator paramIterator, Object paramObject)
  {
    if (paramIterator.hasNext()) {
      paramObject = k(paramIterator);
    }
    return paramObject;
  }
  
  public static Object m(Iterator paramIterator, Object paramObject)
  {
    if (paramIterator.hasNext()) {
      paramObject = paramIterator.next();
    }
    return paramObject;
  }
  
  public static Object n(Iterator paramIterator)
  {
    Object localObject = paramIterator.next();
    if (!paramIterator.hasNext()) {
      return localObject;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("expected one element but was: <");
    localStringBuilder.append(localObject);
    for (int i = 0; (i < 4) && (paramIterator.hasNext()); i++)
    {
      localStringBuilder.append(", ");
      localStringBuilder.append(paramIterator.next());
    }
    if (paramIterator.hasNext()) {
      localStringBuilder.append(", ...");
    }
    localStringBuilder.append('>');
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  public static int o(Iterator paramIterator, n paramn)
  {
    m.k(paramn, "predicate");
    for (int i = 0; paramIterator.hasNext(); i++) {
      if (paramn.apply(paramIterator.next())) {
        return i;
      }
    }
    return -1;
  }
  
  public static Object p(Iterator paramIterator)
  {
    if (paramIterator.hasNext())
    {
      Object localObject = paramIterator.next();
      paramIterator.remove();
      return localObject;
    }
    return null;
  }
  
  public static boolean q(Iterator paramIterator, Collection paramCollection)
  {
    m.j(paramCollection);
    boolean bool = false;
    while (paramIterator.hasNext()) {
      if (paramCollection.contains(paramIterator.next()))
      {
        paramIterator.remove();
        bool = true;
      }
    }
    return bool;
  }
  
  public static boolean r(Iterator paramIterator, n paramn)
  {
    m.j(paramn);
    boolean bool = false;
    while (paramIterator.hasNext()) {
      if (paramn.apply(paramIterator.next()))
      {
        paramIterator.remove();
        bool = true;
      }
    }
    return bool;
  }
  
  public static g0 s(Object paramObject)
  {
    return new d(paramObject);
  }
  
  public class a
    extends b
  {
    public a(n paramn) {}
    
    public Object b()
    {
      while (hasNext())
      {
        Object localObject = next();
        if (paramn.apply(localObject)) {
          return localObject;
        }
      }
      return d();
    }
  }
  
  public static final class b
    extends a
  {
    public static final h0 r = new b(new Object[0], 0);
    public final Object[] q;
    
    public b(Object[] paramArrayOfObject, int paramInt)
    {
      super(paramInt);
      q = paramArrayOfObject;
    }
    
    public Object b(int paramInt)
    {
      return q[paramInt];
    }
  }
  
  public static enum c
    implements Iterator
  {
    public boolean hasNext()
    {
      return false;
    }
    
    public Object next()
    {
      throw new NoSuchElementException();
    }
    
    public void remove()
    {
      i.c(false);
    }
  }
  
  public static final class d
    extends g0
  {
    public static final Object p = new Object();
    public Object o;
    
    public d(Object paramObject)
    {
      o = paramObject;
    }
    
    public boolean hasNext()
    {
      boolean bool;
      if (o != p) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public Object next()
    {
      Object localObject1 = o;
      Object localObject2 = p;
      if (localObject1 != localObject2)
      {
        o = localObject2;
        return localObject1;
      }
      throw new NoSuchElementException();
    }
  }
}

/* Location:
 * Qualified Name:     X2.C
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */