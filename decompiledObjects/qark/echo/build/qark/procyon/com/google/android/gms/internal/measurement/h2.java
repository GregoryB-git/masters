// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

public final class h2 extends Y3 implements K4
{
    private static final h2 zzc;
    private static volatile T4 zzd;
    private int zze;
    private long zzf;
    private String zzg;
    private String zzh;
    private long zzi;
    private float zzj;
    private double zzk;
    
    static {
        Y3.t(h2.class, zzc = new h2());
    }
    
    public h2() {
        this.zzg = "";
        this.zzh = "";
    }
    
    private final void H(final double zzk) {
        this.zze |= 0x20;
        this.zzk = zzk;
    }
    
    private final void I(final long zzi) {
        this.zze |= 0x8;
        this.zzi = zzi;
    }
    
    private final void N(final String zzg) {
        zzg.getClass();
        this.zze |= 0x2;
        this.zzg = zzg;
    }
    
    private final void P(final long zzf) {
        this.zze |= 0x1;
        this.zzf = zzf;
    }
    
    private final void T(final String zzh) {
        zzh.getClass();
        this.zze |= 0x4;
        this.zzh = zzh;
    }
    
    public static a X() {
        return (a)h2.zzc.w();
    }
    
    public static /* synthetic */ h2 Y() {
        return h2.zzc;
    }
    
    private final void g0() {
        this.zze &= 0xFFFFFFDF;
        this.zzk = 0.0;
    }
    
    private final void h0() {
        this.zze &= 0xFFFFFFF7;
        this.zzi = 0L;
    }
    
    private final void i0() {
        this.zze &= 0xFFFFFFFB;
        this.zzh = h2.zzc.zzh;
    }
    
    public final double G() {
        return this.zzk;
    }
    
    public final float O() {
        return this.zzj;
    }
    
    public final long U() {
        return this.zzi;
    }
    
    public final long W() {
        return this.zzf;
    }
    
    public final String Z() {
        return this.zzg;
    }
    
    public final String a0() {
        return this.zzh;
    }
    
    public final boolean b0() {
        return (this.zze & 0x20) != 0x0;
    }
    
    public final boolean c0() {
        return (this.zze & 0x10) != 0x0;
    }
    
    public final boolean d0() {
        return (this.zze & 0x8) != 0x0;
    }
    
    public final boolean e0() {
        return (this.zze & 0x1) != 0x0;
    }
    
    public final boolean f0() {
        return (this.zze & 0x4) != 0x0;
    }
    
    @Override
    public final Object p(final int n, final Object o, final Object o2) {
        Label_0168: {
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
                    final T4 zzd = h2.zzd;
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
                    // monitorenter(h2.class)
                    while (true) {
                        Label_0177: {
                            break Label_0177;
                            try {
                                T4 zzd2;
                                if ((zzd2 = h2.zzd) == null) {
                                    zzd2 = (h2.zzd = new Y3.a(h2.zzc));
                                }
                                // monitorexit(h2.class)
                                return zzd2;
                                return h2.zzc;
                                return Y3.q(h2.zzc, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1002\u0003\u0005\u1001\u0004\u0006\u1000\u0005", new Object[] { "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk" });
                                return new a((T1)null);
                                return new h2();
                            }
                            // monitorexit(h2.class)
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
            super(h2.Y());
        }
        
        public final a A() {
            ((b)this).s();
            ((h2)super.p).h0();
            return this;
        }
        
        public final a B(final long n) {
            ((b)this).s();
            ((h2)super.p).P(n);
            return this;
        }
        
        public final a C(final String s) {
            ((b)this).s();
            ((h2)super.p).T(s);
            return this;
        }
        
        public final a D() {
            ((b)this).s();
            ((h2)super.p).i0();
            return this;
        }
        
        public final a w() {
            ((b)this).s();
            ((h2)super.p).g0();
            return this;
        }
        
        public final a x(final double n) {
            ((b)this).s();
            ((h2)super.p).H(n);
            return this;
        }
        
        public final a y(final long n) {
            ((b)this).s();
            ((h2)super.p).I(n);
            return this;
        }
        
        public final a z(final String s) {
            ((b)this).s();
            ((h2)super.p).N(s);
            return this;
        }
    }
}
