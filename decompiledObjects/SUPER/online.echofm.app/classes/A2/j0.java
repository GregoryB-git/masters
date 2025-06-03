package A2;

import D2.b;
import M2.e;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;

public final class j0
  extends h
{
  public final HashMap f = new HashMap();
  public final Context g;
  public volatile Handler h;
  public final i0 i;
  public final b j;
  public final long k;
  public final long l;
  
  public j0(Context paramContext, Looper paramLooper)
  {
    i0 locali0 = new i0(this, null);
    i = locali0;
    g = paramContext.getApplicationContext();
    h = new e(paramLooper, locali0);
    j = b.b();
    k = 5000L;
    l = 300000L;
  }
  
  public final void d(e0 parame0, ServiceConnection paramServiceConnection, String paramString)
  {
    n.j(paramServiceConnection, "ServiceConnection must not be null");
    synchronized (f)
    {
      g0 localg0 = (g0)f.get(parame0);
      if (localg0 == null) {
        break label132;
      }
      if (!localg0.h(paramServiceConnection)) {
        break label92;
      }
      localg0.f(paramServiceConnection, paramString);
      if (localg0.i())
      {
        parame0 = h.obtainMessage(0, parame0);
        h.sendMessageDelayed(parame0, k);
      }
    }
    return;
    label92:
    paramServiceConnection = new java/lang/IllegalStateException;
    paramString = parame0.toString();
    parame0 = new java/lang/StringBuilder;
    parame0.<init>();
    parame0.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
    parame0.append(paramString);
    paramServiceConnection.<init>(parame0.toString());
    throw paramServiceConnection;
    label132:
    paramServiceConnection = new java/lang/IllegalStateException;
    paramString = parame0.toString();
    parame0 = new java/lang/StringBuilder;
    parame0.<init>();
    parame0.append("Nonexistent connection status for service config: ");
    parame0.append(paramString);
    paramServiceConnection.<init>(parame0.toString());
    throw paramServiceConnection;
  }
  
  public final boolean f(e0 parame0, ServiceConnection paramServiceConnection, String paramString, Executor paramExecutor)
  {
    n.j(paramServiceConnection, "ServiceConnection must not be null");
    g0 localg0;
    synchronized (f)
    {
      localg0 = (g0)f.get(parame0);
      if (localg0 == null)
      {
        localg0 = new A2/g0;
        localg0.<init>(this, parame0);
        localg0.d(paramServiceConnection, paramServiceConnection, paramString);
        localg0.e(paramString, paramExecutor);
        f.put(parame0, localg0);
        parame0 = localg0;
      }
    }
    h.removeMessages(0, parame0);
    if (!localg0.h(paramServiceConnection))
    {
      localg0.d(paramServiceConnection, paramServiceConnection, paramString);
      int m = localg0.a();
      if (m != 1)
      {
        if (m != 2)
        {
          parame0 = localg0;
        }
        else
        {
          localg0.e(paramString, paramExecutor);
          parame0 = localg0;
        }
      }
      else
      {
        paramServiceConnection.onServiceConnected(localg0.b(), localg0.c());
        parame0 = localg0;
      }
      boolean bool = parame0.j();
      return bool;
    }
    paramServiceConnection = new java/lang/IllegalStateException;
    parame0 = parame0.toString();
    paramString = new java/lang/StringBuilder;
    paramString.<init>();
    paramString.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
    paramString.append(parame0);
    paramServiceConnection.<init>(paramString.toString());
    throw paramServiceConnection;
  }
}

/* Location:
 * Qualified Name:     A2.j0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */