package com.google.firebase.messaging;

import D2.b;
import F2.a;
import V2.j;
import V2.k;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class o0
  implements ServiceConnection
{
  public final Context a;
  public final Intent b;
  public final ScheduledExecutorService c;
  public final Queue d = new ArrayDeque();
  public l0 e;
  public boolean f = false;
  
  public o0(Context paramContext, String paramString)
  {
    this(paramContext, paramString, new ScheduledThreadPoolExecutor(0, new a("Firebase-FirebaseInstanceIdServiceConnection")));
  }
  
  public o0(Context paramContext, String paramString, ScheduledExecutorService paramScheduledExecutorService)
  {
    paramContext = paramContext.getApplicationContext();
    a = paramContext;
    b = new Intent(paramString).setPackage(paramContext.getPackageName());
    c = paramScheduledExecutorService;
  }
  
  public final void a()
  {
    while (!d.isEmpty()) {
      ((a)d.poll()).d();
    }
  }
  
  public final void b()
  {
    try
    {
      if (Log.isLoggable("FirebaseMessaging", 3)) {
        Log.d("FirebaseMessaging", "flush queue called");
      }
    }
    finally
    {
      break label122;
    }
    Object localObject2;
    while (!d.isEmpty())
    {
      if (Log.isLoggable("FirebaseMessaging", 3)) {
        Log.d("FirebaseMessaging", "found intent to be delivered");
      }
      localObject2 = e;
      if ((localObject2 != null) && (((Binder)localObject2).isBinderAlive()))
      {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
          Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
        }
        localObject2 = (a)d.poll();
        e.c((a)localObject2);
      }
      else
      {
        d();
        return;
      }
    }
    return;
    label122:
    throw ((Throwable)localObject2);
  }
  
  public j c(Intent paramIntent)
  {
    try
    {
      if (Log.isLoggable("FirebaseMessaging", 3)) {
        Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
      }
    }
    finally
    {
      break label67;
    }
    a locala = new com/google/firebase/messaging/o0$a;
    locala.<init>(paramIntent);
    locala.c(c);
    d.add(locala);
    b();
    paramIntent = locala.e();
    return paramIntent;
    label67:
    throw paramIntent;
  }
  
  public final void d()
  {
    if (Log.isLoggable("FirebaseMessaging", 3))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("binder is dead. start connection? ");
      localStringBuilder.append(f ^ true);
      Log.d("FirebaseMessaging", localStringBuilder.toString());
    }
    if (f) {
      return;
    }
    f = true;
    try
    {
      if (b.b().a(a, b, this, 65)) {
        return;
      }
      Log.e("FirebaseMessaging", "binding to the service failed");
    }
    catch (SecurityException localSecurityException)
    {
      Log.e("FirebaseMessaging", "Exception while binding the service", localSecurityException);
    }
    f = false;
    a();
  }
  
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    try
    {
      if (Log.isLoggable("FirebaseMessaging", 3))
      {
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localStringBuilder.append("onServiceConnected: ");
        localStringBuilder.append(paramComponentName);
        Log.d("FirebaseMessaging", localStringBuilder.toString());
      }
    }
    finally
    {
      break label114;
    }
    f = false;
    if (!(paramIBinder instanceof l0))
    {
      paramComponentName = new java/lang/StringBuilder;
      paramComponentName.<init>();
      paramComponentName.append("Invalid service connection: ");
      paramComponentName.append(paramIBinder);
      Log.e("FirebaseMessaging", paramComponentName.toString());
      a();
      return;
    }
    e = ((l0)paramIBinder);
    b();
    return;
    label114:
    throw paramComponentName;
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    if (Log.isLoggable("FirebaseMessaging", 3))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("onServiceDisconnected: ");
      localStringBuilder.append(paramComponentName);
      Log.d("FirebaseMessaging", localStringBuilder.toString());
    }
    b();
  }
  
  public static class a
  {
    public final Intent a;
    public final k b = new k();
    
    public a(Intent paramIntent)
    {
      a = paramIntent;
    }
    
    public void c(ScheduledExecutorService paramScheduledExecutorService)
    {
      ScheduledFuture localScheduledFuture = paramScheduledExecutorService.schedule(new m0(this), 20L, TimeUnit.SECONDS);
      e().c(paramScheduledExecutorService, new n0(localScheduledFuture));
    }
    
    public void d()
    {
      b.e(null);
    }
    
    public j e()
    {
      return b.a();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.messaging.o0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */