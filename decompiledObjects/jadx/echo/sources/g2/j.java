package g2;

import android.content.Context;
import h2.InterfaceC1333b;
import p2.InterfaceC1791a;

/* loaded from: classes.dex */
public final class j implements InterfaceC1333b {

    /* renamed from: a, reason: collision with root package name */
    public final U5.a f14408a;

    /* renamed from: b, reason: collision with root package name */
    public final U5.a f14409b;

    /* renamed from: c, reason: collision with root package name */
    public final U5.a f14410c;

    public j(U5.a aVar, U5.a aVar2, U5.a aVar3) {
        this.f14408a = aVar;
        this.f14409b = aVar2;
        this.f14410c = aVar3;
    }

    public static j a(U5.a aVar, U5.a aVar2, U5.a aVar3) {
        return new j(aVar, aVar2, aVar3);
    }

    public static i c(Context context, InterfaceC1791a interfaceC1791a, InterfaceC1791a interfaceC1791a2) {
        return new i(context, interfaceC1791a, interfaceC1791a2);
    }

    @Override // U5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public i get() {
        return c((Context) this.f14408a.get(), (InterfaceC1791a) this.f14409b.get(), (InterfaceC1791a) this.f14410c.get());
    }
}
