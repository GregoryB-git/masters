// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.List;

public final class a2 extends Y3 implements K4
{
    private static final a2 zzc;
    private static volatile T4 zzd;
    private int zze;
    private String zzf;
    private String zzg;
    private long zzh;
    private float zzi;
    private double zzj;
    private h4 zzk;
    
    static {
        Y3.t(a2.class, zzc = new a2());
    }
    
    public a2() {
        this.zzf = "";
        this.zzg = "";
        this.zzk = Y3.B();
    }
    
    private final void I(final long zzh) {
        this.zze |= 0x4;
        this.zzh = zzh;
    }
    
    private final void P(final Iterable iterable) {
        this.o0();
        j3.e(iterable, this.zzk);
    }
    
    private final void Q(final String zzf) {
        zzf.getClass();
        this.zze |= 0x1;
        this.zzf = zzf;
    }
    
    public static a Z() {
        return (a)a2.zzc.w();
    }
    
    public static /* synthetic */ a2 b0() {
        return a2.zzc;
    }
    
    public final double G() {
        return this.zzj;
    }
    
    public final void H(final double zzj) {
        this.zze |= 0x10;
        this.zzj = zzj;
    }
    
    public final float R() {
        return this.zzi;
    }
    
    public final void U(final String zzg) {
        zzg.getClass();
        this.zze |= 0x2;
        this.zzg = zzg;
    }
    
    public final int V() {
        return this.zzk.size();
    }
    
    public final long X() {
        return this.zzh;
    }
    
    public final void a0(final a2 a2) {
        a2.getClass();
        this.o0();
        this.zzk.add(a2);
    }
    
    public final String c0() {
        return this.zzf;
    }
    
    public final String d0() {
        return this.zzg;
    }
    
    public final List e0() {
        return this.zzk;
    }
    
    public final boolean f0() {
        return (this.zze & 0x10) != 0x0;
    }
    
    public final boolean g0() {
        return (this.zze & 0x8) != 0x0;
    }
    
    public final boolean h0() {
        return (this.zze & 0x4) != 0x0;
    }
    
    public final boolean i0() {
        return (this.zze & 0x1) != 0x0;
    }
    
    public final boolean j0() {
        return (this.zze & 0x2) != 0x0;
    }
    
    public final void k0() {
        this.zze &= 0xFFFFFFEF;
        this.zzj = 0.0;
    }
    
    public final void l0() {
        this.zze &= 0xFFFFFFFB;
        this.zzh = 0L;
    }
    
    public final void m0() {
        this.zzk = Y3.B();
    }
    
    public final void n0() {
        this.zze &= 0xFFFFFFFD;
        this.zzg = a2.zzc.zzg;
    }
    
    public final void o0() {
        final h4 zzk = this.zzk;
        if (!zzk.c()) {
            this.zzk = Y3.n(zzk);
        }
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
                    final T4 zzd = a2.zzd;
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
                    // monitorenter(a2.class)
                    while (true) {
                        Label_0183: {
                            break Label_0183;
                            try {
                                T4 zzd2;
                                if ((zzd2 = a2.zzd) == null) {
                                    zzd2 = (a2.zzd = new Y3.a(a2.zzc));
                                }
                                // monitorexit(a2.class)
                                return zzd2;
                                return new a((T1)null);
                                return new a2();
                                return a2.zzc;
                                // monitorexit(a2.class)
                                return;
                                return Y3.q(a2.zzc, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1002\u0002\u0004\u1001\u0003\u0005\u1000\u0004\u0006\u001b", new Object[] { "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", a2.class });
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
            super(a2.b0());
        }
        
        public final a A(final Iterable iterable) {
            ((b)this).s();
            ((a2)super.p).P(iterable);
            return this;
        }
        
        public final a B(final String s) {
            ((b)this).s();
            ((a2)super.p).Q(s);
            return this;
        }
        
        public final a C() {
            ((b)this).s();
            ((a2)super.p).k0();
            return this;
        }
        
        public final a D(final String s) {
            ((b)this).s();
            ((a2)super.p).U(s);
            return this;
        }
        
        public final a E() {
            ((b)this).s();
            ((a2)super.p).l0();
            return this;
        }
        
        public final a F() {
            ((b)this).s();
            ((a2)super.p).m0();
            return this;
        }
        
        public final a G() {
            ((b)this).s();
            ((a2)super.p).n0();
            return this;
        }
        
        public final int w() {
            return ((a2)super.p).V();
        }
        
        public final a x(final double n) {
            ((b)this).s();
            ((a2)super.p).H(n);
            return this;
        }
        
        public final a y(final long n) {
            ((b)this).s();
            ((a2)super.p).I(n);
            return this;
        }
        
        public final a z(final a a) {
            ((b)this).s();
            ((a2)super.p).a0((a2)((b)a).p());
            return this;
        }
    }
}
