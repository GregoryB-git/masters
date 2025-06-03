package j6;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.gms.internal.base.zad;
import com.google.android.gms.internal.base.zae;
import com.google.errorprone.annotations.RestrictedInheritance;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingUtils;
import l6.e1;

@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms.*", allowlistAnnotations = {zad.class, zae.class}, explanation = "Sub classing of GMS Core's APIs are restricted to GMS Core client libs and testing fakes.", link = "go/gmscore-restrictedinheritance")
/* loaded from: classes.dex */
public final class e extends f {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f8487c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final e f8488d = new e();

    public static AlertDialog e(Context context, int i10, m6.t tVar, DialogInterface.OnCancelListener onCancelListener) {
        if (i10 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(m6.q.b(context, i10));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String string = context.getResources().getString(i10 != 1 ? i10 != 2 ? i10 != 3 ? R.string.ok : io.meduza.meduza.R.string.common_google_play_services_enable_button : io.meduza.meduza.R.string.common_google_play_services_update_button : io.meduza.meduza.R.string.common_google_play_services_install_button);
        if (string != null) {
            builder.setPositiveButton(string, tVar);
        }
        String c10 = m6.q.c(context, i10);
        if (c10 != null) {
            builder.setTitle(c10);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i10)), new IllegalArgumentException());
        return builder.create();
    }

    public static void f(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof x0.m) {
                x0.y supportFragmentManager = ((x0.m) activity).getSupportFragmentManager();
                l lVar = new l();
                if (alertDialog == null) {
                    throw new NullPointerException("Cannot display null dialog");
                }
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                lVar.f8507w = alertDialog;
                if (onCancelListener != null) {
                    lVar.f8508x = onCancelListener;
                }
                lVar.t = false;
                lVar.f16648u = true;
                supportFragmentManager.getClass();
                x0.a aVar = new x0.a(supportFragmentManager);
                aVar.f16629o = true;
                aVar.e(0, lVar, str);
                aVar.d(false);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        c cVar = new c();
        if (alertDialog == null) {
            throw new NullPointerException("Cannot display null dialog");
        }
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        cVar.f8477a = alertDialog;
        if (onCancelListener != null) {
            cVar.f8478b = onCancelListener;
        }
        cVar.show(fragmentManager, str);
    }

    @Override // j6.f
    public final Intent a(Context context, String str, int i10) {
        return super.a(context, str, i10);
    }

    @Override // j6.f
    @ResultIgnorabilityUnspecified
    public final int b(Context context) {
        return super.b(context);
    }

    @Override // j6.f
    public final int c(Context context, int i10) {
        return super.c(context, i10);
    }

    @ResultIgnorabilityUnspecified
    public final void d(Activity activity, int i10, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog e10 = e(activity, i10, new m6.r(activity, super.a(activity, "d", i10)), onCancelListener);
        if (e10 == null) {
            return;
        }
        f(activity, e10, "GooglePlayServicesErrorDialog", onCancelListener);
    }

    public final void g(Context context, int i10, PendingIntent pendingIntent) {
        int i11;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i10), null), new IllegalArgumentException());
        if (i10 == 18) {
            new m(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i10 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String e10 = i10 == 6 ? m6.q.e(context, "common_google_play_services_resolution_required_title") : m6.q.c(context, i10);
        if (e10 == null) {
            e10 = context.getResources().getString(io.meduza.meduza.R.string.common_google_play_services_notification_ticker);
        }
        String d10 = (i10 == 6 || i10 == 19) ? m6.q.d(context, "common_google_play_services_resolution_required_text", m6.q.a(context)) : m6.q.b(context, i10);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService(FlutterFirebaseMessagingUtils.EXTRA_REMOTE_MESSAGE);
        m6.j.i(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        u.q qVar = new u.q(context, null);
        qVar.f14838s = true;
        qVar.d(16, true);
        qVar.f14825e = u.q.b(e10);
        u.p pVar = new u.p();
        pVar.f14820b = u.q.b(d10);
        qVar.g(pVar);
        PackageManager packageManager = context.getPackageManager();
        if (x6.b.f17195e == null) {
            x6.b.f17195e = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (x6.b.f17195e.booleanValue()) {
            qVar.B.icon = context.getApplicationInfo().icon;
            qVar.f14829j = 2;
            if (x6.b.f0(context)) {
                qVar.f14822b.add(new u.n(2131230814, resources.getString(io.meduza.meduza.R.string.common_open_on_phone), pendingIntent));
            } else {
                qVar.f14826g = pendingIntent;
            }
        } else {
            qVar.B.icon = R.drawable.stat_sys_warning;
            qVar.B.tickerText = u.q.b(resources.getString(io.meduza.meduza.R.string.common_google_play_services_notification_ticker));
            qVar.B.when = System.currentTimeMillis();
            qVar.f14826g = pendingIntent;
            qVar.c(d10);
        }
        if (v6.e.a()) {
            if (!v6.e.a()) {
                throw new IllegalStateException();
            }
            synchronized (f8487c) {
            }
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(io.meduza.meduza.R.string.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationChannel = new NotificationChannel("com.google.android.gms.availability", string, 4);
            } else {
                if (!string.contentEquals(notificationChannel.getName())) {
                    notificationChannel.setName(string);
                }
                qVar.f14843y = "com.google.android.gms.availability";
            }
            notificationManager.createNotificationChannel(notificationChannel);
            qVar.f14843y = "com.google.android.gms.availability";
        }
        Notification a10 = qVar.a();
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            j.f8500a.set(false);
            i11 = 10436;
        } else {
            i11 = 39789;
        }
        notificationManager.notify(i11, a10);
    }

    @ResultIgnorabilityUnspecified
    public final void h(Activity activity, l6.g gVar, int i10, e1 e1Var) {
        AlertDialog e10 = e(activity, i10, new m6.s(super.a(activity, "d", i10), gVar), e1Var);
        if (e10 == null) {
            return;
        }
        f(activity, e10, "GooglePlayServicesErrorDialog", e1Var);
    }
}
