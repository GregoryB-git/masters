package z1;

import O1.C0438a;
import O1.C0458v;
import O1.P;
import O1.r;
import android.app.Activity;
import kotlin.jvm.internal.Intrinsics;
import x1.C2146B;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f21624a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static final String f21625b = b.class.getCanonicalName();

    /* renamed from: c, reason: collision with root package name */
    public static boolean f21626c;

    public static final void b() {
        try {
            if (T1.a.d(b.class)) {
                return;
            }
            try {
                C2146B.t().execute(new Runnable() { // from class: z1.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        b.c();
                    }
                });
            } catch (Exception e7) {
                P p7 = P.f3756a;
                P.i0(f21625b, e7);
            }
        } catch (Throwable th) {
            T1.a.b(th, b.class);
        }
    }

    public static final void c() {
        if (T1.a.d(b.class)) {
            return;
        }
        try {
            if (C0438a.f3802f.h(C2146B.l())) {
                return;
            }
            f21624a.e();
            f21626c = true;
        } catch (Throwable th) {
            T1.a.b(th, b.class);
        }
    }

    public static final void d(Activity activity) {
        if (T1.a.d(b.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(activity, "activity");
            try {
                if (f21626c && !d.f21628d.c().isEmpty()) {
                    f.f21635s.e(activity);
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            T1.a.b(th, b.class);
        }
    }

    public final void e() {
        String h7;
        if (T1.a.d(this)) {
            return;
        }
        try {
            C0458v c0458v = C0458v.f3949a;
            r q7 = C0458v.q(C2146B.m(), false);
            if (q7 == null || (h7 = q7.h()) == null) {
                return;
            }
            d.f21628d.d(h7);
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }
}
