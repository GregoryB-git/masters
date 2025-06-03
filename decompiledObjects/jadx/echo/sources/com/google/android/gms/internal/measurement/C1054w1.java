package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.A1;
import com.google.android.gms.internal.measurement.C1063x1;
import com.google.android.gms.internal.measurement.Y3;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.w1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1054w1 extends Y3 implements K4 {
    private static final C1054w1 zzc;
    private static volatile T4 zzd;
    private int zze;
    private int zzf;
    private InterfaceC0923h4 zzg = Y3.B();
    private InterfaceC0923h4 zzh = Y3.B();
    private boolean zzi;
    private boolean zzj;

    /* renamed from: com.google.android.gms.internal.measurement.w1$a */
    public static final class a extends Y3.b implements K4 {
        public a() {
            super(C1054w1.zzc);
        }

        public final int A() {
            return ((C1054w1) this.f10721p).N();
        }

        public final A1 B(int i7) {
            return ((C1054w1) this.f10721p).M(i7);
        }

        public final int w() {
            return ((C1054w1) this.f10721p).L();
        }

        public final a x(int i7, C1063x1.a aVar) {
            s();
            ((C1054w1) this.f10721p).H(i7, (C1063x1) ((Y3) aVar.p()));
            return this;
        }

        public final a y(int i7, A1.a aVar) {
            s();
            ((C1054w1) this.f10721p).I(i7, (A1) ((Y3) aVar.p()));
            return this;
        }

        public final C1063x1 z(int i7) {
            return ((C1054w1) this.f10721p).G(i7);
        }

        public /* synthetic */ a(AbstractC1045v1 abstractC1045v1) {
            this();
        }
    }

    static {
        C1054w1 c1054w1 = new C1054w1();
        zzc = c1054w1;
        Y3.t(C1054w1.class, c1054w1);
    }

    public final C1063x1 G(int i7) {
        return (C1063x1) this.zzh.get(i7);
    }

    public final void H(int i7, C1063x1 c1063x1) {
        c1063x1.getClass();
        InterfaceC0923h4 interfaceC0923h4 = this.zzh;
        if (!interfaceC0923h4.c()) {
            this.zzh = Y3.n(interfaceC0923h4);
        }
        this.zzh.set(i7, c1063x1);
    }

    public final void I(int i7, A1 a12) {
        a12.getClass();
        InterfaceC0923h4 interfaceC0923h4 = this.zzg;
        if (!interfaceC0923h4.c()) {
            this.zzg = Y3.n(interfaceC0923h4);
        }
        this.zzg.set(i7, a12);
    }

    public final int L() {
        return this.zzh.size();
    }

    public final A1 M(int i7) {
        return (A1) this.zzg.get(i7);
    }

    public final int N() {
        return this.zzg.size();
    }

    public final List P() {
        return this.zzh;
    }

    public final List Q() {
        return this.zzg;
    }

    public final boolean R() {
        return (this.zze & 1) != 0;
    }

    public final int k() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.Y3
    public final Object p(int i7, Object obj, Object obj2) {
        AbstractC1045v1 abstractC1045v1 = null;
        switch (AbstractC1045v1.f11193a[i7 - 1]) {
            case 1:
                return new C1054w1();
            case 2:
                return new a(abstractC1045v1);
            case 3:
                return Y3.q(zzc, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zze", "zzf", "zzg", A1.class, "zzh", C1063x1.class, "zzi", "zzj"});
            case 4:
                return zzc;
            case 5:
                T4 t42 = zzd;
                if (t42 == null) {
                    synchronized (C1054w1.class) {
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
