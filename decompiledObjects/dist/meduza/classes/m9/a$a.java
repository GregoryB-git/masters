package m9;

import p2.m0;

public final class a$a
{
  public final long a;
  
  public a$a(a parama, long paramLong)
  {
    a = paramLong;
  }
  
  public final void a(Runnable paramRunnable)
  {
    b.f.d();
    a locala = b;
    if (j == a) {
      paramRunnable.run();
    } else {
      m0.y(1, locala.getClass().getSimpleName(), "stream callback skipped by CloseGuardedRunner.", new Object[0]);
    }
  }
}

/* Location:
 * Qualified Name:     m9.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */