package w5;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import o4.j;
import o4.j.c;
import o4.m;
import v3.n;
import v5.e0;
import z3.e;

public final class g$c
  implements j.c, Handler.Callback
{
  public final Handler a;
  
  public g$c(g paramg, j paramj)
  {
    paramg = e0.l(this);
    a = paramg;
    paramj.g(this, paramg);
  }
  
  public final void a(long paramLong)
  {
    g localg = b;
    if ((this == s1) && (O != null)) {
      if (paramLong == Long.MAX_VALUE) {
        D0 = true;
      } else {
        try
        {
          localg.z0(paramLong);
          localg.I0();
          e locale = F0;
          e += 1;
          localg.H0();
          localg.i0(paramLong);
        }
        catch (n localn)
        {
          b.E0 = localn;
        }
      }
    }
  }
  
  public final void b(long paramLong)
  {
    if (e0.a < 30)
    {
      Message localMessage = Message.obtain(a, 0, (int)(paramLong >> 32), (int)paramLong);
      a.sendMessageAtFrontOfQueue(localMessage);
    }
    else
    {
      a(paramLong);
    }
  }
  
  public final boolean handleMessage(Message paramMessage)
  {
    if (what != 0) {
      return false;
    }
    int i = arg1;
    int j = arg2;
    int k = e0.a;
    a((i & 0xFFFFFFFF) << 32 | 0xFFFFFFFF & j);
    return true;
  }
}

/* Location:
 * Qualified Name:     w5.g.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */