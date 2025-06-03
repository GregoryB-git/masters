package x2;

import A2.B;
import A2.y;
import E2.l;
import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Handler;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.ProgressBar;
import com.google.android.gms.common.api.GoogleApiActivity;
import java.util.concurrent.atomic.AtomicBoolean;
import w.h.c;
import w.h.e;
import z2.D;
import z2.E;

public class j
  extends k
{
  public static final int d = k.a;
  public static final Object e = new Object();
  public static final j f = new j();
  public String c;
  
  public static j m()
  {
    return f;
  }
  
  public Intent b(Context paramContext, int paramInt, String paramString)
  {
    return super.b(paramContext, paramInt, paramString);
  }
  
  public PendingIntent c(Context paramContext, int paramInt1, int paramInt2)
  {
    return super.c(paramContext, paramInt1, paramInt2);
  }
  
  public final String e(int paramInt)
  {
    return super.e(paramInt);
  }
  
  public int g(Context paramContext)
  {
    return super.g(paramContext);
  }
  
  public int h(Context paramContext, int paramInt)
  {
    return super.h(paramContext, paramInt);
  }
  
  public final boolean j(int paramInt)
  {
    return super.j(paramInt);
  }
  
  public Dialog k(Activity paramActivity, int paramInt1, int paramInt2, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    return p(paramActivity, paramInt1, B.b(paramActivity, b(paramActivity, paramInt1, "d"), paramInt2), paramOnCancelListener);
  }
  
  public PendingIntent l(Context paramContext, b paramb)
  {
    if (paramb.g()) {
      return paramb.f();
    }
    return c(paramContext, paramb.a(), 0);
  }
  
  public boolean n(Activity paramActivity, int paramInt1, int paramInt2, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    Dialog localDialog = k(paramActivity, paramInt1, paramInt2, paramOnCancelListener);
    if (localDialog == null) {
      return false;
    }
    s(paramActivity, localDialog, "GooglePlayServicesErrorDialog", paramOnCancelListener);
    return true;
  }
  
  public void o(Context paramContext, int paramInt)
  {
    t(paramContext, paramInt, null, d(paramContext, paramInt, 0, "n"));
  }
  
  public final Dialog p(Context paramContext, int paramInt, B paramB, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    AlertDialog.Builder localBuilder = null;
    if (paramInt == 0) {
      return null;
    }
    Object localObject = new TypedValue();
    paramContext.getTheme().resolveAttribute(16843529, (TypedValue)localObject, true);
    if ("Theme.Dialog.Alert".equals(paramContext.getResources().getResourceEntryName(resourceId))) {
      localBuilder = new AlertDialog.Builder(paramContext, 5);
    }
    localObject = localBuilder;
    if (localBuilder == null) {
      localObject = new AlertDialog.Builder(paramContext);
    }
    ((AlertDialog.Builder)localObject).setMessage(y.d(paramContext, paramInt));
    if (paramOnCancelListener != null) {
      ((AlertDialog.Builder)localObject).setOnCancelListener(paramOnCancelListener);
    }
    paramOnCancelListener = y.c(paramContext, paramInt);
    if (paramOnCancelListener != null) {
      ((AlertDialog.Builder)localObject).setPositiveButton(paramOnCancelListener, paramB);
    }
    paramContext = y.g(paramContext, paramInt);
    if (paramContext != null) {
      ((AlertDialog.Builder)localObject).setTitle(paramContext);
    }
    Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", new Object[] { Integer.valueOf(paramInt) }), new IllegalArgumentException());
    return ((AlertDialog.Builder)localObject).create();
  }
  
  public final Dialog q(Activity paramActivity, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    Object localObject = new ProgressBar(paramActivity, null, 16842874);
    ((ProgressBar)localObject).setIndeterminate(true);
    ((View)localObject).setVisibility(0);
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(paramActivity);
    localBuilder.setView((View)localObject);
    localBuilder.setMessage(y.d(paramActivity, 18));
    localBuilder.setPositiveButton("", null);
    localObject = localBuilder.create();
    s(paramActivity, (Dialog)localObject, "GooglePlayServicesUpdatingDialog", paramOnCancelListener);
    return (Dialog)localObject;
  }
  
  public final E r(Context paramContext, D paramD)
  {
    IntentFilter localIntentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
    localIntentFilter.addDataScheme("package");
    E localE = new E(paramD);
    K2.g.l(paramContext, localE, localIntentFilter);
    localE.a(paramContext);
    if (!i(paramContext, "com.google.android.gms"))
    {
      paramD.a();
      localE.b();
      return null;
    }
    return localE;
  }
  
  public final void s(Activity paramActivity, Dialog paramDialog, String paramString, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    try
    {
      boolean bool = paramActivity instanceof androidx.fragment.app.e;
      if (bool)
      {
        paramActivity = ((androidx.fragment.app.e)paramActivity).n();
        q.U1(paramDialog, paramOnCancelListener).T1(paramActivity, paramString);
        return;
      }
    }
    catch (NoClassDefFoundError localNoClassDefFoundError)
    {
      for (;;) {}
    }
    paramActivity = paramActivity.getFragmentManager();
    c.a(paramDialog, paramOnCancelListener).show(paramActivity, paramString);
  }
  
  public final void t(Context paramContext, int paramInt, String arg3, PendingIntent paramPendingIntent)
  {
    Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", new Object[] { Integer.valueOf(paramInt), null }), new IllegalArgumentException());
    if (paramInt == 18)
    {
      u(paramContext);
      return;
    }
    if (paramPendingIntent == null)
    {
      if (paramInt == 6) {
        Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
      }
      return;
    }
    Object localObject1 = y.f(paramContext, paramInt);
    ??? = y.e(paramContext, paramInt);
    Object localObject2 = paramContext.getResources();
    NotificationManager localNotificationManager = (NotificationManager)A2.n.i(paramContext.getSystemService("notification"));
    localObject1 = new h.e(paramContext).r(true).g(true).l((CharSequence)localObject1).y(new h.c().h(???));
    if (E2.i.c(paramContext))
    {
      A2.n.l(l.e());
      ((h.e)localObject1).w(getApplicationInfoicon).u(2);
      if (E2.i.d(paramContext)) {
        ((h.e)localObject1).a(v2.a.a, ((Resources)localObject2).getString(v2.b.o), paramPendingIntent);
      } else {
        ((h.e)localObject1).j(paramPendingIntent);
      }
    }
    else
    {
      ((h.e)localObject1).w(17301642).A(((Resources)localObject2).getString(v2.b.h)).D(System.currentTimeMillis()).j(paramPendingIntent).k(???);
    }
    if (l.h()) {
      A2.n.l(l.h());
    }
    synchronized (e)
    {
      paramPendingIntent = c;
      ??? = paramPendingIntent;
      if (paramPendingIntent == null)
      {
        paramPendingIntent = "com.google.android.gms.availability";
        localObject2 = e.a(localNotificationManager, "com.google.android.gms.availability");
        paramContext = y.b(paramContext);
        if (localObject2 == null)
        {
          f.a(localNotificationManager, i.a("com.google.android.gms.availability", paramContext, 4));
          ??? = paramPendingIntent;
        }
        else
        {
          ??? = paramPendingIntent;
          if (!paramContext.contentEquals(g.a((NotificationChannel)localObject2)))
          {
            h.a((NotificationChannel)localObject2, paramContext);
            f.a(localNotificationManager, (NotificationChannel)localObject2);
            ??? = paramPendingIntent;
          }
        }
      }
      ((h.e)localObject1).h(???);
      paramContext = ((h.e)localObject1).c();
      if ((paramInt != 1) && (paramInt != 2) && (paramInt != 3))
      {
        paramInt = 39789;
      }
      else
      {
        n.b.set(false);
        paramInt = 10436;
      }
      localNotificationManager.notify(paramInt, paramContext);
      return;
    }
  }
  
  public final void u(Context paramContext)
  {
    new r(this, paramContext).sendEmptyMessageDelayed(1, 120000L);
  }
  
  public final boolean v(Activity paramActivity, z2.g paramg, int paramInt1, int paramInt2, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    paramg = p(paramActivity, paramInt1, B.c(paramg, b(paramActivity, paramInt1, "d"), 2), paramOnCancelListener);
    if (paramg == null) {
      return false;
    }
    s(paramActivity, paramg, "GooglePlayServicesErrorDialog", paramOnCancelListener);
    return true;
  }
  
  public final boolean w(Context paramContext, b paramb, int paramInt)
  {
    if (G2.a.a(paramContext)) {
      return false;
    }
    PendingIntent localPendingIntent = l(paramContext, paramb);
    if (localPendingIntent != null)
    {
      t(paramContext, paramb.a(), null, PendingIntent.getActivity(paramContext, 0, GoogleApiActivity.a(paramContext, localPendingIntent, paramInt, true), K2.h.a | 0x8000000));
      return true;
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     x2.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */