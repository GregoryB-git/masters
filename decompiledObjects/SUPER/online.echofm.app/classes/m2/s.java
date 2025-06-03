package m2;

import android.content.Context;
import g2.e;
import java.util.concurrent.Executor;
import n2.c;
import n2.d;

public final class s
  implements h2.b
{
  public final U5.a a;
  public final U5.a b;
  public final U5.a c;
  public final U5.a d;
  public final U5.a e;
  public final U5.a f;
  public final U5.a g;
  public final U5.a h;
  public final U5.a i;
  
  public s(U5.a parama1, U5.a parama2, U5.a parama3, U5.a parama4, U5.a parama5, U5.a parama6, U5.a parama7, U5.a parama8, U5.a parama9)
  {
    a = parama1;
    b = parama2;
    c = parama3;
    d = parama4;
    e = parama5;
    f = parama6;
    g = parama7;
    h = parama8;
    i = parama9;
  }
  
  public static s a(U5.a parama1, U5.a parama2, U5.a parama3, U5.a parama4, U5.a parama5, U5.a parama6, U5.a parama7, U5.a parama8, U5.a parama9)
  {
    return new s(parama1, parama2, parama3, parama4, parama5, parama6, parama7, parama8, parama9);
  }
  
  public static r c(Context paramContext, e parame, d paramd, x paramx, Executor paramExecutor, o2.b paramb, p2.a parama1, p2.a parama2, c paramc)
  {
    return new r(paramContext, parame, paramd, paramx, paramExecutor, paramb, parama1, parama2, paramc);
  }
  
  public r b()
  {
    return c((Context)a.get(), (e)b.get(), (d)c.get(), (x)d.get(), (Executor)e.get(), (o2.b)f.get(), (p2.a)g.get(), (p2.a)h.get(), (c)i.get());
  }
}

/* Location:
 * Qualified Name:     m2.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */