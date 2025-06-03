// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

public final class Z1 extends Y3 implements K4
{
    private static final Z1 zzc;
    private static volatile T4 zzd;
    private int zze;
    private String zzf;
    private long zzg;
    
    static {
        Y3.t(Z1.class, zzc = new Z1());
    }
    
    public Z1() {
        this.zzf = "";
    }
    
    public static a G() {
        return (a)Z1.zzc.w();
    }
    
    private final void H(final long zzg) {
        this.zze |= 0x2;
        this.zzg = zzg;
    }
    
    private final void K(final String zzf) {
        zzf.getClass();
        this.zze |= 0x1;
        this.zzf = zzf;
    }
    
    public static /* synthetic */ Z1 L() {
        return Z1.zzc;
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
                    final T4 zzd = Z1.zzd;
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
                    // monitorenter(Z1.class)
                    while (true) {
                        Label_0155: {
                            break Label_0155;
                            try {
                                T4 zzd2;
                                if ((zzd2 = Z1.zzd) == null) {
                                    zzd2 = (Z1.zzd = new Y3.a(Z1.zzc));
                                }
                                // monitorexit(Z1.class)
                                return zzd2;
                                return Z1.zzc;
                                return Y3.q(Z1.zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1002\u0001", new Object[] { "zze", "zzf", "zzg" });
                                return new a((T1)null);
                                return new Z1();
                            }
                            // monitorexit(Z1.class)
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
            super(Z1.L());
        }
        
        public final a w(final long n) {
            ((b)this).s();
            ((Z1)super.p).H(n);
            return this;
        }
        
        public final a x(final String s) {
            ((b)this).s();
            ((Z1)super.p).K(s);
            return this;
        }
    }
}
