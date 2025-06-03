package com.google.crypto.tink.shaded.protobuf;

import java.util.Iterator;
import java.util.List;

public class n0$b
  implements Iterator
{
  public Iterator o;
  
  public n0$b(n0 paramn0)
  {
    o = n0.a(paramn0).iterator();
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
 * Qualified Name:     com.google.crypto.tink.shaded.protobuf.n0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */