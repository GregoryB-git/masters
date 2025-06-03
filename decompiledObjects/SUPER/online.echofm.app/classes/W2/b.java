package W2;

import java.util.Iterator;
import java.util.NoSuchElementException;

public abstract class b
  implements Iterator
{
  public b o = b.p;
  public Object p;
  
  public abstract Object b();
  
  public final Object d()
  {
    o = b.q;
    return null;
  }
  
  public final boolean e()
  {
    o = b.r;
    p = b();
    if (o != b.q)
    {
      o = b.o;
      return true;
    }
    return false;
  }
  
  public final boolean hasNext()
  {
    boolean bool;
    if (o != b.r) {
      bool = true;
    } else {
      bool = false;
    }
    m.o(bool);
    int i = a.a[o.ordinal()];
    if (i != 1)
    {
      if (i != 2) {
        return e();
      }
      return true;
    }
    return false;
  }
  
  public final Object next()
  {
    if (hasNext())
    {
      o = b.p;
      Object localObject = j.a(p);
      p = null;
      return localObject;
    }
    throw new NoSuchElementException();
  }
  
  public final void remove()
  {
    throw new UnsupportedOperationException();
  }
  
  public static enum b {}
}

/* Location:
 * Qualified Name:     W2.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */