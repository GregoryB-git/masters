package R2;

import b3.b;

public final class Q3
  implements b
{
  public Q3(C3 paramC3, v5 paramv5) {}
  
  public final void a(Object paramObject)
  {
    b.n();
    C3.N(b, false);
    b.r0();
    b.j().F().b("registerTriggerAsync ran. uri", a.o);
  }
  
  public final void onFailure(Throwable paramThrowable)
  {
    b.n();
    C3.N(b, false);
    b.r0();
    b.j().G().b("registerTriggerAsync failed with throwable", paramThrowable);
  }
}

/* Location:
 * Qualified Name:     R2.Q3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */