package ma;

import java.util.Iterator;
import java.util.List;

public final class s1$b
  implements Iterator<String>
{
  public Iterator<String> a;
  
  public s1$b(s1 params1)
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

/* Location:
 * Qualified Name:     ma.s1.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */