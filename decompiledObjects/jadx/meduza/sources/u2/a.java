package u2;

import x2.s;

/* loaded from: classes.dex */
public final class a extends d<Boolean> {

    /* renamed from: b, reason: collision with root package name */
    public final int f14918b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(v2.g<Boolean> gVar) {
        super(gVar);
        ec.i.e(gVar, "tracker");
        this.f14918b = 6;
    }

    @Override // u2.d
    public final int a() {
        return this.f14918b;
    }

    @Override // u2.d
    public final boolean b(s sVar) {
        return sVar.f16838j.f11704b;
    }

    @Override // u2.d
    public final boolean c(Boolean bool) {
        return !bool.booleanValue();
    }
}
