package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.Y3;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.x1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1063x1 extends Y3 implements K4 {
    private static final C1063x1 zzc;
    private static volatile T4 zzd;
    private int zze;
    private int zzf;
    private String zzg = "";
    private InterfaceC0923h4 zzh = Y3.B();
    private boolean zzi;
    private C1080z1 zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;

    /* renamed from: com.google.android.gms.internal.measurement.x1$a */
    public static final class a extends Y3.b implements K4 {
        public a() {
            super(C1063x1.zzc);
        }

        public final String A() {
            return ((C1063x1) this.f10721p).P();
        }

        public final int w() {
            return ((C1063x1) this.f10721p).k();
        }

        public final a x(int i7, C1072y1 c1072y1) {
            s();
            ((C1063x1) this.f10721p).H(i7, c1072y1);
            return this;
        }

        public final a y(String str) {
            s();
            ((C1063x1) this.f10721p).K(str);
            return this;
        }

        public final C1072y1 z(int i7) {
            return ((C1063x1) this.f10721p).G(i7);
        }

        public /* synthetic */ a(AbstractC1045v1 abstractC1045v1) {
            this();
        }
    }

    static {
        C1063x1 c1063x1 = new C1063x1();
        zzc = c1063x1;
        Y3.t(C1063x1.class, c1063x1);
    }

    public static a M() {
        return (a) zzc.w();
    }

    public final C1072y1 G(int i7) {
        return (C1072y1) this.zzh.get(i7);
    }

    public final void H(int i7, C1072y1 c1072y1) {
        c1072y1.getClass();
        InterfaceC0923h4 interfaceC0923h4 = this.zzh;
        if (!interfaceC0923h4.c()) {
            this.zzh = Y3.n(interfaceC0923h4);
        }
        this.zzh.set(i7, c1072y1);
    }

    public final void K(String str) {
        str.getClass();
        this.zze |= 2;
        this.zzg = str;
    }

    public final int L() {
        return this.zzf;
    }

    public final C1080z1 O() {
        C1080z1 c1080z1 = this.zzj;
        return c1080z1 == null ? C1080z1.I() : c1080z1;
    }

    public final String P() {
        return this.zzg;
    }

    public final List Q() {
        return this.zzh;
    }

    public final boolean R() {
        return this.zzk;
    }

    public final boolean S() {
        return this.zzl;
    }

    public final boolean T() {
        return this.zzm;
    }

    public final boolean U() {
        return (this.zze & 8) != 0;
    }

    public final boolean V() {
        return (this.zze & 1) != 0;
    }

    public final boolean W() {
        return (this.zze & 64) != 0;
    }

    public final int k() {
        return this.zzh.size();
    }

    @Override // com.google.android.gms.internal.measurement.Y3
    public final Object p(int i7, Object obj, Object obj2) {
        AbstractC1045v1 abstractC1045v1 = null;
        switch (AbstractC1045v1.f11193a[i7 - 1]) {
            case 1:
                return new C1063x1();
            case 2:
                return new a(abstractC1045v1);
            case 3:
                return Y3.q(zzc, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", C1072y1.class, "zzi", "zzj", "zzk", "zzl", "zzm"});
            case 4:
                return zzc;
            case 5:
                T4 t42 = zzd;
                if (t42 == null) {
                    synchronized (C1063x1.class) {
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
