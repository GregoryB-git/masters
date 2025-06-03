package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.Y3;

/* loaded from: classes.dex */
public final class U1 extends Y3 implements K4 {
    private static final U1 zzc;
    private static volatile T4 zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";
    private String zzl = "";

    public static final class a extends Y3.b implements K4 {
        public a() {
            super(U1.zzc);
        }

        public /* synthetic */ a(T1 t12) {
            this();
        }
    }

    static {
        U1 u12 = new U1();
        zzc = u12;
        Y3.t(U1.class, u12);
    }

    @Override // com.google.android.gms.internal.measurement.Y3
    public final Object p(int i7, Object obj, Object obj2) {
        T1 t12 = null;
        switch (T1.f10593a[i7 - 1]) {
            case 1:
                return new U1();
            case 2:
                return new a(t12);
            case 3:
                return Y3.q(zzc, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
            case 4:
                return zzc;
            case 5:
                T4 t42 = zzd;
                if (t42 == null) {
                    synchronized (U1.class) {
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
