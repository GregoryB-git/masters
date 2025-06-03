package g2;

import android.content.Context;
import h2.InterfaceC1333b;

/* loaded from: classes.dex */
public final class l implements InterfaceC1333b {

    /* renamed from: a, reason: collision with root package name */
    public final U5.a f14416a;

    /* renamed from: b, reason: collision with root package name */
    public final U5.a f14417b;

    public l(U5.a aVar, U5.a aVar2) {
        this.f14416a = aVar;
        this.f14417b = aVar2;
    }

    public static l a(U5.a aVar, U5.a aVar2) {
        return new l(aVar, aVar2);
    }

    public static k c(Context context, Object obj) {
        return new k(context, (i) obj);
    }

    @Override // U5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public k get() {
        return c((Context) this.f14416a.get(), this.f14417b.get());
    }
}
