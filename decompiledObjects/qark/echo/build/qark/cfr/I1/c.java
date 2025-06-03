/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.Set
 */
package I1;

import I1.a;
import I1.b;
import I1.e;
import O1.P;
import W5.I;
import W5.m;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import x1.B;

public final class c {
    public static final c a = new c();
    public static final Set b = I.f("fb_mobile_purchase", "StartTrial", "Subscribe");

    public static /* synthetic */ void a(String string2, y1.e e8) {
        c.f(string2, e8);
    }

    public static /* synthetic */ void b(Context context, String string2, String string3) {
        c.h(context, string2, string3);
    }

    public static final boolean d() {
        Throwable throwable2;
        block4 : {
            if (T1.a.d(c.class)) {
                return false;
            }
            try {
                boolean bl;
                if (!B.z(B.l()) && !P.Z() && (bl = e.b())) {
                    return true;
                }
            }
            catch (Throwable throwable2) {
                break block4;
            }
            return false;
        }
        T1.a.b(throwable2, c.class);
        return false;
    }

    public static final void e(String string2, y1.e e8) {
        Throwable throwable2;
        block4 : {
            if (T1.a.d(c.class)) {
                return;
            }
            try {
                Intrinsics.checkNotNullParameter(string2, "applicationId");
                Intrinsics.checkNotNullParameter(e8, "event");
                if (a.c(e8)) {
                    B.t().execute((Runnable)new a(string2, e8));
                    return;
                }
            }
            catch (Throwable throwable2) {
                break block4;
            }
            return;
        }
        T1.a.b(throwable2, c.class);
    }

    public static final void f(String string2, y1.e e8) {
        if (T1.a.d(c.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(string2, "$applicationId");
            Intrinsics.checkNotNullParameter(e8, "$event");
            e e9 = e.a;
            e.c(string2, m.b(e8));
            return;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, c.class);
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final void g(String string2, String string3) {
        Context context;
        if (T1.a.d(c.class)) {
            return;
        }
        try {
            context = B.l();
            if (context == null || string2 == null || string3 == null) return;
        }
        catch (Throwable throwable) {}
        B.t().execute((Runnable)new b(context, string3, string2));
        return;
        T1.a.b(throwable, c.class);
    }

    public static final void h(Context object, String string2, String string3) {
        Throwable throwable2;
        block4 : {
            if (T1.a.d(c.class)) {
                return;
            }
            try {
                Intrinsics.checkNotNullParameter(object, "$context");
                string2 = object.getSharedPreferences(string2, 0);
                object = Intrinsics.i(string3, "pingForOnDevice");
                if (string2.getLong((String)object, 0L) == 0L) {
                    e.e(string3);
                    string2 = string2.edit();
                    string2.putLong((String)object, System.currentTimeMillis());
                    string2.apply();
                    return;
                }
            }
            catch (Throwable throwable2) {
                break block4;
            }
            return;
        }
        T1.a.b(throwable2, c.class);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean c(y1.e e8) {
        boolean bl;
        boolean bl2 = T1.a.d(this);
        boolean bl3 = false;
        if (bl2) {
            return false;
        }
        try {
            bl = e8.h() && b.contains((Object)e8.f());
        }
        catch (Throwable throwable) {}
        bl2 = e8.h();
        if (bl2 ^ true) return true;
        if (!bl) return bl3;
        return true;
        T1.a.b(throwable, this);
        return false;
    }
}

