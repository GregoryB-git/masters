package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.Y3;

/* loaded from: classes.dex */
public final class M1 extends Y3 implements K4 {
    private static final M1 zzc;
    private static volatile T4 zzd;
    private int zze;
    private int zzf = 14;
    private int zzg = 11;
    private int zzh = 60;

    public static final class a extends Y3.b implements K4 {
        public a() {
            super(M1.zzc);
        }

        public /* synthetic */ a(H1 h12) {
            this();
        }
    }

    static {
        M1 m12 = new M1();
        zzc = m12;
        Y3.t(M1.class, m12);
    }

    @Override // com.google.android.gms.internal.measurement.Y3
    public final Object p(int i7, Object obj, Object obj2) {
        H1 h12 = null;
        switch (H1.f10398a[i7 - 1]) {
            case 1:
                return new M1();
            case 2:
                return new a(h12);
            case 3:
                return Y3.q(zzc, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                T4 t42 = zzd;
                if (t42 == null) {
                    synchronized (M1.class) {
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
