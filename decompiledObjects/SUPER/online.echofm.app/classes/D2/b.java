package D2;

import A2.k0;
import A2.n;
import E2.l;
import G2.c;
import G2.d;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

public class b
{
  public static final Object b = new Object();
  public static volatile b c;
  public ConcurrentHashMap a = new ConcurrentHashMap();
  
  public static b b()
  {
    if (c == null)
    {
      synchronized (b)
      {
        if (c == null)
        {
          b localb = new D2/b;
          localb.<init>();
          c = localb;
        }
      }
      break label46;
      throw ((Throwable)localObject2);
    }
    label46:
    ??? = c;
    n.i(???);
    return (b)???;
  }
  
  public static void e(Context paramContext, ServiceConnection paramServiceConnection)
  {
    try
    {
      paramContext.unbindService(paramServiceConnection);
      return;
    }
    catch (IllegalArgumentException|IllegalStateException|NoSuchElementException paramContext)
    {
      for (;;) {}
    }
  }
  
  public static boolean g(ServiceConnection paramServiceConnection)
  {
    return !(paramServiceConnection instanceof k0);
  }
  
  public static final boolean h(Context paramContext, Intent paramIntent, ServiceConnection paramServiceConnection, int paramInt, Executor paramExecutor)
  {
    if ((l.j()) && (paramExecutor != null)) {
      return a.a(paramContext, paramIntent, paramInt, paramExecutor, paramServiceConnection);
    }
    return paramContext.bindService(paramIntent, paramServiceConnection, paramInt);
  }
  
  public boolean a(Context paramContext, Intent paramIntent, ServiceConnection paramServiceConnection, int paramInt)
  {
    return f(paramContext, paramContext.getClass().getName(), paramIntent, paramServiceConnection, paramInt, true, null);
  }
  
  public void c(Context paramContext, ServiceConnection paramServiceConnection)
  {
    if ((g(paramServiceConnection)) && (a.containsKey(paramServiceConnection))) {
      try
      {
        e(paramContext, (ServiceConnection)a.get(paramServiceConnection));
        return;
      }
      finally
      {
        a.remove(paramServiceConnection);
      }
    }
    e(paramContext, paramServiceConnection);
  }
  
  public final boolean d(Context paramContext, String paramString, Intent paramIntent, ServiceConnection paramServiceConnection, int paramInt, Executor paramExecutor)
  {
    return f(paramContext, paramString, paramIntent, paramServiceConnection, paramInt, true, paramExecutor);
  }
  
  public final boolean f(Context paramContext, String paramString, Intent paramIntent, ServiceConnection paramServiceConnection, int paramInt, boolean paramBoolean, Executor paramExecutor)
  {
    Object localObject = paramIntent.getComponent();
    if (localObject != null)
    {
      localObject = ((ComponentName)localObject).getPackageName();
      "com.google.android.gms".equals(localObject);
    }
    try
    {
      int i = ac0flags;
      if ((i & 0x200000) != 0)
      {
        Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
        return false;
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      label192:
      for (;;) {}
    }
    if (g(paramServiceConnection))
    {
      localObject = (ServiceConnection)a.putIfAbsent(paramServiceConnection, paramServiceConnection);
      if ((localObject != null) && (paramServiceConnection != localObject)) {
        Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", new Object[] { paramServiceConnection, paramString, paramIntent.getAction() }));
      }
      try
      {
        paramBoolean = h(paramContext, paramIntent, paramServiceConnection, paramInt, paramExecutor);
        if (paramBoolean) {
          break label192;
        }
        return false;
      }
      finally
      {
        a.remove(paramServiceConnection, paramServiceConnection);
      }
    }
    paramBoolean = h(paramContext, paramIntent, paramServiceConnection, paramInt, paramExecutor);
    return paramBoolean;
  }
}

/* Location:
 * Qualified Name:     D2.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */