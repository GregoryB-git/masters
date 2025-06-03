package I1;

import O1.P;
import W5.K;
import W5.n;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import x1.C2146B;
import y1.C2248e;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f2493a = new c();

    /* renamed from: b, reason: collision with root package name */
    public static final Set f2494b;

    static {
        Set f7;
        f7 = K.f("fb_mobile_purchase", "StartTrial", "Subscribe");
        f2494b = f7;
    }

    public static final boolean d() {
        if (T1.a.d(c.class)) {
            return false;
        }
        try {
            if (C2146B.z(C2146B.l()) || P.Z()) {
                return false;
            }
            return e.b();
        } catch (Throwable th) {
            T1.a.b(th, c.class);
            return false;
        }
    }

    public static final void e(final String applicationId, final C2248e event) {
        if (T1.a.d(c.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(event, "event");
            if (f2493a.c(event)) {
                C2146B.t().execute(new Runnable() { // from class: I1.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        c.f(applicationId, event);
                    }
                });
            }
        } catch (Throwable th) {
            T1.a.b(th, c.class);
        }
    }

    public static final void f(String applicationId, C2248e event) {
        if (T1.a.d(c.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(applicationId, "$applicationId");
            Intrinsics.checkNotNullParameter(event, "$event");
            e eVar = e.f2497a;
            e.c(applicationId, n.b(event));
        } catch (Throwable th) {
            T1.a.b(th, c.class);
        }
    }

    public static final void g(final String str, final String str2) {
        if (T1.a.d(c.class)) {
            return;
        }
        try {
            final Context l7 = C2146B.l();
            if (l7 == null || str == null || str2 == null) {
                return;
            }
            C2146B.t().execute(new Runnable() { // from class: I1.b
                @Override // java.lang.Runnable
                public final void run() {
                    c.h(l7, str2, str);
                }
            });
        } catch (Throwable th) {
            T1.a.b(th, c.class);
        }
    }

    public static final void h(Context context, String str, String str2) {
        if (T1.a.d(c.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "$context");
            SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
            String i7 = Intrinsics.i(str2, "pingForOnDevice");
            if (sharedPreferences.getLong(i7, 0L) == 0) {
                e.e(str2);
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putLong(i7, System.currentTimeMillis());
                edit.apply();
            }
        } catch (Throwable th) {
            T1.a.b(th, c.class);
        }
    }

    public final boolean c(C2248e c2248e) {
        if (T1.a.d(this)) {
            return false;
        }
        try {
            return (c2248e.h() ^ true) || (c2248e.h() && f2494b.contains(c2248e.f()));
        } catch (Throwable th) {
            T1.a.b(th, this);
            return false;
        }
    }
}
