// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.List;

public final class x1 extends Y3 implements K4
{
    private static final x1 zzc;
    private static volatile T4 zzd;
    private int zze;
    private int zzf;
    private String zzg;
    private h4 zzh;
    private boolean zzi;
    private z1 zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    
    static {
        Y3.t(x1.class, zzc = new x1());
    }
    
    public x1() {
        this.zzg = "";
        this.zzh = Y3.B();
    }
    
    public static a M() {
        return (a)x1.zzc.w();
    }
    
    public static /* synthetic */ x1 N() {
        return x1.zzc;
    }
    
    public final y1 G(final int n) {
        return this.zzh.get(n);
    }
    
    public final void H(final int n, final y1 y1) {
        y1.getClass();
        final h4 zzh = this.zzh;
        if (!zzh.c()) {
            this.zzh = Y3.n(zzh);
        }
        this.zzh.set(n, y1);
    }
    
    public final void K(final String zzg) {
        zzg.getClass();
        this.zze |= 0x2;
        this.zzg = zzg;
    }
    
    public final int L() {
        return this.zzf;
    }
    
    public final z1 O() {
        z1 z1;
        if ((z1 = this.zzj) == null) {
            z1 = com.google.android.gms.internal.measurement.z1.I();
        }
        return z1;
    }
    
    public final String P() {
        return this.zzg;
    }
    
    public final List Q() {
        return this.zzh;
    }
    
    public final boolean R() {
        return this.zzk;
    }
    
    public final boolean S() {
        return this.zzl;
    }
    
    public final boolean T() {
        return this.zzm;
    }
    
    public final boolean U() {
        return (this.zze & 0x8) != 0x0;
    }
    
    public final boolean V() {
        return (this.zze & 0x1) != 0x0;
    }
    
    public final boolean W() {
        return (this.zze & 0x40) != 0x0;
    }
    
    public final int k() {
        return this.zzh.size();
    }
    
    @Override
    public final Object p(final int n, final Object o, final Object o2) {
        Label_0186: {
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
                    final T4 zzd = x1.zzd;
                    if (zzd == null) {
                        break Label_0186;
                    }
                    return zzd;
                }
                case 4: {
                    break Label_0186;
                }
                case 3: {
                    break Label_0186;
                }
                case 2: {
                    break Label_0186;
                }
                case 1: {
                    // monitorenter(x1.class)
                    while (true) {
                        Label_0195: {
                            break Label_0195;
                            try {
                                T4 zzd2;
                                if ((zzd2 = x1.zzd) == null) {
                                    zzd2 = (x1.zzd = new Y3.a(x1.zzc));
                                }
                                // monitorexit(x1.class)
                                return zzd2;
                                return new x1();
                                // monitorexit(x1.class)
                                return Y3.q(x1.zzc, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u1004\u0000\u0002\u1008\u0001\u0003\u001b\u0004\u1007\u0002\u0005\u1009\u0003\u0006\u1007\u0004\u0007\u1007\u0005\b\u1007\u0006", new Object[] { "zze", "zzf", "zzg", "zzh", y1.class, "zzi", "zzj", "zzk", "zzl", "zzm" });
                                return new a((v1)null);
                                return x1.zzc;
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
            super(x1.N());
        }
        
        public final String A() {
            return ((x1)super.p).P();
        }
        
        public final int w() {
            return ((x1)super.p).k();
        }
        
        public final a x(final int n, final y1 y1) {
            ((b)this).s();
            ((x1)super.p).H(n, y1);
            return this;
        }
        
        public final a y(final String s) {
            ((b)this).s();
            ((x1)super.p).K(s);
            return this;
        }
        
        public final y1 z(final int n) {
            return ((x1)super.p).G(n);
        }
    }
}
