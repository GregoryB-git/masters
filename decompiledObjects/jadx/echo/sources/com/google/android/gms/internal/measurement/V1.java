package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.Y3;

/* loaded from: classes.dex */
public final class V1 extends Y3 implements K4 {
    private static final V1 zzc;
    private static volatile T4 zzd;
    private int zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    public static final class a extends Y3.b implements K4 {
        public a() {
            super(V1.zzc);
        }

        public final a A(boolean z7) {
            s();
            ((V1) this.f10721p).T(z7);
            return this;
        }

        public final a B(boolean z7) {
            s();
            ((V1) this.f10721p).W(z7);
            return this;
        }

        public final a C(boolean z7) {
            s();
            ((V1) this.f10721p).Z(z7);
            return this;
        }

        public final a w(boolean z7) {
            s();
            ((V1) this.f10721p).I(z7);
            return this;
        }

        public final a x(boolean z7) {
            s();
            ((V1) this.f10721p).L(z7);
            return this;
        }

        public final a y(boolean z7) {
            s();
            ((V1) this.f10721p).O(z7);
            return this;
        }

        public final a z(boolean z7) {
            s();
            ((V1) this.f10721p).Q(z7);
            return this;
        }

        public /* synthetic */ a(T1 t12) {
            this();
        }
    }

    static {
        V1 v12 = new V1();
        zzc = v12;
        Y3.t(V1.class, v12);
    }

    public static a G() {
        return (a) zzc.w();
    }

    public static V1 M() {
        return zzc;
    }

    public final void I(boolean z7) {
        this.zze |= 32;
        this.zzk = z7;
    }

    public final void L(boolean z7) {
        this.zze |= 16;
        this.zzj = z7;
    }

    public final void O(boolean z7) {
        this.zze |= 1;
        this.zzf = z7;
    }

    public final void Q(boolean z7) {
        this.zze |= 64;
        this.zzl = z7;
    }

    public final boolean R() {
        return this.zzk;
    }

    public final void T(boolean z7) {
        this.zze |= 2;
        this.zzg = z7;
    }

    public final boolean U() {
        return this.zzj;
    }

    public final void W(boolean z7) {
        this.zze |= 4;
        this.zzh = z7;
    }

    public final boolean X() {
        return this.zzf;
    }

    public final void Z(boolean z7) {
        this.zze |= 8;
        this.zzi = z7;
    }

    public final boolean a0() {
        return this.zzl;
    }

    public final boolean b0() {
        return this.zzg;
    }

    public final boolean c0() {
        return this.zzh;
    }

    public final boolean d0() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.measurement.Y3
    public final Object p(int i7, Object obj, Object obj2) {
        T1 t12 = null;
        switch (T1.f10593a[i7 - 1]) {
            case 1:
                return new V1();
            case 2:
                return new a(t12);
            case 3:
                return Y3.q(zzc, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
            case 4:
                return zzc;
            case 5:
                T4 t42 = zzd;
                if (t42 == null) {
                    synchronized (V1.class) {
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
