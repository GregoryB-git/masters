// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.List;

public final class q2 extends Y3 implements K4
{
    private static final q2 zzc;
    private static volatile T4 zzd;
    private int zze;
    private h4 zzf;
    private o2 zzg;
    
    static {
        Y3.t(q2.class, zzc = new q2());
    }
    
    public q2() {
        this.zzf = Y3.B();
    }
    
    public static /* synthetic */ q2 H() {
        return q2.zzc;
    }
    
    public final o2 G() {
        o2 o2;
        if ((o2 = this.zzg) == null) {
            o2 = com.google.android.gms.internal.measurement.o2.H();
        }
        return o2;
    }
    
    public final List I() {
        return this.zzf;
    }
    
    @Override
    public final Object p(final int n, final Object o, final Object o2) {
        Label_0151: {
            switch (n2.a[n - 1]) {
                default: {
                    throw new UnsupportedOperationException();
                }
                case 7: {
                    return null;
                }
                case 6: {
                    return 1;
                }
                case 5: {
                    final T4 zzd = q2.zzd;
                    if (zzd == null) {
                        break Label_0151;
                    }
                    return zzd;
                }
                case 4: {
                    break Label_0151;
                }
                case 3: {
                    break Label_0151;
                }
                case 2: {
                    break Label_0151;
                }
                case 1: {
                    // monitorenter(q2.class)
                    while (true) {
                        Label_0160: {
                            break Label_0160;
                            try {
                                T4 zzd2;
                                if ((zzd2 = q2.zzd) == null) {
                                    zzd2 = (q2.zzd = new Y3.a(q2.zzc));
                                }
                                // monitorexit(q2.class)
                                return zzd2;
                                return Y3.q(q2.zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u1009\u0000", new Object[] { "zze", "zzf", r2.class, "zzg" });
                                return new q2();
                                // monitorexit(q2.class)
                                return q2.zzc;
                                return new a((n2)null);
                            }
                            finally {}
                        }
                        continue;
                    }
                }
            }
        }
    }
    
    public static final class a extends b implements K4
    {
        public a() {
            super(q2.H());
        }
    }
}
