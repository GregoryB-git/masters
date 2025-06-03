package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class F1 {

    /* renamed from: a, reason: collision with root package name */
    public final E f10367a;

    /* renamed from: b, reason: collision with root package name */
    public final C0904f3 f10368b;

    /* renamed from: c, reason: collision with root package name */
    public final C0904f3 f10369c;

    /* renamed from: d, reason: collision with root package name */
    public final X4 f10370d;

    public F1() {
        E e7 = new E();
        this.f10367a = e7;
        C0904f3 c0904f3 = new C0904f3(null, e7);
        this.f10369c = c0904f3;
        this.f10368b = c0904f3.d();
        X4 x42 = new X4();
        this.f10370d = x42;
        c0904f3.h("require", new X7(x42));
        x42.b("internal.platform", new Callable() { // from class: com.google.android.gms.internal.measurement.d1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new W7();
            }
        });
        c0904f3.h("runtime.counter", new C0945k(Double.valueOf(0.0d)));
    }

    public final InterfaceC1016s a(C0904f3 c0904f3, C1010r2... c1010r2Arr) {
        InterfaceC1016s interfaceC1016s = InterfaceC1016s.f11133d;
        for (C1010r2 c1010r2 : c1010r2Arr) {
            interfaceC1016s = AbstractC0869b4.a(c1010r2);
            C2.b(this.f10369c);
            if ((interfaceC1016s instanceof C1043v) || (interfaceC1016s instanceof C1025t)) {
                interfaceC1016s = this.f10367a.a(c0904f3, interfaceC1016s);
            }
        }
        return interfaceC1016s;
    }

    public final void b(String str, Callable callable) {
        this.f10370d.b(str, callable);
    }
}
