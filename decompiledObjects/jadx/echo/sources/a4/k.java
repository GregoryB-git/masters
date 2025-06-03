package a4;

import d4.n;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public final C0745a f8129a;

    /* renamed from: b, reason: collision with root package name */
    public final C0745a f8130b;

    public k(C0745a c0745a, C0745a c0745a2) {
        this.f8129a = c0745a;
        this.f8130b = c0745a2;
    }

    public n a() {
        if (this.f8129a.f()) {
            return this.f8129a.b();
        }
        return null;
    }

    public n b() {
        if (this.f8130b.f()) {
            return this.f8130b.b();
        }
        return null;
    }

    public C0745a c() {
        return this.f8129a;
    }

    public C0745a d() {
        return this.f8130b;
    }

    public k e(d4.i iVar, boolean z7, boolean z8) {
        return new k(new C0745a(iVar, z7, z8), this.f8130b);
    }

    public k f(d4.i iVar, boolean z7, boolean z8) {
        return new k(this.f8129a, new C0745a(iVar, z7, z8));
    }
}
