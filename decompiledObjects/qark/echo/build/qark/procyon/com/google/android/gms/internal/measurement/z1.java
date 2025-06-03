// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

public final class z1 extends Y3 implements K4
{
    private static final z1 zzc;
    private static volatile T4 zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private String zzh;
    private String zzi;
    private String zzj;
    
    static {
        Y3.t(z1.class, zzc = new z1());
    }
    
    public z1() {
        this.zzh = "";
        this.zzi = "";
        this.zzj = "";
    }
    
    public static /* synthetic */ z1 H() {
        return z1.zzc;
    }
    
    public static z1 I() {
        return z1.zzc;
    }
    
    public final b G() {
        b b;
        if ((b = z1.b.c(this.zzf)) == null) {
            b = z1.b.p;
        }
        return b;
    }
    
    public final String J() {
        return this.zzh;
    }
    
    public final String K() {
        return this.zzj;
    }
    
    public final String L() {
        return this.zzi;
    }
    
    public final boolean M() {
        return this.zzg;
    }
    
    public final boolean N() {
        return (this.zze & 0x1) != 0x0;
    }
    
    public final boolean O() {
        return (this.zze & 0x4) != 0x0;
    }
    
    public final boolean P() {
        return (this.zze & 0x2) != 0x0;
    }
    
    public final boolean Q() {
        return (this.zze & 0x10) != 0x0;
    }
    
    public final boolean R() {
        return (this.zze & 0x8) != 0x0;
    }
    
    @Override
    public final Object p(final int n, final Object o, final Object o2) {
        Label_0171: {
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
                    final T4 zzd = z1.zzd;
                    if (zzd == null) {
                        break Label_0171;
                    }
                    return zzd;
                }
                case 4: {
                    break Label_0171;
                }
                case 3: {
                    break Label_0171;
                }
                case 2: {
                    break Label_0171;
                }
                case 1: {
                    // monitorenter(z1.class)
                    while (true) {
                        Label_0180: {
                            break Label_0180;
                            try {
                                T4 zzd2;
                                if ((zzd2 = z1.zzd) == null) {
                                    zzd2 = (z1.zzd = new Y3.a(z1.zzc));
                                }
                                // monitorexit(z1.class)
                                return zzd2;
                                // monitorexit(z1.class)
                                return new a((v1)null);
                                return Y3.q(z1.zzc, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u180c\u0000\u0002\u1007\u0001\u0003\u1008\u0002\u0004\u1008\u0003\u0005\u1008\u0004", new Object[] { "zze", "zzf", b.e(), "zzg", "zzh", "zzi", "zzj" });
                                return z1.zzc;
                                return new z1();
                            }
                            finally {}
                        }
                        continue;
                    }
                }
            }
        }
    }
    
    public static final class a extends Y3.b implements K4
    {
        public a() {
            super(z1.H());
        }
    }
    
    public enum b implements e4
    {
        p("UNKNOWN_COMPARISON_TYPE", 0, 0), 
        q("LESS_THAN", 1, 1), 
        r("GREATER_THAN", 2, 2), 
        s("EQUAL", 3, 3), 
        t("BETWEEN", 4, 4);
        
        public static final d4 u;
        public final int o;
        
        static {
            u = new C1();
        }
        
        public b(final String name, final int ordinal, final int o) {
            this.o = o;
        }
        
        public static b c(final int n) {
            if (n == 0) {
                return b.p;
            }
            if (n == 1) {
                return b.q;
            }
            if (n == 2) {
                return b.r;
            }
            if (n == 3) {
                return b.s;
            }
            if (n != 4) {
                return null;
            }
            return b.t;
        }
        
        public static g4 e() {
            return D1.a;
        }
        
        @Override
        public final int a() {
            return this.o;
        }
        
        @Override
        public final String toString() {
            final StringBuilder sb = new StringBuilder("<");
            sb.append(b.class.getName());
            sb.append('@');
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" number=");
            sb.append(this.o);
            sb.append(" name=");
            sb.append(this.name());
            sb.append('>');
            return sb.toString();
        }
    }
}
