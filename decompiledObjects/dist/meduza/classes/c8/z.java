package c8;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import b8.g;
import b8.r;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.firebase_auth_api.zzadr;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;
import d5.n;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import l3.l;
import m6.j;
import n6.d;

public final class z
  extends BroadcastReceiver
{
  public final WeakReference<Activity> a;
  public final TaskCompletionSource<g> b;
  public final FirebaseAuth c;
  public final r d;
  
  public z(Activity paramActivity, TaskCompletionSource<g> paramTaskCompletionSource, FirebaseAuth paramFirebaseAuth, r paramr)
  {
    a = new WeakReference(paramTaskCompletionSource);
    b = paramFirebaseAuth;
    c = paramr;
    r localr;
    d = localr;
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
      if ("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(localObject))
      {
        localObject = b;
        c.g(w.a(paramIntent)).addOnSuccessListener(new l((TaskCompletionSource)localObject, paramContext)).addOnFailureListener(new v((TaskCompletionSource)localObject, paramContext));
        return;
      }
      r localr;
      if ("com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(localObject))
      {
        localObject = b;
        localr = d;
        paramIntent = w.a(paramIntent);
        FirebaseAuth.getInstance(localr.K()).i(localr, paramIntent).addOnSuccessListener(new v((TaskCompletionSource)localObject, paramContext)).addOnFailureListener(new x((TaskCompletionSource)localObject, paramContext));
        return;
      }
      if ("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(localObject))
      {
        localObject = b;
        localr = d;
        paramIntent = w.a(paramIntent);
        FirebaseAuth.getInstance(localr.K()).r(localr, paramIntent).addOnSuccessListener(new x((TaskCompletionSource)localObject, paramContext)).addOnFailureListener(new n((TaskCompletionSource)localObject, paramContext));
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
 * Qualified Name:     c8.z
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */