// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

public final class Y1 extends Y3 implements K4
{
    private static final Y1 zzc;
    private static volatile T4 zzd;
    private int zze;
    private h4 zzf;
    private String zzg;
    private long zzh;
    private long zzi;
    private int zzj;
    
    static {
        Y3.t(Y1.class, zzc = new Y1());
    }
    
    public Y1() {
        this.zzf = Y3.B();
        this.zzg = "";
    }
    
    private final void I(final long zzi) {
        this.zze |= 0x4;
        this.zzi = zzi;
    }
    
    private final void Q(final a2 a2) {
        a2.getClass();
        this.h0();
        this.zzf.add(a2);
    }
    
    private final void S(final String zzg) {
        zzg.getClass();
        this.zze |= 0x1;
        this.zzg = zzg;
    }
    
    public static a Z() {
        return (a)Y1.zzc.w();
    }
    
    public static /* synthetic */ Y1 a0() {
        return Y1.zzc;
    }
    
    public final a2 G(final int n) {
        return this.zzf.get(n);
    }
    
    public final void H(final int n, final a2 a2) {
        a2.getClass();
        this.h0();
        this.zzf.set(n, a2);
    }
    
    public final void R(final Iterable iterable) {
        this.h0();
        j3.e(iterable, this.zzf);
    }
    
    public final int T() {
        return this.zzf.size();
    }
    
    public final void U(final int n) {
        this.h0();
        this.zzf.remove(n);
    }
    
    public final void V(final long zzh) {
        this.zze |= 0x2;
        this.zzh = zzh;
    }
    
    public final long X() {
        return this.zzi;
    }
    
    public final long Y() {
        return this.zzh;
    }
    
    public final String b0() {
        return this.zzg;
    }
    
    public final List c0() {
        return this.zzf;
    }
    
    public final boolean d0() {
        return (this.zze & 0x8) != 0x0;
    }
    
    public final boolean e0() {
        return (this.zze & 0x4) != 0x0;
    }
    
    public final boolean f0() {
        return (this.zze & 0x2) != 0x0;
    }
    
    public final void g0() {
        this.zzf = Y3.B();
    }
    
    public final void h0() {
        final h4 zzf = this.zzf;
        if (!zzf.c()) {
            this.zzf = Y3.n(zzf);
        }
    }
    
    public final int k() {
        return this.zzj;
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
                    final T4 zzd = Y1.zzd;
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
                    // monitorenter(Y1.class)
                    while (true) {
                        Label_0177: {
                            break Label_0177;
                            try {
                                T4 zzd2;
                                if ((zzd2 = Y1.zzd) == null) {
                                    zzd2 = (Y1.zzd = new Y3.a(Y1.zzc));
                                }
                                // monitorexit(Y1.class)
                                return zzd2;
                                return new Y1();
                                return new a((T1)null);
                                return Y1.zzc;
                                return Y3.q(Y1.zzc, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002\u1008\u0000\u0003\u1002\u0001\u0004\u1002\u0002\u0005\u1004\u0003", new Object[] { "zze", "zzf", a2.class, "zzg", "zzh", "zzi", "zzj" });
                                // monitorexit(Y1.class)
                                return;
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
            super(Y1.a0());
        }
        
        public final a A(final long n) {
            ((b)this).s();
            ((Y1)super.p).I(n);
            return this;
        }
        
        public final a B(final a2.a a) {
            ((b)this).s();
            ((Y1)super.p).Q((a2)((b)a).p());
            return this;
        }
        
        public final a C(final a2 a2) {
            ((b)this).s();
            ((Y1)super.p).Q(a2);
            return this;
        }
        
        public final a D(final Iterable iterable) {
            ((b)this).s();
            ((Y1)super.p).R(iterable);
            return this;
        }
        
        public final a E(final String s) {
            ((b)this).s();
            ((Y1)super.p).S(s);
            return this;
        }
        
        public final long F() {
            return ((Y1)super.p).X();
        }
        
        public final a G(final long n) {
            ((b)this).s();
            ((Y1)super.p).V(n);
            return this;
        }
        
        public final a2 H(final int n) {
            return ((Y1)super.p).G(n);
        }
        
        public final long I() {
            return ((Y1)super.p).Y();
        }
        
        public final a J() {
            ((b)this).s();
            ((Y1)super.p).g0();
            return this;
        }
        
        public final String K() {
            return ((Y1)super.p).b0();
        }
        
        public final List L() {
            return Collections.unmodifiableList((List<?>)((Y1)super.p).c0());
        }
        
        public final boolean M() {
            return ((Y1)super.p).f0();
        }
        
        public final int w() {
            return ((Y1)super.p).T();
        }
        
        public final a x(final int n) {
            ((b)this).s();
            ((Y1)super.p).U(n);
            return this;
        }
        
        public final a y(final int n, final a2.a a) {
            ((b)this).s();
            ((Y1)super.p).H(n, (a2)((b)a).p());
            return this;
        }
        
        public final a z(final int n, final a2 a2) {
            ((b)this).s();
            ((Y1)super.p).H(n, a2);
            return this;
        }
    }
}
