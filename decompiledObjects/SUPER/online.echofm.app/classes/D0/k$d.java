package D0;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import g0.M;
import k0.u;
import t0.m;
import t0.m.d;

public final class k$d
  implements m.d, Handler.Callback
{
  public final Handler o;
  
  public k$d(k paramk, m paramm)
  {
    paramk = M.B(this);
    o = paramk;
    paramm.o(this, paramk);
  }
  
  public void a(m paramm, long paramLong1, long paramLong2)
  {
    if (M.a < 30)
    {
      paramm = Message.obtain(o, 0, (int)(paramLong1 >> 32), (int)paramLong1);
      o.sendMessageAtFrontOfQueue(paramm);
    }
    else
    {
      b(paramLong1);
    }
  }
  
  public final void b(long paramLong)
  {
    k localk = p;
    if ((this == A1) && (k.S1(localk) != null)) {
      if (paramLong == Long.MAX_VALUE) {
        k.T1(p);
      } else {
        try
        {
          p.v2(paramLong);
        }
        catch (u localu)
        {
          k.U1(p, localu);
        }
      }
    }
  }
  
  public boolean handleMessage(Message paramMessage)
  {
    if (what != 0) {
      return false;
    }
    b(M.g1(arg1, arg2));
    return true;
  }
}

/* Location:
 * Qualified Name:     D0.k.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */