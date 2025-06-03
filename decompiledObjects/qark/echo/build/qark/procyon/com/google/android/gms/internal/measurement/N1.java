// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

public final class N1 extends Y3 implements K4
{
    private static final N1 zzc;
    private static volatile T4 zzd;
    private int zze;
    private String zzf;
    private String zzg;
    
    static {
        Y3.t(N1.class, zzc = new N1());
    }
    
    public N1() {
        this.zzf = "";
        this.zzg = "";
    }
    
    public static /* synthetic */ N1 G() {
        return N1.zzc;
    }
    
    @Override
    public final Object p(final int n, final Object o, final Object o2) {
        Label_0146: {
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
                    final T4 zzd = N1.zzd;
                    if (zzd == null) {
                        break Label_0146;
                    }
                    return zzd;
                }
                case 4: {
                    break Label_0146;
                }
                case 3: {
                    break Label_0146;
                }
                case 2: {
                    break Label_0146;
                }
                case 1: {
                    // monitorenter(N1.class)
                    while (true) {
                        Label_0155: {
                            break Label_0155;
                            try {
                                T4 zzd2;
                                if ((zzd2 = N1.zzd) == null) {
                                    zzd2 = (N1.zzd = new Y3.a(N1.zzc));
                                }
                                // monitorexit(N1.class)
                                return zzd2;
                                return new a((H1)null);
                                // monitorexit(N1.class)
                                return N1.zzc;
                                return Y3.q(N1.zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001", new Object[] { "zze", "zzf", "zzg" });
                                return new N1();
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
            super(N1.G());
        }
    }
}
