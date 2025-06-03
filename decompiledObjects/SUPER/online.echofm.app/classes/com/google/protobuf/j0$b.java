package com.google.protobuf;

import java.util.Iterator;
import java.util.List;

public class j0$b
  implements Iterator
{
  public Iterator o;
  
  public j0$b(j0 paramj0)
  {
    o = j0.a(paramj0).iterator();
  }
  
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

/* Location:
 * Qualified Name:     com.google.protobuf.j0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */