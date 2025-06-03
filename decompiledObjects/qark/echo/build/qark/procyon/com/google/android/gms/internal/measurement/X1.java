// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

public final class X1 extends Y3 implements K4
{
    private static final X1 zzc;
    private static volatile T4 zzd;
    private int zze;
    private int zzf;
    private long zzg;
    
    static {
        Y3.t(X1.class, zzc = new X1());
    }
    
    private final void G(final int zzf) {
        this.zze |= 0x1;
        this.zzf = zzf;
    }
    
    public static a L() {
        return (a)X1.zzc.w();
    }
    
    public static /* synthetic */ X1 M() {
        return X1.zzc;
    }
    
    public final void H(final long zzg) {
        this.zze |= 0x2;
        this.zzg = zzg;
    }
    
    public final long K() {
        return this.zzg;
    }
    
    public final boolean N() {
        return (this.zze & 0x2) != 0x0;
    }
    
    public final boolean O() {
        return (this.zze & 0x1) != 0x0;
    }
    
    public final int k() {
        return this.zzf;
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
                    final T4 zzd = X1.zzd;
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
                    // monitorenter(X1.class)
                    while (true) {
                        Label_0155: {
                            break Label_0155;
                            try {
                                T4 zzd2;
                                if ((zzd2 = X1.zzd) == null) {
                                    zzd2 = (X1.zzd = new Y3.a(X1.zzc));
                                }
                                // monitorexit(X1.class)
                                return zzd2;
                                return Y3.q(X1.zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1002\u0001", new Object[] { "zze", "zzf", "zzg" });
                                // monitorexit(X1.class)
                                return;
                                return X1.zzc;
                                return new X1();
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
            super(X1.M());
        }
        
        public final a w(final int n) {
            ((b)this).s();
            ((X1)super.p).G(n);
            return this;
        }
        
        public final a x(final long n) {
            ((b)this).s();
            ((X1)super.p).H(n);
            return this;
        }
    }
}
