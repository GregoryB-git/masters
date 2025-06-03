package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.Y3;

/* renamed from: com.google.android.gms.internal.measurement.y1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1072y1 extends Y3 implements K4 {
    private static final C1072y1 zzc;
    private static volatile T4 zzd;
    private int zze;
    private B1 zzf;
    private C1080z1 zzg;
    private boolean zzh;
    private String zzi = "";

    /* renamed from: com.google.android.gms.internal.measurement.y1$a */
    public static final class a extends Y3.b implements K4 {
        public a() {
            super(C1072y1.zzc);
        }

        public final a w(String str) {
            s();
            ((C1072y1) this.f10721p).I(str);
            return this;
        }

        public /* synthetic */ a(AbstractC1045v1 abstractC1045v1) {
            this();
        }
    }

    static {
        C1072y1 c1072y1 = new C1072y1();
        zzc = c1072y1;
        Y3.t(C1072y1.class, c1072y1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(String str) {
        str.getClass();
        this.zze |= 8;
        this.zzi = str;
    }

    public static C1072y1 J() {
        return zzc;
    }

    public final C1080z1 K() {
        C1080z1 c1080z1 = this.zzg;
        return c1080z1 == null ? C1080z1.I() : c1080z1;
    }

    public final B1 L() {
        B1 b12 = this.zzf;
        return b12 == null ? B1.I() : b12;
    }

    public final String M() {
        return this.zzi;
    }

    public final boolean N() {
        return this.zzh;
    }

    public final boolean O() {
        return (this.zze & 4) != 0;
    }

    public final boolean P() {
        return (this.zze & 2) != 0;
    }

    public final boolean Q() {
        return (this.zze & 8) != 0;
    }

    public final boolean R() {
        return (this.zze & 1) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.Y3
    public final Object p(int i7, Object obj, Object obj2) {
        AbstractC1045v1 abstractC1045v1 = null;
        switch (AbstractC1045v1.f11193a[i7 - 1]) {
            case 1:
                return new C1072y1();
            case 2:
                return new a(abstractC1045v1);
            case 3:
                return Y3.q(zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                T4 t42 = zzd;
                if (t42 == null) {
                    synchronized (C1072y1.class) {
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
