package u9;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import nc.g0;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: b, reason: collision with root package name */
    public static final long f15128b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f15129c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d, reason: collision with root package name */
    public static k f15130d;

    /* renamed from: a, reason: collision with root package name */
    public final g0 f15131a;

    public k(g0 g0Var) {
        this.f15131a = g0Var;
    }

    public static k a() {
        if (g0.f11496b == null) {
            g0.f11496b = new g0(17);
        }
        g0 g0Var = g0.f11496b;
        if (f15130d == null) {
            f15130d = new k(g0Var);
        }
        return f15130d;
    }

    public final boolean b(w9.a aVar) {
        if (TextUtils.isEmpty(aVar.f16453d)) {
            return true;
        }
        long j10 = aVar.f + aVar.f16455g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f15131a.getClass();
        return j10 < timeUnit.toSeconds(System.currentTimeMillis()) + f15128b;
    }
}
