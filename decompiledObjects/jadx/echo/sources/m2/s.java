package m2;

import android.content.Context;
import h2.InterfaceC1333b;
import java.util.concurrent.Executor;
import n2.InterfaceC1706c;
import n2.InterfaceC1707d;
import p2.InterfaceC1791a;

/* loaded from: classes.dex */
public final class s implements InterfaceC1333b {

    /* renamed from: a, reason: collision with root package name */
    public final U5.a f17722a;

    /* renamed from: b, reason: collision with root package name */
    public final U5.a f17723b;

    /* renamed from: c, reason: collision with root package name */
    public final U5.a f17724c;

    /* renamed from: d, reason: collision with root package name */
    public final U5.a f17725d;

    /* renamed from: e, reason: collision with root package name */
    public final U5.a f17726e;

    /* renamed from: f, reason: collision with root package name */
    public final U5.a f17727f;

    /* renamed from: g, reason: collision with root package name */
    public final U5.a f17728g;

    /* renamed from: h, reason: collision with root package name */
    public final U5.a f17729h;

    /* renamed from: i, reason: collision with root package name */
    public final U5.a f17730i;

    public s(U5.a aVar, U5.a aVar2, U5.a aVar3, U5.a aVar4, U5.a aVar5, U5.a aVar6, U5.a aVar7, U5.a aVar8, U5.a aVar9) {
        this.f17722a = aVar;
        this.f17723b = aVar2;
        this.f17724c = aVar3;
        this.f17725d = aVar4;
        this.f17726e = aVar5;
        this.f17727f = aVar6;
        this.f17728g = aVar7;
        this.f17729h = aVar8;
        this.f17730i = aVar9;
    }

    public static s a(U5.a aVar, U5.a aVar2, U5.a aVar3, U5.a aVar4, U5.a aVar5, U5.a aVar6, U5.a aVar7, U5.a aVar8, U5.a aVar9) {
        return new s(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9);
    }

    public static r c(Context context, g2.e eVar, InterfaceC1707d interfaceC1707d, x xVar, Executor executor, o2.b bVar, InterfaceC1791a interfaceC1791a, InterfaceC1791a interfaceC1791a2, InterfaceC1706c interfaceC1706c) {
        return new r(context, eVar, interfaceC1707d, xVar, executor, bVar, interfaceC1791a, interfaceC1791a2, interfaceC1706c);
    }

    @Override // U5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r get() {
        return c((Context) this.f17722a.get(), (g2.e) this.f17723b.get(), (InterfaceC1707d) this.f17724c.get(), (x) this.f17725d.get(), (Executor) this.f17726e.get(), (o2.b) this.f17727f.get(), (InterfaceC1791a) this.f17728g.get(), (InterfaceC1791a) this.f17729h.get(), (InterfaceC1706c) this.f17730i.get());
    }
}
