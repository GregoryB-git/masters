package B1;

import B1.m;
import O1.C0438a;
import O1.C0458v;
import O1.P;
import O1.r;
import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
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
import x1.C2146B;
import x1.F;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    public static SensorManager f687c;

    /* renamed from: d, reason: collision with root package name */
    public static l f688d;

    /* renamed from: e, reason: collision with root package name */
    public static String f689e;

    /* renamed from: h, reason: collision with root package name */
    public static volatile boolean f692h;

    /* renamed from: a, reason: collision with root package name */
    public static final e f685a = new e();

    /* renamed from: b, reason: collision with root package name */
    public static final m f686b = new m();

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicBoolean f690f = new AtomicBoolean(true);

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicBoolean f691g = new AtomicBoolean(false);

    public static final void d(String str) {
        boolean z7 = true;
        if (T1.a.d(e.class)) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            C0438a e7 = C0438a.f3802f.e(C2146B.l());
            JSONArray jSONArray = new JSONArray();
            String str2 = Build.MODEL;
            if (str2 == null) {
                str2 = "";
            }
            jSONArray.put(str2);
            if ((e7 == null ? null : e7.h()) != null) {
                jSONArray.put(e7.h());
            } else {
                jSONArray.put("");
            }
            jSONArray.put("0");
            jSONArray.put(G1.g.f() ? "1" : "0");
            Locale A7 = P.A();
            jSONArray.put(A7.getLanguage() + '_' + ((Object) A7.getCountry()));
            String jSONArray2 = jSONArray.toString();
            Intrinsics.checkNotNullExpressionValue(jSONArray2, "extInfoArray.toString()");
            bundle.putString("device_session_id", g());
            bundle.putString("extinfo", jSONArray2);
            F.c cVar = F.f20890n;
            x xVar = x.f16233a;
            String format = String.format(Locale.US, "%s/app_indexing_session", Arrays.copyOf(new Object[]{str}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
            JSONObject c7 = cVar.B(null, format, bundle, null).k().c();
            AtomicBoolean atomicBoolean = f691g;
            if (c7 == null || !c7.optBoolean("is_app_indexing_enabled", false)) {
                z7 = false;
            }
            atomicBoolean.set(z7);
            if (atomicBoolean.get()) {
                l lVar = f688d;
                if (lVar != null) {
                    lVar.h();
                }
            } else {
                f689e = null;
            }
            f692h = false;
        } catch (Throwable th) {
            T1.a.b(th, e.class);
        }
    }

    public static final void e() {
        if (T1.a.d(e.class)) {
            return;
        }
        try {
            f690f.set(false);
        } catch (Throwable th) {
            T1.a.b(th, e.class);
        }
    }

    public static final void f() {
        if (T1.a.d(e.class)) {
            return;
        }
        try {
            f690f.set(true);
        } catch (Throwable th) {
            T1.a.b(th, e.class);
        }
    }

    public static final String g() {
        if (T1.a.d(e.class)) {
            return null;
        }
        try {
            if (f689e == null) {
                f689e = UUID.randomUUID().toString();
            }
            String str = f689e;
            if (str != null) {
                return str;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } catch (Throwable th) {
            T1.a.b(th, e.class);
            return null;
        }
    }

    public static final boolean h() {
        if (T1.a.d(e.class)) {
            return false;
        }
        try {
            return f691g.get();
        } catch (Throwable th) {
            T1.a.b(th, e.class);
            return false;
        }
    }

    public static final void j(Activity activity) {
        if (T1.a.d(e.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(activity, "activity");
            g.f694f.a().f(activity);
        } catch (Throwable th) {
            T1.a.b(th, e.class);
        }
    }

    public static final void k(Activity activity) {
        if (T1.a.d(e.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (f690f.get()) {
                g.f694f.a().h(activity);
                l lVar = f688d;
                if (lVar != null) {
                    lVar.l();
                }
                SensorManager sensorManager = f687c;
                if (sensorManager == null) {
                    return;
                }
                sensorManager.unregisterListener(f686b);
            }
        } catch (Throwable th) {
            T1.a.b(th, e.class);
        }
    }

    public static final void l(Activity activity) {
        e eVar;
        if (T1.a.d(e.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (f690f.get()) {
                g.f694f.a().e(activity);
                Context applicationContext = activity.getApplicationContext();
                final String m7 = C2146B.m();
                final r f7 = C0458v.f(m7);
                if (!Intrinsics.a(f7 == null ? null : Boolean.valueOf(f7.b()), Boolean.TRUE)) {
                    if (f685a.i()) {
                    }
                    eVar = f685a;
                    if (eVar.i() || f691g.get()) {
                    }
                    eVar.c(m7);
                    return;
                }
                SensorManager sensorManager = (SensorManager) applicationContext.getSystemService("sensor");
                if (sensorManager == null) {
                    return;
                }
                f687c = sensorManager;
                Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                l lVar = new l(activity);
                f688d = lVar;
                m mVar = f686b;
                mVar.a(new m.b() { // from class: B1.c
                    @Override // B1.m.b
                    public final void a() {
                        e.m(r.this, m7);
                    }
                });
                sensorManager.registerListener(mVar, defaultSensor, 2);
                if (f7 != null && f7.b()) {
                    lVar.h();
                }
                eVar = f685a;
                if (eVar.i()) {
                }
            }
        } catch (Throwable th) {
            T1.a.b(th, e.class);
        }
    }

    public static final void m(r rVar, String appId) {
        if (T1.a.d(e.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(appId, "$appId");
            boolean z7 = rVar != null && rVar.b();
            boolean s7 = C2146B.s();
            if (z7 && s7) {
                f685a.c(appId);
            }
        } catch (Throwable th) {
            T1.a.b(th, e.class);
        }
    }

    public static final void n(boolean z7) {
        if (T1.a.d(e.class)) {
            return;
        }
        try {
            f691g.set(z7);
        } catch (Throwable th) {
            T1.a.b(th, e.class);
        }
    }

    public final void c(final String str) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            if (f692h) {
                return;
            }
            f692h = true;
            C2146B.t().execute(new Runnable() { // from class: B1.d
                @Override // java.lang.Runnable
                public final void run() {
                    e.d(str);
                }
            });
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }

    public final boolean i() {
        T1.a.d(this);
        return false;
    }
}
