package c8;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.firebase_auth_api.zzadr;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import m6.j;
import n6.d;

public final class a0
  extends BroadcastReceiver
{
  public final WeakReference<Activity> a;
  public final TaskCompletionSource<String> b;
  
  public a0(Activity paramActivity, TaskCompletionSource<String> paramTaskCompletionSource)
  {
    a = new WeakReference(paramTaskCompletionSource);
    TaskCompletionSource localTaskCompletionSource;
    b = localTaskCompletionSource;
  }
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    if ((Activity)a.get() == null)
    {
      Log.e("FederatedAuthReceiver", "Failed to unregister BroadcastReceiver because the Activity that launched this flow has been garbage collected; please do not finish() your Activity while performing a FederatedAuthProvider operation.");
      b.setException(zzadr.zza(new Status(17499, "Activity that started the web operation is no longer alive; see logcat for details", null, null)));
      w.c(paramContext);
      return;
    }
    if (paramIntent.hasExtra("com.google.firebase.auth.internal.OPERATION"))
    {
      localObject = paramIntent.getStringExtra("com.google.firebase.auth.internal.OPERATION");
      if ("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA".equals(localObject))
      {
        b.setResult(paramIntent.getStringExtra("com.google.firebase.auth.internal.RECAPTCHA_TOKEN"));
        w.c(paramContext);
        return;
      }
      paramIntent = b;
      paramContext = new StringBuilder("WEB_CONTEXT_CANCELED:Unknown operation received (");
      paramContext.append((String)localObject);
      paramContext.append(")");
      paramIntent.setException(zzadr.zza(p.a(paramContext.toString())));
      return;
    }
    Object localObject = v0.a;
    if (paramIntent.hasExtra("com.google.firebase.auth.internal.STATUS"))
    {
      j.b(paramIntent.hasExtra("com.google.firebase.auth.internal.STATUS"));
      paramIntent = (Status)d.a(paramIntent, "com.google.firebase.auth.internal.STATUS", Status.CREATOR);
      b.setException(zzadr.zza(paramIntent));
      w.c(paramContext);
      return;
    }
    if (paramIntent.hasExtra("com.google.firebase.auth.internal.EXTRA_CANCELED"))
    {
      b.setException(zzadr.zza(p.a("WEB_CONTEXT_CANCELED")));
      w.c(paramContext);
    }
  }
}

/* Location:
 * Qualified Name:     c8.a0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */