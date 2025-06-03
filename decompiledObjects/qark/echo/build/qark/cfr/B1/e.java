/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.hardware.Sensor
 *  android.hardware.SensorEventListener
 *  android.hardware.SensorManager
 *  android.os.Build
 *  android.os.Bundle
 *  java.lang.Boolean
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.Arrays
 *  java.util.Locale
 *  java.util.UUID
 *  java.util.concurrent.atomic.AtomicBoolean
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package B1;

import B1.c;
import B1.d;
import B1.g;
import B1.l;
import B1.m;
import O1.P;
import O1.a;
import O1.r;
import O1.v;
import T1.a;
import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.x;
import org.json.JSONArray;
import org.json.JSONObject;
import x1.B;
import x1.F;
import x1.K;

public final class e {
    public static final e a = new e();
    public static final m b = new m();
    public static SensorManager c;
    public static l d;
    public static String e;
    public static final AtomicBoolean f;
    public static final AtomicBoolean g;
    public static volatile boolean h;

    static {
        f = new AtomicBoolean(true);
        g = new AtomicBoolean(false);
    }

    public static /* synthetic */ void a(String string2) {
        e.d(string2);
    }

    public static /* synthetic */ void b(r r8, String string2) {
        e.m(r8, string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void d(String object) {
        boolean bl;
        Object object2;
        block10 : {
            block11 : {
                bl = true;
                Object object3 = "0";
                if (a.d(e.class)) {
                    return;
                }
                try {
                    Bundle bundle = new Bundle();
                    object2 = B.l();
                    O1.a a8 = O1.a.f.e((Context)object2);
                    JSONArray jSONArray = new JSONArray();
                    object2 = Build.MODEL;
                    if (object2 == null) {
                        object2 = "";
                    }
                    jSONArray.put(object2);
                    object2 = a8 == null ? null : a8.h();
                    if (object2 != null) {
                        jSONArray.put((Object)a8.h());
                    } else {
                        jSONArray.put((Object)"");
                    }
                    jSONArray.put((Object)"0");
                    object2 = object3;
                    if (G1.g.f()) {
                        object2 = "1";
                    }
                    jSONArray.put(object2);
                    object2 = P.A();
                    object3 = new StringBuilder();
                    object3.append(object2.getLanguage());
                    object3.append('_');
                    object3.append((Object)object2.getCountry());
                    jSONArray.put((Object)object3.toString());
                    object2 = jSONArray.toString();
                    Intrinsics.checkNotNullExpressionValue(object2, "extInfoArray.toString()");
                    bundle.putString("device_session_id", e.g());
                    bundle.putString("extinfo", (String)object2);
                    object2 = F.n;
                    object3 = x.a;
                    object = String.format((Locale)Locale.US, (String)"%s/app_indexing_session", (Object[])Arrays.copyOf((Object[])new Object[]{object}, (int)1));
                    Intrinsics.checkNotNullExpressionValue(object, "java.lang.String.format(locale, format, *args)");
                    object = object2.B(null, (String)object, bundle, null).k().c();
                    object2 = g;
                    if (object != null && object.optBoolean("is_app_indexing_enabled", false)) break block10;
                    break block11;
                }
                catch (Throwable throwable) {}
                a.b(throwable, e.class);
                return;
            }
            bl = false;
        }
        object2.set(bl);
        if (!object2.get()) {
            e = null;
        } else {
            object = d;
            if (object != null) {
                object.h();
            }
        }
        h = false;
    }

    public static final void e() {
        if (a.d(e.class)) {
            return;
        }
        try {
            f.set(false);
            return;
        }
        catch (Throwable throwable) {
            a.b(throwable, e.class);
            return;
        }
    }

    public static final void f() {
        if (a.d(e.class)) {
            return;
        }
        try {
            f.set(true);
            return;
        }
        catch (Throwable throwable) {
            a.b(throwable, e.class);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final String g() {
        if (a.d(e.class)) {
            return null;
        }
        try {
            String string2;
            if (e == null) {
                e = UUID.randomUUID().toString();
            }
            if ((string2 = e) != null) {
                return string2;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        catch (Throwable throwable) {}
        a.b(throwable, e.class);
        return null;
    }

    public static final boolean h() {
        if (a.d(e.class)) {
            return false;
        }
        try {
            boolean bl = g.get();
            return bl;
        }
        catch (Throwable throwable) {
            a.b(throwable, e.class);
            return false;
        }
    }

    public static final void j(Activity activity) {
        if (a.d(e.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter((Object)activity, "activity");
            g.f.a().f(activity);
            return;
        }
        catch (Throwable throwable) {
            a.b(throwable, e.class);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void k(Activity object) {
        if (a.d(e.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(object, "activity");
            if (!f.get()) {
                return;
            }
            g.f.a().h((Activity)object);
            object = d;
            if (object != null) {
                object.l();
            }
            object = c;
            if (object == null) {
                return;
            }
            object.unregisterListener((SensorEventListener)b);
            return;
        }
        catch (Throwable throwable) {
            a.b(throwable, e.class);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void l(Activity object) {
        if (a.d(e.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(object, "activity");
            if (!f.get()) {
                return;
            }
            g.f.a().e((Activity)object);
            Context context = object.getApplicationContext();
            String string2 = B.m();
            r r8 = v.f(string2);
            Boolean bl = r8 == null ? null : Boolean.valueOf((boolean)r8.b());
            if (Intrinsics.a((Object)bl, (Object)Boolean.TRUE) || a.i()) {
                bl = (SensorManager)context.getSystemService("sensor");
                if (bl == null) {
                    return;
                }
                c = bl;
                context = bl.getDefaultSensor(1);
                d = object = new l((Activity)object);
                m m8 = b;
                m8.a(new c(r8, string2));
                bl.registerListener((SensorEventListener)m8, (Sensor)context, 2);
                if (r8 != null && r8.b()) {
                    object.h();
                }
            }
            if ((object = a).i() && !g.get()) {
                object.c(string2);
            }
            return;
        }
        catch (Throwable throwable) {}
        a.b(throwable, e.class);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void m(r r8, String string2) {
        boolean bl;
        if (a.d(e.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(string2, "$appId");
            bl = r8 != null && r8.b();
        }
        catch (Throwable throwable) {}
        a.b(throwable, e.class);
        return;
        boolean bl2 = B.s();
        if (bl && bl2) {
            a.c(string2);
        }
    }

    public static final void n(boolean bl) {
        if (a.d(e.class)) {
            return;
        }
        try {
            g.set(bl);
            return;
        }
        catch (Throwable throwable) {
            a.b(throwable, e.class);
            return;
        }
    }

    public final void c(String string2) {
        if (a.d(this)) {
            return;
        }
        try {
            if (h) {
                return;
            }
            h = true;
            B.t().execute((Runnable)new d(string2));
            return;
        }
        catch (Throwable throwable) {
            a.b(throwable, this);
            return;
        }
    }

    public final boolean i() {
        a.d(this);
        return false;
    }
}

