/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package x2;

import A2.l0;
import E2.i;
import G2.d;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import x2.n;

public class k {
    public static final int a = n.a;
    public static final k b = new k();

    public static k f() {
        return b;
    }

    public int a(Context context) {
        return n.a(context);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Intent b(Context context, int n8, String string2) {
        if (n8 != 1 && n8 != 2) {
            if (n8 == 3) return l0.c("com.google.android.gms");
            return null;
        }
        if (context != null) {
            if (i.d(context)) return l0.a();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("gcore_");
        stringBuilder.append(a);
        stringBuilder.append("-");
        if (!TextUtils.isEmpty((CharSequence)string2)) {
            stringBuilder.append(string2);
        }
        stringBuilder.append("-");
        if (context != null) {
            stringBuilder.append(context.getPackageName());
        }
        stringBuilder.append("-");
        if (context == null) return l0.b("com.google.android.gms", stringBuilder.toString());
        try {
            stringBuilder.append(d.a((Context)context).e((String)context.getPackageName(), (int)0).versionCode);
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            return l0.b("com.google.android.gms", stringBuilder.toString());
        }
        return l0.b("com.google.android.gms", stringBuilder.toString());
    }

    public PendingIntent c(Context context, int n8, int n9) {
        return this.d(context, n8, n9, null);
    }

    public PendingIntent d(Context context, int n8, int n9, String string2) {
        if ((string2 = this.b(context, n8, string2)) == null) {
            return null;
        }
        return PendingIntent.getActivity((Context)context, (int)n9, (Intent)string2, (int)(M2.d.a | 134217728));
    }

    public String e(int n8) {
        return n.b(n8);
    }

    public int g(Context context) {
        return this.h(context, a);
    }

    public int h(Context context, int n8) {
        if (n.f(context, n8 = n.e(context, n8))) {
            return 18;
        }
        return n8;
    }

    public boolean i(Context context, String string2) {
        return n.j(context, string2);
    }

    public boolean j(int n8) {
        return n.h(n8);
    }
}

