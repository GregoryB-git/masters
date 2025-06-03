// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

public final class y1 extends Y3 implements K4
{
    private static final y1 zzc;
    private static volatile T4 zzd;
    private int zze;
    private B1 zzf;
    private z1 zzg;
    private boolean zzh;
    private String zzi;
    
    static {
        Y3.t(y1.class, zzc = new y1());
    }
    
    public y1() {
        this.zzi = "";
    }
    
    public static /* synthetic */ y1 G() {
        return y1.zzc;
    }
    
    private final void I(final String zzi) {
        zzi.getClass();
        this.zze |= 0x8;
        this.zzi = zzi;
    }
    
    public static y1 J() {
        return y1.zzc;
    }
    
    public final z1 K() {
        z1 z1;
        if ((z1 = this.zzg) == null) {
            z1 = com.google.android.gms.internal.measurement.z1.I();
        }
        return z1;
    }
    
    public final B1 L() {
        B1 b1;
        if ((b1 = this.zzf) == null) {
            b1 = B1.I();
        }
        return b1;
    }
    
    public final String M() {
        return this.zzi;
    }
    
    public final boolean N() {
        return this.zzh;
    }
    
    public final boolean O() {
        return (this.zze & 0x4) != 0x0;
    }
    
    public final boolean P() {
        return (this.zze & 0x2) != 0x0;
    }
    
    public final boolean Q() {
        return (this.zze & 0x8) != 0x0;
    }
    
    public final boolean R() {
        return (this.zze & 0x1) != 0x0;
    }
    
    @Override
    public final Object p(final int n, final Object o, final Object o2) {
        Label_0156: {
            switch (v1.a[n - 1]) {
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
                    final T4 zzd = y1.zzd;
                    if (zzd == null) {
                        break Label_0156;
                    }
                    return zzd;
                }
                case 4: {
                    break Label_0156;
                }
                case 3: {
                    break Label_0156;
                }
                case 2: {
                    break Label_0156;
                }
                case 1: {
                    // monitorenter(y1.class)
                    while (true) {
                        Label_0165: {
                            break Label_0165;
                            try {
                                T4 zzd2;
                                if ((zzd2 = y1.zzd) == null) {
                                    zzd2 = (y1.zzd = new Y3.a(y1.zzc));
                                }
                                // monitorexit(y1.class)
                                return zzd2;
                                return y1.zzc;
                                return new y1();
                                return Y3.q(y1.zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0003\u1007\u0002\u0004\u1008\u0003", new Object[] { "zze", "zzf", "zzg", "zzh", "zzi" });
                                return new a((v1)null);
                            }
                            // monitorexit(y1.class)
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
            super(y1.G());
        }
        
        public final a w(final String s) {
            ((b)this).s();
            ((y1)super.p).I(s);
            return this;
        }
    }
}
