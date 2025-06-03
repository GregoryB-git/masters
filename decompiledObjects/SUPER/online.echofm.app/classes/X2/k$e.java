package X2;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public abstract class k$e
  implements Iterator
{
  public int o;
  public int p;
  public int q;
  
  public k$e(k paramk)
  {
    o = k.a(paramk);
    p = paramk.z();
    q = -1;
  }
  
  public final void b()
  {
    if (k.a(r) == o) {
      return;
    }
    throw new ConcurrentModificationException();
  }
  
  public abstract Object d(int paramInt);
  
  public void e()
  {
    o += 32;
  }
  
  public boolean hasNext()
  {
    boolean bool;
    if (p >= 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public Object next()
  {
    b();
    if (hasNext())
    {
      int i = p;
      q = i;
      Object localObject = d(i);
      p = r.A(p);
      return localObject;
    }
    throw new NoSuchElementException();
  }
  
  public void remove()
  {
    b();
    boolean bool;
    if (q >= 0) {
      bool = true;
    } else {
      bool = false;
    }
    i.c(bool);
    e();
    k localk = r;
    localk.remove(k.b(localk, q));
    p = r.o(p, q);
    q = -1;
  }
}

/* Location:
 * Qualified Name:     X2.k.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */