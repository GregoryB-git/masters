package E1;

import E1.h;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f1546a = new f();

    public static final void d(Context context) {
        h.b bVar;
        h c7;
        if (T1.a.d(f.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            if (m.a("com.android.billingclient.api.Purchase") == null || (c7 = (bVar = h.f1549s).c(context)) == null || !bVar.f().get()) {
                return;
            }
            if (j.d()) {
                c7.p("inapp", new Runnable() { // from class: E1.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        f.e();
                    }
                });
            } else {
                c7.o("inapp", new Runnable() { // from class: E1.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        f.f();
                    }
                });
            }
        } catch (Throwable th) {
            T1.a.b(th, f.class);
        }
    }

    public static final void e() {
        if (T1.a.d(f.class)) {
            return;
        }
        try {
            f1546a.c();
        } catch (Throwable th) {
            T1.a.b(th, f.class);
        }
    }

    public static final void f() {
        if (T1.a.d(f.class)) {
            return;
        }
        try {
            f1546a.c();
        } catch (Throwable th) {
            T1.a.b(th, f.class);
        }
    }

    public final void c() {
        if (T1.a.d(this)) {
            return;
        }
        try {
            j jVar = j.f1583a;
            h.b bVar = h.f1549s;
            j.e(bVar.d(), bVar.e());
            bVar.d().clear();
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }
}
