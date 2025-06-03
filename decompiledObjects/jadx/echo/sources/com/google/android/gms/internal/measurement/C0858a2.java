package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.Y3;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.a2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0858a2 extends Y3 implements K4 {
    private static final C0858a2 zzc;
    private static volatile T4 zzd;
    private int zze;
    private long zzh;
    private float zzi;
    private double zzj;
    private String zzf = "";
    private String zzg = "";
    private InterfaceC0923h4 zzk = Y3.B();

    /* renamed from: com.google.android.gms.internal.measurement.a2$a */
    public static final class a extends Y3.b implements K4 {
        public a() {
            super(C0858a2.zzc);
        }

        public final a A(Iterable iterable) {
            s();
            ((C0858a2) this.f10721p).P(iterable);
            return this;
        }

        public final a B(String str) {
            s();
            ((C0858a2) this.f10721p).Q(str);
            return this;
        }

        public final a C() {
            s();
            ((C0858a2) this.f10721p).k0();
            return this;
        }

        public final a D(String str) {
            s();
            ((C0858a2) this.f10721p).U(str);
            return this;
        }

        public final a E() {
            s();
            ((C0858a2) this.f10721p).l0();
            return this;
        }

        public final a F() {
            s();
            ((C0858a2) this.f10721p).m0();
            return this;
        }

        public final a G() {
            s();
            ((C0858a2) this.f10721p).n0();
            return this;
        }

        public final int w() {
            return ((C0858a2) this.f10721p).V();
        }

        public final a x(double d7) {
            s();
            ((C0858a2) this.f10721p).H(d7);
            return this;
        }

        public final a y(long j7) {
            s();
            ((C0858a2) this.f10721p).I(j7);
            return this;
        }

        public final a z(a aVar) {
            s();
            ((C0858a2) this.f10721p).a0((C0858a2) ((Y3) aVar.p()));
            return this;
        }

        public /* synthetic */ a(T1 t12) {
            this();
        }
    }

    static {
        C0858a2 c0858a2 = new C0858a2();
        zzc = c0858a2;
        Y3.t(C0858a2.class, c0858a2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(long j7) {
        this.zze |= 4;
        this.zzh = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P(Iterable iterable) {
        o0();
        AbstractC0940j3.e(iterable, this.zzk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q(String str) {
        str.getClass();
        this.zze |= 1;
        this.zzf = str;
    }

    public static a Z() {
        return (a) zzc.w();
    }

    public final double G() {
        return this.zzj;
    }

    public final void H(double d7) {
        this.zze |= 16;
        this.zzj = d7;
    }

    public final float R() {
        return this.zzi;
    }

    public final void U(String str) {
        str.getClass();
        this.zze |= 2;
        this.zzg = str;
    }

    public final int V() {
        return this.zzk.size();
    }

    public final long X() {
        return this.zzh;
    }

    public final void a0(C0858a2 c0858a2) {
        c0858a2.getClass();
        o0();
        this.zzk.add(c0858a2);
    }

    public final String c0() {
        return this.zzf;
    }

    public final String d0() {
        return this.zzg;
    }

    public final List e0() {
        return this.zzk;
    }

    public final boolean f0() {
        return (this.zze & 16) != 0;
    }

    public final boolean g0() {
        return (this.zze & 8) != 0;
    }

    public final boolean h0() {
        return (this.zze & 4) != 0;
    }

    public final boolean i0() {
        return (this.zze & 1) != 0;
    }

    public final boolean j0() {
        return (this.zze & 2) != 0;
    }

    public final void k0() {
        this.zze &= -17;
        this.zzj = 0.0d;
    }

    public final void l0() {
        this.zze &= -5;
        this.zzh = 0L;
    }

    public final void m0() {
        this.zzk = Y3.B();
    }

    public final void n0() {
        this.zze &= -3;
        this.zzg = zzc.zzg;
    }

    public final void o0() {
        InterfaceC0923h4 interfaceC0923h4 = this.zzk;
        if (interfaceC0923h4.c()) {
            return;
        }
        this.zzk = Y3.n(interfaceC0923h4);
    }

    @Override // com.google.android.gms.internal.measurement.Y3
    public final Object p(int i7, Object obj, Object obj2) {
        T1 t12 = null;
        switch (T1.f10593a[i7 - 1]) {
            case 1:
                return new C0858a2();
            case 2:
                return new a(t12);
            case 3:
                return Y3.q(zzc, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", C0858a2.class});
            case 4:
                return zzc;
            case 5:
                T4 t42 = zzd;
                if (t42 == null) {
                    synchronized (C0858a2.class) {
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
