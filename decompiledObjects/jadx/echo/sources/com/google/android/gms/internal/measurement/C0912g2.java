package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.Y3;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.g2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0912g2 extends Y3 implements K4 {
    private static final C0912g2 zzc;
    private static volatile T4 zzd;
    private int zze;
    private int zzf;
    private InterfaceC0932i4 zzg = Y3.A();

    /* renamed from: com.google.android.gms.internal.measurement.g2$a */
    public static final class a extends Y3.b implements K4 {
        public a() {
            super(C0912g2.zzc);
        }

        public final a w(int i7) {
            s();
            ((C0912g2) this.f10721p).L(i7);
            return this;
        }

        public final a x(Iterable iterable) {
            s();
            ((C0912g2) this.f10721p).J(iterable);
            return this;
        }

        public /* synthetic */ a(T1 t12) {
            this();
        }
    }

    static {
        C0912g2 c0912g2 = new C0912g2();
        zzc = c0912g2;
        Y3.t(C0912g2.class, c0912g2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(Iterable iterable) {
        InterfaceC0932i4 interfaceC0932i4 = this.zzg;
        if (!interfaceC0932i4.c()) {
            this.zzg = Y3.o(interfaceC0932i4);
        }
        AbstractC0940j3.e(iterable, this.zzg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L(int i7) {
        this.zze |= 1;
        this.zzf = i7;
    }

    public static a M() {
        return (a) zzc.w();
    }

    public final long G(int i7) {
        return this.zzg.l(i7);
    }

    public final int K() {
        return this.zzf;
    }

    public final List O() {
        return this.zzg;
    }

    public final boolean P() {
        return (this.zze & 1) != 0;
    }

    public final int k() {
        return this.zzg.size();
    }

    @Override // com.google.android.gms.internal.measurement.Y3
    public final Object p(int i7, Object obj, Object obj2) {
        T1 t12 = null;
        switch (T1.f10593a[i7 - 1]) {
            case 1:
                return new C0912g2();
            case 2:
                return new a(t12);
            case 3:
                return Y3.q(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                T4 t42 = zzd;
                if (t42 == null) {
                    synchronized (C0912g2.class) {
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
