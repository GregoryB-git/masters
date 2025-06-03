package y2;

import java.util.HashMap;
import o2.j;
import x2.l;

public final class b0$b
  implements Runnable
{
  public final b0 a;
  public final l b;
  
  public b0$b(b0 paramb0, l paraml)
  {
    a = paramb0;
    b = paraml;
  }
  
  public final void run()
  {
    synchronized (a.d)
    {
      if ((b)a.b.remove(b) != null)
      {
        b0.a locala = (b0.a)a.c.remove(b);
        if (locala != null) {
          locala.a(b);
        }
      }
      else
      {
        j.d().a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", new Object[] { b }));
      }
      return;
    }
  }
}

/* Location:
 * Qualified Name:     y2.b0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */