// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

public final class W1 extends Y3 implements K4
{
    private static final W1 zzc;
    private static volatile T4 zzd;
    private int zze;
    private int zzf;
    private f2 zzg;
    private f2 zzh;
    private boolean zzi;
    
    static {
        Y3.t(W1.class, zzc = new W1());
    }
    
    private final void K(final f2 zzg) {
        zzg.getClass();
        this.zzg = zzg;
        this.zze |= 0x2;
    }
    
    private final void L(final boolean zzi) {
        this.zze |= 0x8;
        this.zzi = zzi;
    }
    
    public static a M() {
        return (a)W1.zzc.w();
    }
    
    private final void O(final f2 zzh) {
        zzh.getClass();
        this.zzh = zzh;
        this.zze |= 0x4;
    }
    
    public static /* synthetic */ W1 P() {
        return W1.zzc;
    }
    
    public final void G(final int zzf) {
        this.zze |= 0x1;
        this.zzf = zzf;
    }
    
    public final f2 Q() {
        f2 f2;
        if ((f2 = this.zzg) == null) {
            f2 = com.google.android.gms.internal.measurement.f2.X();
        }
        return f2;
    }
    
    public final f2 R() {
        f2 f2;
        if ((f2 = this.zzh) == null) {
            f2 = com.google.android.gms.internal.measurement.f2.X();
        }
        return f2;
    }
    
    public final boolean S() {
        return this.zzi;
    }
    
    public final boolean T() {
        return (this.zze & 0x1) != 0x0;
    }
    
    public final boolean U() {
        return (this.zze & 0x8) != 0x0;
    }
    
    public final boolean V() {
        return (this.zze & 0x4) != 0x0;
    }
    
    public final int k() {
        return this.zzf;
    }
    
    @Override
    public final Object p(final int n, final Object o, final Object o2) {
        Label_0156: {
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
                    final T4 zzd = W1.zzd;
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
                    // monitorenter(W1.class)
                    while (true) {
                        Label_0165: {
                            break Label_0165;
                            try {
                                T4 zzd2;
                                if ((zzd2 = W1.zzd) == null) {
                                    zzd2 = (W1.zzd = new Y3.a(W1.zzc));
                                }
                                // monitorexit(W1.class)
                                return zzd2;
                                return W1.zzc;
                                // monitorexit(W1.class)
                                return new a((T1)null);
                                return new W1();
                                return Y3.q(W1.zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1009\u0001\u0003\u1009\u0002\u0004\u1007\u0003", new Object[] { "zze", "zzf", "zzg", "zzh", "zzi" });
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
            super(W1.P());
        }
        
        public final a w(final int n) {
            ((b)this).s();
            ((W1)super.p).G(n);
            return this;
        }
        
        public final a x(final f2.a a) {
            ((b)this).s();
            ((W1)super.p).K((f2)((b)a).p());
            return this;
        }
        
        public final a y(final f2 f2) {
            ((b)this).s();
            ((W1)super.p).O(f2);
            return this;
        }
        
        public final a z(final boolean b) {
            ((b)this).s();
            ((W1)super.p).L(b);
            return this;
        }
    }
}
