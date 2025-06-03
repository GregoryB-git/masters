package a4;

import d4.C1227b;
import d4.n;

/* renamed from: a4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0745a {

    /* renamed from: a, reason: collision with root package name */
    public final d4.i f8079a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8080b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8081c;

    public C0745a(d4.i iVar, boolean z7, boolean z8) {
        this.f8079a = iVar;
        this.f8080b = z7;
        this.f8081c = z8;
    }

    public d4.i a() {
        return this.f8079a;
    }

    public n b() {
        return this.f8079a.k();
    }

    public boolean c(C1227b c1227b) {
        return (f() && !this.f8081c) || this.f8079a.k().Q(c1227b);
    }

    public boolean d(V3.k kVar) {
        return kVar.isEmpty() ? f() && !this.f8081c : c(kVar.Z());
    }

    public boolean e() {
        return this.f8081c;
    }

    public boolean f() {
        return this.f8080b;
    }
}
