package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.Y3;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.p2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0993p2 extends Y3 implements K4 {
    private static final C0993p2 zzc;
    private static volatile T4 zzd;
    private int zze;
    private String zzf = "";
    private InterfaceC0923h4 zzg = Y3.B();

    /* renamed from: com.google.android.gms.internal.measurement.p2$a */
    public static final class a extends Y3.b implements K4 {
        public a() {
            super(C0993p2.zzc);
        }

        public /* synthetic */ a(AbstractC0975n2 abstractC0975n2) {
            this();
        }
    }

    static {
        C0993p2 c0993p2 = new C0993p2();
        zzc = c0993p2;
        Y3.t(C0993p2.class, c0993p2);
    }

    public final String H() {
        return this.zzf;
    }

    public final List I() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.measurement.Y3
    public final Object p(int i7, Object obj, Object obj2) {
        AbstractC0975n2 abstractC0975n2 = null;
        switch (AbstractC0975n2.f11059a[i7 - 1]) {
            case 1:
                return new C0993p2();
            case 2:
                return new a(abstractC0975n2);
            case 3:
                return Y3.q(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zze", "zzf", "zzg", C1010r2.class});
            case 4:
                return zzc;
            case 5:
                T4 t42 = zzd;
                if (t42 == null) {
                    synchronized (C0993p2.class) {
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
