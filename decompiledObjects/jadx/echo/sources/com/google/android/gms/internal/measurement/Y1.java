package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C0858a2;
import com.google.android.gms.internal.measurement.Y3;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class Y1 extends Y3 implements K4 {
    private static final Y1 zzc;
    private static volatile T4 zzd;
    private int zze;
    private InterfaceC0923h4 zzf = Y3.B();
    private String zzg = "";
    private long zzh;
    private long zzi;
    private int zzj;

    public static final class a extends Y3.b implements K4 {
        public a() {
            super(Y1.zzc);
        }

        public final a A(long j7) {
            s();
            ((Y1) this.f10721p).I(j7);
            return this;
        }

        public final a B(C0858a2.a aVar) {
            s();
            ((Y1) this.f10721p).Q((C0858a2) ((Y3) aVar.p()));
            return this;
        }

        public final a C(C0858a2 c0858a2) {
            s();
            ((Y1) this.f10721p).Q(c0858a2);
            return this;
        }

        public final a D(Iterable iterable) {
            s();
            ((Y1) this.f10721p).R(iterable);
            return this;
        }

        public final a E(String str) {
            s();
            ((Y1) this.f10721p).S(str);
            return this;
        }

        public final long F() {
            return ((Y1) this.f10721p).X();
        }

        public final a G(long j7) {
            s();
            ((Y1) this.f10721p).V(j7);
            return this;
        }

        public final C0858a2 H(int i7) {
            return ((Y1) this.f10721p).G(i7);
        }

        public final long I() {
            return ((Y1) this.f10721p).Y();
        }

        public final a J() {
            s();
            ((Y1) this.f10721p).g0();
            return this;
        }

        public final String K() {
            return ((Y1) this.f10721p).b0();
        }

        public final List L() {
            return Collections.unmodifiableList(((Y1) this.f10721p).c0());
        }

        public final boolean M() {
            return ((Y1) this.f10721p).f0();
        }

        public final int w() {
            return ((Y1) this.f10721p).T();
        }

        public final a x(int i7) {
            s();
            ((Y1) this.f10721p).U(i7);
            return this;
        }

        public final a y(int i7, C0858a2.a aVar) {
            s();
            ((Y1) this.f10721p).H(i7, (C0858a2) ((Y3) aVar.p()));
            return this;
        }

        public final a z(int i7, C0858a2 c0858a2) {
            s();
            ((Y1) this.f10721p).H(i7, c0858a2);
            return this;
        }

        public /* synthetic */ a(T1 t12) {
            this();
        }
    }

    static {
        Y1 y12 = new Y1();
        zzc = y12;
        Y3.t(Y1.class, y12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(long j7) {
        this.zze |= 4;
        this.zzi = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q(C0858a2 c0858a2) {
        c0858a2.getClass();
        h0();
        this.zzf.add(c0858a2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S(String str) {
        str.getClass();
        this.zze |= 1;
        this.zzg = str;
    }

    public static a Z() {
        return (a) zzc.w();
    }

    public final C0858a2 G(int i7) {
        return (C0858a2) this.zzf.get(i7);
    }

    public final void H(int i7, C0858a2 c0858a2) {
        c0858a2.getClass();
        h0();
        this.zzf.set(i7, c0858a2);
    }

    public final void R(Iterable iterable) {
        h0();
        AbstractC0940j3.e(iterable, this.zzf);
    }

    public final int T() {
        return this.zzf.size();
    }

    public final void U(int i7) {
        h0();
        this.zzf.remove(i7);
    }

    public final void V(long j7) {
        this.zze |= 2;
        this.zzh = j7;
    }

    public final long X() {
        return this.zzi;
    }

    public final long Y() {
        return this.zzh;
    }

    public final String b0() {
        return this.zzg;
    }

    public final List c0() {
        return this.zzf;
    }

    public final boolean d0() {
        return (this.zze & 8) != 0;
    }

    public final boolean e0() {
        return (this.zze & 4) != 0;
    }

    public final boolean f0() {
        return (this.zze & 2) != 0;
    }

    public final void g0() {
        this.zzf = Y3.B();
    }

    public final void h0() {
        InterfaceC0923h4 interfaceC0923h4 = this.zzf;
        if (interfaceC0923h4.c()) {
            return;
        }
        this.zzf = Y3.n(interfaceC0923h4);
    }

    public final int k() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.measurement.Y3
    public final Object p(int i7, Object obj, Object obj2) {
        T1 t12 = null;
        switch (T1.f10593a[i7 - 1]) {
            case 1:
                return new Y1();
            case 2:
                return new a(t12);
            case 3:
                return Y3.q(zzc, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zze", "zzf", C0858a2.class, "zzg", "zzh", "zzi", "zzj"});
            case 4:
                return zzc;
            case 5:
                T4 t42 = zzd;
                if (t42 == null) {
                    synchronized (Y1.class) {
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
