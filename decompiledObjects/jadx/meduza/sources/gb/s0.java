package gb;

import eb.u0;
import n7.g;

/* loaded from: classes.dex */
public abstract class s0 extends eb.u0 {

    /* renamed from: a, reason: collision with root package name */
    public final eb.u0 f6803a;

    public s0(eb.u0 u0Var) {
        this.f6803a = u0Var;
    }

    @Override // eb.u0
    public String a() {
        return this.f6803a.a();
    }

    @Override // eb.u0
    public final void b() {
        this.f6803a.b();
    }

    @Override // eb.u0
    public void c() {
        this.f6803a.c();
    }

    @Override // eb.u0
    public void d(u0.d dVar) {
        this.f6803a.d(dVar);
    }

    public final String toString() {
        g.a b10 = n7.g.b(this);
        b10.a(this.f6803a, "delegate");
        return b10.toString();
    }
}
