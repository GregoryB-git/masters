// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

public final class K1 extends Y3 implements K4
{
    private static final K1 zzc;
    private static volatile T4 zzd;
    private int zze;
    private String zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;
    
    static {
        Y3.t(K1.class, zzc = new K1());
    }
    
    public K1() {
        this.zzf = "";
    }
    
    private final void H(final String zzf) {
        zzf.getClass();
        this.zze |= 0x1;
        this.zzf = zzf;
    }
    
    public static /* synthetic */ K1 I() {
        return K1.zzc;
    }
    
    public final String J() {
        return this.zzf;
    }
    
    public final boolean K() {
        return this.zzg;
    }
    
    public final boolean L() {
        return this.zzh;
    }
    
    public final boolean M() {
        return (this.zze & 0x2) != 0x0;
    }
    
    public final boolean N() {
        return (this.zze & 0x4) != 0x0;
    }
    
    public final boolean O() {
        return (this.zze & 0x8) != 0x0;
    }
    
    public final int k() {
        return this.zzi;
    }
    
    @Override
    public final Object p(final int n, final Object o, final Object o2) {
        Label_0156: {
            switch (H1.a[n - 1]) {
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
                    final T4 zzd = K1.zzd;
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
                    // monitorenter(K1.class)
                    while (true) {
                        Label_0165: {
                            break Label_0165;
                            try {
                                T4 zzd2;
                                if ((zzd2 = K1.zzd) == null) {
                                    zzd2 = (K1.zzd = new Y3.a(K1.zzc));
                                }
                                // monitorexit(K1.class)
                                return zzd2;
                                // monitorexit(K1.class)
                                return;
                                return K1.zzc;
                                return Y3.q(K1.zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1007\u0001\u0003\u1007\u0002\u0004\u1004\u0003", new Object[] { "zze", "zzf", "zzg", "zzh", "zzi" });
                                return new K1();
                                return new a((H1)null);
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
            super(K1.I());
        }
        
        public final boolean A() {
            return ((K1)super.p).L();
        }
        
        public final boolean B() {
            return ((K1)super.p).M();
        }
        
        public final boolean C() {
            return ((K1)super.p).N();
        }
        
        public final boolean D() {
            return ((K1)super.p).O();
        }
        
        public final int w() {
            return ((K1)super.p).k();
        }
        
        public final a x(final String s) {
            ((b)this).s();
            ((K1)super.p).H(s);
            return this;
        }
        
        public final String y() {
            return ((K1)super.p).J();
        }
        
        public final boolean z() {
            return ((K1)super.p).K();
        }
    }
}
