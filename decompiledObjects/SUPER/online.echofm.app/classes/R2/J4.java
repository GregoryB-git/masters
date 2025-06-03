package R2;

import A2.n;

public final class J4
  implements Runnable
{
  public J4(D4 paramD4, W5 paramW5, boolean paramBoolean, R5 paramR5) {}
  
  public final void run()
  {
    R1 localR1 = D4.B(r);
    if (localR1 == null)
    {
      r.j().G().a("Discarding data. Failed to set user property");
      return;
    }
    n.i(o);
    D4 localD4 = r;
    R5 localR5;
    if (p) {
      localR5 = null;
    } else {
      localR5 = q;
    }
    localD4.F(localR1, localR5, o);
    D4.m0(r);
  }
}

/* Location:
 * Qualified Name:     R2.J4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */