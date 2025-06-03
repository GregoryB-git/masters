package ea;

import java.util.Locale;
import java.util.UUID;

/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final m0 f4900a;

    /* renamed from: b, reason: collision with root package name */
    public final dc.a<UUID> f4901b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4902c;

    /* renamed from: d, reason: collision with root package name */
    public int f4903d;

    /* renamed from: e, reason: collision with root package name */
    public x f4904e;

    public e0() {
        throw null;
    }

    public e0(int i10) {
        p2.m0 m0Var = p2.m0.f12891c;
        d0 d0Var = d0.f4895a;
        ec.i.e(d0Var, "uuidGenerator");
        this.f4900a = m0Var;
        this.f4901b = d0Var;
        this.f4902c = a();
        this.f4903d = -1;
    }

    public final String a() {
        String uuid = this.f4901b.invoke().toString();
        ec.i.d(uuid, "uuidGenerator().toString()");
        String lowerCase = lc.h.m0(uuid, "-", "").toLowerCase(Locale.ROOT);
        ec.i.d(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }
}
