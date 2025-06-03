package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.List;

public class o0$b
  implements Iterator
{
  public Iterator o;
  
  public o0$b(o0 paramo0)
  {
    o = o0.a(paramo0).iterator();
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
 * Qualified Name:     androidx.datastore.preferences.protobuf.o0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */