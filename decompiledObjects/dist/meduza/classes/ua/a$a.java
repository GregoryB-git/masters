package ua;

import android.os.Handler;
import v3.d0;

public final class a$a
  implements Runnable
{
  public a$a(a parama) {}
  
  public final void run()
  {
    Object localObject = a.I;
    if (localObject == null) {
      return;
    }
    long l = ((d0)localObject).z();
    localObject = a;
    if (l != o) {
      ((a)localObject).E();
    }
    int i = a.I.d();
    if (i != 2)
    {
      if (i != 3) {
        return;
      }
      if (a.I.k())
      {
        localObject = a.M;
        l = 500L;
      }
      else
      {
        localObject = a.M;
        l = 1000L;
      }
    }
    else
    {
      localObject = a.M;
      l = 200L;
    }
    ((Handler)localObject).postDelayed(this, l);
  }
}

/* Location:
 * Qualified Name:     ua.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */