package i5;

import h5.h;
import h5.k;
import h5.l;
import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import v5.e0;
import x6.b;
import z3.a;
import z3.h.a;

public abstract class c
  implements h
{
  public final ArrayDeque<a> a = new ArrayDeque();
  public final ArrayDeque<l> b;
  public final PriorityQueue<a> c;
  public a d;
  public long e;
  public long f;
  
  public c()
  {
    int i = 0;
    for (int j = 0; j < 10; j++) {
      a.add(new a());
    }
    b = new ArrayDeque();
    for (j = i; j < 2; j++) {
      b.add(new b(new io.flutter.plugins.firebase.auth.g(this, 10)));
    }
    c = new PriorityQueue();
  }
  
  public final void a(long paramLong)
  {
    e = paramLong;
  }
  
  public final Object c()
  {
    boolean bool;
    if (d == null) {
      bool = true;
    } else {
      bool = false;
    }
    b.H(bool);
    a locala;
    if (a.isEmpty())
    {
      locala = null;
    }
    else
    {
      locala = (a)a.pollFirst();
      d = locala;
    }
    return locala;
  }
  
  public final void d(k paramk)
  {
    boolean bool;
    if (paramk == d) {
      bool = true;
    } else {
      bool = false;
    }
    b.q(bool);
    paramk = (a)paramk;
    if (paramk.n())
    {
      paramk.o();
      a.add(paramk);
    }
    else
    {
      long l = f;
      f = (1L + l);
      r = l;
      c.add(paramk);
    }
    d = null;
  }
  
  public abstract d e();
  
  public abstract void f(a parama);
  
  public void flush()
  {
    f = 0L;
    e = 0L;
    while (!c.isEmpty())
    {
      locala = (a)c.poll();
      int i = e0.a;
      locala.o();
      a.add(locala);
    }
    a locala = d;
    if (locala != null)
    {
      locala.o();
      a.add(locala);
      d = null;
    }
  }
  
  public l g()
  {
    if (b.isEmpty()) {
      return null;
    }
    while (!c.isEmpty())
    {
      Object localObject = (a)c.peek();
      int i = e0.a;
      if (e > e) {
        break;
      }
      a locala = (a)c.poll();
      if (locala.m(4))
      {
        localObject = (l)b.pollFirst();
        ((a)localObject).l(4);
      }
      for (;;)
      {
        locala.o();
        a.add(locala);
        return (l)localObject;
        f(locala);
        if (!h()) {
          break;
        }
        d locald = e();
        localObject = (l)b.pollFirst();
        ((l)localObject).p(e, locald, Long.MAX_VALUE);
      }
      locala.o();
      a.add(locala);
    }
    return null;
  }
  
  public abstract boolean h();
  
  public void release() {}
  
  public static final class a
    extends k
    implements Comparable<a>
  {
    public long r;
    
    public final int compareTo(Object paramObject)
    {
      paramObject = (a)paramObject;
      boolean bool1 = m(4);
      boolean bool2 = ((a)paramObject).m(4);
      int i = 1;
      if (bool1 != bool2)
      {
        if (m(4)) {}
      }
      else
      {
        long l2;
        do
        {
          i = -1;
          break;
          long l1 = e - e;
          l2 = l1;
          if (l1 == 0L)
          {
            l1 = r - r;
            l2 = l1;
            if (l1 == 0L)
            {
              i = 0;
              break;
            }
          }
        } while (l2 <= 0L);
      }
      return i;
    }
  }
  
  public static final class b
    extends l
  {
    public h.a<b> e;
    
    public b(io.flutter.plugins.firebase.auth.g paramg)
    {
      e = paramg;
    }
    
    public final void o()
    {
      c localc = (c)e).b;
      localc.getClass();
      a = 0;
      c = null;
      b.add(this);
    }
  }
}

/* Location:
 * Qualified Name:     i5.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */