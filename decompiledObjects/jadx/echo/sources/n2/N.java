package n2;

import h2.InterfaceC1333b;
import p2.InterfaceC1791a;

/* loaded from: classes.dex */
public final class N implements InterfaceC1333b {

    /* renamed from: a, reason: collision with root package name */
    public final U5.a f17886a;

    /* renamed from: b, reason: collision with root package name */
    public final U5.a f17887b;

    /* renamed from: c, reason: collision with root package name */
    public final U5.a f17888c;

    /* renamed from: d, reason: collision with root package name */
    public final U5.a f17889d;

    /* renamed from: e, reason: collision with root package name */
    public final U5.a f17890e;

    public N(U5.a aVar, U5.a aVar2, U5.a aVar3, U5.a aVar4, U5.a aVar5) {
        this.f17886a = aVar;
        this.f17887b = aVar2;
        this.f17888c = aVar3;
        this.f17889d = aVar4;
        this.f17890e = aVar5;
    }

    public static N a(U5.a aVar, U5.a aVar2, U5.a aVar3, U5.a aVar4, U5.a aVar5) {
        return new N(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static M c(InterfaceC1791a interfaceC1791a, InterfaceC1791a interfaceC1791a2, Object obj, Object obj2, U5.a aVar) {
        return new M(interfaceC1791a, interfaceC1791a2, (AbstractC1708e) obj, (U) obj2, aVar);
    }

    @Override // U5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public M get() {
        return c((InterfaceC1791a) this.f17886a.get(), (InterfaceC1791a) this.f17887b.get(), this.f17888c.get(), this.f17889d.get(), this.f17890e);
    }
}
