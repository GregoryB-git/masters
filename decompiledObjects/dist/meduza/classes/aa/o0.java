package aa;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import b.d;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import e;
import f;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import u6.a;

public final class o0
  implements ServiceConnection
{
  public final Context a;
  public final Intent b;
  public final ScheduledExecutorService c;
  public final ArrayDeque d = new ArrayDeque();
  public n0 e;
  public boolean f = false;
  
  public o0(Context paramContext)
  {
    paramContext = paramContext.getApplicationContext();
    a = paramContext;
    b = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(paramContext.getPackageName());
    c = localScheduledThreadPoolExecutor;
  }
  
  public final void a()
  {
    try
    {
      if (Log.isLoggable("FirebaseMessaging", 3)) {
        Log.d("FirebaseMessaging", "flush queue called");
      }
      while (!d.isEmpty())
      {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
          Log.d("FirebaseMessaging", "found intent to be delivered");
        }
        Object localObject1 = e;
        if ((localObject1 != null) && (((Binder)localObject1).isBinderAlive()))
        {
          if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
          }
          localObject1 = (a)d.poll();
          e.a((a)localObject1);
        }
        else
        {
          c();
          return;
        }
      }
      return;
    }
    finally {}
  }
  
  public final Task<Void> b(Intent paramIntent)
  {
    try
    {
      if (Log.isLoggable("FirebaseMessaging", 3)) {
        Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
      }
      a locala = new aa/o0$a;
      locala.<init>(paramIntent);
      paramIntent = c;
      Object localObject = new b/d;
      ((d)localObject).<init>(locala, 21);
      ScheduledFuture localScheduledFuture = paramIntent.schedule((Runnable)localObject, 20L, TimeUnit.SECONDS);
      localObject = b.getTask();
      e locale = new e;
      locale.<init>(localScheduledFuture, 1);
      ((Task)localObject).addOnCompleteListener(paramIntent, locale);
      d.add(locala);
      a();
      paramIntent = b.getTask();
      return paramIntent;
    }
    finally {}
  }
  
  public final void c()
  {
    if (Log.isLoggable("FirebaseMessaging", 3))
    {
      StringBuilder localStringBuilder = f.l("binder is dead. start connection? ");
      localStringBuilder.append(f ^ true);
      Log.d("FirebaseMessaging", localStringBuilder.toString());
    }
    if (f) {
      return;
    }
    f = true;
    try
    {
      if (a.b().a(a, b, this, 65)) {
        return;
      }
      Log.e("FirebaseMessaging", "binding to the service failed");
    }
    catch (SecurityException localSecurityException)
    {
      Log.e("FirebaseMessaging", "Exception while binding the service", localSecurityException);
    }
    f = false;
    while (!d.isEmpty()) {
      d.poll()).b.trySetResult(null);
    }
  }
  
  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
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
      f = false;
      if (!(paramIBinder instanceof n0))
      {
        paramComponentName = new java/lang/StringBuilder;
        paramComponentName.<init>();
        paramComponentName.append("Invalid service connection: ");
        paramComponentName.append(paramIBinder);
        Log.e("FirebaseMessaging", paramComponentName.toString());
        while (!d.isEmpty()) {
          d.poll()).b.trySetResult(null);
        }
        return;
      }
      e = ((n0)paramIBinder);
      a();
      return;
    }
    finally {}
  }
  
  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    if (Log.isLoggable("FirebaseMessaging", 3))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("onServiceDisconnected: ");
      localStringBuilder.append(paramComponentName);
      Log.d("FirebaseMessaging", localStringBuilder.toString());
    }
    a();
  }
  
  public static final class a
  {
    public final Intent a;
    public final TaskCompletionSource<Void> b = new TaskCompletionSource();
    
    public a(Intent paramIntent)
    {
      a = paramIntent;
    }
  }
}

/* Location:
 * Qualified Name:     aa.o0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */