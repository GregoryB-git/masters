// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.List;

public final class w1 extends Y3 implements K4
{
    private static final w1 zzc;
    private static volatile T4 zzd;
    private int zze;
    private int zzf;
    private h4 zzg;
    private h4 zzh;
    private boolean zzi;
    private boolean zzj;
    
    static {
        Y3.t(w1.class, zzc = new w1());
    }
    
    public w1() {
        this.zzg = Y3.B();
        this.zzh = Y3.B();
    }
    
    public static /* synthetic */ w1 O() {
        return w1.zzc;
    }
    
    public final x1 G(final int n) {
        return this.zzh.get(n);
    }
    
    public final void H(final int n, final x1 x1) {
        x1.getClass();
        final h4 zzh = this.zzh;
        if (!zzh.c()) {
            this.zzh = Y3.n(zzh);
        }
        this.zzh.set(n, x1);
    }
    
    public final void I(final int n, final A1 a1) {
        a1.getClass();
        final h4 zzg = this.zzg;
        if (!zzg.c()) {
            this.zzg = Y3.n(zzg);
        }
        this.zzg.set(n, a1);
    }
    
    public final int L() {
        return this.zzh.size();
    }
    
    public final A1 M(final int n) {
        return this.zzg.get(n);
    }
    
    public final int N() {
        return this.zzg.size();
    }
    
    public final List P() {
        return this.zzh;
    }
    
    public final List Q() {
        return this.zzg;
    }
    
    public final boolean R() {
        return (this.zze & 0x1) != 0x0;
    }
    
    public final int k() {
        return this.zzf;
    }
    
    @Override
    public final Object p(final int n, final Object o, final Object o2) {
        Label_0174: {
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
                    final T4 zzd = w1.zzd;
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
                    // monitorenter(w1.class)
                    while (true) {
                        Label_0183: {
                            break Label_0183;
                            try {
                                T4 zzd2;
                                if ((zzd2 = w1.zzd) == null) {
                                    zzd2 = (w1.zzd = new Y3.a(w1.zzc));
                                }
                                // monitorexit(w1.class)
                                return zzd2;
                                // monitorexit(w1.class)
                                return new w1();
                                return new a((v1)null);
                                return w1.zzc;
                                return Y3.q(w1.zzc, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001\u1004\u0000\u0002\u001b\u0003\u001b\u0004\u1007\u0001\u0005\u1007\u0002", new Object[] { "zze", "zzf", "zzg", A1.class, "zzh", x1.class, "zzi", "zzj" });
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
            super(w1.O());
        }
        
        public final int A() {
            return ((w1)super.p).N();
        }
        
        public final A1 B(final int n) {
            return ((w1)super.p).M(n);
        }
        
        public final int w() {
            return ((w1)super.p).L();
        }
        
        public final a x(final int n, final x1.a a) {
            ((b)this).s();
            ((w1)super.p).H(n, (x1)((b)a).p());
            return this;
        }
        
        public final a y(final int n, final A1.a a) {
            ((b)this).s();
            ((w1)super.p).I(n, (A1)((b)a).p());
            return this;
        }
        
        public final x1 z(final int n) {
            return ((w1)super.p).G(n);
        }
    }
}
