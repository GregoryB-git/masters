package p0;

import B0.m;
import B0.m.c;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import g0.o;
import java.io.IOException;
import x0.r;
import x0.u;

public class g$c
  extends Handler
{
  public boolean a;
  
  public g$c(g paramg, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public final boolean a(Message paramMessage, S paramS)
  {
    g.d locald = (g.d)obj;
    if (!b) {
      return false;
    }
    int i = e + 1;
    e = i;
    if (i > g.o(b).d(3)) {
      return false;
    }
    r localr = new r(a, o, p, q, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - c, r);
    u localu = new u(3);
    if ((paramS.getCause() instanceof IOException)) {
      paramS = (IOException)paramS.getCause();
    } else {
      paramS = new g.f(paramS.getCause());
    }
    long l = g.o(b).c(new m.c(localr, localu, paramS, e));
    if (l == -9223372036854775807L) {
      return false;
    }
    label207:
    try
    {
      if (!a)
      {
        sendMessageDelayed(Message.obtain(paramMessage), l);
        return true;
      }
    }
    finally
    {
      break label207;
      return false;
    }
  }
  
  public void b(int paramInt, Object paramObject, boolean paramBoolean)
  {
    obtainMessage(paramInt, new g.d(r.a(), paramBoolean, SystemClock.elapsedRealtime(), paramObject)).sendToTarget();
  }
  
  public void c()
  {
    try
    {
      removeCallbacksAndMessages(null);
      a = true;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void handleMessage(Message paramMessage)
  {
    g.d locald = (g.d)obj;
    try
    {
      int i = what;
      if (i == 1) {
        break label77;
      }
      if (i == 2) {
        byte[] arrayOfByte = g.n(b).b(g.m(b), (F.a)d);
      }
    }
    catch (Exception localException)
    {
      break label108;
    }
    catch (S localS)
    {
      break label120;
    }
    Object localObject = new java/lang/RuntimeException;
    ((RuntimeException)localObject).<init>();
    throw ((Throwable)localObject);
    label77:
    localObject = g.n(b).a(g.m(b), (F.d)d);
    break label135;
    label108:
    o.i("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", (Throwable)localObject);
    break label135;
    label120:
    localObject = localS;
    if (a(paramMessage, localS)) {
      return;
    }
    label135:
    g.o(b).a(a);
    try
    {
      if (!a) {
        g.p(b).obtainMessage(what, Pair.create(d, localObject)).sendToTarget();
      }
    }
    finally
    {
      break label196;
    }
    return;
    label196:
    throw paramMessage;
  }
}

/* Location:
 * Qualified Name:     p0.g.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */