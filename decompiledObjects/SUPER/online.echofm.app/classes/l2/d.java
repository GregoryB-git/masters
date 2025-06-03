package l2;

import U5.a;
import g2.e;
import java.util.concurrent.Executor;
import m2.x;

public final class d
  implements h2.b
{
  public final a a;
  public final a b;
  public final a c;
  public final a d;
  public final a e;
  
  public d(a parama1, a parama2, a parama3, a parama4, a parama5)
  {
    a = parama1;
    b = parama2;
    c = parama3;
    d = parama4;
    e = parama5;
  }
  
  public static d a(a parama1, a parama2, a parama3, a parama4, a parama5)
  {
    return new d(parama1, parama2, parama3, parama4, parama5);
  }
  
  public static c c(Executor paramExecutor, e parame, x paramx, n2.d paramd, o2.b paramb)
  {
    return new c(paramExecutor, parame, paramx, paramd, paramb);
  }
  
  public c b()
  {
    return c((Executor)a.get(), (e)b.get(), (x)c.get(), (n2.d)d.get(), (o2.b)e.get());
  }
}

/* Location:
 * Qualified Name:     l2.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */