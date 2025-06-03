package u5;

import java.util.TreeSet;
import q5.i;

public final class n
  implements d
{
  public final long a;
  public final TreeSet<g> b;
  public long c;
  
  public n(long paramLong)
  {
    a = paramLong;
    b = new TreeSet(new i(2));
  }
  
  public final void a(g paramg)
  {
    b.remove(paramg);
    c -= c;
  }
  
  public final void b(a parama, long paramLong)
  {
    if (paramLong != -1L) {
      f(parama, paramLong);
    }
  }
  
  public final void c() {}
  
  public final void d(a parama, g paramg)
  {
    b.add(paramg);
    c += c;
    f(parama, 0L);
  }
  
  public final void e(a parama, g paramg, r paramr)
  {
    a(paramg);
    d(parama, paramr);
  }
  
  public final void f(a parama, long paramLong)
  {
    while ((c + paramLong > a) && (!b.isEmpty())) {
      parama.g((g)b.first());
    }
  }
}

/* Location:
 * Qualified Name:     u5.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */