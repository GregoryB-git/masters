package p0;

import android.os.Handler;
import d0.q;
import g0.M;
import g0.a;

public class h$f
  implements x.b
{
  public final v.a b;
  public n c;
  public boolean d;
  
  public h$f(h paramh, v.a parama)
  {
    b = parama;
  }
  
  public void c(q paramq)
  {
    ((Handler)a.e(h.p(e))).post(new i(this, paramq));
  }
  
  public void release()
  {
    M.S0((Handler)a.e(h.p(e)), new j(this));
  }
}

/* Location:
 * Qualified Name:     p0.h.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */