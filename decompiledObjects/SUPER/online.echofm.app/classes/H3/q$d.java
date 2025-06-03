package H3;

import E3.f;
import O3.d;
import V2.i;
import V2.j;
import V2.k;
import V2.m;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public class q$d
  implements i
{
  public q$d(q paramq, j paramj) {}
  
  public j b(final Boolean paramBoolean)
  {
    return q.m(b).i(new a(paramBoolean));
  }
  
  public class a
    implements Callable
  {
    public a(Boolean paramBoolean) {}
    
    public j a()
    {
      if (!paramBoolean.booleanValue())
      {
        f.f().i("Deleting cached crash reports...");
        q.d(b.N());
        q.h(b).v();
        b.r.e(null);
        return m.e(null);
      }
      f.f().b("Sending cached crash reports...");
      boolean bool = paramBoolean.booleanValue();
      q.l(b).c(bool);
      final Executor localExecutor = q.m(b).c();
      return a.p(localExecutor, new a(localExecutor));
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
          q.n(b);
          q.h(b).w(localExecutor);
          b.r.e(null);
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     H3.q.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */