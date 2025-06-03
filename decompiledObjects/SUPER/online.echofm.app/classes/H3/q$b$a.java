package H3;

import E3.f;
import O3.d;
import V2.i;
import V2.j;
import V2.m;
import java.util.concurrent.Executor;

public class q$b$a
  implements i
{
  public q$b$a(q.b paramb, Executor paramExecutor, String paramString) {}
  
  public j b(d paramd)
  {
    Object localObject = null;
    if (paramd == null)
    {
      f.f().k("Received null app settings, cannot send reports at crash time.");
      return m.e(null);
    }
    j localj = q.n(c.t);
    V localV = q.h(c.t);
    Executor localExecutor = a;
    paramd = (d)localObject;
    if (c.s) {
      paramd = b;
    }
    return m.g(new j[] { localj, localV.x(localExecutor, paramd) });
  }
}

/* Location:
 * Qualified Name:     H3.q.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */