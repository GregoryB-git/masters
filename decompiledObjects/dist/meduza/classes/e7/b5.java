package e7;

import d2.q;
import m6.j;
import n6.a;

public final class b5
  implements Runnable
{
  public final void run()
  {
    Object localObject = d;
    n0 localn0 = e;
    if (localn0 == null)
    {
      zzjo.b("Discarding data. Failed to set user property");
      return;
    }
    j.i(a);
    w4 localw4 = d;
    if (b) {
      localObject = null;
    } else {
      localObject = c;
    }
    localw4.w(localn0, (a)localObject, a);
    d.H();
  }
}

/* Location:
 * Qualified Name:     e7.b5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */