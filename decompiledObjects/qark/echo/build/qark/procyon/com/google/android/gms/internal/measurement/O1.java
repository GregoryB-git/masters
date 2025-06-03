// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

public final class O1 extends Y3 implements K4
{
    private static final O1 zzc;
    private static volatile T4 zzd;
    private int zze;
    private String zzf;
    private String zzg;
    
    static {
        Y3.t(O1.class, zzc = new O1());
    }
    
    public O1() {
        this.zzf = "";
        this.zzg = "";
    }
    
    public static /* synthetic */ O1 G() {
        return O1.zzc;
    }
    
    public final String H() {
        return this.zzf;
    }
    
    public final String I() {
        return this.zzg;
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
                    final T4 zzd = O1.zzd;
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
                    // monitorenter(O1.class)
                    while (true) {
                        Label_0155: {
                            break Label_0155;
                            try {
                                T4 zzd2;
                                if ((zzd2 = O1.zzd) == null) {
                                    zzd2 = (O1.zzd = new Y3.a(O1.zzc));
                                }
                                // monitorexit(O1.class)
                                return zzd2;
                                // monitorexit(O1.class)
                                return new O1();
                                return Y3.q(O1.zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001", new Object[] { "zze", "zzf", "zzg" });
                                return new a((H1)null);
                                return O1.zzc;
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
            super(O1.G());
        }
    }
}
