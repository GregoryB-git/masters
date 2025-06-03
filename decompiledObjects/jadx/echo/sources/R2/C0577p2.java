package R2;

import A2.AbstractC0328n;
import android.content.SharedPreferences;
import android.util.Pair;

/* renamed from: R2.p2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0577p2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f5467a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5468b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5469c;

    /* renamed from: d, reason: collision with root package name */
    public final long f5470d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0549l2 f5471e;

    public C0577p2(C0549l2 c0549l2, String str, long j7) {
        this.f5471e = c0549l2;
        AbstractC0328n.e(str);
        AbstractC0328n.a(j7 > 0);
        this.f5467a = str + ":start";
        this.f5468b = str + ":count";
        this.f5469c = str + ":value";
        this.f5470d = j7;
    }

    public final Pair a() {
        long abs;
        this.f5471e.n();
        this.f5471e.n();
        long c7 = c();
        if (c7 == 0) {
            d();
            abs = 0;
        } else {
            abs = Math.abs(c7 - this.f5471e.b().a());
        }
        long j7 = this.f5470d;
        if (abs < j7) {
            return null;
        }
        if (abs > (j7 << 1)) {
            d();
            return null;
        }
        String string = this.f5471e.F().getString(this.f5469c, null);
        long j8 = this.f5471e.F().getLong(this.f5468b, 0L);
        d();
        return (string == null || j8 <= 0) ? C0549l2.f5385z : new Pair(string, Long.valueOf(j8));
    }

    public final void b(String str, long j7) {
        this.f5471e.n();
        if (c() == 0) {
            d();
        }
        if (str == null) {
            str = "";
        }
        long j8 = this.f5471e.F().getLong(this.f5468b, 0L);
        if (j8 <= 0) {
            SharedPreferences.Editor edit = this.f5471e.F().edit();
            edit.putString(this.f5469c, str);
            edit.putLong(this.f5468b, 1L);
            edit.apply();
            return;
        }
        long j9 = j8 + 1;
        boolean z7 = (this.f5471e.k().U0().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j9;
        SharedPreferences.Editor edit2 = this.f5471e.F().edit();
        if (z7) {
            edit2.putString(this.f5469c, str);
        }
        edit2.putLong(this.f5468b, j9);
        edit2.apply();
    }

    public final long c() {
        return this.f5471e.F().getLong(this.f5467a, 0L);
    }

    public final void d() {
        this.f5471e.n();
        long a7 = this.f5471e.b().a();
        SharedPreferences.Editor edit = this.f5471e.F().edit();
        edit.remove(this.f5468b);
        edit.remove(this.f5469c);
        edit.putLong(this.f5467a, a7);
        edit.apply();
    }
}
