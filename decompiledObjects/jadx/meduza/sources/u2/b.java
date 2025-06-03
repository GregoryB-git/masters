package u2;

import x2.s;

/* loaded from: classes.dex */
public final class b extends d<Boolean> {

    /* renamed from: b, reason: collision with root package name */
    public final int f14919b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(v2.c cVar) {
        super(cVar);
        ec.i.e(cVar, "tracker");
        this.f14919b = 5;
    }

    @Override // u2.d
    public final int a() {
        return this.f14919b;
    }

    @Override // u2.d
    public final boolean b(s sVar) {
        return sVar.f16838j.f11706d;
    }

    @Override // u2.d
    public final boolean c(Boolean bool) {
        return !bool.booleanValue();
    }
}
