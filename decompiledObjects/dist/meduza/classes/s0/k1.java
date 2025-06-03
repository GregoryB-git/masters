package s0;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class k1
  extends AbstractList<String>
  implements d0, RandomAccess
{
  public final d0 a;
  
  public k1(d0 paramd0)
  {
    a = paramd0;
  }
  
  public final List<?> d()
  {
    return a.d();
  }
  
  public final d0 e()
  {
    return this;
  }
  
  public final Object f(int paramInt)
  {
    return a.f(paramInt);
  }
  
  public final Object get(int paramInt)
  {
    return (String)a.get(paramInt);
  }
  
  public final Iterator<String> iterator()
  {
    return new b();
  }
  
  public final ListIterator<String> listIterator(int paramInt)
  {
    return new a(paramInt);
  }
  
  public final int size()
  {
    return a.size();
  }
  
  public final void w(g paramg)
  {
    throw new UnsupportedOperationException();
  }
  
  public final class a
    implements ListIterator<String>
  {
    public ListIterator<String> a;
    
    public a(int paramInt)
    {
      a = a.listIterator(paramInt);
    }
    
    public final void add(Object paramObject)
    {
      paramObject = (String)paramObject;
      throw new UnsupportedOperationException();
    }
    
    public final boolean hasNext()
    {
      return a.hasNext();
    }
    
    public final boolean hasPrevious()
    {
      return a.hasPrevious();
    }
    
    public final Object next()
    {
      return (String)a.next();
    }
    
    public final int nextIndex()
    {
      return a.nextIndex();
    }
    
    public final Object previous()
    {
      return (String)a.previous();
    }
    
    public final int previousIndex()
    {
      return a.previousIndex();
    }
    
    public final void remove()
    {
      throw new UnsupportedOperationException();
    }
    
    public final void set(Object paramObject)
    {
      paramObject = (String)paramObject;
      throw new UnsupportedOperationException();
    }
  }
  
  public final class b
    implements Iterator<String>
  {
    public Iterator<String> a;
    
    public b()
    {
      a = a.iterator();
    }
    
    public final boolean hasNext()
    {
      return a.hasNext();
    }
    
    public final Object next()
    {
      return (String)a.next();
    }
    
    public final void remove()
    {
      throw new UnsupportedOperationException();
    }
  }
}

/* Location:
 * Qualified Name:     s0.k1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */