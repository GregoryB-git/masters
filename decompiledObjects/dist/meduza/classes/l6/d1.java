package l6;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Parcelable;
import android.view.View;
import android.widget.ProgressBar;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.internal.base.zao;
import j6.b;
import j6.e;
import java.util.concurrent.atomic.AtomicReference;
import l.l;
import m6.q;

public final class d1
  implements Runnable
{
  public final c1 a;
  
  public d1(v paramv, c1 paramc1)
  {
    a = paramc1;
  }
  
  public final void run()
  {
    if (!b.a) {
      return;
    }
    Object localObject1 = a.b;
    if ((b != 0) && (c != null)) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0)
    {
      localObject2 = b;
      localObject3 = mLifecycleFragment;
      localObject2 = ((f)localObject2).getActivity();
      localObject1 = c;
      m6.j.i(localObject1);
      int j = a.a;
      i = GoogleApiActivity.b;
      localObject2 = new Intent((Context)localObject2, GoogleApiActivity.class);
      ((Intent)localObject2).putExtra("pending_intent", (Parcelable)localObject1);
      ((Intent)localObject2).putExtra("failing_client_id", j);
      ((Intent)localObject2).putExtra("notify_manager", false);
      ((g)localObject3).startActivityForResult((Intent)localObject2, 1);
      return;
    }
    Object localObject2 = b;
    Object localObject3 = ((f)localObject2).getActivity();
    int i = b;
    Object localObject4;
    if (d.a((Context)localObject3, null, i) != null)
    {
      localObject3 = b;
      localObject2 = ((f)localObject3).getActivity();
      localObject4 = mLifecycleFragment;
      i = b;
      localObject1 = b;
      d.h((Activity)localObject2, (g)localObject4, i, (e1)localObject1);
      return;
    }
    if (b == 18)
    {
      localObject3 = b;
      localObject1 = d;
      localObject2 = ((f)localObject3).getActivity();
      localObject1.getClass();
      localObject4 = new ProgressBar((Context)localObject2, null, 16842874);
      ((ProgressBar)localObject4).setIndeterminate(true);
      ((View)localObject4).setVisibility(0);
      localObject1 = new AlertDialog.Builder((Context)localObject2);
      ((AlertDialog.Builder)localObject1).setView((View)localObject4);
      ((AlertDialog.Builder)localObject1).setMessage(q.b((Context)localObject2, 18));
      ((AlertDialog.Builder)localObject1).setPositiveButton("", null);
      localObject1 = ((AlertDialog.Builder)localObject1).create();
      e.f((Activity)localObject2, (AlertDialog)localObject1, "GooglePlayServicesUpdatingDialog", (DialogInterface.OnCancelListener)localObject3);
      localObject4 = b;
      localObject2 = ((f)localObject4).getActivity().getApplicationContext();
      localObject3 = new l(this, (AlertDialog)localObject1);
      d.getClass();
      localObject4 = new IntentFilter("android.intent.action.PACKAGE_ADDED");
      ((IntentFilter)localObject4).addDataScheme("package");
      localObject3 = new i0((l)localObject3);
      zao.zaa((Context)localObject2, (BroadcastReceiver)localObject3, (IntentFilter)localObject4);
      a = ((Context)localObject2);
      if (!j6.j.c((Context)localObject2))
      {
        localObject2 = b;
        b.set(null);
        localObject2 = f.v;
        ((Handler)localObject2).sendMessage(((Handler)localObject2).obtainMessage(3));
        if (((Dialog)localObject1).isShowing()) {
          ((Dialog)localObject1).dismiss();
        }
        try
        {
          localObject1 = a;
          if (localObject1 != null) {
            ((Context)localObject1).unregisterReceiver((BroadcastReceiver)localObject3);
          }
          a = null;
        }
        finally {}
      }
      return;
    }
    b.a(localb, a.a);
  }
}

/* Location:
 * Qualified Name:     l6.d1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */