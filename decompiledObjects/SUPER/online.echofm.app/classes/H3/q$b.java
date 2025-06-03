package H3;

import E3.f;
import O3.d;
import V2.j;
import V2.m;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public class q$b
  implements Callable
{
  public q$b(q paramq, long paramLong, Throwable paramThrowable, Thread paramThread, O3.i parami, boolean paramBoolean) {}
  
  public j a()
  {
    long l = q.b(o);
    final String str = q.c(t);
    if (str == null)
    {
      f.f().d("Tried to write a fatal exception while no session was open.");
      return m.e(null);
    }
    q.g(t).a();
    q.h(t).s(p, q, str, l);
    q.i(t, o);
    t.v(r);
    q.k(t, new h(q.j(t)).toString(), Boolean.valueOf(s));
    if (!q.l(t).d()) {
      return m.e(null);
    }
    final Executor localExecutor = q.m(t).c();
    return r.a().p(localExecutor, new a(localExecutor, str));
  }
  
  public class a
    implements V2.i
  {
    public a(Executor paramExecutor, String paramString) {}
    
    public j b(d paramd)
    {
      Object localObject = null;
      if (paramd == null)
      {
        f.f().k("Received null app settings, cannot send reports at crash time.");
        return m.e(null);
      }
      j localj = q.n(t);
      V localV = q.h(t);
      Executor localExecutor = localExecutor;
      paramd = (d)localObject;
      if (s) {
        paramd = str;
      }
      return m.g(new j[] { localj, localV.x(localExecutor, paramd) });
    }
  }
}

/* Location:
 * Qualified Name:     H3.q.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */