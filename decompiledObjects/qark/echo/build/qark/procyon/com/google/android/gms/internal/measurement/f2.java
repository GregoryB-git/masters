// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.List;

public final class f2 extends Y3 implements K4
{
    private static final f2 zzc;
    private static volatile T4 zzd;
    private i4 zze;
    private i4 zzf;
    private h4 zzg;
    private h4 zzh;
    
    static {
        Y3.t(f2.class, zzc = new f2());
    }
    
    public f2() {
        this.zze = Y3.A();
        this.zzf = Y3.A();
        this.zzg = Y3.B();
        this.zzh = Y3.B();
    }
    
    private final void I(final Iterable iterable) {
        final h4 zzg = this.zzg;
        if (!zzg.c()) {
            this.zzg = Y3.n(zzg);
        }
        j3.e(iterable, this.zzg);
    }
    
    private final void M(final Iterable iterable) {
        final i4 zzf = this.zzf;
        if (!zzf.c()) {
            this.zzf = Y3.o(zzf);
        }
        j3.e(iterable, this.zzf);
    }
    
    private final void Q(final Iterable iterable) {
        final h4 zzh = this.zzh;
        if (!zzh.c()) {
            this.zzh = Y3.n(zzh);
        }
        j3.e(iterable, this.zzh);
    }
    
    private final void U(final Iterable iterable) {
        final i4 zze = this.zze;
        if (!zze.c()) {
            this.zze = Y3.o(zze);
        }
        j3.e(iterable, this.zze);
    }
    
    public static a V() {
        return (a)f2.zzc.w();
    }
    
    public static /* synthetic */ f2 W() {
        return f2.zzc;
    }
    
    public static f2 X() {
        return f2.zzc;
    }
    
    private final void c0() {
        this.zzg = Y3.B();
    }
    
    private final void d0() {
        this.zzf = Y3.A();
    }
    
    private final void f0() {
        this.zze = Y3.A();
    }
    
    public final int J() {
        return this.zzf.size();
    }
    
    public final int N() {
        return this.zzh.size();
    }
    
    public final int R() {
        return this.zze.size();
    }
    
    public final List Y() {
        return this.zzg;
    }
    
    public final List Z() {
        return this.zzf;
    }
    
    public final List a0() {
        return this.zzh;
    }
    
    public final List b0() {
        return this.zze;
    }
    
    public final void e0() {
        this.zzh = Y3.B();
    }
    
    public final int k() {
        return this.zzg.size();
    }
    
    @Override
    public final Object p(final int n, final Object o, final Object o2) {
        Label_0162: {
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
                    final T4 zzd = f2.zzd;
                    if (zzd == null) {
                        break Label_0162;
                    }
                    return zzd;
                }
                case 4: {
                    break Label_0162;
                }
                case 3: {
                    break Label_0162;
                }
                case 2: {
                    break Label_0162;
                }
                case 1: {
                    // monitorenter(f2.class)
                    while (true) {
                        Label_0171: {
                            break Label_0171;
                            try {
                                T4 zzd2;
                                if ((zzd2 = f2.zzd) == null) {
                                    zzd2 = (f2.zzd = new Y3.a(f2.zzc));
                                }
                                // monitorexit(f2.class)
                                return zzd2;
                                return new f2();
                                return f2.zzc;
                                // monitorexit(f2.class)
                                return;
                                return Y3.q(f2.zzc, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[] { "zze", "zzf", "zzg", X1.class, "zzh", g2.class });
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
            super(f2.W());
        }
        
        public final a A() {
            ((b)this).s();
            ((f2)super.p).e0();
            return this;
        }
        
        public final a B(final Iterable iterable) {
            ((b)this).s();
            ((f2)super.p).Q(iterable);
            return this;
        }
        
        public final a C() {
            ((b)this).s();
            ((f2)super.p).f0();
            return this;
        }
        
        public final a D(final Iterable iterable) {
            ((b)this).s();
            ((f2)super.p).U(iterable);
            return this;
        }
        
        public final a w() {
            ((b)this).s();
            ((f2)super.p).c0();
            return this;
        }
        
        public final a x(final Iterable iterable) {
            ((b)this).s();
            ((f2)super.p).I(iterable);
            return this;
        }
        
        public final a y() {
            ((b)this).s();
            ((f2)super.p).d0();
            return this;
        }
        
        public final a z(final Iterable iterable) {
            ((b)this).s();
            ((f2)super.p).M(iterable);
            return this;
        }
    }
}
