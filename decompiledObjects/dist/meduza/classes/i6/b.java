package i6;

import android.app.PendingIntent;
import android.app.PendingIntent.CanceledException;
import android.content.BroadcastReceiver;
import android.content.BroadcastReceiver.PendingResult;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.internal.cloudmessaging.zze;
import java.lang.ref.SoftReference;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public abstract class b
  extends BroadcastReceiver
{
  public static SoftReference a;
  public static SoftReference b;
  
  public abstract int a(Context paramContext, a parama);
  
  public void b(Bundle paramBundle) {}
  
  public final int c(Context paramContext, Intent paramIntent)
  {
    paramContext = (PendingIntent)paramIntent.getParcelableExtra("pending_intent");
    if (paramContext != null) {
      try
      {
        paramContext.send();
      }
      catch (PendingIntent.CanceledException paramContext)
      {
        Log.e("CloudMessagingReceiver", "Notification pending intent canceled");
      }
    }
    paramContext = paramIntent.getExtras();
    if (paramContext != null) {
      paramContext.remove("pending_intent");
    } else {
      paramContext = new Bundle();
    }
    if (Objects.equals(paramIntent.getAction(), "com.google.firebase.messaging.NOTIFICATION_DISMISS"))
    {
      b(paramContext);
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
    try
    {
      Object localObject1 = a;
      if (localObject1 != null) {
        localObject1 = (ExecutorService)((SoftReference)localObject1).get();
      } else {
        localObject1 = null;
      }
      Object localObject2 = localObject1;
      if (localObject1 == null)
      {
        zze.zza();
        localObject1 = new w6/a;
        ((w6.a)localObject1).<init>("firebase-iid-executor");
        localObject2 = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool((ThreadFactory)localObject1));
        localObject1 = new java/lang/ref/SoftReference;
        ((SoftReference)localObject1).<init>(localObject2);
        a = (SoftReference)localObject1;
      }
      ((Executor)localObject2).execute(new o(this, paramIntent, paramContext, bool, localPendingResult));
      return;
    }
    finally {}
  }
}

/* Location:
 * Qualified Name:     i6.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */