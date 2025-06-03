package q2;

import ec.i;
import java.util.LinkedHashMap;
import java.util.Map;
import o2.n;
import p2.c;
import p2.h0;
import p2.i0;
import p2.x;
import x0.q0;

public final class d
{
  public final n a;
  public final h0 b;
  public final long c;
  public final Object d;
  public final LinkedHashMap e;
  
  public d(c paramc, i0 parami0)
  {
    a = paramc;
    b = parami0;
    c = l;
    d = new Object();
    e = new LinkedHashMap();
  }
  
  public final void a(x paramx)
  {
    i.e(paramx, "token");
    synchronized (d)
    {
      paramx = (Runnable)e.remove(paramx);
      if (paramx != null) {
        a.b(paramx);
      }
      return;
    }
  }
  
  public final void b(x paramx)
  {
    q0 localq0 = new q0(4, this, paramx);
    synchronized (d)
    {
      paramx = (Runnable)e.put(paramx, localq0);
      a.a(localq0, c);
      return;
    }
  }
}

/* Location:
 * Qualified Name:     q2.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */