/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Set
 */
package z1;

import O1.P;
import O1.a;
import O1.v;
import android.app.Activity;
import android.content.Context;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import x1.B;
import z1.a;
import z1.d;
import z1.f;

public final class b {
    public static final b a = new b();
    public static final String b = b.class.getCanonicalName();
    public static boolean c;

    public static /* synthetic */ void a() {
        b.c();
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static final void b() {
        Throwable throwable2222;
        block5 : {
            if (T1.a.d(b.class)) {
                return;
            }
            try {
                B.t().execute((Runnable)new a());
                return;
            }
            catch (Throwable throwable2222) {
                break block5;
            }
            catch (Exception exception) {
                P p8 = P.a;
                P.i0(b, exception);
                return;
            }
        }
        T1.a.b(throwable2222, b.class);
    }

    public static final void c() {
        Throwable throwable2;
        block4 : {
            if (T1.a.d(b.class)) {
                return;
            }
            try {
                Context context = B.l();
                if (!O1.a.f.h(context)) {
                    a.e();
                    c = true;
                    return;
                }
            }
            catch (Throwable throwable2) {
                break block4;
            }
            return;
        }
        T1.a.b(throwable2, b.class);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static final void d(Activity activity) {
        if (T1.a.d(b.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter((Object)activity, "activity");
            if (!c) return;
            if (d.d.c().isEmpty()) {
                return;
            }
            f.s.e(activity);
            return;
        }
        catch (Throwable throwable222) {}
        T1.a.b(throwable222, b.class);
        return;
        catch (Exception exception) {
            return;
        }
    }

    public final void e() {
        Object object;
        block6 : {
            block5 : {
                if (T1.a.d(this)) {
                    return;
                }
                try {
                    object = v.a;
                    object = v.q(B.m(), false);
                    if (object != null) break block5;
                    return;
                }
                catch (Throwable throwable) {
                    T1.a.b(throwable, this);
                    return;
                }
            }
            object = object.h();
            if (object != null) break block6;
            return;
        }
        d.d.d((String)object);
    }
}

