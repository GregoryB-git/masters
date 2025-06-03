// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package x2;

import com.google.android.gms.common.api.GoogleApiActivity;
import android.app.Notification;
import android.app.NotificationChannel;
import android.content.res.Resources;
import v2.a;
import E2.l;
import E2.i;
import w.h;
import android.app.NotificationManager;
import android.app.FragmentManager;
import androidx.fragment.app.n;
import androidx.fragment.app.e;
import android.content.BroadcastReceiver;
import K2.g;
import android.content.IntentFilter;
import z2.E;
import z2.D;
import android.app.AlertDialog;
import android.view.View;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import android.util.Log;
import android.content.DialogInterface$OnClickListener;
import A2.y;
import android.app.AlertDialog$Builder;
import android.util.TypedValue;
import A2.B;
import android.app.Dialog;
import android.content.DialogInterface$OnCancelListener;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.Context;

public class j extends k
{
    public static final int d;
    public static final Object e;
    public static final j f;
    public String c;
    
    static {
        e = new Object();
        f = new j();
        d = k.a;
    }
    
    public static j m() {
        return j.f;
    }
    
    @Override
    public Intent b(final Context context, final int n, final String s) {
        return super.b(context, n, s);
    }
    
    @Override
    public PendingIntent c(final Context context, final int n, final int n2) {
        return super.c(context, n, n2);
    }
    
    @Override
    public final String e(final int n) {
        return super.e(n);
    }
    
    @Override
    public int g(final Context context) {
        return super.g(context);
    }
    
    @Override
    public int h(final Context context, final int n) {
        return super.h(context, n);
    }
    
    @Override
    public final boolean j(final int n) {
        return super.j(n);
    }
    
    public Dialog k(final Activity activity, final int n, final int n2, final DialogInterface$OnCancelListener dialogInterface$OnCancelListener) {
        return this.p((Context)activity, n, B.b(activity, this.b((Context)activity, n, "d"), n2), dialogInterface$OnCancelListener);
    }
    
    public PendingIntent l(final Context context, final b b) {
        if (b.g()) {
            return b.f();
        }
        return this.c(context, b.a(), 0);
    }
    
    public boolean n(final Activity activity, final int n, final int n2, final DialogInterface$OnCancelListener dialogInterface$OnCancelListener) {
        final Dialog k = this.k(activity, n, n2, dialogInterface$OnCancelListener);
        if (k == null) {
            return false;
        }
        this.s(activity, k, "GooglePlayServicesErrorDialog", dialogInterface$OnCancelListener);
        return true;
    }
    
    public void o(final Context context, final int n) {
        this.t(context, n, null, this.d(context, n, 0, "n"));
    }
    
    public final Dialog p(final Context context, final int i, final B b, final DialogInterface$OnCancelListener onCancelListener) {
        AlertDialog$Builder alertDialog$Builder = null;
        if (i == 0) {
            return null;
        }
        final TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            alertDialog$Builder = new AlertDialog$Builder(context, 5);
        }
        AlertDialog$Builder alertDialog$Builder2;
        if ((alertDialog$Builder2 = alertDialog$Builder) == null) {
            alertDialog$Builder2 = new AlertDialog$Builder(context);
        }
        alertDialog$Builder2.setMessage((CharSequence)y.d(context, i));
        if (onCancelListener != null) {
            alertDialog$Builder2.setOnCancelListener(onCancelListener);
        }
        final String c = y.c(context, i);
        if (c != null) {
            alertDialog$Builder2.setPositiveButton((CharSequence)c, (DialogInterface$OnClickListener)b);
        }
        final String g = y.g(context, i);
        if (g != null) {
            alertDialog$Builder2.setTitle((CharSequence)g);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", i), (Throwable)new IllegalArgumentException());
        return (Dialog)alertDialog$Builder2.create();
    }
    
    public final Dialog q(final Activity activity, final DialogInterface$OnCancelListener dialogInterface$OnCancelListener) {
        final ProgressBar view = new ProgressBar((Context)activity, (AttributeSet)null, 16842874);
        view.setIndeterminate(true);
        ((View)view).setVisibility(0);
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context)activity);
        alertDialog$Builder.setView((View)view);
        alertDialog$Builder.setMessage((CharSequence)y.d((Context)activity, 18));
        alertDialog$Builder.setPositiveButton((CharSequence)"", (DialogInterface$OnClickListener)null);
        final AlertDialog create = alertDialog$Builder.create();
        this.s(activity, (Dialog)create, "GooglePlayServicesUpdatingDialog", dialogInterface$OnCancelListener);
        return (Dialog)create;
    }
    
    public final E r(final Context context, final D d) {
        final IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        final E e = new E(d);
        g.l(context, e, intentFilter);
        e.a(context);
        if (!this.i(context, "com.google.android.gms")) {
            d.a();
            e.b();
            return null;
        }
        return e;
    }
    
    public final void s(Activity activity, final Dialog dialog, final String s, final DialogInterface$OnCancelListener dialogInterface$OnCancelListener) {
        while (true) {
            try {
                if (activity instanceof e) {
                    activity = (Activity)((e)activity).n();
                    q.U1(dialog, dialogInterface$OnCancelListener).T1((n)activity, s);
                    return;
                }
                activity = (Activity)activity.getFragmentManager();
                x2.c.a(dialog, dialogInterface$OnCancelListener).show((FragmentManager)activity, s);
            }
            catch (NoClassDefFoundError noClassDefFoundError) {
                continue;
            }
            break;
        }
    }
    
    public final void t(final Context context, int i, String s, final PendingIntent pendingIntent) {
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", i, null), (Throwable)new IllegalArgumentException());
        if (i == 18) {
            this.u(context);
            return;
        }
        if (pendingIntent == null) {
            if (i == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
            }
            return;
        }
        final String f = y.f(context, i);
        s = y.e(context, i);
        final Resources resources = context.getResources();
        final NotificationManager notificationManager = (NotificationManager)A2.n.i(context.getSystemService("notification"));
        final h.e y = new h.e(context).r(true).g(true).l(f).y(new h.c().h(s));
        if (i.c(context)) {
            A2.n.l(l.e());
            y.w(context.getApplicationInfo().icon).u(2);
            if (i.d(context)) {
                y.a(v2.a.a, resources.getString(v2.b.o), pendingIntent);
            }
            else {
                y.j(pendingIntent);
            }
        }
        else {
            y.w(17301642).A(resources.getString(v2.b.h)).D(System.currentTimeMillis()).j(pendingIntent).k(s);
        }
        Label_0362: {
            if (!l.h()) {
                break Label_0362;
            }
            A2.n.l(l.h());
            s = (String)j.e;
            synchronized (s) {
                final String c = this.c;
                // monitorexit(s)
                s = c;
                if (c == null) {
                    final String s2 = "com.google.android.gms.availability";
                    final NotificationChannel a = x2.e.a(notificationManager, "com.google.android.gms.availability");
                    final String b = A2.y.b(context);
                    if (a == null) {
                        x2.f.a(notificationManager, i.a("com.google.android.gms.availability", b, 4));
                        s = s2;
                    }
                    else {
                        s = s2;
                        if (!b.contentEquals(x2.g.a(a))) {
                            x2.h.a(a, (CharSequence)b);
                            x2.f.a(notificationManager, a);
                            s = s2;
                        }
                    }
                }
                y.h(s);
                final Notification c2 = y.c();
                if (i != 1 && i != 2 && i != 3) {
                    i = 39789;
                }
                else {
                    x2.n.b.set(false);
                    i = 10436;
                }
                notificationManager.notify(i, c2);
            }
        }
    }
    
    public final void u(final Context context) {
        new r(this, context).sendEmptyMessageDelayed(1, 120000L);
    }
    
    public final boolean v(final Activity activity, final z2.g g, final int n, final int n2, final DialogInterface$OnCancelListener dialogInterface$OnCancelListener) {
        final Dialog p5 = this.p((Context)activity, n, B.c(g, this.b((Context)activity, n, "d"), 2), dialogInterface$OnCancelListener);
        if (p5 == null) {
            return false;
        }
        this.s(activity, p5, "GooglePlayServicesErrorDialog", dialogInterface$OnCancelListener);
        return true;
    }
    
    public final boolean w(final Context context, final b b, final int n) {
        if (G2.a.a(context)) {
            return false;
        }
        final PendingIntent l = this.l(context, b);
        if (l != null) {
            this.t(context, b.a(), null, PendingIntent.getActivity(context, 0, GoogleApiActivity.a(context, l, n, true), K2.h.a | 0x8000000));
            return true;
        }
        return false;
    }
}
