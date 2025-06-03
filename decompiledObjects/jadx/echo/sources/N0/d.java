package N0;

import F0.C;
import F0.InterfaceC0373s;
import g0.AbstractC1297a;

/* loaded from: classes.dex */
public final class d extends C {

    /* renamed from: b, reason: collision with root package name */
    public final long f3597b;

    public d(InterfaceC0373s interfaceC0373s, long j7) {
        super(interfaceC0373s);
        AbstractC1297a.a(interfaceC0373s.p() >= j7);
        this.f3597b = j7;
    }

    @Override // F0.C, F0.InterfaceC0373s
    public long a() {
        return super.a() - this.f3597b;
    }

    @Override // F0.C, F0.InterfaceC0373s
    public long m() {
        return super.m() - this.f3597b;
    }

    @Override // F0.C, F0.InterfaceC0373s
    public long p() {
        return super.p() - this.f3597b;
    }
}
