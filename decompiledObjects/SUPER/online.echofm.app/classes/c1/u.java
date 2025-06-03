package c1;

import F0.L;
import F0.r;
import F0.s;
import F0.t;

public class u
  implements r
{
  public final r a;
  public final t.a b;
  public v c;
  
  public u(r paramr, t.a parama)
  {
    a = paramr;
    b = parama;
  }
  
  public void a(long paramLong1, long paramLong2)
  {
    v localv = c;
    if (localv != null) {
      localv.b();
    }
    a.a(paramLong1, paramLong2);
  }
  
  public void b(t paramt)
  {
    paramt = new v(paramt, b);
    c = paramt;
    a.b(paramt);
  }
  
  public r d()
  {
    return a;
  }
  
  public boolean e(s params)
  {
    return a.e(params);
  }
  
  public int i(s params, L paramL)
  {
    return a.i(params, paramL);
  }
  
  public void release()
  {
    a.release();
  }
}

/* Location:
 * Qualified Name:     c1.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */