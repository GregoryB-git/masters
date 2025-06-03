package m6;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.common.zzh;
import j6.b;
import java.util.HashMap;
import java.util.concurrent.Executor;
import u6.a;

public final class s0
  extends c
{
  public final HashMap d = new HashMap();
  public final Context e;
  public volatile zzh f;
  public final a g;
  public final long h;
  public final long i;
  public volatile Executor j;
  
  public s0(Context paramContext, Looper paramLooper)
  {
    r0 localr0 = new r0(this);
    e = paramContext.getApplicationContext();
    f = new zzh(paramLooper, localr0);
    g = a.b();
    h = 5000L;
    i = 300000L;
    j = null;
  }
  
  public final b b(p0 paramp0, ServiceConnection paramServiceConnection, String paramString, Executor paramExecutor)
  {
    q0 localq0;
    Executor localExecutor;
    synchronized (d)
    {
      localq0 = (q0)d.get(paramp0);
      localExecutor = paramExecutor;
      if (paramExecutor == null) {
        localExecutor = j;
      }
      paramExecutor = null;
      if (localq0 == null)
      {
        paramExecutor = new m6/q0;
        paramExecutor.<init>(this, paramp0);
        a.put(paramServiceConnection, paramServiceConnection);
        paramString = q0.a(paramExecutor, paramString, localExecutor);
        d.put(paramp0, paramExecutor);
        paramServiceConnection = paramExecutor;
        paramp0 = paramString;
      }
    }
    f.removeMessages(0, paramp0);
    if (!a.containsKey(paramServiceConnection))
    {
      a.put(paramServiceConnection, paramServiceConnection);
      int k = b;
      if (k != 1)
      {
        if (k != 2)
        {
          paramServiceConnection = localq0;
          paramp0 = paramExecutor;
        }
        else
        {
          paramp0 = q0.a(localq0, paramString, localExecutor);
          paramServiceConnection = localq0;
        }
      }
      else
      {
        paramServiceConnection.onServiceConnected(f, d);
        paramp0 = paramExecutor;
        paramServiceConnection = localq0;
      }
      if (c)
      {
        paramp0 = b.e;
        return paramp0;
      }
      paramServiceConnection = paramp0;
      if (paramp0 == null)
      {
        paramServiceConnection = new j6/b;
        paramServiceConnection.<init>(-1);
      }
      return paramServiceConnection;
    }
    paramServiceConnection = new java/lang/IllegalStateException;
    paramp0 = paramp0.toString();
    paramString = new java/lang/StringBuilder;
    paramString.<init>();
    paramString.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
    paramString.append(paramp0);
    paramServiceConnection.<init>(paramString.toString());
    throw paramServiceConnection;
  }
  
  public final void c(p0 paramp0, ServiceConnection paramServiceConnection)
  {
    HashMap localHashMap = d;
    label175:
    try
    {
      localObject = (q0)d.get(paramp0);
      if (localObject != null) {
        if (a.containsKey(paramServiceConnection))
        {
          a.remove(paramServiceConnection);
          if (a.isEmpty())
          {
            paramp0 = f.obtainMessage(0, paramp0);
            f.sendMessageDelayed(paramp0, h);
          }
          return;
        }
      }
    }
    finally
    {
      break label175;
      paramServiceConnection = new java/lang/IllegalStateException;
      Object localObject = paramp0.toString();
      paramp0 = new java/lang/StringBuilder;
      paramp0.<init>();
      paramp0.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
      paramp0.append((String)localObject);
      paramServiceConnection.<init>(paramp0.toString());
      throw paramServiceConnection;
      paramServiceConnection = new java/lang/IllegalStateException;
      paramp0 = paramp0.toString();
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      ((StringBuilder)localObject).append("Nonexistent connection status for service config: ");
      ((StringBuilder)localObject).append(paramp0);
      paramServiceConnection.<init>(((StringBuilder)localObject).toString());
      throw paramServiceConnection;
    }
  }
}

/* Location:
 * Qualified Name:     m6.s0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */