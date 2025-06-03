package Q3;

import d4.i;
import d4.m;
import java.util.Iterator;

public class b$a
  implements Iterable
{
  public b$a(b paramb, Iterator paramIterator) {}
  
  public Iterator iterator()
  {
    return new a();
  }
  
  public class a
    implements Iterator
  {
    public a() {}
    
    public b b()
    {
      m localm = (m)o.next();
      return new b(b.a(p).W(localm.c().e()), i.d(localm.d()));
    }
    
    public boolean hasNext()
    {
      return o.hasNext();
    }
    
    public void remove()
    {
      throw new UnsupportedOperationException("remove called on immutable collection");
    }
  }
}

/* Location:
 * Qualified Name:     Q3.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */