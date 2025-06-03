package com.google.crypto.tink.shaded.protobuf;

import java.util.List;
import java.util.ListIterator;

public class n0$a
  implements ListIterator
{
  public ListIterator o;
  
  public n0$a(n0 paramn0, int paramInt)
  {
    o = n0.a(paramn0).listIterator(paramInt);
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
 * Qualified Name:     com.google.crypto.tink.shaded.protobuf.n0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */