package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.Y3;

/* loaded from: classes.dex */
public final class J1 extends Y3 implements K4 {
    private static final J1 zzc;
    private static volatile T4 zzd;
    private int zze;
    private String zzf = "";
    private InterfaceC0923h4 zzg = Y3.B();
    private boolean zzh;

    public static final class a extends Y3.b implements K4 {
        public a() {
            super(J1.zzc);
        }

        public /* synthetic */ a(H1 h12) {
            this();
        }
    }

    static {
        J1 j12 = new J1();
        zzc = j12;
        Y3.t(J1.class, j12);
    }

    public final String H() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.Y3
    public final Object p(int i7, Object obj, Object obj2) {
        H1 h12 = null;
        switch (H1.f10398a[i7 - 1]) {
            case 1:
                return new J1();
            case 2:
                return new a(h12);
            case 3:
                return Y3.q(zzc, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zze", "zzf", "zzg", N1.class, "zzh"});
            case 4:
                return zzc;
            case 5:
                T4 t42 = zzd;
                if (t42 == null) {
                    synchronized (J1.class) {
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
