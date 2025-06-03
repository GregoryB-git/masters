package a4;

import V3.AbstractC0669h;

/* renamed from: a4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0746b implements InterfaceC0749e {

    /* renamed from: a, reason: collision with root package name */
    public final V3.k f8082a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0669h f8083b;

    /* renamed from: c, reason: collision with root package name */
    public final Q3.c f8084c;

    public C0746b(AbstractC0669h abstractC0669h, Q3.c cVar, V3.k kVar) {
        this.f8083b = abstractC0669h;
        this.f8082a = kVar;
        this.f8084c = cVar;
    }

    @Override // a4.InterfaceC0749e
    public void a() {
        this.f8083b.c(this.f8084c);
    }

    public V3.k b() {
        return this.f8082a;
    }

    @Override // a4.InterfaceC0749e
    public String toString() {
        return b() + ":CANCEL";
    }
}
