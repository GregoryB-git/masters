package com.google.android.play.core.integrity;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.google.android.play.integrity.internal.q;
import m7.e;
import m7.v;

final class as
  extends q
{
  public final TaskCompletionSource a;
  public final e b;
  private final v c = new v("RequestDialogCallbackImpl");
  private final String d;
  private final k e;
  private final Activity f;
  
  public as(Context paramContext, k paramk, Activity paramActivity, TaskCompletionSource paramTaskCompletionSource, e parame)
  {
    d = paramContext.getPackageName();
    e = paramk;
    a = paramTaskCompletionSource;
    f = paramActivity;
    b = parame;
  }
  
  public final void b(Bundle paramBundle)
  {
    b.d(a);
    Object localObject = d;
    c.b("onRequestDialog(%s)", new Object[] { localObject });
    localObject = e.a(paramBundle);
    if (localObject != null)
    {
      a.trySetException((Exception)localObject);
      return;
    }
    localObject = (PendingIntent)paramBundle.getParcelable("dialog.intent");
    if (localObject == null)
    {
      paramBundle = c;
      localObject = d;
      paramBundle.getClass();
      if (Log.isLoggable("PlayCore", 6)) {
        Log.e("PlayCore", v.c(a, "onRequestDialog(%s): got null dialog intent", new Object[] { localObject }));
      }
      a.trySetResult(Integer.valueOf(0));
      return;
    }
    paramBundle = new Intent(f, PlayCoreDialogWrapperActivity.class);
    paramBundle.putExtra("confirmation_intent", (Parcelable)localObject);
    paramBundle.setFlags(536870912);
    paramBundle.putExtra("result_receiver", new ar(this, b.a()));
    localObject = c;
    localObject.getClass();
    if (Log.isLoggable("PlayCore", 3)) {
      Log.d("PlayCore", v.c(a, "Starting dialog intent...", new Object[0]));
    }
    f.startActivityForResult(paramBundle, 0);
  }
}

/* Location:
 * Qualified Name:     com.google.android.play.core.integrity.as
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */