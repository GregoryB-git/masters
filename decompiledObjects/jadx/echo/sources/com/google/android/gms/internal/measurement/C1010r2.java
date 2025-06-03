package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.Y3;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.r2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1010r2 extends Y3 implements K4 {
    private static final C1010r2 zzc;
    private static volatile T4 zzd;
    private int zze;
    private int zzf;
    private InterfaceC0923h4 zzg = Y3.B();
    private String zzh = "";
    private String zzi = "";
    private boolean zzj;
    private double zzk;

    /* renamed from: com.google.android.gms.internal.measurement.r2$a */
    public static final class a extends Y3.b implements K4 {
        public a() {
            super(C1010r2.zzc);
        }

        public /* synthetic */ a(AbstractC0975n2 abstractC0975n2) {
            this();
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.r2$b */
    public enum b implements InterfaceC0896e4 {
        UNKNOWN(0),
        STRING(1),
        NUMBER(2),
        BOOLEAN(3),
        STATEMENT(4);


        /* renamed from: u, reason: collision with root package name */
        public static final InterfaceC0887d4 f11127u = new C1019s2();

        /* renamed from: o, reason: collision with root package name */
        public final int f11129o;

        b(int i7) {
            this.f11129o = i7;
        }

        public static b c(int i7) {
            if (i7 == 0) {
                return UNKNOWN;
            }
            if (i7 == 1) {
                return STRING;
            }
            if (i7 == 2) {
                return NUMBER;
            }
            if (i7 == 3) {
                return BOOLEAN;
            }
            if (i7 != 4) {
                return null;
            }
            return STATEMENT;
        }

        public static InterfaceC0914g4 e() {
            return C1037u2.f11180a;
        }

        @Override // com.google.android.gms.internal.measurement.InterfaceC0896e4
        public final int a() {
            return this.f11129o;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f11129o + " name=" + name() + '>';
        }
    }

    static {
        C1010r2 c1010r2 = new C1010r2();
        zzc = c1010r2;
        Y3.t(C1010r2.class, c1010r2);
    }

    public final double G() {
        return this.zzk;
    }

    public final b H() {
        b c7 = b.c(this.zzf);
        return c7 == null ? b.UNKNOWN : c7;
    }

    public final String J() {
        return this.zzh;
    }

    public final String K() {
        return this.zzi;
    }

    public final List L() {
        return this.zzg;
    }

    public final boolean M() {
        return this.zzj;
    }

    public final boolean N() {
        return (this.zze & 8) != 0;
    }

    public final boolean O() {
        return (this.zze & 16) != 0;
    }

    public final boolean P() {
        return (this.zze & 4) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.Y3
    public final Object p(int i7, Object obj, Object obj2) {
        AbstractC0975n2 abstractC0975n2 = null;
        switch (AbstractC0975n2.f11059a[i7 - 1]) {
            case 1:
                return new C1010r2();
            case 2:
                return new a(abstractC0975n2);
            case 3:
                return Y3.q(zzc, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zze", "zzf", b.e(), "zzg", C1010r2.class, "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzc;
            case 5:
                T4 t42 = zzd;
                if (t42 == null) {
                    synchronized (C1010r2.class) {
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
