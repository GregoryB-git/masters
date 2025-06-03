package p3;

import java.util.concurrent.Executor;
import java.util.logging.Logger;
import k3.h;
import k3.w;
import l3.e;
import q3.n;
import s3.b;

public final class c
  implements d
{
  public static final Logger f = Logger.getLogger(w.class.getName());
  public final n a;
  public final Executor b;
  public final e c;
  public final r3.d d;
  public final b e;
  
  public c(Executor paramExecutor, e parame, n paramn, r3.d paramd, b paramb)
  {
    b = paramExecutor;
    c = parame;
    a = paramn;
    d = paramd;
    e = paramb;
  }
  
  public final void a(h3.j paramj, h paramh, k3.j paramj1)
  {
    b.execute(new a(this, paramj1, paramj, paramh, 0));
  }
}

/* Location:
 * Qualified Name:     p3.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */