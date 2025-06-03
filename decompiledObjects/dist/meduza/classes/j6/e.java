package j6;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Handler;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.gms.internal.base.zad;
import com.google.android.gms.internal.base.zae;
import com.google.errorprone.annotations.RestrictedInheritance;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import l6.e1;
import l6.g;
import m6.r;
import m6.t;
import u.n;
import u.p;
import x0.a;
import x0.y;
import x6.b;

@RestrictedInheritance(allowedOnPath=".*java.*/com/google/android/gms.*", allowlistAnnotations={zad.class, zae.class}, explanation="Sub classing of GMS Core's APIs are restricted to GMS Core client libs and testing fakes.", link="go/gmscore-restrictedinheritance")
public final class e
  extends f
{
  public static final Object c = new Object();
  public static final e d = new e();
  
  public static AlertDialog e(Context paramContext, int paramInt, t paramt, DialogInterface.OnCancelListener paramOnCancelListener)
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
    ((AlertDialog.Builder)localObject).setMessage(m6.q.b(paramContext, paramInt));
    if (paramOnCancelListener != null) {
      ((AlertDialog.Builder)localObject).setOnCancelListener(paramOnCancelListener);
    }
    paramOnCancelListener = paramContext.getResources();
    int i;
    if (paramInt != 1)
    {
      if (paramInt != 2)
      {
        if (paramInt != 3) {
          i = 17039370;
        } else {
          i = 2131886123;
        }
      }
      else {
        i = 2131886133;
      }
    }
    else {
      i = 2131886126;
    }
    paramOnCancelListener = paramOnCancelListener.getString(i);
    if (paramOnCancelListener != null) {
      ((AlertDialog.Builder)localObject).setPositiveButton(paramOnCancelListener, paramt);
    }
    paramContext = m6.q.c(paramContext, paramInt);
    if (paramContext != null) {
      ((AlertDialog.Builder)localObject).setTitle(paramContext);
    }
    Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", new Object[] { Integer.valueOf(paramInt) }), new IllegalArgumentException());
    return ((AlertDialog.Builder)localObject).create();
  }
  
  public static void f(Activity paramActivity, AlertDialog paramAlertDialog, String paramString, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    try
    {
      boolean bool = paramActivity instanceof x0.m;
      if (bool)
      {
        localObject = ((x0.m)paramActivity).getSupportFragmentManager();
        paramActivity = new l();
        if (paramAlertDialog != null)
        {
          paramAlertDialog.setOnCancelListener(null);
          paramAlertDialog.setOnDismissListener(null);
          w = paramAlertDialog;
          if (paramOnCancelListener != null) {
            x = paramOnCancelListener;
          }
          t = false;
          u = true;
          localObject.getClass();
          paramAlertDialog = new a((y)localObject);
          o = true;
          paramAlertDialog.e(0, paramActivity, paramString);
          paramAlertDialog.d(false);
          return;
        }
        throw new NullPointerException("Cannot display null dialog");
      }
    }
    catch (NoClassDefFoundError localNoClassDefFoundError)
    {
      Object localObject;
      for (;;) {}
    }
    paramActivity = paramActivity.getFragmentManager();
    localObject = new c();
    if (paramAlertDialog != null)
    {
      paramAlertDialog.setOnCancelListener(null);
      paramAlertDialog.setOnDismissListener(null);
      a = paramAlertDialog;
      if (paramOnCancelListener != null) {
        b = paramOnCancelListener;
      }
      ((c)localObject).show(paramActivity, paramString);
      return;
    }
    throw new NullPointerException("Cannot display null dialog");
  }
  
  public final Intent a(Context paramContext, String paramString, int paramInt)
  {
    return super.a(paramContext, paramString, paramInt);
  }
  
  @ResultIgnorabilityUnspecified
  public final int b(Context paramContext)
  {
    return super.b(paramContext);
  }
  
  public final int c(Context paramContext, int paramInt)
  {
    return super.c(paramContext, paramInt);
  }
  
  @ResultIgnorabilityUnspecified
  public final void d(Activity paramActivity, int paramInt, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    AlertDialog localAlertDialog = e(paramActivity, paramInt, new r(paramActivity, super.a(paramActivity, "d", paramInt)), paramOnCancelListener);
    if (localAlertDialog == null) {
      return;
    }
    f(paramActivity, localAlertDialog, "GooglePlayServicesErrorDialog", paramOnCancelListener);
  }
  
  public final void g(Context paramContext, int paramInt, PendingIntent arg3)
  {
    Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", new Object[] { Integer.valueOf(paramInt), null }), new IllegalArgumentException());
    if (paramInt == 18)
    {
      new m(this, paramContext).sendEmptyMessageDelayed(1, 120000L);
      return;
    }
    if (??? == null)
    {
      if (paramInt == 6) {
        Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
      }
      return;
    }
    String str;
    if (paramInt == 6) {
      str = m6.q.e(paramContext, "common_google_play_services_resolution_required_title");
    } else {
      str = m6.q.c(paramContext, paramInt);
    }
    Object localObject1 = str;
    if (str == null) {
      localObject1 = paramContext.getResources().getString(2131886130);
    }
    if ((paramInt != 6) && (paramInt != 19)) {
      str = m6.q.b(paramContext, paramInt);
    } else {
      str = m6.q.d(paramContext, "common_google_play_services_resolution_required_text", m6.q.a(paramContext));
    }
    Resources localResources = paramContext.getResources();
    Object localObject2 = paramContext.getSystemService("notification");
    m6.j.i(localObject2);
    localObject2 = (NotificationManager)localObject2;
    u.q localq = new u.q(paramContext, null);
    s = true;
    localq.d(16, true);
    e = u.q.b((CharSequence)localObject1);
    localObject1 = new p();
    b = u.q.b(str);
    localq.g((u.s)localObject1);
    localObject1 = paramContext.getPackageManager();
    if (b.e == null) {
      b.e = Boolean.valueOf(((PackageManager)localObject1).hasSystemFeature("android.hardware.type.watch"));
    }
    if (b.e.booleanValue())
    {
      int i = getApplicationInfoicon;
      B.icon = i;
      j = 2;
      if (b.f0(paramContext))
      {
        str = localResources.getString(2131886138);
        b.add(new n(2131230814, str, ???));
      }
      else
      {
        g = ???;
      }
    }
    else
    {
      B.icon = 17301642;
      localObject1 = localResources.getString(2131886130);
      B.tickerText = u.q.b((CharSequence)localObject1);
      long l = System.currentTimeMillis();
      B.when = l;
      g = ???;
      localq.c(str);
    }
    if (v6.e.a())
    {
      if (v6.e.a())
      {
        synchronized (c)
        {
          ??? = ((NotificationManager)localObject2).getNotificationChannel("com.google.android.gms.availability");
        }
        if (!paramContext.contentEquals(???.getName()))
        {
          ???.setName(paramContext);
          paramContext = ???;
          ((NotificationManager)localObject2).createNotificationChannel(paramContext);
        }
        y = "com.google.android.gms.availability";
      }
    }
    else
    {
      paramContext = localq.a();
      if ((paramInt != 1) && (paramInt != 2) && (paramInt != 3))
      {
        paramInt = 39789;
      }
      else
      {
        j.a.set(false);
        paramInt = 10436;
      }
      ((NotificationManager)localObject2).notify(paramInt, paramContext);
      return;
      paramContext = finally;
      throw paramContext;
    }
    throw new IllegalStateException();
  }
  
  @ResultIgnorabilityUnspecified
  public final void h(Activity paramActivity, g paramg, int paramInt, e1 parame1)
  {
    paramg = e(paramActivity, paramInt, new m6.s(super.a(paramActivity, "d", paramInt), paramg), parame1);
    if (paramg == null) {
      return;
    }
    f(paramActivity, paramg, "GooglePlayServicesErrorDialog", parame1);
  }
}

/* Location:
 * Qualified Name:     j6.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */