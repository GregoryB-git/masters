package w2;

import L2.e;
import V2.j;
import V2.m;
import android.app.PendingIntent;
import android.app.PendingIntent.CanceledException;
import android.content.BroadcastReceiver;
import android.content.BroadcastReceiver.PendingResult;
import android.content.Context;
import android.content.Intent;
import android.os.BaseBundle;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public abstract class b
  extends BroadcastReceiver
{
  public final ExecutorService a;
  
  public b()
  {
    e.a();
    Object localObject = new F2.a("firebase-iid-executor");
    localObject = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), (ThreadFactory)localObject);
    ((ThreadPoolExecutor)localObject).allowCoreThreadTimeOut(true);
    a = Executors.unconfigurableExecutorService((ExecutorService)localObject);
  }
  
  public Executor a()
  {
    return a;
  }
  
  public abstract int b(Context paramContext, a parama);
  
  public abstract void c(Context paramContext, Bundle paramBundle);
  
  public final int e(Context paramContext, Intent paramIntent)
  {
    if (paramIntent.getExtras() == null) {
      return 500;
    }
    Object localObject = paramIntent.getStringExtra("google.message_id");
    if (TextUtils.isEmpty((CharSequence)localObject))
    {
      localObject = m.e(null);
    }
    else
    {
      Bundle localBundle = new Bundle();
      localBundle.putString("google.message_id", (String)localObject);
      localObject = w.b(paramContext).c(2, localBundle);
    }
    int i = b(paramContext, new a(paramIntent));
    try
    {
      m.b((j)localObject, TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS);
    }
    catch (TimeoutException paramContext) {}catch (InterruptedException paramContext) {}catch (ExecutionException paramContext) {}
    paramIntent = String.valueOf(paramContext);
    paramContext = new StringBuilder(paramIntent.length() + 20);
    paramContext.append("Message ack failed: ");
    paramContext.append(paramIntent);
    Log.w("CloudMessagingReceiver", paramContext.toString());
    return i;
  }
  
  public final int f(Context paramContext, Intent paramIntent)
  {
    PendingIntent localPendingIntent = (PendingIntent)paramIntent.getParcelableExtra("pending_intent");
    if (localPendingIntent != null) {
      try
      {
        localPendingIntent.send();
      }
      catch (PendingIntent.CanceledException localCanceledException)
      {
        Log.e("CloudMessagingReceiver", "Notification pending intent canceled");
      }
    }
    Bundle localBundle = paramIntent.getExtras();
    if (localBundle != null) {
      localBundle.remove("pending_intent");
    } else {
      localBundle = new Bundle();
    }
    if ("com.google.firebase.messaging.NOTIFICATION_DISMISS".equals(paramIntent.getAction()))
    {
      c(paramContext, localBundle);
      return -1;
    }
    Log.e("CloudMessagingReceiver", "Unknown notification action");
    return 500;
  }
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    if (paramIntent == null) {
      return;
    }
    boolean bool = isOrderedBroadcast();
    BroadcastReceiver.PendingResult localPendingResult = goAsync();
    a().execute(new i(this, paramIntent, paramContext, bool, localPendingResult));
  }
}

/* Location:
 * Qualified Name:     w2.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */