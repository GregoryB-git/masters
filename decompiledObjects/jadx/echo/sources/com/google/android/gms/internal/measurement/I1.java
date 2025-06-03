package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.Y3;
import java.util.List;

/* loaded from: classes.dex */
public final class I1 extends Y3 implements K4 {
    private static final I1 zzc;
    private static volatile T4 zzd;
    private int zze;
    private boolean zzi;
    private InterfaceC0923h4 zzf = Y3.B();
    private InterfaceC0923h4 zzg = Y3.B();
    private InterfaceC0923h4 zzh = Y3.B();
    private InterfaceC0923h4 zzj = Y3.B();

    public static final class a extends Y3.b implements K4 {
        public a() {
            super(I1.zzc);
        }

        public /* synthetic */ a(H1 h12) {
            this();
        }
    }

    public static final class b extends Y3 implements K4 {
        private static final b zzc;
        private static volatile T4 zzd;
        private int zze;
        private int zzf;
        private int zzg;

        public static final class a extends Y3.b implements K4 {
            public a() {
                super(b.zzc);
            }

            public /* synthetic */ a(H1 h12) {
                this();
            }
        }

        static {
            b bVar = new b();
            zzc = bVar;
            Y3.t(b.class, bVar);
        }

        public final d H() {
            d c7 = d.c(this.zzg);
            return c7 == null ? d.CONSENT_STATUS_UNSPECIFIED : c7;
        }

        public final e I() {
            e c7 = e.c(this.zzf);
            return c7 == null ? e.CONSENT_TYPE_UNSPECIFIED : c7;
        }

        @Override // com.google.android.gms.internal.measurement.Y3
        public final Object p(int i7, Object obj, Object obj2) {
            H1 h12 = null;
            switch (H1.f10398a[i7 - 1]) {
                case 1:
                    return new b();
                case 2:
                    return new a(h12);
                case 3:
                    return Y3.q(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zze", "zzf", e.e(), "zzg", d.e()});
                case 4:
                    return zzc;
                case 5:
                    T4 t42 = zzd;
                    if (t42 == null) {
                        synchronized (b.class) {
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

    public static final class c extends Y3 implements K4 {
        private static final c zzc;
        private static volatile T4 zzd;
        private int zze;
        private int zzf;
        private int zzg;

        public static final class a extends Y3.b implements K4 {
            public a() {
                super(c.zzc);
            }

            public /* synthetic */ a(H1 h12) {
                this();
            }
        }

        static {
            c cVar = new c();
            zzc = cVar;
            Y3.t(c.class, cVar);
        }

        public final e H() {
            e c7 = e.c(this.zzg);
            return c7 == null ? e.CONSENT_TYPE_UNSPECIFIED : c7;
        }

        public final e I() {
            e c7 = e.c(this.zzf);
            return c7 == null ? e.CONSENT_TYPE_UNSPECIFIED : c7;
        }

        @Override // com.google.android.gms.internal.measurement.Y3
        public final Object p(int i7, Object obj, Object obj2) {
            H1 h12 = null;
            switch (H1.f10398a[i7 - 1]) {
                case 1:
                    return new c();
                case 2:
                    return new a(h12);
                case 3:
                    return Y3.q(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zze", "zzf", e.e(), "zzg", e.e()});
                case 4:
                    return zzc;
                case 5:
                    T4 t42 = zzd;
                    if (t42 == null) {
                        synchronized (c.class) {
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

    public enum d implements InterfaceC0896e4 {
        CONSENT_STATUS_UNSPECIFIED(0),
        GRANTED(1),
        DENIED(2);


        /* renamed from: s, reason: collision with root package name */
        public static final InterfaceC0887d4 f10408s = new P1();

        /* renamed from: o, reason: collision with root package name */
        public final int f10410o;

        d(int i7) {
            this.f10410o = i7;
        }

        public static d c(int i7) {
            if (i7 == 0) {
                return CONSENT_STATUS_UNSPECIFIED;
            }
            if (i7 == 1) {
                return GRANTED;
            }
            if (i7 != 2) {
                return null;
            }
            return DENIED;
        }

        public static InterfaceC0914g4 e() {
            return Q1.f10550a;
        }

        @Override // com.google.android.gms.internal.measurement.InterfaceC0896e4
        public final int a() {
            return this.f10410o;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + d.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f10410o + " name=" + name() + '>';
        }
    }

    public enum e implements InterfaceC0896e4 {
        CONSENT_TYPE_UNSPECIFIED(0),
        AD_STORAGE(1),
        ANALYTICS_STORAGE(2),
        AD_USER_DATA(3),
        AD_PERSONALIZATION(4);


        /* renamed from: u, reason: collision with root package name */
        public static final InterfaceC0887d4 f10416u = new S1();

        /* renamed from: o, reason: collision with root package name */
        public final int f10418o;

        e(int i7) {
            this.f10418o = i7;
        }

        public static e c(int i7) {
            if (i7 == 0) {
                return CONSENT_TYPE_UNSPECIFIED;
            }
            if (i7 == 1) {
                return AD_STORAGE;
            }
            if (i7 == 2) {
                return ANALYTICS_STORAGE;
            }
            if (i7 == 3) {
                return AD_USER_DATA;
            }
            if (i7 != 4) {
                return null;
            }
            return AD_PERSONALIZATION;
        }

        public static InterfaceC0914g4 e() {
            return R1.f10564a;
        }

        @Override // com.google.android.gms.internal.measurement.InterfaceC0896e4
        public final int a() {
            return this.f10418o;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + e.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f10418o + " name=" + name() + '>';
        }
    }

    public static final class f extends Y3 implements K4 {
        private static final f zzc;
        private static volatile T4 zzd;
        private int zze;
        private String zzf = "";
        private String zzg = "";

        public static final class a extends Y3.b implements K4 {
            public a() {
                super(f.zzc);
            }

            public /* synthetic */ a(H1 h12) {
                this();
            }
        }

        static {
            f fVar = new f();
            zzc = fVar;
            Y3.t(f.class, fVar);
        }

        public final String H() {
            return this.zzf;
        }

        @Override // com.google.android.gms.internal.measurement.Y3
        public final Object p(int i7, Object obj, Object obj2) {
            H1 h12 = null;
            switch (H1.f10398a[i7 - 1]) {
                case 1:
                    return new f();
                case 2:
                    return new a(h12);
                case 3:
                    return Y3.q(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
                case 4:
                    return zzc;
                case 5:
                    T4 t42 = zzd;
                    if (t42 == null) {
                        synchronized (f.class) {
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

    static {
        I1 i12 = new I1();
        zzc = i12;
        Y3.t(I1.class, i12);
    }

    public static I1 H() {
        return zzc;
    }

    public final List I() {
        return this.zzh;
    }

    public final List J() {
        return this.zzf;
    }

    public final List K() {
        return this.zzg;
    }

    public final boolean L() {
        return this.zzi;
    }

    public final boolean M() {
        return (this.zze & 1) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.Y3
    public final Object p(int i7, Object obj, Object obj2) {
        H1 h12 = null;
        switch (H1.f10398a[i7 - 1]) {
            case 1:
                return new I1();
            case 2:
                return new a(h12);
            case 3:
                return Y3.q(zzc, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zze", "zzf", b.class, "zzg", c.class, "zzh", f.class, "zzi", "zzj", b.class});
            case 4:
                return zzc;
            case 5:
                T4 t42 = zzd;
                if (t42 == null) {
                    synchronized (I1.class) {
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
