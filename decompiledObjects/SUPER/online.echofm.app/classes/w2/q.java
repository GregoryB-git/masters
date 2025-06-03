package w2;

import D2.b;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class q
  implements ServiceConnection
{
  public int a;
  public final Messenger b;
  public r c;
  public final Queue d;
  public final SparseArray e;
  
  public final void a(int paramInt, String paramString)
  {
    try
    {
      b(paramInt, paramString, null);
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public final void b(int paramInt, String paramString, Throwable paramThrowable)
  {
    try
    {
      if (!Log.isLoggable("MessengerIpcClient", 3)) {
        break label60;
      }
      localObject = String.valueOf(paramString);
      if (((String)localObject).length() != 0) {
        localObject = "Disconnected: ".concat((String)localObject);
      }
    }
    finally
    {
      break label249;
    }
    Object localObject = new String("Disconnected: ");
    Log.d("MessengerIpcClient", (String)localObject);
    label60:
    int i = a;
    if (i != 0)
    {
      if ((i != 1) && (i != 2))
      {
        if (i != 3) {
          return;
        }
        a = 4;
        return;
      }
      if (Log.isLoggable("MessengerIpcClient", 2)) {
        Log.v("MessengerIpcClient", "Unbinding service");
      }
      a = 4;
      b.b().c(w.a(f), this);
      localObject = new w2/u;
      ((u)localObject).<init>(paramInt, paramString, paramThrowable);
      paramString = d.iterator();
      while (paramString.hasNext()) {
        ((t)paramString.next()).c((u)localObject);
      }
      d.clear();
      for (paramInt = 0; paramInt < e.size(); paramInt++) {
        ((t)e.valueAt(paramInt)).c((u)localObject);
      }
      e.clear();
      return;
    }
    paramString = new java/lang/IllegalStateException;
    paramString.<init>();
    throw paramString;
    label249:
    throw paramString;
  }
  
  public final void c()
  {
    w.e(f).execute(new l(this));
  }
  
  public final void d()
  {
    try
    {
      if (a == 1)
      {
        a(1, "Timed out while binding");
        return;
      }
    }
    finally
    {
      localObject = finally;
      break label27;
      return;
      label27:
      throw ((Throwable)localObject);
    }
  }
  
  public final void e(int paramInt)
  {
    label90:
    try
    {
      t localt = (t)e.get(paramInt);
      if (localt != null)
      {
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>(31);
        ((StringBuilder)localObject2).append("Timing out request: ");
        ((StringBuilder)localObject2).append(paramInt);
        Log.w("MessengerIpcClient", ((StringBuilder)localObject2).toString());
        e.remove(paramInt);
        localObject2 = new w2/u;
        ((u)localObject2).<init>(3, "Timed out waiting for response", null);
        localt.c((u)localObject2);
        f();
        return;
      }
    }
    finally
    {
      break label90;
      return;
    }
  }
  
  public final void f()
  {
    try
    {
      if ((a != 2) || (!d.isEmpty()) || (e.size() != 0)) {
        break label78;
      }
      if (Log.isLoggable("MessengerIpcClient", 2)) {
        Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
      }
    }
    finally
    {
      break label81;
    }
    a = 3;
    b.b().c(w.a(f), this);
    return;
    label78:
    return;
    label81:
    throw ((Throwable)localObject);
  }
  
  public final boolean g(t paramt)
  {
    label200:
    label208:
    label212:
    try
    {
      int i = a;
      if (i != 0) {
        if (i != 1)
        {
          if (i != 2) {
            return false;
          }
          d.add(paramt);
          c();
          return true;
        }
      }
    }
    finally
    {
      break label212;
      d.add(paramt);
      return true;
      d.add(paramt);
      boolean bool;
      if (a == 0) {
        bool = true;
      } else {
        bool = false;
      }
      A2.n.l(bool);
      if (Log.isLoggable("MessengerIpcClient", 2)) {
        Log.v("MessengerIpcClient", "Starting bind to GmsCore");
      }
      a = 1;
      paramt = new android/content/Intent;
      paramt.<init>("com.google.android.c2dm.intent.REGISTER");
      paramt.setPackage("com.google.android.gms");
      try
      {
        if (!b.b().a(w.a(f), paramt, this, 1)) {
          a(0, "Unable to bind to service");
        }
      }
      catch (SecurityException paramt)
      {
        break label200;
        ScheduledExecutorService localScheduledExecutorService = w.e(f);
        paramt = new w2/m;
        paramt.<init>(this);
        localScheduledExecutorService.schedule(paramt, 30L, TimeUnit.SECONDS);
        break label208;
        b(0, "Unable to bind to service", paramt);
      }
      return true;
    }
  }
  
  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    if (Log.isLoggable("MessengerIpcClient", 2)) {
      Log.v("MessengerIpcClient", "Service connected");
    }
    w.e(f).execute(new n(this, paramIBinder));
  }
  
  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    if (Log.isLoggable("MessengerIpcClient", 2)) {
      Log.v("MessengerIpcClient", "Service disconnected");
    }
    w.e(f).execute(new k(this));
  }
}

/* Location:
 * Qualified Name:     w2.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */