package com.google.protobuf;

import java.util.List;
import java.util.ListIterator;

public class j0$a
  implements ListIterator
{
  public ListIterator o;
  
  public j0$a(j0 paramj0, int paramInt)
  {
    o = j0.a(paramj0).listIterator(paramInt);
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

/* Location:
 * Qualified Name:     com.google.protobuf.j0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */