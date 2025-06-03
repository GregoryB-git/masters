package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.Y3;
import com.google.android.gms.internal.measurement.Z1;

/* renamed from: com.google.android.gms.internal.measurement.e2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0894e2 extends Y3 implements K4 {
    private static final C0894e2 zzc;
    private static volatile T4 zzd;
    private int zze;
    private int zzf = 1;
    private InterfaceC0923h4 zzg = Y3.B();

    /* renamed from: com.google.android.gms.internal.measurement.e2$a */
    public enum a implements InterfaceC0896e4 {
        RADS(1),
        PROVISIONING(2);


        /* renamed from: r, reason: collision with root package name */
        public static final InterfaceC0887d4 f10885r = new C0966m2();

        /* renamed from: o, reason: collision with root package name */
        public final int f10887o;

        a(int i7) {
            this.f10887o = i7;
        }

        public static a c(int i7) {
            if (i7 == 1) {
                return RADS;
            }
            if (i7 != 2) {
                return null;
            }
            return PROVISIONING;
        }

        public static InterfaceC0914g4 e() {
            return C0957l2.f11023a;
        }

        @Override // com.google.android.gms.internal.measurement.InterfaceC0896e4
        public final int a() {
            return this.f10887o;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f10887o + " name=" + name() + '>';
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.e2$b */
    public static final class b extends Y3.b implements K4 {
        public b() {
            super(C0894e2.zzc);
        }

        public final b w(Z1.a aVar) {
            s();
            ((C0894e2) this.f10721p).H((Z1) ((Y3) aVar.p()));
            return this;
        }

        public /* synthetic */ b(T1 t12) {
            this();
        }
    }

    static {
        C0894e2 c0894e2 = new C0894e2();
        zzc = c0894e2;
        Y3.t(C0894e2.class, c0894e2);
    }

    public static b G() {
        return (b) zzc.w();
    }

    public final void H(Z1 z12) {
        z12.getClass();
        InterfaceC0923h4 interfaceC0923h4 = this.zzg;
        if (!interfaceC0923h4.c()) {
            this.zzg = Y3.n(interfaceC0923h4);
        }
        this.zzg.add(z12);
    }

    @Override // com.google.android.gms.internal.measurement.Y3
    public final Object p(int i7, Object obj, Object obj2) {
        T1 t12 = null;
        switch (T1.f10593a[i7 - 1]) {
            case 1:
                return new C0894e2();
            case 2:
                return new b(t12);
            case 3:
                return Y3.q(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"zze", "zzf", a.e(), "zzg", Z1.class});
            case 4:
                return zzc;
            case 5:
                T4 t42 = zzd;
                if (t42 == null) {
                    synchronized (C0894e2.class) {
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
