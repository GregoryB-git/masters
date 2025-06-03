package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.Y3;

/* renamed from: com.google.android.gms.internal.measurement.b2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0867b2 extends Y3 implements K4 {
    private static final C0867b2 zzc;
    private static volatile T4 zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private U1 zzh;

    /* renamed from: com.google.android.gms.internal.measurement.b2$a */
    public static final class a extends Y3.b implements K4 {
        public a() {
            super(C0867b2.zzc);
        }

        public /* synthetic */ a(T1 t12) {
            this();
        }
    }

    static {
        C0867b2 c0867b2 = new C0867b2();
        zzc = c0867b2;
        Y3.t(C0867b2.class, c0867b2);
    }

    @Override // com.google.android.gms.internal.measurement.Y3
    public final Object p(int i7, Object obj, Object obj2) {
        T1 t12 = null;
        switch (T1.f10593a[i7 - 1]) {
            case 1:
                return new C0867b2();
            case 2:
                return new a(t12);
            case 3:
                return Y3.q(zzc, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                T4 t42 = zzd;
                if (t42 == null) {
                    synchronized (C0867b2.class) {
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
