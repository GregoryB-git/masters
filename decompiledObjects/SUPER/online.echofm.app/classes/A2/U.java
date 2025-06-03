package A2;

import M2.e;
import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;
import x2.b;

public final class U
  extends e
{
  public U(c paramc, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public static final void a(Message paramMessage)
  {
    paramMessage = (V)obj;
    paramMessage.b();
    paramMessage.e();
  }
  
  public static final boolean b(Message paramMessage)
  {
    int i = what;
    return (i == 2) || (i == 1) || (i == 7);
  }
  
  public final void handleMessage(Message paramMessage)
  {
    if (a.C.get() != arg1)
    {
      if (b(paramMessage)) {
        a(paramMessage);
      }
      return;
    }
    int i = what;
    if (((i != 1) && (i != 7) && ((i != 4) || (a.t())) && (what != 5)) || (a.i()))
    {
      i = what;
      Object localObject1 = null;
      if (i == 4)
      {
        c.Z(a, new b(arg2));
        if (c.h0(a))
        {
          paramMessage = a;
          if (!c.f0(paramMessage))
          {
            c.b0(paramMessage, 3, null);
            return;
          }
        }
        paramMessage = a;
        if (c.T(paramMessage) != null) {
          paramMessage = c.T(paramMessage);
        } else {
          paramMessage = new b(8);
        }
        a.p.b(paramMessage);
        a.L(paramMessage);
        return;
      }
      if (i == 5)
      {
        paramMessage = a;
        if (c.T(paramMessage) != null) {
          paramMessage = c.T(paramMessage);
        } else {
          paramMessage = new b(8);
        }
        a.p.b(paramMessage);
        a.L(paramMessage);
        return;
      }
      if (i == 3)
      {
        Object localObject2 = obj;
        if ((localObject2 instanceof PendingIntent)) {
          localObject1 = (PendingIntent)localObject2;
        }
        paramMessage = new b(arg2, (PendingIntent)localObject1);
        a.p.b(paramMessage);
        a.L(paramMessage);
        return;
      }
      if (i == 6)
      {
        c.b0(a, 5, null);
        localObject1 = a;
        if (c.U((c)localObject1) != null) {
          c.U((c)localObject1).n(arg2);
        }
        a.M(arg2);
        c.g0(a, 5, 1, null);
        return;
      }
      if ((i == 2) && (!a.a()))
      {
        a(paramMessage);
        return;
      }
      if (b(paramMessage))
      {
        ((V)obj).c();
        return;
      }
      i = what;
      paramMessage = new StringBuilder();
      paramMessage.append("Don't know how to handle message: ");
      paramMessage.append(i);
      localObject1 = new Exception();
      Log.wtf("GmsClient", paramMessage.toString(), (Throwable)localObject1);
      return;
    }
    a(paramMessage);
  }
}

/* Location:
 * Qualified Name:     A2.U
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */