package tb;

import java.util.ConcurrentModificationException;

public class c$d<K, V>
{
  public final c<K, V> a;
  public int b;
  public int c;
  public int d;
  
  public c$d(c<K, V> paramc)
  {
    a = paramc;
    c = -1;
    d = p;
    b();
  }
  
  public final void a()
  {
    if (a.p == d) {
      return;
    }
    throw new ConcurrentModificationException();
  }
  
  public final void b()
  {
    for (;;)
    {
      int i = b;
      c localc = a;
      if ((i >= f) || (c[i] >= 0)) {
        break;
      }
      b = (i + 1);
    }
  }
  
  public final boolean hasNext()
  {
    boolean bool;
    if (b < a.f) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void remove()
  {
    a();
    int i;
    if (c != -1) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0)
    {
      a.c();
      a.k(c);
      c = -1;
      d = a.p;
      return;
    }
    throw new IllegalStateException("Call next() before removing element from the iterator.".toString());
  }
}

/* Location:
 * Qualified Name:     tb.c.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */