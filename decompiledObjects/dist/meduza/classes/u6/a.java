package u6;

import aa.u;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.util.Log;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import m6.j;
import m6.t0;
import x6.c;
import x6.d;

public final class a
{
  public static final Object b = new Object();
  public static volatile a c;
  public final ConcurrentHashMap a = new ConcurrentHashMap();
  
  public static a b()
  {
    if (c == null) {
      synchronized (b)
      {
        if (c == null)
        {
          a locala = new u6/a;
          locala.<init>();
          c = locala;
        }
      }
    }
    ??? = c;
    j.i(???);
    return (a)???;
  }
  
  public final boolean a(Context paramContext, Intent paramIntent, ServiceConnection paramServiceConnection, int paramInt)
  {
    return d(paramContext, paramContext.getClass().getName(), paramIntent, paramServiceConnection, paramInt, null);
  }
  
  /* Error */
  public final void c(Context paramContext, ServiceConnection paramServiceConnection)
  {
    // Byte code:
    //   0: aload_2
    //   1: instanceof 57
    //   4: iconst_1
    //   5: ixor
    //   6: ifeq +53 -> 59
    //   9: aload_0
    //   10: getfield 23	u6/a:a	Ljava/util/concurrent/ConcurrentHashMap;
    //   13: aload_2
    //   14: invokevirtual 61	java/util/concurrent/ConcurrentHashMap:containsKey	(Ljava/lang/Object;)Z
    //   17: ifeq +42 -> 59
    //   20: aload_0
    //   21: getfield 23	u6/a:a	Ljava/util/concurrent/ConcurrentHashMap;
    //   24: aload_2
    //   25: invokevirtual 65	java/util/concurrent/ConcurrentHashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   28: checkcast 67	android/content/ServiceConnection
    //   31: astore_3
    //   32: aload_1
    //   33: aload_3
    //   34: invokevirtual 73	android/content/Context:unbindService	(Landroid/content/ServiceConnection;)V
    //   37: aload_0
    //   38: getfield 23	u6/a:a	Ljava/util/concurrent/ConcurrentHashMap;
    //   41: aload_2
    //   42: invokevirtual 76	java/util/concurrent/ConcurrentHashMap:remove	(Ljava/lang/Object;)Ljava/lang/Object;
    //   45: pop
    //   46: return
    //   47: astore_1
    //   48: aload_0
    //   49: getfield 23	u6/a:a	Ljava/util/concurrent/ConcurrentHashMap;
    //   52: aload_2
    //   53: invokevirtual 76	java/util/concurrent/ConcurrentHashMap:remove	(Ljava/lang/Object;)Ljava/lang/Object;
    //   56: pop
    //   57: aload_1
    //   58: athrow
    //   59: aload_1
    //   60: aload_2
    //   61: invokevirtual 73	android/content/Context:unbindService	(Landroid/content/ServiceConnection;)V
    //   64: return
    //   65: astore_1
    //   66: goto -29 -> 37
    //   69: astore_1
    //   70: goto -6 -> 64
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	73	0	this	a
    //   0	73	1	paramContext	Context
    //   0	73	2	paramServiceConnection	ServiceConnection
    //   31	3	3	localServiceConnection	ServiceConnection
    // Exception table:
    //   from	to	target	type
    //   20	32	47	finally
    //   32	37	47	finally
    //   32	37	65	java/lang/IllegalArgumentException
    //   32	37	65	java/lang/IllegalStateException
    //   32	37	65	java/util/NoSuchElementException
    //   59	64	69	java/lang/IllegalArgumentException
    //   59	64	69	java/lang/IllegalStateException
    //   59	64	69	java/util/NoSuchElementException
  }
  
  public final boolean d(Context paramContext, String paramString, Intent paramIntent, ServiceConnection paramServiceConnection, int paramInt, Executor paramExecutor)
  {
    Object localObject = paramIntent.getComponent();
    int i = 0;
    if (localObject != null)
    {
      localObject = ((ComponentName)localObject).getPackageName();
      "com.google.android.gms".equals(localObject);
    }
    try
    {
      j = aa0flags;
      if ((j & 0x200000) != 0)
      {
        Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
        return false;
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      int j;
      boolean bool;
      label230:
      for (;;) {}
    }
    bool = paramServiceConnection instanceof t0;
    j = 1;
    if ((bool ^ true))
    {
      localObject = (ServiceConnection)a.putIfAbsent(paramServiceConnection, paramServiceConnection);
      if ((localObject != null) && (paramServiceConnection != localObject)) {
        Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", new Object[] { paramServiceConnection, paramString, paramIntent.getAction() }));
      }
      paramString = paramExecutor;
      if (paramExecutor == null) {
        paramString = null;
      }
      try
      {
        if (Build.VERSION.SDK_INT >= 29) {
          i = j;
        } else {
          i = 0;
        }
        if ((i != 0) && (paramString != null)) {
          bool = u.s(paramInt, paramContext, paramIntent, paramServiceConnection, paramString);
        }
      }
      finally
      {
        break label230;
      }
      bool = paramContext.bindService(paramIntent, paramServiceConnection, paramInt);
      if (!bool)
      {
        a.remove(paramServiceConnection, paramServiceConnection);
        return false;
        a.remove(paramServiceConnection, paramServiceConnection);
        throw paramContext;
      }
    }
    else
    {
      paramString = paramExecutor;
      if (paramExecutor == null) {
        paramString = null;
      }
      if (Build.VERSION.SDK_INT >= 29) {
        i = 1;
      }
      if ((i != 0) && (paramString != null)) {
        bool = u.s(paramInt, paramContext, paramIntent, paramServiceConnection, paramString);
      } else {
        bool = paramContext.bindService(paramIntent, paramServiceConnection, paramInt);
      }
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     u6.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */