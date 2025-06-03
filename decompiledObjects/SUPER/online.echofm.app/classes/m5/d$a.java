package m5;

import android.os.Handler;
import d0.D;

public class d$a
  implements Runnable
{
  public d$a(d paramd) {}
  
  public void run()
  {
    if (d.Z(o) == null) {
      return;
    }
    if (d.Z(o).t() != d.a0(o)) {
      d.b0(o);
    }
    int i = d.Z(o).f();
    Handler localHandler;
    long l;
    if (i != 2)
    {
      if (i != 3) {
        return;
      }
      if (d.Z(o).u())
      {
        localHandler = d.c0(o);
        l = 500L;
      }
    }
    for (;;)
    {
      localHandler.postDelayed(this, l);
      break;
      localHandler = d.c0(o);
      l = 1000L;
      continue;
      localHandler = d.c0(o);
      l = 200L;
    }
  }
}

/* Location:
 * Qualified Name:     m5.d.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */