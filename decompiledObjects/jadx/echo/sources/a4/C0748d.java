package a4;

import V3.AbstractC0669h;
import a4.InterfaceC0749e;

/* renamed from: a4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0748d implements InterfaceC0749e {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0749e.a f8090a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0669h f8091b;

    /* renamed from: c, reason: collision with root package name */
    public final Q3.b f8092c;

    /* renamed from: d, reason: collision with root package name */
    public final String f8093d;

    public C0748d(InterfaceC0749e.a aVar, AbstractC0669h abstractC0669h, Q3.b bVar, String str) {
        this.f8090a = aVar;
        this.f8091b = abstractC0669h;
        this.f8092c = bVar;
        this.f8093d = str;
    }

    @Override // a4.InterfaceC0749e
    public void a() {
        this.f8091b.d(this);
    }

    public InterfaceC0749e.a b() {
        return this.f8090a;
    }

    public V3.k c() {
        V3.k s7 = this.f8092c.g().s();
        return this.f8090a == InterfaceC0749e.a.VALUE ? s7 : s7.a0();
    }

    public String d() {
        return this.f8093d;
    }

    public Q3.b e() {
        return this.f8092c;
    }

    @Override // a4.InterfaceC0749e
    public String toString() {
        StringBuilder sb;
        if (this.f8090a == InterfaceC0749e.a.VALUE) {
            sb = new StringBuilder();
            sb.append(c());
            sb.append(": ");
            sb.append(this.f8090a);
            sb.append(": ");
            sb.append(this.f8092c.i(true));
        } else {
            sb = new StringBuilder();
            sb.append(c());
            sb.append(": ");
            sb.append(this.f8090a);
            sb.append(": { ");
            sb.append(this.f8092c.e());
            sb.append(": ");
            sb.append(this.f8092c.i(true));
            sb.append(" }");
        }
        return sb.toString();
    }
}
