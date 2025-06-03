package f2;

import h2.InterfaceC1333b;
import l2.InterfaceC1602e;
import p2.InterfaceC1791a;

/* loaded from: classes.dex */
public final class w implements InterfaceC1333b {

    /* renamed from: a, reason: collision with root package name */
    public final U5.a f14232a;

    /* renamed from: b, reason: collision with root package name */
    public final U5.a f14233b;

    /* renamed from: c, reason: collision with root package name */
    public final U5.a f14234c;

    /* renamed from: d, reason: collision with root package name */
    public final U5.a f14235d;

    /* renamed from: e, reason: collision with root package name */
    public final U5.a f14236e;

    public w(U5.a aVar, U5.a aVar2, U5.a aVar3, U5.a aVar4, U5.a aVar5) {
        this.f14232a = aVar;
        this.f14233b = aVar2;
        this.f14234c = aVar3;
        this.f14235d = aVar4;
        this.f14236e = aVar5;
    }

    public static w a(U5.a aVar, U5.a aVar2, U5.a aVar3, U5.a aVar4, U5.a aVar5) {
        return new w(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static u c(InterfaceC1791a interfaceC1791a, InterfaceC1791a interfaceC1791a2, InterfaceC1602e interfaceC1602e, m2.r rVar, m2.v vVar) {
        return new u(interfaceC1791a, interfaceC1791a2, interfaceC1602e, rVar, vVar);
    }

    @Override // U5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public u get() {
        return c((InterfaceC1791a) this.f14232a.get(), (InterfaceC1791a) this.f14233b.get(), (InterfaceC1602e) this.f14234c.get(), (m2.r) this.f14235d.get(), (m2.v) this.f14236e.get());
    }
}
