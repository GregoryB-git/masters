// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.List;

public final class r2 extends Y3 implements K4
{
    private static final r2 zzc;
    private static volatile T4 zzd;
    private int zze;
    private int zzf;
    private h4 zzg;
    private String zzh;
    private String zzi;
    private boolean zzj;
    private double zzk;
    
    static {
        Y3.t(r2.class, zzc = new r2());
    }
    
    public r2() {
        this.zzg = Y3.B();
        this.zzh = "";
        this.zzi = "";
    }
    
    public static /* synthetic */ r2 I() {
        return r2.zzc;
    }
    
    public final double G() {
        return this.zzk;
    }
    
    public final b H() {
        b b;
        if ((b = r2.b.c(this.zzf)) == null) {
            b = r2.b.p;
        }
        return b;
    }
    
    public final String J() {
        return this.zzh;
    }
    
    public final String K() {
        return this.zzi;
    }
    
    public final List L() {
        return this.zzg;
    }
    
    public final boolean M() {
        return this.zzj;
    }
    
    public final boolean N() {
        return (this.zze & 0x8) != 0x0;
    }
    
    public final boolean O() {
        return (this.zze & 0x10) != 0x0;
    }
    
    public final boolean P() {
        return (this.zze & 0x4) != 0x0;
    }
    
    @Override
    public final Object p(final int n, final Object o, final Object o2) {
        Label_0183: {
            switch (n2.a[n - 1]) {
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
                    final T4 zzd = r2.zzd;
                    if (zzd == null) {
                        break Label_0183;
                    }
                    return zzd;
                }
                case 4: {
                    break Label_0183;
                }
                case 3: {
                    break Label_0183;
                }
                case 2: {
                    break Label_0183;
                }
                case 1: {
                    // monitorenter(r2.class)
                    while (true) {
                        Label_0192: {
                            break Label_0192;
                            try {
                                T4 zzd2;
                                if ((zzd2 = r2.zzd) == null) {
                                    zzd2 = (r2.zzd = new Y3.a(r2.zzc));
                                }
                                // monitorexit(r2.class)
                                return zzd2;
                                return Y3.q(r2.zzc, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u180c\u0000\u0002\u001b\u0003\u1008\u0001\u0004\u1008\u0002\u0005\u1007\u0003\u0006\u1000\u0004", new Object[] { "zze", "zzf", b.e(), "zzg", r2.class, "zzh", "zzi", "zzj", "zzk" });
                                return new r2();
                                // monitorexit(r2.class)
                                return r2.zzc;
                                return new a((n2)null);
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
            super(r2.I());
        }
    }
    
    public enum b implements e4
    {
        p("UNKNOWN", 0, 0), 
        q("STRING", 1, 1), 
        r("NUMBER", 2, 2), 
        s("BOOLEAN", 3, 3), 
        t("STATEMENT", 4, 4);
        
        public static final d4 u;
        public final int o;
        
        static {
            u = new s2();
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
            return u2.a;
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
