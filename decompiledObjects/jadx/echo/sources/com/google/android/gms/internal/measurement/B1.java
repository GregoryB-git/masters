package com.google.android.gms.internal.measurement;

import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.gms.internal.measurement.Y3;
import java.util.List;

/* loaded from: classes.dex */
public final class B1 extends Y3 implements K4 {
    private static final B1 zzc;
    private static volatile T4 zzd;
    private int zze;
    private int zzf;
    private boolean zzh;
    private String zzg = "";
    private InterfaceC0923h4 zzi = Y3.B();

    public enum a implements InterfaceC0896e4 {
        UNKNOWN_MATCH_TYPE(0),
        REGEXP(1),
        BEGINS_WITH(2),
        ENDS_WITH(3),
        PARTIAL(4),
        EXACT(5),
        IN_LIST(6);


        /* renamed from: w, reason: collision with root package name */
        public static final InterfaceC0887d4 f10302w = new G1();

        /* renamed from: o, reason: collision with root package name */
        public final int f10304o;

        a(int i7) {
            this.f10304o = i7;
        }

        public static a c(int i7) {
            switch (i7) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    return UNKNOWN_MATCH_TYPE;
                case 1:
                    return REGEXP;
                case 2:
                    return BEGINS_WITH;
                case 3:
                    return ENDS_WITH;
                case 4:
                    return PARTIAL;
                case 5:
                    return EXACT;
                case 6:
                    return IN_LIST;
                default:
                    return null;
            }
        }

        public static InterfaceC0914g4 e() {
            return E1.f10362a;
        }

        @Override // com.google.android.gms.internal.measurement.InterfaceC0896e4
        public final int a() {
            return this.f10304o;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f10304o + " name=" + name() + '>';
        }
    }

    public static final class b extends Y3.b implements K4 {
        public b() {
            super(B1.zzc);
        }

        public /* synthetic */ b(AbstractC1045v1 abstractC1045v1) {
            this();
        }
    }

    static {
        B1 b12 = new B1();
        zzc = b12;
        Y3.t(B1.class, b12);
    }

    public static B1 I() {
        return zzc;
    }

    public final a G() {
        a c7 = a.c(this.zzf);
        return c7 == null ? a.UNKNOWN_MATCH_TYPE : c7;
    }

    public final String J() {
        return this.zzg;
    }

    public final List K() {
        return this.zzi;
    }

    public final boolean L() {
        return this.zzh;
    }

    public final boolean M() {
        return (this.zze & 4) != 0;
    }

    public final boolean N() {
        return (this.zze & 2) != 0;
    }

    public final boolean O() {
        return (this.zze & 1) != 0;
    }

    public final int k() {
        return this.zzi.size();
    }

    @Override // com.google.android.gms.internal.measurement.Y3
    public final Object p(int i7, Object obj, Object obj2) {
        AbstractC1045v1 abstractC1045v1 = null;
        switch (AbstractC1045v1.f11193a[i7 - 1]) {
            case 1:
                return new B1();
            case 2:
                return new b(abstractC1045v1);
            case 3:
                return Y3.q(zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zze", "zzf", a.e(), "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                T4 t42 = zzd;
                if (t42 == null) {
                    synchronized (B1.class) {
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
