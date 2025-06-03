package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C0903f2;
import com.google.android.gms.internal.measurement.Y3;

/* loaded from: classes.dex */
public final class W1 extends Y3 implements K4 {
    private static final W1 zzc;
    private static volatile T4 zzd;
    private int zze;
    private int zzf;
    private C0903f2 zzg;
    private C0903f2 zzh;
    private boolean zzi;

    public static final class a extends Y3.b implements K4 {
        public a() {
            super(W1.zzc);
        }

        public final a w(int i7) {
            s();
            ((W1) this.f10721p).G(i7);
            return this;
        }

        public final a x(C0903f2.a aVar) {
            s();
            ((W1) this.f10721p).K((C0903f2) ((Y3) aVar.p()));
            return this;
        }

        public final a y(C0903f2 c0903f2) {
            s();
            ((W1) this.f10721p).O(c0903f2);
            return this;
        }

        public final a z(boolean z7) {
            s();
            ((W1) this.f10721p).L(z7);
            return this;
        }

        public /* synthetic */ a(T1 t12) {
            this();
        }
    }

    static {
        W1 w12 = new W1();
        zzc = w12;
        Y3.t(W1.class, w12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(C0903f2 c0903f2) {
        c0903f2.getClass();
        this.zzg = c0903f2;
        this.zze |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L(boolean z7) {
        this.zze |= 8;
        this.zzi = z7;
    }

    public static a M() {
        return (a) zzc.w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O(C0903f2 c0903f2) {
        c0903f2.getClass();
        this.zzh = c0903f2;
        this.zze |= 4;
    }

    public final void G(int i7) {
        this.zze |= 1;
        this.zzf = i7;
    }

    public final C0903f2 Q() {
        C0903f2 c0903f2 = this.zzg;
        return c0903f2 == null ? C0903f2.X() : c0903f2;
    }

    public final C0903f2 R() {
        C0903f2 c0903f2 = this.zzh;
        return c0903f2 == null ? C0903f2.X() : c0903f2;
    }

    public final boolean S() {
        return this.zzi;
    }

    public final boolean T() {
        return (this.zze & 1) != 0;
    }

    public final boolean U() {
        return (this.zze & 8) != 0;
    }

    public final boolean V() {
        return (this.zze & 4) != 0;
    }

    public final int k() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.Y3
    public final Object p(int i7, Object obj, Object obj2) {
        T1 t12 = null;
        switch (T1.f10593a[i7 - 1]) {
            case 1:
                return new W1();
            case 2:
                return new a(t12);
            case 3:
                return Y3.q(zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                T4 t42 = zzd;
                if (t42 == null) {
                    synchronized (W1.class) {
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
