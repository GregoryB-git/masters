// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

public final class U1 extends Y3 implements K4
{
    private static final U1 zzc;
    private static volatile T4 zzd;
    private int zze;
    private String zzf;
    private String zzg;
    private String zzh;
    private String zzi;
    private String zzj;
    private String zzk;
    private String zzl;
    
    static {
        Y3.t(U1.class, zzc = new U1());
    }
    
    public U1() {
        this.zzf = "";
        this.zzg = "";
        this.zzh = "";
        this.zzi = "";
        this.zzj = "";
        this.zzk = "";
        this.zzl = "";
    }
    
    public static /* synthetic */ U1 G() {
        return U1.zzc;
    }
    
    @Override
    public final Object p(final int n, final Object o, final Object o2) {
        Label_0174: {
            switch (T1.a[n - 1]) {
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
                    final T4 zzd = U1.zzd;
                    if (zzd == null) {
                        break Label_0174;
                    }
                    return zzd;
                }
                case 4: {
                    break Label_0174;
                }
                case 3: {
                    break Label_0174;
                }
                case 2: {
                    break Label_0174;
                }
                case 1: {
                    // monitorenter(U1.class)
                    while (true) {
                        Label_0183: {
                            break Label_0183;
                            try {
                                T4 zzd2;
                                if ((zzd2 = U1.zzd) == null) {
                                    zzd2 = (U1.zzd = new Y3.a(U1.zzc));
                                }
                                // monitorexit(U1.class)
                                return zzd2;
                                return new U1();
                                // monitorexit(U1.class)
                                return Y3.q(U1.zzc, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1008\u0003\u0005\u1008\u0004\u0006\u1008\u0005\u0007\u1008\u0006", new Object[] { "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl" });
                                return U1.zzc;
                                return new a((T1)null);
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
            super(U1.G());
        }
    }
}
