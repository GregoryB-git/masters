package o7;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import x6.b;

public final class t$c
  extends t<E>
{
  public final transient int c;
  public final transient int d;
  
  public t$c(t paramt, int paramInt1, int paramInt2)
  {
    c = paramInt1;
    d = paramInt2;
  }
  
  public final E get(int paramInt)
  {
    b.v(paramInt, d);
    return (E)e.get(paramInt + c);
  }
  
  public final Object[] i()
  {
    return e.i();
  }
  
  public final Iterator iterator()
  {
    return r(0);
  }
  
  public final int k()
  {
    return e.l() + c + d;
  }
  
  public final int l()
  {
    return e.l() + c;
  }
  
  public final ListIterator listIterator()
  {
    return r(0);
  }
  
  public final boolean m()
  {
    return true;
  }
  
  public final int size()
  {
    return d;
  }
  
  public final t<E> x(int paramInt1, int paramInt2)
  {
    b.E(paramInt1, paramInt2, d);
    t localt = e;
    int i = c;
    return localt.x(paramInt1 + i, paramInt2 + i);
  }
}

/* Location:
 * Qualified Name:     o7.t.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */