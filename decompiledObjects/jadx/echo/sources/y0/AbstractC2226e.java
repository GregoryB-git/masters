package y0;

import B0.n;
import android.net.Uri;
import d0.C1194q;
import g0.AbstractC1297a;
import i0.x;
import java.util.Map;
import x0.r;

/* renamed from: y0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2226e implements n.e {

    /* renamed from: a, reason: collision with root package name */
    public final long f21252a = r.a();

    /* renamed from: b, reason: collision with root package name */
    public final i0.k f21253b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21254c;

    /* renamed from: d, reason: collision with root package name */
    public final C1194q f21255d;

    /* renamed from: e, reason: collision with root package name */
    public final int f21256e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f21257f;

    /* renamed from: g, reason: collision with root package name */
    public final long f21258g;

    /* renamed from: h, reason: collision with root package name */
    public final long f21259h;

    /* renamed from: i, reason: collision with root package name */
    public final x f21260i;

    public AbstractC2226e(i0.g gVar, i0.k kVar, int i7, C1194q c1194q, int i8, Object obj, long j7, long j8) {
        this.f21260i = new x(gVar);
        this.f21253b = (i0.k) AbstractC1297a.e(kVar);
        this.f21254c = i7;
        this.f21255d = c1194q;
        this.f21256e = i8;
        this.f21257f = obj;
        this.f21258g = j7;
        this.f21259h = j8;
    }

    public final long a() {
        return this.f21260i.q();
    }

    public final long d() {
        return this.f21259h - this.f21258g;
    }

    public final Map e() {
        return this.f21260i.s();
    }

    public final Uri f() {
        return this.f21260i.r();
    }
}
