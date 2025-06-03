package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    public final F1 f10322a;

    /* renamed from: b, reason: collision with root package name */
    public C0904f3 f10323b;

    /* renamed from: c, reason: collision with root package name */
    public C0882d f10324c;

    /* renamed from: d, reason: collision with root package name */
    public final C0864b f10325d;

    public C() {
        this(new F1());
    }

    public final C0882d a() {
        return this.f10324c;
    }

    public final void b(C1002q2 c1002q2) {
        AbstractC0972n abstractC0972n;
        try {
            this.f10323b = this.f10322a.f10368b.d();
            if (this.f10322a.a(this.f10323b, (C1010r2[]) c1002q2.I().toArray(new C1010r2[0])) instanceof C0954l) {
                throw new IllegalStateException("Program loading failed");
            }
            for (C0993p2 c0993p2 : c1002q2.G().I()) {
                List I6 = c0993p2.I();
                String H6 = c0993p2.H();
                Iterator it = I6.iterator();
                while (it.hasNext()) {
                    InterfaceC1016s a7 = this.f10322a.a(this.f10323b, (C1010r2) it.next());
                    if (!(a7 instanceof r)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                    C0904f3 c0904f3 = this.f10323b;
                    if (c0904f3.g(H6)) {
                        InterfaceC1016s c7 = c0904f3.c(H6);
                        if (!(c7 instanceof AbstractC0972n)) {
                            throw new IllegalStateException("Invalid function name: " + H6);
                        }
                        abstractC0972n = (AbstractC0972n) c7;
                    } else {
                        abstractC0972n = null;
                    }
                    if (abstractC0972n == null) {
                        throw new IllegalStateException("Rule function is undefined: " + H6);
                    }
                    abstractC0972n.b(this.f10323b, Collections.singletonList(a7));
                }
            }
        } catch (Throwable th) {
            throw new C0883d0(th);
        }
    }

    public final void c(String str, Callable callable) {
        this.f10322a.b(str, callable);
    }

    public final boolean d(C0891e c0891e) {
        try {
            this.f10324c.b(c0891e);
            this.f10322a.f10369c.h("runtime.counter", new C0945k(Double.valueOf(0.0d)));
            this.f10325d.b(this.f10323b.d(), this.f10324c);
            if (g()) {
                return true;
            }
            return f();
        } catch (Throwable th) {
            throw new C0883d0(th);
        }
    }

    public final /* synthetic */ AbstractC0972n e() {
        return new U7(this.f10325d);
    }

    public final boolean f() {
        return !this.f10324c.f().isEmpty();
    }

    public final boolean g() {
        return !this.f10324c.d().equals(this.f10324c.a());
    }

    public C(F1 f12) {
        this.f10322a = f12;
        this.f10323b = f12.f10368b.d();
        this.f10324c = new C0882d();
        this.f10325d = new C0864b();
        f12.b("internal.registerCallback", new Callable() { // from class: com.google.android.gms.internal.measurement.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C.this.e();
            }
        });
        f12.b("internal.eventLogger", new Callable() { // from class: com.google.android.gms.internal.measurement.D0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new C1075y4(C.this.f10324c);
            }
        });
    }
}
