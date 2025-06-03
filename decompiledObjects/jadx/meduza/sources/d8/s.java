package d8;

import t9.a;

/* loaded from: classes.dex */
public final class s<T> implements t9.b<T>, t9.a<T> {

    /* renamed from: c, reason: collision with root package name */
    public static final e0.d f3623c = new e0.d(21);

    /* renamed from: d, reason: collision with root package name */
    public static final r f3624d = new r(0);

    /* renamed from: a, reason: collision with root package name */
    public a.InterfaceC0234a<T> f3625a;

    /* renamed from: b, reason: collision with root package name */
    public volatile t9.b<T> f3626b;

    public s(e0.d dVar, t9.b bVar) {
        this.f3625a = dVar;
        this.f3626b = bVar;
    }

    @Override // t9.a
    public final void a(a.InterfaceC0234a<T> interfaceC0234a) {
        t9.b<T> bVar;
        t9.b<T> bVar2 = this.f3626b;
        r rVar = f3624d;
        if (bVar2 != rVar) {
            interfaceC0234a.h(bVar2);
            return;
        }
        t9.b<T> bVar3 = null;
        synchronized (this) {
            bVar = this.f3626b;
            if (bVar != rVar) {
                bVar3 = bVar;
            } else {
                this.f3625a = new o9.l(6, this.f3625a, interfaceC0234a);
            }
        }
        if (bVar3 != null) {
            interfaceC0234a.h(bVar);
        }
    }

    @Override // t9.b
    public final T get() {
        return this.f3626b.get();
    }
}
