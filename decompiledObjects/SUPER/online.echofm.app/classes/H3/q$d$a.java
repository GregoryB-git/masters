package H3;

import E3.f;
import O3.d;
import V2.i;
import V2.j;
import V2.k;
import V2.m;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public class q$d$a
  implements Callable
{
  public q$d$a(q.d paramd, Boolean paramBoolean) {}
  
  public j a()
  {
    if (!o.booleanValue())
    {
      f.f().i("Deleting cached crash reports...");
      q.d(p.b.N());
      q.h(p.b).v();
      p.b.r.e(null);
      return m.e(null);
    }
    f.f().b("Sending cached crash reports...");
    boolean bool = o.booleanValue();
    q.l(p.b).c(bool);
    final Executor localExecutor = q.m(p.b).c();
    return p.a.p(localExecutor, new a(localExecutor));
  }
  
  public class a
    implements i
  {
    public a(Executor paramExecutor) {}
    
    public j b(d paramd)
    {
      if (paramd == null) {
        f.f().k("Received null app settings at app startup. Cannot send cached reports");
      }
      for (;;)
      {
        return m.e(null);
        q.n(p.b);
        q.h(p.b).w(localExecutor);
        p.b.r.e(null);
      }
    }
  }
}

/* Location:
 * Qualified Name:     H3.q.d.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */