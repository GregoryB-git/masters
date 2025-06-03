package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.Y3;

/* loaded from: classes.dex */
public final class K1 extends Y3 implements K4 {
    private static final K1 zzc;
    private static volatile T4 zzd;
    private int zze;
    private String zzf = "";
    private boolean zzg;
    private boolean zzh;
    private int zzi;

    public static final class a extends Y3.b implements K4 {
        public a() {
            super(K1.zzc);
        }

        public final boolean A() {
            return ((K1) this.f10721p).L();
        }

        public final boolean B() {
            return ((K1) this.f10721p).M();
        }

        public final boolean C() {
            return ((K1) this.f10721p).N();
        }

        public final boolean D() {
            return ((K1) this.f10721p).O();
        }

        public final int w() {
            return ((K1) this.f10721p).k();
        }

        public final a x(String str) {
            s();
            ((K1) this.f10721p).H(str);
            return this;
        }

        public final String y() {
            return ((K1) this.f10721p).J();
        }

        public final boolean z() {
            return ((K1) this.f10721p).K();
        }

        public /* synthetic */ a(H1 h12) {
            this();
        }
    }

    static {
        K1 k12 = new K1();
        zzc = k12;
        Y3.t(K1.class, k12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(String str) {
        str.getClass();
        this.zze |= 1;
        this.zzf = str;
    }

    public final String J() {
        return this.zzf;
    }

    public final boolean K() {
        return this.zzg;
    }

    public final boolean L() {
        return this.zzh;
    }

    public final boolean M() {
        return (this.zze & 2) != 0;
    }

    public final boolean N() {
        return (this.zze & 4) != 0;
    }

    public final boolean O() {
        return (this.zze & 8) != 0;
    }

    public final int k() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.measurement.Y3
    public final Object p(int i7, Object obj, Object obj2) {
        H1 h12 = null;
        switch (H1.f10398a[i7 - 1]) {
            case 1:
                return new K1();
            case 2:
                return new a(h12);
            case 3:
                return Y3.q(zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                T4 t42 = zzd;
                if (t42 == null) {
                    synchronized (K1.class) {
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
