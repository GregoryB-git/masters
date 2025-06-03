package p6;

import u6.F;
import u6.K;

public final class L0
{
  public static final L0 a = new L0();
  public static final ThreadLocal b = K.a(new F("ThreadLocalEventLoop"));
  
  public final a0 a()
  {
    return (a0)b.get();
  }
  
  public final a0 b()
  {
    ThreadLocal localThreadLocal = b;
    a0 locala01 = (a0)localThreadLocal.get();
    a0 locala02 = locala01;
    if (locala01 == null)
    {
      locala02 = d0.a();
      localThreadLocal.set(locala02);
    }
    return locala02;
  }
  
  public final void c()
  {
    b.set(null);
  }
  
  public final void d(a0 parama0)
  {
    b.set(parama0);
  }
}

/* Location:
 * Qualified Name:     p6.L0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */