package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.Y3;

/* renamed from: com.google.android.gms.internal.measurement.h2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0921h2 extends Y3 implements K4 {
    private static final C0921h2 zzc;
    private static volatile T4 zzd;
    private int zze;
    private long zzf;
    private String zzg = "";
    private String zzh = "";
    private long zzi;
    private float zzj;
    private double zzk;

    /* renamed from: com.google.android.gms.internal.measurement.h2$a */
    public static final class a extends Y3.b implements K4 {
        public a() {
            super(C0921h2.zzc);
        }

        public final a A() {
            s();
            ((C0921h2) this.f10721p).h0();
            return this;
        }

        public final a B(long j7) {
            s();
            ((C0921h2) this.f10721p).P(j7);
            return this;
        }

        public final a C(String str) {
            s();
            ((C0921h2) this.f10721p).T(str);
            return this;
        }

        public final a D() {
            s();
            ((C0921h2) this.f10721p).i0();
            return this;
        }

        public final a w() {
            s();
            ((C0921h2) this.f10721p).g0();
            return this;
        }

        public final a x(double d7) {
            s();
            ((C0921h2) this.f10721p).H(d7);
            return this;
        }

        public final a y(long j7) {
            s();
            ((C0921h2) this.f10721p).I(j7);
            return this;
        }

        public final a z(String str) {
            s();
            ((C0921h2) this.f10721p).N(str);
            return this;
        }

        public /* synthetic */ a(T1 t12) {
            this();
        }
    }

    static {
        C0921h2 c0921h2 = new C0921h2();
        zzc = c0921h2;
        Y3.t(C0921h2.class, c0921h2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(double d7) {
        this.zze |= 32;
        this.zzk = d7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(long j7) {
        this.zze |= 8;
        this.zzi = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N(String str) {
        str.getClass();
        this.zze |= 2;
        this.zzg = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P(long j7) {
        this.zze |= 1;
        this.zzf = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T(String str) {
        str.getClass();
        this.zze |= 4;
        this.zzh = str;
    }

    public static a X() {
        return (a) zzc.w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g0() {
        this.zze &= -33;
        this.zzk = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h0() {
        this.zze &= -9;
        this.zzi = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i0() {
        this.zze &= -5;
        this.zzh = zzc.zzh;
    }

    public final double G() {
        return this.zzk;
    }

    public final float O() {
        return this.zzj;
    }

    public final long U() {
        return this.zzi;
    }

    public final long W() {
        return this.zzf;
    }

    public final String Z() {
        return this.zzg;
    }

    public final String a0() {
        return this.zzh;
    }

    public final boolean b0() {
        return (this.zze & 32) != 0;
    }

    public final boolean c0() {
        return (this.zze & 16) != 0;
    }

    public final boolean d0() {
        return (this.zze & 8) != 0;
    }

    public final boolean e0() {
        return (this.zze & 1) != 0;
    }

    public final boolean f0() {
        return (this.zze & 4) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.Y3
    public final Object p(int i7, Object obj, Object obj2) {
        T1 t12 = null;
        switch (T1.f10593a[i7 - 1]) {
            case 1:
                return new C0921h2();
            case 2:
                return new a(t12);
            case 3:
                return Y3.q(zzc, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzc;
            case 5:
                T4 t42 = zzd;
                if (t42 == null) {
                    synchronized (C0921h2.class) {
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
