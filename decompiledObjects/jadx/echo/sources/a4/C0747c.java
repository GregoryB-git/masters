package a4;

import a4.InterfaceC0749e;
import d4.C1227b;
import d4.n;

/* renamed from: a4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0747c {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0749e.a f8085a;

    /* renamed from: b, reason: collision with root package name */
    public final d4.i f8086b;

    /* renamed from: c, reason: collision with root package name */
    public final d4.i f8087c;

    /* renamed from: d, reason: collision with root package name */
    public final C1227b f8088d;

    /* renamed from: e, reason: collision with root package name */
    public final C1227b f8089e;

    public C0747c(InterfaceC0749e.a aVar, d4.i iVar, C1227b c1227b, C1227b c1227b2, d4.i iVar2) {
        this.f8085a = aVar;
        this.f8086b = iVar;
        this.f8088d = c1227b;
        this.f8089e = c1227b2;
        this.f8087c = iVar2;
    }

    public static C0747c b(C1227b c1227b, d4.i iVar) {
        return new C0747c(InterfaceC0749e.a.CHILD_ADDED, iVar, c1227b, null, null);
    }

    public static C0747c c(C1227b c1227b, n nVar) {
        return b(c1227b, d4.i.d(nVar));
    }

    public static C0747c d(C1227b c1227b, d4.i iVar, d4.i iVar2) {
        return new C0747c(InterfaceC0749e.a.CHILD_CHANGED, iVar, c1227b, null, iVar2);
    }

    public static C0747c e(C1227b c1227b, n nVar, n nVar2) {
        return d(c1227b, d4.i.d(nVar), d4.i.d(nVar2));
    }

    public static C0747c f(C1227b c1227b, d4.i iVar) {
        return new C0747c(InterfaceC0749e.a.CHILD_MOVED, iVar, c1227b, null, null);
    }

    public static C0747c g(C1227b c1227b, d4.i iVar) {
        return new C0747c(InterfaceC0749e.a.CHILD_REMOVED, iVar, c1227b, null, null);
    }

    public static C0747c h(C1227b c1227b, n nVar) {
        return g(c1227b, d4.i.d(nVar));
    }

    public static C0747c n(d4.i iVar) {
        return new C0747c(InterfaceC0749e.a.VALUE, iVar, null, null, null);
    }

    public C0747c a(C1227b c1227b) {
        return new C0747c(this.f8085a, this.f8086b, this.f8088d, c1227b, this.f8087c);
    }

    public C1227b i() {
        return this.f8088d;
    }

    public InterfaceC0749e.a j() {
        return this.f8085a;
    }

    public d4.i k() {
        return this.f8086b;
    }

    public d4.i l() {
        return this.f8087c;
    }

    public C1227b m() {
        return this.f8089e;
    }

    public String toString() {
        return "Change: " + this.f8085a + " " + this.f8088d;
    }
}
