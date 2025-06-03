// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.List;

public final class p2 extends Y3 implements K4
{
    private static final p2 zzc;
    private static volatile T4 zzd;
    private int zze;
    private String zzf;
    private h4 zzg;
    
    static {
        Y3.t(p2.class, zzc = new p2());
    }
    
    public p2() {
        this.zzf = "";
        this.zzg = Y3.B();
    }
    
    public static /* synthetic */ p2 G() {
        return p2.zzc;
    }
    
    public final String H() {
        return this.zzf;
    }
    
    public final List I() {
        return this.zzg;
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
                    final T4 zzd = p2.zzd;
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
                    // monitorenter(p2.class)
                    while (true) {
                        Label_0160: {
                            break Label_0160;
                            try {
                                T4 zzd2;
                                if ((zzd2 = p2.zzd) == null) {
                                    zzd2 = (p2.zzd = new Y3.a(p2.zzc));
                                }
                                // monitorexit(p2.class)
                                return zzd2;
                                return new p2();
                                return Y3.q(p2.zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u001b", new Object[] { "zze", "zzf", "zzg", r2.class });
                                // monitorexit(p2.class)
                                return p2.zzc;
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
            super(p2.G());
        }
    }
}
