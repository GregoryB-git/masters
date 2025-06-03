package u2;

import x2.s;

/* loaded from: classes.dex */
public final class i extends d<Boolean> {

    /* renamed from: b, reason: collision with root package name */
    public final int f14934b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(v2.g<Boolean> gVar) {
        super(gVar);
        ec.i.e(gVar, "tracker");
        this.f14934b = 9;
    }

    @Override // u2.d
    public final int a() {
        return this.f14934b;
    }

    @Override // u2.d
    public final boolean b(s sVar) {
        return sVar.f16838j.f11707e;
    }

    @Override // u2.d
    public final boolean c(Boolean bool) {
        return !bool.booleanValue();
    }
}
