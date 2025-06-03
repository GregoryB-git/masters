package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.Y3;

/* loaded from: classes.dex */
public final class A1 extends Y3 implements K4 {
    private static final A1 zzc;
    private static volatile T4 zzd;
    private int zze;
    private int zzf;
    private String zzg = "";
    private C1072y1 zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    public static final class a extends Y3.b implements K4 {
        public a() {
            super(A1.zzc);
        }

        public final a w(String str) {
            s();
            ((A1) this.f10721p).H(str);
            return this;
        }

        public /* synthetic */ a(AbstractC1045v1 abstractC1045v1) {
            this();
        }
    }

    static {
        A1 a12 = new A1();
        zzc = a12;
        Y3.t(A1.class, a12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(String str) {
        str.getClass();
        this.zze |= 2;
        this.zzg = str;
    }

    public static a J() {
        return (a) zzc.w();
    }

    public final C1072y1 I() {
        C1072y1 c1072y1 = this.zzh;
        return c1072y1 == null ? C1072y1.J() : c1072y1;
    }

    public final String L() {
        return this.zzg;
    }

    public final boolean M() {
        return this.zzi;
    }

    public final boolean N() {
        return this.zzj;
    }

    public final boolean O() {
        return this.zzk;
    }

    public final boolean P() {
        return (this.zze & 1) != 0;
    }

    public final boolean Q() {
        return (this.zze & 32) != 0;
    }

    public final int k() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.Y3
    public final Object p(int i7, Object obj, Object obj2) {
        AbstractC1045v1 abstractC1045v1 = null;
        switch (AbstractC1045v1.f11193a[i7 - 1]) {
            case 1:
                return new A1();
            case 2:
                return new a(abstractC1045v1);
            case 3:
                return Y3.q(zzc, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzc;
            case 5:
                T4 t42 = zzd;
                if (t42 == null) {
                    synchronized (A1.class) {
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
