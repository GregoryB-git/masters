// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

public final class A1 extends Y3 implements K4
{
    private static final A1 zzc;
    private static volatile T4 zzd;
    private int zze;
    private int zzf;
    private String zzg;
    private y1 zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    
    static {
        Y3.t(A1.class, zzc = new A1());
    }
    
    public A1() {
        this.zzg = "";
    }
    
    private final void H(final String zzg) {
        zzg.getClass();
        this.zze |= 0x2;
        this.zzg = zzg;
    }
    
    public static a J() {
        return (a)A1.zzc.w();
    }
    
    public static /* synthetic */ A1 K() {
        return A1.zzc;
    }
    
    public final y1 I() {
        y1 y1;
        if ((y1 = this.zzh) == null) {
            y1 = com.google.android.gms.internal.measurement.y1.J();
        }
        return y1;
    }
    
    public final String L() {
        return this.zzg;
    }
    
    public final boolean M() {
        return this.zzi;
    }
    
    public final boolean N() {
        return this.zzj;
    }
    
    public final boolean O() {
        return this.zzk;
    }
    
    public final boolean P() {
        return (this.zze & 0x1) != 0x0;
    }
    
    public final boolean Q() {
        return (this.zze & 0x20) != 0x0;
    }
    
    public final int k() {
        return this.zzf;
    }
    
    @Override
    public final Object p(final int n, final Object o, final Object o2) {
        Label_0168: {
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
                    final T4 zzd = A1.zzd;
                    if (zzd == null) {
                        break Label_0168;
                    }
                    return zzd;
                }
                case 4: {
                    break Label_0168;
                }
                case 3: {
                    break Label_0168;
                }
                case 2: {
                    break Label_0168;
                }
                case 1: {
                    // monitorenter(A1.class)
                    while (true) {
                        Label_0177: {
                            break Label_0177;
                            try {
                                T4 zzd2;
                                if ((zzd2 = A1.zzd) == null) {
                                    zzd2 = (A1.zzd = new Y3.a(A1.zzc));
                                }
                                // monitorexit(A1.class)
                                return zzd2;
                                return Y3.q(A1.zzc, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1008\u0001\u0003\u1009\u0002\u0004\u1007\u0003\u0005\u1007\u0004\u0006\u1007\u0005", new Object[] { "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk" });
                                // monitorexit(A1.class)
                                return new A1();
                                return new a((v1)null);
                                return A1.zzc;
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
            super(A1.K());
        }
        
        public final a w(final String s) {
            ((b)this).s();
            ((A1)super.p).H(s);
            return this;
        }
    }
}
