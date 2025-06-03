package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public class n0
  extends AbstractList
  implements D, RandomAccess
{
  public final D o;
  
  public n0(D paramD)
  {
    o = paramD;
  }
  
  public void C(h paramh)
  {
    throw new UnsupportedOperationException();
  }
  
  public String d(int paramInt)
  {
    return (String)o.get(paramInt);
  }
  
  public Iterator iterator()
  {
    return new b();
  }
  
  public ListIterator listIterator(final int paramInt)
  {
    return new a(paramInt);
  }
  
  public D m()
  {
    return this;
  }
  
  public Object n(int paramInt)
  {
    return o.n(paramInt);
  }
  
  public List o()
  {
    return o.o();
  }
  
  public int size()
  {
    return o.size();
  }
  
  public class a
    implements ListIterator
  {
    public ListIterator o;
    
    public a(int paramInt)
    {
      o = n0.a(n0.this).listIterator(paramInt);
    }
    
    public void b(String paramString)
    {
      throw new UnsupportedOperationException();
    }
    
    public String d()
    {
      return (String)o.next();
    }
    
    public String e()
    {
      return (String)o.previous();
    }
    
    public void f(String paramString)
    {
      throw new UnsupportedOperationException();
    }
    
    public boolean hasNext()
    {
      return o.hasNext();
    }
    
    public boolean hasPrevious()
    {
      return o.hasPrevious();
    }
    
    public int nextIndex()
    {
      return o.nextIndex();
    }
    
    public int previousIndex()
    {
      return o.previousIndex();
    }
    
    public void remove()
    {
      throw new UnsupportedOperationException();
    }
  }
  
  public class b
    implements Iterator
  {
    public Iterator o = n0.a(n0.this).iterator();
    
    public b() {}
    
    public String b()
    {
      return (String)o.next();
    }
    
    public boolean hasNext()
    {
      return o.hasNext();
    }
    
    public void remove()
    {
      throw new UnsupportedOperationException();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.crypto.tink.shaded.protobuf.n0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */