package com.google.android.gms.internal.measurement;

import E2.e;

public abstract class J0$a
  implements Runnable
{
  public final long o;
  public final long p;
  public final boolean q;
  
  public J0$a(J0 paramJ0)
  {
    this(paramJ0, true);
  }
  
  public J0$a(J0 paramJ0, boolean paramBoolean)
  {
    o = b.a();
    p = b.b();
    q = paramBoolean;
  }
  
  public abstract void a();
  
  public void b() {}
  
  public void run()
  {
    if (J0.I(r))
    {
      b();
      return;
    }
    try
    {
      a();
      return;
    }
    catch (Exception localException)
    {
      J0.q(r, localException, false, q);
      b();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.J0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */