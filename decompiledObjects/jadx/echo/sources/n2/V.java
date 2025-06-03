package n2;

import android.content.Context;
import h2.InterfaceC1333b;

/* loaded from: classes.dex */
public final class V implements InterfaceC1333b {

    /* renamed from: a, reason: collision with root package name */
    public final U5.a f17901a;

    /* renamed from: b, reason: collision with root package name */
    public final U5.a f17902b;

    /* renamed from: c, reason: collision with root package name */
    public final U5.a f17903c;

    public V(U5.a aVar, U5.a aVar2, U5.a aVar3) {
        this.f17901a = aVar;
        this.f17902b = aVar2;
        this.f17903c = aVar3;
    }

    public static V a(U5.a aVar, U5.a aVar2, U5.a aVar3) {
        return new V(aVar, aVar2, aVar3);
    }

    public static U c(Context context, String str, int i7) {
        return new U(context, str, i7);
    }

    @Override // U5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public U get() {
        return c((Context) this.f17901a.get(), (String) this.f17902b.get(), ((Integer) this.f17903c.get()).intValue());
    }
}
