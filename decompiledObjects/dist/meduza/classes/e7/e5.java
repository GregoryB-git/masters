package e7;

import d2.q;
import m6.j;
import n6.a;

public final class e5
  implements Runnable
{
  public e5(w4 paramw4, k6 paramk6, boolean paramBoolean, f0 paramf0, String paramString) {}
  
  public final void run()
  {
    Object localObject = d;
    n0 localn0 = e;
    if (localn0 == null)
    {
      zzjo.b("Discarding data. Failed to send event to service");
      return;
    }
    localObject = null;
    j.i(a);
    w4 localw4 = d;
    if (!b) {
      localObject = c;
    }
    localw4.w(localn0, (a)localObject, a);
    d.H();
  }
}

/* Location:
 * Qualified Name:     e7.e5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */