package H3;

import E3.f;

public class q$f
  implements Runnable
{
  public q$f(q paramq, long paramLong, Throwable paramThrowable, Thread paramThread) {}
  
  public void run()
  {
    if (!r.L())
    {
      long l = q.b(o);
      String str = q.c(r);
      if (str == null)
      {
        f.f().k("Tried to write a non-fatal exception while no session was open.");
        return;
      }
      q.h(r).t(p, q, str, l);
    }
  }
}

/* Location:
 * Qualified Name:     H3.q.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */