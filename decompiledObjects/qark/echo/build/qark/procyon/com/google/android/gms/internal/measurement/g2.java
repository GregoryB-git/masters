// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.List;

public final class g2 extends Y3 implements K4
{
    private static final g2 zzc;
    private static volatile T4 zzd;
    private int zze;
    private int zzf;
    private i4 zzg;
    
    static {
        Y3.t(g2.class, zzc = new g2());
    }
    
    public g2() {
        this.zzg = Y3.A();
    }
    
    private final void J(final Iterable iterable) {
        final i4 zzg = this.zzg;
        if (!zzg.c()) {
            this.zzg = Y3.o(zzg);
        }
        j3.e(iterable, this.zzg);
    }
    
    private final void L(final int zzf) {
        this.zze |= 0x1;
        this.zzf = zzf;
    }
    
    public static a M() {
        return (a)g2.zzc.w();
    }
    
    public static /* synthetic */ g2 N() {
        return g2.zzc;
    }
    
    public final long G(final int n) {
        return this.zzg.l(n);
    }
    
    public final int K() {
        return this.zzf;
    }
    
    public final List O() {
        return this.zzg;
    }
    
    public final boolean P() {
        return (this.zze & 0x1) != 0x0;
    }
    
    public final int k() {
        return this.zzg.size();
    }
    
    @Override
    public final Object p(final int n, final Object o, final Object o2) {
        Label_0146: {
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
                    final T4 zzd = g2.zzd;
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
                    // monitorenter(g2.class)
                    while (true) {
                        Label_0155: {
                            break Label_0155;
                            try {
                                T4 zzd2;
                                if ((zzd2 = g2.zzd) == null) {
                                    zzd2 = (g2.zzd = new Y3.a(g2.zzc));
                                }
                                // monitorexit(g2.class)
                                return zzd2;
                                return Y3.q(g2.zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u1004\u0000\u0002\u0014", new Object[] { "zze", "zzf", "zzg" });
                                return g2.zzc;
                                return new a((T1)null);
                                return new g2();
                                // monitorexit(g2.class)
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
            super(g2.N());
        }
        
        public final a w(final int n) {
            ((b)this).s();
            ((g2)super.p).L(n);
            return this;
        }
        
        public final a x(final Iterable iterable) {
            ((b)this).s();
            ((g2)super.p).J(iterable);
            return this;
        }
    }
}
