package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C0885d2;
import com.google.android.gms.internal.measurement.Y3;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.c2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0876c2 extends Y3 implements K4 {
    private static final C0876c2 zzc;
    private static volatile T4 zzd;
    private int zze;
    private InterfaceC0923h4 zzf = Y3.B();
    private String zzg = "";

    /* renamed from: com.google.android.gms.internal.measurement.c2$a */
    public static final class a extends Y3.b implements K4 {
        public a() {
            super(C0876c2.zzc);
        }

        public final int w() {
            return ((C0876c2) this.f10721p).k();
        }

        public final a x(C0885d2.a aVar) {
            s();
            ((C0876c2) this.f10721p).I((C0885d2) ((Y3) aVar.p()));
            return this;
        }

        public final C0885d2 y(int i7) {
            return ((C0876c2) this.f10721p).G(0);
        }

        public /* synthetic */ a(T1 t12) {
            this();
        }
    }

    static {
        C0876c2 c0876c2 = new C0876c2();
        zzc = c0876c2;
        Y3.t(C0876c2.class, c0876c2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(C0885d2 c0885d2) {
        c0885d2.getClass();
        InterfaceC0923h4 interfaceC0923h4 = this.zzf;
        if (!interfaceC0923h4.c()) {
            this.zzf = Y3.n(interfaceC0923h4);
        }
        this.zzf.add(c0885d2);
    }

    public static a J() {
        return (a) zzc.w();
    }

    public final C0885d2 G(int i7) {
        return (C0885d2) this.zzf.get(0);
    }

    public final List L() {
        return this.zzf;
    }

    public final int k() {
        return this.zzf.size();
    }

    @Override // com.google.android.gms.internal.measurement.Y3
    public final Object p(int i7, Object obj, Object obj2) {
        T1 t12 = null;
        switch (T1.f10593a[i7 - 1]) {
            case 1:
                return new C0876c2();
            case 2:
                return new a(t12);
            case 3:
                return Y3.q(zzc, "\u0001\u0002\u0000\u0001\u0001\u0007\u0002\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000", new Object[]{"zze", "zzf", C0885d2.class, "zzg"});
            case 4:
                return zzc;
            case 5:
                T4 t42 = zzd;
                if (t42 == null) {
                    synchronized (C0876c2.class) {
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
