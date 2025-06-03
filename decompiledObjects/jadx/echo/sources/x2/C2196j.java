package x2;

import A2.AbstractC0328n;
import A2.AbstractC0338y;
import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import com.google.android.gms.common.api.GoogleApiActivity;
import v2.AbstractC2050a;
import v2.AbstractC2051b;
import w.h;
import z2.AbstractC2295D;
import z2.C2296E;
import z2.InterfaceC2304g;

/* renamed from: x2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2196j extends C2197k {

    /* renamed from: c, reason: collision with root package name */
    public String f21181c;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f21179e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public static final C2196j f21180f = new C2196j();

    /* renamed from: d, reason: collision with root package name */
    public static final int f21178d = C2197k.f21182a;

    public static C2196j m() {
        return f21180f;
    }

    @Override // x2.C2197k
    public Intent b(Context context, int i7, String str) {
        return super.b(context, i7, str);
    }

    @Override // x2.C2197k
    public PendingIntent c(Context context, int i7, int i8) {
        return super.c(context, i7, i8);
    }

    @Override // x2.C2197k
    public final String e(int i7) {
        return super.e(i7);
    }

    @Override // x2.C2197k
    public int g(Context context) {
        return super.g(context);
    }

    @Override // x2.C2197k
    public int h(Context context, int i7) {
        return super.h(context, i7);
    }

    @Override // x2.C2197k
    public final boolean j(int i7) {
        return super.j(i7);
    }

    public Dialog k(Activity activity, int i7, int i8, DialogInterface.OnCancelListener onCancelListener) {
        return p(activity, i7, A2.B.b(activity, b(activity, i7, "d"), i8), onCancelListener);
    }

    public PendingIntent l(Context context, C2188b c2188b) {
        return c2188b.g() ? c2188b.f() : c(context, c2188b.a(), 0);
    }

    public boolean n(Activity activity, int i7, int i8, DialogInterface.OnCancelListener onCancelListener) {
        Dialog k7 = k(activity, i7, i8, onCancelListener);
        if (k7 == null) {
            return false;
        }
        s(activity, k7, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public void o(Context context, int i7) {
        t(context, i7, null, d(context, i7, 0, "n"));
    }

    public final Dialog p(Context context, int i7, A2.B b7, DialogInterface.OnCancelListener onCancelListener) {
        if (i7 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(AbstractC0338y.d(context, i7));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String c7 = AbstractC0338y.c(context, i7);
        if (c7 != null) {
            builder.setPositiveButton(c7, b7);
        }
        String g7 = AbstractC0338y.g(context, i7);
        if (g7 != null) {
            builder.setTitle(g7);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i7)), new IllegalArgumentException());
        return builder.create();
    }

    public final Dialog q(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleLarge);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(AbstractC0338y.d(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        s(activity, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    public final C2296E r(Context context, AbstractC2295D abstractC2295D) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        C2296E c2296e = new C2296E(abstractC2295D);
        K2.g.l(context, c2296e, intentFilter);
        c2296e.a(context);
        if (i(context, "com.google.android.gms")) {
            return c2296e;
        }
        abstractC2295D.a();
        c2296e.b();
        return null;
    }

    public final void s(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof androidx.fragment.app.e) {
                C2203q.U1(dialog, onCancelListener).T1(((androidx.fragment.app.e) activity).n(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        DialogFragmentC2189c.a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    public final void t(Context context, int i7, String str, PendingIntent pendingIntent) {
        int i8;
        String str2;
        NotificationChannel notificationChannel;
        CharSequence name;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i7), null), new IllegalArgumentException());
        if (i7 == 18) {
            u(context);
            return;
        }
        if (pendingIntent == null) {
            if (i7 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String f7 = AbstractC0338y.f(context, i7);
        String e7 = AbstractC0338y.e(context, i7);
        Resources resources = context.getResources();
        NotificationManager notificationManager = (NotificationManager) AbstractC0328n.i(context.getSystemService("notification"));
        h.e y7 = new h.e(context).r(true).g(true).l(f7).y(new h.c().h(e7));
        if (E2.i.c(context)) {
            AbstractC0328n.l(E2.l.e());
            y7.w(context.getApplicationInfo().icon).u(2);
            if (E2.i.d(context)) {
                y7.a(AbstractC2050a.f20121a, resources.getString(AbstractC2051b.f20136o), pendingIntent);
            } else {
                y7.j(pendingIntent);
            }
        } else {
            y7.w(R.drawable.stat_sys_warning).A(resources.getString(AbstractC2051b.f20129h)).D(System.currentTimeMillis()).j(pendingIntent).k(e7);
        }
        if (E2.l.h()) {
            AbstractC0328n.l(E2.l.h());
            synchronized (f21179e) {
                str2 = this.f21181c;
            }
            if (str2 == null) {
                str2 = "com.google.android.gms.availability";
                notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String b7 = AbstractC0338y.b(context);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(AbstractC2195i.a("com.google.android.gms.availability", b7, 4));
                } else {
                    name = notificationChannel.getName();
                    if (!b7.contentEquals(name)) {
                        notificationChannel.setName(b7);
                        notificationManager.createNotificationChannel(notificationChannel);
                    }
                }
            }
            y7.h(str2);
        }
        Notification c7 = y7.c();
        if (i7 == 1 || i7 == 2 || i7 == 3) {
            AbstractC2200n.f21187b.set(false);
            i8 = 10436;
        } else {
            i8 = 39789;
        }
        notificationManager.notify(i8, c7);
    }

    public final void u(Context context) {
        new HandlerC2204r(this, context).sendEmptyMessageDelayed(1, 120000L);
    }

    public final boolean v(Activity activity, InterfaceC2304g interfaceC2304g, int i7, int i8, DialogInterface.OnCancelListener onCancelListener) {
        Dialog p7 = p(activity, i7, A2.B.c(interfaceC2304g, b(activity, i7, "d"), 2), onCancelListener);
        if (p7 == null) {
            return false;
        }
        s(activity, p7, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public final boolean w(Context context, C2188b c2188b, int i7) {
        PendingIntent l7;
        if (G2.a.a(context) || (l7 = l(context, c2188b)) == null) {
            return false;
        }
        t(context, c2188b.a(), null, PendingIntent.getActivity(context, 0, GoogleApiActivity.a(context, l7, i7, true), K2.h.f3188a | 134217728));
        return true;
    }
}
