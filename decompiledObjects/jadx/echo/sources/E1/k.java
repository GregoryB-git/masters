package E1;

import O1.C0451n;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.s;
import x1.C2146B;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final k f1587a = new k();

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f1588b = new AtomicBoolean(false);

    public static final void a() {
        if (T1.a.d(k.class)) {
            return;
        }
        try {
            f1588b.set(true);
            b();
        } catch (Throwable th) {
            T1.a.b(th, k.class);
        }
    }

    public static final void b() {
        if (T1.a.d(k.class)) {
            return;
        }
        try {
            if (f1588b.get()) {
                if (f1587a.c()) {
                    C0451n c0451n = C0451n.f3862a;
                    if (C0451n.g(C0451n.b.IapLoggingLib2)) {
                        f fVar = f.f1546a;
                        f.d(C2146B.l());
                        return;
                    }
                }
                a.g();
            }
        } catch (Throwable th) {
            T1.a.b(th, k.class);
        }
    }

    public final boolean c() {
        List V6;
        if (T1.a.d(this)) {
            return false;
        }
        try {
            Context l7 = C2146B.l();
            ApplicationInfo applicationInfo = l7.getPackageManager().getApplicationInfo(l7.getPackageName(), 128);
            Intrinsics.checkNotNullExpressionValue(applicationInfo, "context.packageManager.getApplicationInfo(\n              context.packageName, PackageManager.GET_META_DATA)");
            String string = applicationInfo.metaData.getString("com.google.android.play.billingclient.version");
            if (string == null) {
                return false;
            }
            V6 = s.V(string, new String[]{"."}, false, 3, 2, null);
            return Integer.parseInt((String) V6.get(0)) >= 2;
        } catch (Exception unused) {
            return false;
        } catch (Throwable th) {
            T1.a.b(th, this);
            return false;
        }
    }
}
