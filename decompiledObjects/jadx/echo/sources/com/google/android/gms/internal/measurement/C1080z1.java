package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.Y3;

/* renamed from: com.google.android.gms.internal.measurement.z1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1080z1 extends Y3 implements K4 {
    private static final C1080z1 zzc;
    private static volatile T4 zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    /* renamed from: com.google.android.gms.internal.measurement.z1$a */
    public static final class a extends Y3.b implements K4 {
        public a() {
            super(C1080z1.zzc);
        }

        public /* synthetic */ a(AbstractC1045v1 abstractC1045v1) {
            this();
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.z1$b */
    public enum b implements InterfaceC0896e4 {
        UNKNOWN_COMPARISON_TYPE(0),
        LESS_THAN(1),
        GREATER_THAN(2),
        EQUAL(3),
        BETWEEN(4);


        /* renamed from: u, reason: collision with root package name */
        public static final InterfaceC0887d4 f11226u = new C1();

        /* renamed from: o, reason: collision with root package name */
        public final int f11228o;

        b(int i7) {
            this.f11228o = i7;
        }

        public static b c(int i7) {
            if (i7 == 0) {
                return UNKNOWN_COMPARISON_TYPE;
            }
            if (i7 == 1) {
                return LESS_THAN;
            }
            if (i7 == 2) {
                return GREATER_THAN;
            }
            if (i7 == 3) {
                return EQUAL;
            }
            if (i7 != 4) {
                return null;
            }
            return BETWEEN;
        }

        public static InterfaceC0914g4 e() {
            return D1.f10333a;
        }

        @Override // com.google.android.gms.internal.measurement.InterfaceC0896e4
        public final int a() {
            return this.f11228o;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f11228o + " name=" + name() + '>';
        }
    }

    static {
        C1080z1 c1080z1 = new C1080z1();
        zzc = c1080z1;
        Y3.t(C1080z1.class, c1080z1);
    }

    public static C1080z1 I() {
        return zzc;
    }

    public final b G() {
        b c7 = b.c(this.zzf);
        return c7 == null ? b.UNKNOWN_COMPARISON_TYPE : c7;
    }

    public final String J() {
        return this.zzh;
    }

    public final String K() {
        return this.zzj;
    }

    public final String L() {
        return this.zzi;
    }

    public final boolean M() {
        return this.zzg;
    }

    public final boolean N() {
        return (this.zze & 1) != 0;
    }

    public final boolean O() {
        return (this.zze & 4) != 0;
    }

    public final boolean P() {
        return (this.zze & 2) != 0;
    }

    public final boolean Q() {
        return (this.zze & 16) != 0;
    }

    public final boolean R() {
        return (this.zze & 8) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.Y3
    public final Object p(int i7, Object obj, Object obj2) {
        AbstractC1045v1 abstractC1045v1 = null;
        switch (AbstractC1045v1.f11193a[i7 - 1]) {
            case 1:
                return new C1080z1();
            case 2:
                return new a(abstractC1045v1);
            case 3:
                return Y3.q(zzc, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zze", "zzf", b.e(), "zzg", "zzh", "zzi", "zzj"});
            case 4:
                return zzc;
            case 5:
                T4 t42 = zzd;
                if (t42 == null) {
                    synchronized (C1080z1.class) {
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
