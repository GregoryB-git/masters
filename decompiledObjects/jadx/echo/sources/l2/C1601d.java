package l2;

import h2.InterfaceC1333b;
import java.util.concurrent.Executor;
import m2.x;
import n2.InterfaceC1707d;

/* renamed from: l2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1601d implements InterfaceC1333b {

    /* renamed from: a, reason: collision with root package name */
    public final U5.a f17150a;

    /* renamed from: b, reason: collision with root package name */
    public final U5.a f17151b;

    /* renamed from: c, reason: collision with root package name */
    public final U5.a f17152c;

    /* renamed from: d, reason: collision with root package name */
    public final U5.a f17153d;

    /* renamed from: e, reason: collision with root package name */
    public final U5.a f17154e;

    public C1601d(U5.a aVar, U5.a aVar2, U5.a aVar3, U5.a aVar4, U5.a aVar5) {
        this.f17150a = aVar;
        this.f17151b = aVar2;
        this.f17152c = aVar3;
        this.f17153d = aVar4;
        this.f17154e = aVar5;
    }

    public static C1601d a(U5.a aVar, U5.a aVar2, U5.a aVar3, U5.a aVar4, U5.a aVar5) {
        return new C1601d(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static C1600c c(Executor executor, g2.e eVar, x xVar, InterfaceC1707d interfaceC1707d, o2.b bVar) {
        return new C1600c(executor, eVar, xVar, interfaceC1707d, bVar);
    }

    @Override // U5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C1600c get() {
        return c((Executor) this.f17150a.get(), (g2.e) this.f17151b.get(), (x) this.f17152c.get(), (InterfaceC1707d) this.f17153d.get(), (o2.b) this.f17154e.get());
    }
}
