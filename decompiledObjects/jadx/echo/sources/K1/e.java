package K1;

import H1.f;
import O1.C0458v;
import O1.r;
import android.app.Activity;
import java.io.File;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;
import x1.C2146B;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f3161a = new e();

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f3162b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public static final Set f3163c = new LinkedHashSet();

    /* renamed from: d, reason: collision with root package name */
    public static final Set f3164d = new LinkedHashSet();

    public static final synchronized void b() {
        synchronized (e.class) {
            if (T1.a.d(e.class)) {
                return;
            }
            try {
                C2146B.t().execute(new Runnable() { // from class: K1.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        e.c();
                    }
                });
            } catch (Throwable th) {
                T1.a.b(th, e.class);
            }
        }
    }

    public static final void c() {
        if (T1.a.d(e.class)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = f3162b;
            if (atomicBoolean.get()) {
                return;
            }
            atomicBoolean.set(true);
            f3161a.d();
        } catch (Throwable th) {
            T1.a.b(th, e.class);
        }
    }

    public static final boolean e(String event) {
        if (T1.a.d(e.class)) {
            return false;
        }
        try {
            Intrinsics.checkNotNullParameter(event, "event");
            return f3164d.contains(event);
        } catch (Throwable th) {
            T1.a.b(th, e.class);
            return false;
        }
    }

    public static final boolean f(String event) {
        if (T1.a.d(e.class)) {
            return false;
        }
        try {
            Intrinsics.checkNotNullParameter(event, "event");
            return f3163c.contains(event);
        } catch (Throwable th) {
            T1.a.b(th, e.class);
            return false;
        }
    }

    public static final void h(Activity activity) {
        if (T1.a.d(e.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(activity, "activity");
            try {
                if (!f3162b.get() || !a.f() || (f3163c.isEmpty() && f3164d.isEmpty())) {
                    g.f3166r.b(activity);
                    return;
                }
                g.f3166r.a(activity);
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            T1.a.b(th, e.class);
        }
    }

    public final void d() {
        String m7;
        if (T1.a.d(this)) {
            return;
        }
        try {
            C0458v c0458v = C0458v.f3949a;
            r q7 = C0458v.q(C2146B.m(), false);
            if (q7 == null || (m7 = q7.m()) == null) {
                return;
            }
            g(m7);
            if (!(!f3163c.isEmpty()) && !(!f3164d.isEmpty())) {
                return;
            }
            H1.f fVar = H1.f.f2181a;
            File l7 = H1.f.l(f.a.MTML_APP_EVENT_PREDICTION);
            if (l7 == null) {
                return;
            }
            a.d(l7);
            Activity l8 = G1.f.l();
            if (l8 != null) {
                h(l8);
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }

    public final void g(String str) {
        JSONArray jSONArray;
        int length;
        JSONArray jSONArray2;
        int length2;
        if (T1.a.d(this)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i7 = 0;
            if (jSONObject.has("production_events") && (length2 = (jSONArray2 = jSONObject.getJSONArray("production_events")).length()) > 0) {
                int i8 = 0;
                while (true) {
                    int i9 = i8 + 1;
                    Set set = f3163c;
                    String string = jSONArray2.getString(i8);
                    Intrinsics.checkNotNullExpressionValue(string, "jsonArray.getString(i)");
                    set.add(string);
                    if (i9 >= length2) {
                        break;
                    } else {
                        i8 = i9;
                    }
                }
            }
            if (!jSONObject.has("eligible_for_prediction_events") || (length = (jSONArray = jSONObject.getJSONArray("eligible_for_prediction_events")).length()) <= 0) {
                return;
            }
            while (true) {
                int i10 = i7 + 1;
                Set set2 = f3164d;
                String string2 = jSONArray.getString(i7);
                Intrinsics.checkNotNullExpressionValue(string2, "jsonArray.getString(i)");
                set2.add(string2);
                if (i10 >= length) {
                    return;
                } else {
                    i7 = i10;
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }
}
