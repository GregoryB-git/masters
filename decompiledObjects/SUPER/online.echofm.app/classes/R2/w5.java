package R2;

import A2.n;
import E2.e;

public final class w5
{
  public final e a;
  public long b;
  
  public w5(e parame)
  {
    n.i(parame);
    a = parame;
  }
  
  public final void a()
  {
    b = 0L;
  }
  
  public final boolean b(long paramLong)
  {
    if (b == 0L) {
      return true;
    }
    return a.b() - b >= 3600000L;
  }
  
  public final void c()
  {
    b = a.b();
  }
}

/* Location:
 * Qualified Name:     R2.w5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */