package i9;

import b.m;
import n9.a;
import n9.a.a;
import n9.a.c;

public final class q$a
  implements k1
{
  public final a a;
  public final n b;
  public boolean c = false;
  public a.a d;
  
  public q$a(q paramq, a parama, n paramn)
  {
    a = parama;
    b = paramn;
  }
  
  public final void start()
  {
    if (e.b.a != -1L)
    {
      long l;
      if (c) {
        l = q.d;
      } else {
        l = q.c;
      }
      d = a.b(a.c.o, l, new m(this, 16));
    }
  }
  
  public final void stop()
  {
    a.a locala = d;
    if (locala != null) {
      locala.a();
    }
  }
}

/* Location:
 * Qualified Name:     i9.q.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */