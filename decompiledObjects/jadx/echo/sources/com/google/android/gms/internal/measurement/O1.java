package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.Y3;

/* loaded from: classes.dex */
public final class O1 extends Y3 implements K4 {
    private static final O1 zzc;
    private static volatile T4 zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";

    public static final class a extends Y3.b implements K4 {
        public a() {
            super(O1.zzc);
        }

        public /* synthetic */ a(H1 h12) {
            this();
        }
    }

    static {
        O1 o12 = new O1();
        zzc = o12;
        Y3.t(O1.class, o12);
    }

    public final String H() {
        return this.zzf;
    }

    public final String I() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.measurement.Y3
    public final Object p(int i7, Object obj, Object obj2) {
        H1 h12 = null;
        switch (H1.f10398a[i7 - 1]) {
            case 1:
                return new O1();
            case 2:
                return new a(h12);
            case 3:
                return Y3.q(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                T4 t42 = zzd;
                if (t42 == null) {
                    synchronized (O1.class) {
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
