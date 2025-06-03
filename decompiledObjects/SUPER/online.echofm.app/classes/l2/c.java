package l2;

import c2.h;
import f2.i;
import f2.p;
import f2.u;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import m2.x;
import n2.d;
import o2.b;

public class c
  implements e
{
  public static final Logger f = Logger.getLogger(u.class.getName());
  public final x a;
  public final Executor b;
  public final g2.e c;
  public final d d;
  public final b e;
  
  public c(Executor paramExecutor, g2.e parame, x paramx, d paramd, b paramb)
  {
    b = paramExecutor;
    c = parame;
    a = paramx;
    d = paramd;
    e = paramb;
  }
  
  public void a(p paramp, i parami, h paramh)
  {
    b.execute(new a(this, paramp, paramh, parami));
  }
}

/* Location:
 * Qualified Name:     l2.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */