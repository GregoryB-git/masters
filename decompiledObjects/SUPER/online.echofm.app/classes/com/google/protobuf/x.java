package com.google.protobuf;

import java.util.Iterator;
import java.util.Map.Entry;

public class x
  implements Iterator
{
  public Iterator o;
  
  public x(Iterator paramIterator)
  {
    o = paramIterator;
  }
  
  public Map.Entry b()
  {
    Map.Entry localEntry = (Map.Entry)o.next();
    localEntry.getValue();
    return localEntry;
  }
  
  public boolean hasNext()
  {
    return o.hasNext();
  }
  
  public void remove()
  {
    o.remove();
  }
}

/* Location:
 * Qualified Name:     com.google.protobuf.x
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */