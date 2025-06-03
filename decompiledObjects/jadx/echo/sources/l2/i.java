package l2;

import android.content.Context;
import h2.InterfaceC1333b;
import m2.x;
import n2.InterfaceC1707d;
import p2.InterfaceC1791a;

/* loaded from: classes.dex */
public final class i implements InterfaceC1333b {

    /* renamed from: a, reason: collision with root package name */
    public final U5.a f17156a;

    /* renamed from: b, reason: collision with root package name */
    public final U5.a f17157b;

    /* renamed from: c, reason: collision with root package name */
    public final U5.a f17158c;

    /* renamed from: d, reason: collision with root package name */
    public final U5.a f17159d;

    public i(U5.a aVar, U5.a aVar2, U5.a aVar3, U5.a aVar4) {
        this.f17156a = aVar;
        this.f17157b = aVar2;
        this.f17158c = aVar3;
        this.f17159d = aVar4;
    }

    public static i a(U5.a aVar, U5.a aVar2, U5.a aVar3, U5.a aVar4) {
        return new i(aVar, aVar2, aVar3, aVar4);
    }

    public static x c(Context context, InterfaceC1707d interfaceC1707d, m2.f fVar, InterfaceC1791a interfaceC1791a) {
        return (x) h2.d.c(h.a(context, interfaceC1707d, fVar, interfaceC1791a), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // U5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public x get() {
        return c((Context) this.f17156a.get(), (InterfaceC1707d) this.f17157b.get(), (m2.f) this.f17158c.get(), (InterfaceC1791a) this.f17159d.get());
    }
}
