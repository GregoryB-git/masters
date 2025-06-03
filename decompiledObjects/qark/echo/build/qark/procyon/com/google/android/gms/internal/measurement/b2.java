// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

public final class b2 extends Y3 implements K4
{
    private static final b2 zzc;
    private static volatile T4 zzd;
    private int zze;
    private String zzf;
    private String zzg;
    private U1 zzh;
    
    static {
        Y3.t(b2.class, zzc = new b2());
    }
    
    public b2() {
        this.zzf = "";
        this.zzg = "";
    }
    
    public static /* synthetic */ b2 G() {
        return b2.zzc;
    }
    
    @Override
    public final Object p(final int n, final Object o, final Object o2) {
        Label_0151: {
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
                    final T4 zzd = b2.zzd;
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
                    // monitorenter(b2.class)
                    while (true) {
                        Label_0160: {
                            break Label_0160;
                            try {
                                T4 zzd2;
                                if ((zzd2 = b2.zzd) == null) {
                                    zzd2 = (b2.zzd = new Y3.a(b2.zzc));
                                }
                                // monitorexit(b2.class)
                                return zzd2;
                                return b2.zzc;
                                // monitorexit(b2.class)
                                return Y3.q(b2.zzc, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1009\u0002", new Object[] { "zze", "zzf", "zzg", "zzh" });
                                return new b2();
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
            super(b2.G());
        }
    }
}
