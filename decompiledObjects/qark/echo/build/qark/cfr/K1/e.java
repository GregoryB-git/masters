/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  java.io.File
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.LinkedHashSet
 *  java.util.Set
 *  java.util.concurrent.atomic.AtomicBoolean
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package K1;

import G1.f;
import H1.f;
import K1.a;
import K1.d;
import K1.g;
import O1.v;
import android.app.Activity;
import java.io.File;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;
import x1.B;

public final class e {
    public static final e a = new e();
    public static final AtomicBoolean b = new AtomicBoolean(false);
    public static final Set c = new LinkedHashSet();
    public static final Set d = new LinkedHashSet();

    public static /* synthetic */ void a() {
        e.c();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void b() {
        synchronized (e.class) {
            boolean bl = T1.a.d(e.class);
            if (bl) {
                return;
            }
            try {
                B.t().execute((Runnable)new d());
            }
            catch (Throwable throwable) {
                T1.a.b(throwable, e.class);
                return;
            }
            return;
        }
    }

    public static final void c() {
        if (T1.a.d(e.class)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = b;
            if (atomicBoolean.get()) {
                return;
            }
            atomicBoolean.set(true);
            a.d();
            return;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, e.class);
            return;
        }
    }

    public static final boolean e(String string2) {
        if (T1.a.d(e.class)) {
            return false;
        }
        try {
            Intrinsics.checkNotNullParameter(string2, "event");
            boolean bl = d.contains((Object)string2);
            return bl;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, e.class);
            return false;
        }
    }

    public static final boolean f(String string2) {
        if (T1.a.d(e.class)) {
            return false;
        }
        try {
            Intrinsics.checkNotNullParameter(string2, "event");
            boolean bl = c.contains((Object)string2);
            return bl;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, e.class);
            return false;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void h(Activity activity) {
        if (T1.a.d(e.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter((Object)activity, "activity");
            try {
                if (b.get() && a.f() && (!c.isEmpty() || !d.isEmpty())) {
                    g.r.a(activity);
                    return;
                }
                g.r.b(activity);
                return;
            }
            catch (Exception exception) {
                return;
            }
        }
        catch (Throwable throwable) {}
        T1.a.b(throwable, e.class);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d() {
        if (T1.a.d(this)) {
            return;
        }
        try {
            Object object = v.a;
            object = v.q(B.m(), false);
            if (object == null) {
                return;
            }
            if ((object = object.m()) == null) {
                return;
            }
            this.g((String)object);
            if (!(c.isEmpty() ^ true)) {
                if (!(d.isEmpty() ^ true)) return;
            }
            object = H1.f.a;
            object = H1.f.l(f.a.p);
            if (object == null) {
                return;
            }
            a.d((File)object);
            object = f.l();
            if (object == null) return;
            e.h((Activity)object);
            return;
        }
        catch (Exception exception) {
            return;
        }
        catch (Throwable throwable) {}
        T1.a.b(throwable, this);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final void g(String var1_1) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            var1_1 = new JSONObject(var1_1);
            var6_4 = var1_1.has("production_events");
            var3_5 = 0;
            if (!var6_4 || (var5_7 = (var7_6 = var1_1.getJSONArray("production_events")).length()) <= 0) ** GOTO lbl17
            var2_8 = 0;
        }
        catch (Exception var1_3) {
            return;
        }
        catch (Throwable var1_2) {}
        do {
            block12 : {
                var4_9 = var2_8 + 1;
                var8_10 = e.c;
                var9_11 = var7_6.getString(var2_8);
                Intrinsics.checkNotNullExpressionValue(var9_11, "jsonArray.getString(i)");
                var8_10.add((Object)var9_11);
                if (var4_9 < var5_7) break block12;
lbl17: // 2 sources:
                if (var1_1.has("eligible_for_prediction_events") == false) return;
                var4_9 = (var1_1 = var1_1.getJSONArray("eligible_for_prediction_events")).length();
                if (var4_9 <= 0) return;
                var2_8 = var3_5;
                break;
            }
            var2_8 = var4_9;
            continue;
            break;
        } while (true);
        do {
            var3_5 = var2_8 + 1;
            var7_6 = e.d;
            var8_10 = var1_1.getString(var2_8);
            Intrinsics.checkNotNullExpressionValue(var8_10, "jsonArray.getString(i)");
            var7_6.add(var8_10);
            if (var3_5 >= var4_9) {
                return;
            }
            var2_8 = var3_5;
            continue;
            break;
        } while (true);
        T1.a.b(var1_2, this);
    }
}

