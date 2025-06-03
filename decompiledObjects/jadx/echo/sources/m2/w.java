package m2;

import h2.InterfaceC1333b;
import java.util.concurrent.Executor;
import n2.InterfaceC1707d;

/* loaded from: classes.dex */
public final class w implements InterfaceC1333b {

    /* renamed from: a, reason: collision with root package name */
    public final U5.a f17737a;

    /* renamed from: b, reason: collision with root package name */
    public final U5.a f17738b;

    /* renamed from: c, reason: collision with root package name */
    public final U5.a f17739c;

    /* renamed from: d, reason: collision with root package name */
    public final U5.a f17740d;

    public w(U5.a aVar, U5.a aVar2, U5.a aVar3, U5.a aVar4) {
        this.f17737a = aVar;
        this.f17738b = aVar2;
        this.f17739c = aVar3;
        this.f17740d = aVar4;
    }

    public static w a(U5.a aVar, U5.a aVar2, U5.a aVar3, U5.a aVar4) {
        return new w(aVar, aVar2, aVar3, aVar4);
    }

    public static v c(Executor executor, InterfaceC1707d interfaceC1707d, x xVar, o2.b bVar) {
        return new v(executor, interfaceC1707d, xVar, bVar);
    }

    @Override // U5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public v get() {
        return c((Executor) this.f17737a.get(), (InterfaceC1707d) this.f17738b.get(), (x) this.f17739c.get(), (o2.b) this.f17740d.get());
    }
}
