// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

public final class M1 extends Y3 implements K4
{
    private static final M1 zzc;
    private static volatile T4 zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    
    static {
        Y3.t(M1.class, zzc = new M1());
    }
    
    public M1() {
        this.zzf = 14;
        this.zzg = 11;
        this.zzh = 60;
    }
    
    public static /* synthetic */ M1 G() {
        return M1.zzc;
    }
    
    @Override
    public final Object p(final int n, final Object o, final Object o2) {
        Label_0151: {
            switch (H1.a[n - 1]) {
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
                    final T4 zzd = M1.zzd;
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
                    // monitorenter(M1.class)
                    while (true) {
                        Label_0160: {
                            break Label_0160;
                            try {
                                T4 zzd2;
                                if ((zzd2 = M1.zzd) == null) {
                                    zzd2 = (M1.zzd = new Y3.a(M1.zzc));
                                }
                                // monitorexit(M1.class)
                                return zzd2;
                                return M1.zzc;
                                return new M1();
                                return new a((H1)null);
                                // monitorexit(M1.class)
                                return Y3.q(M1.zzc, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u1004\u0002", new Object[] { "zze", "zzf", "zzg", "zzh" });
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
            super(M1.G());
        }
    }
}
