package w6;

import X5.g;
import p6.g0;

public abstract class f
  extends g0
{
  public final int r;
  public final int s;
  public final long t;
  public final String u;
  public a v;
  
  public f(int paramInt1, int paramInt2, long paramLong, String paramString)
  {
    r = paramInt1;
    s = paramInt2;
    t = paramLong;
    u = paramString;
    v = H();
  }
  
  public void E(g paramg, Runnable paramRunnable)
  {
    a.k(v, paramRunnable, null, false, 6, null);
  }
  
  public final a H()
  {
    return new a(r, s, t, u);
  }
  
  public final void I(Runnable paramRunnable, i parami, boolean paramBoolean)
  {
    v.i(paramRunnable, parami, paramBoolean);
  }
}

/* Location:
 * Qualified Name:     w6.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */