// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.List;

public final class c2 extends Y3 implements K4
{
    private static final c2 zzc;
    private static volatile T4 zzd;
    private int zze;
    private h4 zzf;
    private String zzg;
    
    static {
        Y3.t(c2.class, zzc = new c2());
    }
    
    public c2() {
        this.zzf = Y3.B();
        this.zzg = "";
    }
    
    private final void I(final d2 d2) {
        d2.getClass();
        final h4 zzf = this.zzf;
        if (!zzf.c()) {
            this.zzf = Y3.n(zzf);
        }
        this.zzf.add(d2);
    }
    
    public static a J() {
        return (a)c2.zzc.w();
    }
    
    public static /* synthetic */ c2 K() {
        return c2.zzc;
    }
    
    public final d2 G(final int n) {
        return this.zzf.get(0);
    }
    
    public final List L() {
        return this.zzf;
    }
    
    public final int k() {
        return this.zzf.size();
    }
    
    @Override
    public final Object p(final int n, final Object o, final Object o2) {
        Label_0151: {
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
                    final T4 zzd = c2.zzd;
                    if (zzd == null) {
                        break Label_0151;
                    }
                    return zzd;
                }
                case 4: {
                    break Label_0151;
                }
                case 3: {
                    break Label_0151;
                }
                case 2: {
                    break Label_0151;
                }
                case 1: {
                    // monitorenter(c2.class)
                    while (true) {
                        Label_0160: {
                            break Label_0160;
                            try {
                                T4 zzd2;
                                if ((zzd2 = c2.zzd) == null) {
                                    zzd2 = (c2.zzd = new Y3.a(c2.zzc));
                                }
                                // monitorexit(c2.class)
                                return zzd2;
                                return Y3.q(c2.zzc, "\u0001\u0002\u0000\u0001\u0001\u0007\u0002\u0000\u0001\u0000\u0001\u001b\u0007\u1008\u0000", new Object[] { "zze", "zzf", d2.class, "zzg" });
                                // monitorexit(c2.class)
                                return new c2();
                                return c2.zzc;
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
            super(c2.K());
        }
        
        public final int w() {
            return ((c2)super.p).k();
        }
        
        public final a x(final d2.a a) {
            ((b)this).s();
            ((c2)super.p).I((d2)((b)a).p());
            return this;
        }
        
        public final d2 y(final int n) {
            return ((c2)super.p).G(0);
        }
    }
}
