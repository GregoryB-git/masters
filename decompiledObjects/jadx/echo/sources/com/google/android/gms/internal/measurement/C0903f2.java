package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.Y3;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.f2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0903f2 extends Y3 implements K4 {
    private static final C0903f2 zzc;
    private static volatile T4 zzd;
    private InterfaceC0932i4 zze = Y3.A();
    private InterfaceC0932i4 zzf = Y3.A();
    private InterfaceC0923h4 zzg = Y3.B();
    private InterfaceC0923h4 zzh = Y3.B();

    /* renamed from: com.google.android.gms.internal.measurement.f2$a */
    public static final class a extends Y3.b implements K4 {
        public a() {
            super(C0903f2.zzc);
        }

        public final a A() {
            s();
            ((C0903f2) this.f10721p).e0();
            return this;
        }

        public final a B(Iterable iterable) {
            s();
            ((C0903f2) this.f10721p).Q(iterable);
            return this;
        }

        public final a C() {
            s();
            ((C0903f2) this.f10721p).f0();
            return this;
        }

        public final a D(Iterable iterable) {
            s();
            ((C0903f2) this.f10721p).U(iterable);
            return this;
        }

        public final a w() {
            s();
            ((C0903f2) this.f10721p).c0();
            return this;
        }

        public final a x(Iterable iterable) {
            s();
            ((C0903f2) this.f10721p).I(iterable);
            return this;
        }

        public final a y() {
            s();
            ((C0903f2) this.f10721p).d0();
            return this;
        }

        public final a z(Iterable iterable) {
            s();
            ((C0903f2) this.f10721p).M(iterable);
            return this;
        }

        public /* synthetic */ a(T1 t12) {
            this();
        }
    }

    static {
        C0903f2 c0903f2 = new C0903f2();
        zzc = c0903f2;
        Y3.t(C0903f2.class, c0903f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(Iterable iterable) {
        InterfaceC0923h4 interfaceC0923h4 = this.zzg;
        if (!interfaceC0923h4.c()) {
            this.zzg = Y3.n(interfaceC0923h4);
        }
        AbstractC0940j3.e(iterable, this.zzg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(Iterable iterable) {
        InterfaceC0932i4 interfaceC0932i4 = this.zzf;
        if (!interfaceC0932i4.c()) {
            this.zzf = Y3.o(interfaceC0932i4);
        }
        AbstractC0940j3.e(iterable, this.zzf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q(Iterable iterable) {
        InterfaceC0923h4 interfaceC0923h4 = this.zzh;
        if (!interfaceC0923h4.c()) {
            this.zzh = Y3.n(interfaceC0923h4);
        }
        AbstractC0940j3.e(iterable, this.zzh);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U(Iterable iterable) {
        InterfaceC0932i4 interfaceC0932i4 = this.zze;
        if (!interfaceC0932i4.c()) {
            this.zze = Y3.o(interfaceC0932i4);
        }
        AbstractC0940j3.e(iterable, this.zze);
    }

    public static a V() {
        return (a) zzc.w();
    }

    public static C0903f2 X() {
        return zzc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c0() {
        this.zzg = Y3.B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d0() {
        this.zzf = Y3.A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f0() {
        this.zze = Y3.A();
    }

    public final int J() {
        return this.zzf.size();
    }

    public final int N() {
        return this.zzh.size();
    }

    public final int R() {
        return this.zze.size();
    }

    public final List Y() {
        return this.zzg;
    }

    public final List Z() {
        return this.zzf;
    }

    public final List a0() {
        return this.zzh;
    }

    public final List b0() {
        return this.zze;
    }

    public final void e0() {
        this.zzh = Y3.B();
    }

    public final int k() {
        return this.zzg.size();
    }

    @Override // com.google.android.gms.internal.measurement.Y3
    public final Object p(int i7, Object obj, Object obj2) {
        T1 t12 = null;
        switch (T1.f10593a[i7 - 1]) {
            case 1:
                return new C0903f2();
            case 2:
                return new a(t12);
            case 3:
                return Y3.q(zzc, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zze", "zzf", "zzg", X1.class, "zzh", C0912g2.class});
            case 4:
                return zzc;
            case 5:
                T4 t42 = zzd;
                if (t42 == null) {
                    synchronized (C0903f2.class) {
                        try {
                            t42 = zzd;
                            if (t42 == null) {
                                t42 = new Y3.a(zzc);
                                zzd = t42;
                            }
                        } finally {
                        }
                    }
                }
                return t42;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
