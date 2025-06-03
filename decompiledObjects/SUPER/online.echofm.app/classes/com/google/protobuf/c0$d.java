package com.google.protobuf;

import java.util.Iterator;
import java.util.NoSuchElementException;

public abstract class c0$d
{
  public static final Iterator a = new a();
  public static final Iterable b = new b();
  
  public static Iterable b()
  {
    return b;
  }
  
  public class a
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
      throw new UnsupportedOperationException();
    }
  }
  
  public class b
    implements Iterable
  {
    public Iterator iterator()
    {
      return c0.d.a();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.protobuf.c0.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */