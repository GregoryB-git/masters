package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.K1;
import com.google.android.gms.internal.measurement.Y3;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class L1 extends Y3 implements K4 {
    private static final L1 zzc;
    private static volatile T4 zzd;
    private int zze;
    private long zzf;
    private int zzh;
    private boolean zzm;
    private I1 zzt;
    private M1 zzu;
    private String zzg = "";
    private InterfaceC0923h4 zzi = Y3.B();
    private InterfaceC0923h4 zzj = Y3.B();
    private InterfaceC0923h4 zzk = Y3.B();
    private String zzl = "";
    private InterfaceC0923h4 zzn = Y3.B();
    private InterfaceC0923h4 zzo = Y3.B();
    private String zzp = "";
    private String zzq = "";
    private String zzr = "";
    private String zzs = "";

    public static final class a extends Y3.b implements K4 {
        public a() {
            super(L1.zzc);
        }

        public final String A() {
            return ((L1) this.f10721p).T();
        }

        public final List B() {
            return Collections.unmodifiableList(((L1) this.f10721p).U());
        }

        public final List C() {
            return Collections.unmodifiableList(((L1) this.f10721p).V());
        }

        public final int w() {
            return ((L1) this.f10721p).K();
        }

        public final K1 x(int i7) {
            return ((L1) this.f10721p).G(i7);
        }

        public final a y(int i7, K1.a aVar) {
            s();
            ((L1) this.f10721p).H(i7, (K1) ((Y3) aVar.p()));
            return this;
        }

        public final a z() {
            s();
            ((L1) this.f10721p).c0();
            return this;
        }

        public /* synthetic */ a(H1 h12) {
            this();
        }
    }

    static {
        L1 l12 = new L1();
        zzc = l12;
        Y3.t(L1.class, l12);
    }

    public static a N() {
        return (a) zzc.w();
    }

    public static L1 P() {
        return zzc;
    }

    public final K1 G(int i7) {
        return (K1) this.zzj.get(i7);
    }

    public final void H(int i7, K1 k12) {
        k12.getClass();
        InterfaceC0923h4 interfaceC0923h4 = this.zzj;
        if (!interfaceC0923h4.c()) {
            this.zzj = Y3.n(interfaceC0923h4);
        }
        this.zzj.set(i7, k12);
    }

    public final int K() {
        return this.zzj.size();
    }

    public final long L() {
        return this.zzf;
    }

    public final I1 M() {
        I1 i12 = this.zzt;
        return i12 == null ? I1.H() : i12;
    }

    public final String Q() {
        return this.zzg;
    }

    public final String R() {
        return this.zzr;
    }

    public final String S() {
        return this.zzq;
    }

    public final String T() {
        return this.zzp;
    }

    public final List U() {
        return this.zzk;
    }

    public final List V() {
        return this.zzo;
    }

    public final List W() {
        return this.zzn;
    }

    public final List X() {
        return this.zzi;
    }

    public final boolean Y() {
        return this.zzm;
    }

    public final boolean Z() {
        return (this.zze & 512) != 0;
    }

    public final boolean a0() {
        return (this.zze & 2) != 0;
    }

    public final boolean b0() {
        return (this.zze & 1) != 0;
    }

    public final void c0() {
        this.zzk = Y3.B();
    }

    public final int k() {
        return this.zzn.size();
    }

    @Override // com.google.android.gms.internal.measurement.Y3
    public final Object p(int i7, Object obj, Object obj2) {
        H1 h12 = null;
        switch (H1.f10398a[i7 - 1]) {
            case 1:
                return new L1();
            case 2:
                return new a(h12);
            case 3:
                return Y3.q(zzc, "\u0001\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\fဈ\u0006\rဈ\u0007\u000eဈ\b\u000fဉ\t\u0010ဉ\n", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", O1.class, "zzj", K1.class, "zzk", C1054w1.class, "zzl", "zzm", "zzn", C1002q2.class, "zzo", J1.class, "zzp", "zzq", "zzr", "zzs", "zzt", "zzu"});
            case 4:
                return zzc;
            case 5:
                T4 t42 = zzd;
                if (t42 == null) {
                    synchronized (L1.class) {
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
