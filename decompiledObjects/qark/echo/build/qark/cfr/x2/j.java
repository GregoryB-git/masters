/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.AlertDialog
 *  android.app.AlertDialog$Builder
 *  android.app.Dialog
 *  android.app.FragmentManager
 *  android.app.Notification
 *  android.app.NotificationChannel
 *  android.app.NotificationManager
 *  android.app.PendingIntent
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnCancelListener
 *  android.content.DialogInterface$OnClickListener
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.content.pm.ApplicationInfo
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.util.AttributeSet
 *  android.util.Log
 *  android.util.TypedValue
 *  android.view.View
 *  android.widget.ProgressBar
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.NoClassDefFoundError
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.concurrent.atomic.AtomicBoolean
 */
package x2;

import A2.B;
import A2.y;
import E2.l;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.ProgressBar;
import com.google.android.gms.common.api.GoogleApiActivity;
import java.util.concurrent.atomic.AtomicBoolean;
import v2.a;
import w.h;
import x2.b;
import x2.c;
import x2.e;
import x2.f;
import x2.g;
import x2.h;
import x2.i;
import x2.k;
import x2.n;
import x2.q;
import x2.r;
import z2.D;
import z2.E;

public class j
extends k {
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
        return f;
    }

    @Override
    public Intent b(Context context, int n8, String string2) {
        return super.b(context, n8, string2);
    }

    @Override
    public PendingIntent c(Context context, int n8, int n9) {
        return super.c(context, n8, n9);
    }

    @Override
    public final String e(int n8) {
        return super.e(n8);
    }

    @Override
    public int g(Context context) {
        return super.g(context);
    }

    @Override
    public int h(Context context, int n8) {
        return super.h(context, n8);
    }

    @Override
    public final boolean j(int n8) {
        return super.j(n8);
    }

    public Dialog k(Activity activity, int n8, int n9, DialogInterface.OnCancelListener onCancelListener) {
        return this.p((Context)activity, n8, B.b(activity, this.b((Context)activity, n8, "d"), n9), onCancelListener);
    }

    public PendingIntent l(Context context, b b8) {
        if (b8.g()) {
            return b8.f();
        }
        return this.c(context, b8.a(), 0);
    }

    public boolean n(Activity activity, int n8, int n9, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialog = this.k(activity, n8, n9, onCancelListener);
        if (dialog == null) {
            return false;
        }
        this.s(activity, dialog, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public void o(Context context, int n8) {
        this.t(context, n8, null, this.d(context, n8, 0, "n"));
    }

    public final Dialog p(Context object, int n8, B b8, DialogInterface.OnCancelListener object2) {
        AlertDialog.Builder builder = null;
        if (n8 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        object.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals((Object)object.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder((Context)object, 5);
        }
        typedValue = builder;
        if (builder == null) {
            typedValue = new AlertDialog.Builder((Context)object);
        }
        typedValue.setMessage((CharSequence)y.d((Context)object, n8));
        if (object2 != null) {
            typedValue.setOnCancelListener((DialogInterface.OnCancelListener)object2);
        }
        if ((object2 = y.c((Context)object, n8)) != null) {
            typedValue.setPositiveButton((CharSequence)object2, (DialogInterface.OnClickListener)b8);
        }
        if ((object = y.g((Context)object, n8)) != null) {
            typedValue.setTitle((CharSequence)object);
        }
        Log.w((String)"GoogleApiAvailability", (String)String.format((String)"Creating dialog for Google Play services availability issue. ConnectionResult=%s", (Object[])new Object[]{n8}), (Throwable)new IllegalArgumentException());
        return typedValue.create();
    }

    public final Dialog q(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar((Context)activity, null, 16842874);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder((Context)activity);
        builder.setView((View)progressBar);
        builder.setMessage((CharSequence)y.d((Context)activity, 18));
        builder.setPositiveButton((CharSequence)"", null);
        progressBar = builder.create();
        this.s(activity, (Dialog)progressBar, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return progressBar;
    }

    public final E r(Context context, D d8) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        E e8 = new E(d8);
        K2.g.l(context, e8, intentFilter);
        e8.a(context);
        if (!this.i(context, "com.google.android.gms")) {
            d8.a();
            e8.b();
            return null;
        }
        return e8;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final void s(Activity var1_1, Dialog var2_2, String var3_3, DialogInterface.OnCancelListener var4_4) {
        try {
            var5_5 = var1_1 instanceof androidx.fragment.app.e;
            ** if (!var5_5) goto lbl-1000
        }
        catch (NoClassDefFoundError var6_6) {}
lbl-1000: // 1 sources:
        {
            var1_1 = ((androidx.fragment.app.e)var1_1).n();
            q.U1(var2_2, var4_4).T1((androidx.fragment.app.n)var1_1, var3_3);
            return;
        }
lbl-1000: // 1 sources:
        {
        }
        var1_1 = var1_1.getFragmentManager();
        c.a(var2_2, var4_4).show((FragmentManager)var1_1, var3_3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void t(Context object, int n8, String object2, PendingIntent object3) {
        Log.w((String)"GoogleApiAvailability", (String)String.format((String)"GMS core API Availability. ConnectionResult=%s, tag=%s", (Object[])new Object[]{n8, null}), (Throwable)new IllegalArgumentException());
        if (n8 == 18) {
            this.u((Context)object);
            return;
        }
        if (object3 == null) {
            if (n8 == 6) {
                Log.w((String)"GoogleApiAvailability", (String)"Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
            }
            return;
        }
        Object object4 = y.f((Context)object, n8);
        object2 = y.e((Context)object, n8);
        Resources resources = object.getResources();
        NotificationManager notificationManager = (NotificationManager)A2.n.i(object.getSystemService("notification"));
        object4 = new h.e((Context)object).r(true).g(true).l((CharSequence)object4).y(new h.c().h((CharSequence)object2));
        if (E2.i.c((Context)object)) {
            A2.n.l(l.e());
            object4.w(object.getApplicationInfo().icon).u(2);
            if (E2.i.d((Context)object)) {
                object4.a(a.a, resources.getString(v2.b.o), (PendingIntent)object3);
            } else {
                object4.j((PendingIntent)object3);
            }
        } else {
            object4.w(17301642).A(resources.getString(v2.b.h)).D(System.currentTimeMillis()).j((PendingIntent)object3).k((CharSequence)object2);
        }
        if (l.h()) {
            A2.n.l(l.h());
            object2 = e;
            synchronized (object2) {
                object3 = this.c;
            }
            object2 = object3;
            if (object3 == null) {
                object3 = "com.google.android.gms.availability";
                resources = e.a(notificationManager, "com.google.android.gms.availability");
                object = y.b((Context)object);
                if (resources == null) {
                    f.a(notificationManager, i.a("com.google.android.gms.availability", (CharSequence)object, 4));
                    object2 = object3;
                } else {
                    object2 = object3;
                    if (!object.contentEquals(g.a((NotificationChannel)resources))) {
                        h.a((NotificationChannel)resources, (CharSequence)object);
                        f.a(notificationManager, (NotificationChannel)resources);
                        object2 = object3;
                    }
                }
            }
            object4.h((String)object2);
        }
        object = object4.c();
        if (n8 != 1 && n8 != 2 && n8 != 3) {
            n8 = 39789;
        } else {
            n.b.set(false);
            n8 = 10436;
        }
        notificationManager.notify(n8, (Notification)object);
    }

    public final void u(Context context) {
        new r(this, context).sendEmptyMessageDelayed(1, 120000L);
    }

    public final boolean v(Activity activity, z2.g g8, int n8, int n9, DialogInterface.OnCancelListener onCancelListener) {
        if ((g8 = this.p((Context)activity, n8, B.c(g8, this.b((Context)activity, n8, "d"), 2), onCancelListener)) == null) {
            return false;
        }
        this.s(activity, (Dialog)g8, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public final boolean w(Context context, b b8, int n8) {
        if (G2.a.a(context)) {
            return false;
        }
        PendingIntent pendingIntent = this.l(context, b8);
        if (pendingIntent != null) {
            this.t(context, b8.a(), null, PendingIntent.getActivity((Context)context, (int)0, (Intent)GoogleApiActivity.a(context, pendingIntent, n8, true), (int)(K2.h.a | 134217728)));
            return true;
        }
        return false;
    }
}

