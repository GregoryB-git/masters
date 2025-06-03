package Q3;

import d4.i;
import d4.m;
import java.util.Iterator;

public class b$a$a
  implements Iterator
{
  public b$a$a(b.a parama) {}
  
  public b b()
  {
    m localm = (m)o.o.next();
    return new b(b.a(o.p).W(localm.c().e()), i.d(localm.d()));
  }
  
  public boolean hasNext()
  {
    return o.o.hasNext();
  }
  
  public void remove()
  {
    throw new UnsupportedOperationException("remove called on immutable collection");
  }
}

/* Location:
 * Qualified Name:     Q3.b.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */