package p0;

import android.os.Handler;
import android.os.SystemClock;
import g0.a;
import java.util.List;
import java.util.Set;

public class h$h
  implements g.b
{
  public h$h(h paramh) {}
  
  public void a(g paramg, int paramInt)
  {
    if (h.n(a) != -9223372036854775807L)
    {
      h.o(a).remove(paramg);
      ((Handler)a.e(h.p(a))).removeCallbacksAndMessages(paramg);
    }
  }
  
  public void b(g paramg, int paramInt)
  {
    if ((paramInt == 1) && (h.q(a) > 0) && (h.n(a) != -9223372036854775807L))
    {
      h.o(a).add(paramg);
      ((Handler)a.e(h.p(a))).postAtTime(new k(paramg), paramg, SystemClock.uptimeMillis() + h.n(a));
    }
    else if (paramInt == 0)
    {
      h.m(a).remove(paramg);
      if (h.r(a) == paramg) {
        h.s(a, null);
      }
      if (h.e(a) == paramg) {
        h.f(a, null);
      }
      h.h(a).d(paramg);
      if (h.n(a) != -9223372036854775807L)
      {
        ((Handler)a.e(h.p(a))).removeCallbacksAndMessages(paramg);
        h.o(a).remove(paramg);
      }
    }
    h.i(a);
  }
}

/* Location:
 * Qualified Name:     p0.h.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */