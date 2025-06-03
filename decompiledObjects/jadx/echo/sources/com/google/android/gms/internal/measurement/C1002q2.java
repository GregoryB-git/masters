package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.Y3;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.q2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1002q2 extends Y3 implements K4 {
    private static final C1002q2 zzc;
    private static volatile T4 zzd;
    private int zze;
    private InterfaceC0923h4 zzf = Y3.B();
    private C0984o2 zzg;

    /* renamed from: com.google.android.gms.internal.measurement.q2$a */
    public static final class a extends Y3.b implements K4 {
        public a() {
            super(C1002q2.zzc);
        }

        public /* synthetic */ a(AbstractC0975n2 abstractC0975n2) {
            this();
        }
    }

    static {
        C1002q2 c1002q2 = new C1002q2();
        zzc = c1002q2;
        Y3.t(C1002q2.class, c1002q2);
    }

    public final C0984o2 G() {
        C0984o2 c0984o2 = this.zzg;
        return c0984o2 == null ? C0984o2.H() : c0984o2;
    }

    public final List I() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.Y3
    public final Object p(int i7, Object obj, Object obj2) {
        AbstractC0975n2 abstractC0975n2 = null;
        switch (AbstractC0975n2.f11059a[i7 - 1]) {
            case 1:
                return new C1002q2();
            case 2:
                return new a(abstractC0975n2);
            case 3:
                return Y3.q(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zze", "zzf", C1010r2.class, "zzg"});
            case 4:
                return zzc;
            case 5:
                T4 t42 = zzd;
                if (t42 == null) {
                    synchronized (C1002q2.class) {
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
