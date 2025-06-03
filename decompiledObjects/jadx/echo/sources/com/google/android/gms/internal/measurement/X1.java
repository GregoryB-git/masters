package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.Y3;

/* loaded from: classes.dex */
public final class X1 extends Y3 implements K4 {
    private static final X1 zzc;
    private static volatile T4 zzd;
    private int zze;
    private int zzf;
    private long zzg;

    public static final class a extends Y3.b implements K4 {
        public a() {
            super(X1.zzc);
        }

        public final a w(int i7) {
            s();
            ((X1) this.f10721p).G(i7);
            return this;
        }

        public final a x(long j7) {
            s();
            ((X1) this.f10721p).H(j7);
            return this;
        }

        public /* synthetic */ a(T1 t12) {
            this();
        }
    }

    static {
        X1 x12 = new X1();
        zzc = x12;
        Y3.t(X1.class, x12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(int i7) {
        this.zze |= 1;
        this.zzf = i7;
    }

    public static a L() {
        return (a) zzc.w();
    }

    public final void H(long j7) {
        this.zze |= 2;
        this.zzg = j7;
    }

    public final long K() {
        return this.zzg;
    }

    public final boolean N() {
        return (this.zze & 2) != 0;
    }

    public final boolean O() {
        return (this.zze & 1) != 0;
    }

    public final int k() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.Y3
    public final Object p(int i7, Object obj, Object obj2) {
        T1 t12 = null;
        switch (T1.f10593a[i7 - 1]) {
            case 1:
                return new X1();
            case 2:
                return new a(t12);
            case 3:
                return Y3.q(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                T4 t42 = zzd;
                if (t42 == null) {
                    synchronized (X1.class) {
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
