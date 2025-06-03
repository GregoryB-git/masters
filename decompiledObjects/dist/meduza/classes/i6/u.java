package i6;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import u6.a;

public final class u
  implements ServiceConnection
{
  public int a;
  public final Messenger b;
  public v c;
  public final ArrayDeque d;
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
  
  public final void b(int paramInt, String paramString, SecurityException paramSecurityException)
  {
    try
    {
      if (Log.isLoggable("MessengerIpcClient", 3)) {
        Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(paramString)));
      }
      paramInt = a;
      if (paramInt != 0)
      {
        if ((paramInt != 1) && (paramInt != 2))
        {
          if (paramInt != 3) {
            return;
          }
          a = 4;
          return;
        }
        if (Log.isLoggable("MessengerIpcClient", 2)) {
          Log.v("MessengerIpcClient", "Unbinding service");
        }
        a = 4;
        Object localObject = f;
        a.b().c(a, this);
        localObject = new z3/f;
        ((z3.f)localObject).<init>(paramString, paramSecurityException);
        paramString = d.iterator();
        while (paramString.hasNext()) {
          ((x)paramString.next()).c((z3.f)localObject);
        }
        d.clear();
        for (paramInt = 0; paramInt < e.size(); paramInt++) {
          ((x)e.valueAt(paramInt)).c((z3.f)localObject);
        }
        e.clear();
        return;
      }
      paramString = new java/lang/IllegalStateException;
      paramString.<init>();
      throw paramString;
    }
    finally {}
  }
  
  public final void c()
  {
    try
    {
      if ((a == 2) && (d.isEmpty()) && (e.size() == 0))
      {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
          Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
        }
        a = 3;
        z localz = f;
        a.b().c(a, this);
        return;
      }
      return;
    }
    finally {}
  }
  
  public final boolean d(x paramx)
  {
    try
    {
      int i = a;
      Object localObject;
      if (i != 0)
      {
        if (i != 1)
        {
          if (i != 2) {
            return false;
          }
          d.add(paramx);
          paramx = f.b;
          localObject = new i6/q;
          ((q)localObject).<init>(this, 0);
          paramx.execute((Runnable)localObject);
          return true;
        }
        d.add(paramx);
        return true;
      }
      d.add(paramx);
      if (a == 0) {
        i = 1;
      } else {
        i = 0;
      }
      if (i != 0)
      {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
          Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        a = 1;
        paramx = new android/content/Intent;
        paramx.<init>("com.google.android.c2dm.intent.REGISTER");
        paramx.setPackage("com.google.android.gms");
        try
        {
          if (!a.b().a(f.a, paramx, this, 1))
          {
            a(0, "Unable to bind to service");
          }
          else
          {
            localObject = f.b;
            paramx = new i6/f;
            paramx.<init>(this, 1);
            ((ScheduledExecutorService)localObject).schedule(paramx, 30L, TimeUnit.SECONDS);
          }
        }
        catch (SecurityException paramx)
        {
          b(0, "Unable to bind to service", paramx);
        }
        return true;
      }
      paramx = new java/lang/IllegalStateException;
      paramx.<init>();
      throw paramx;
    }
    finally {}
  }
  
  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    if (Log.isLoggable("MessengerIpcClient", 2)) {
      Log.v("MessengerIpcClient", "Service connected");
    }
    f.b.execute(new p(0, this, paramIBinder));
  }
  
  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    if (Log.isLoggable("MessengerIpcClient", 2)) {
      Log.v("MessengerIpcClient", "Service disconnected");
    }
    f.b.execute(new r(this, 0));
  }
}

/* Location:
 * Qualified Name:     i6.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */