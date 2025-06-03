// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.List;

public final class B1 extends Y3 implements K4
{
    private static final B1 zzc;
    private static volatile T4 zzd;
    private int zze;
    private int zzf;
    private String zzg;
    private boolean zzh;
    private h4 zzi;
    
    static {
        Y3.t(B1.class, zzc = new B1());
    }
    
    public B1() {
        this.zzg = "";
        this.zzi = Y3.B();
    }
    
    public static /* synthetic */ B1 H() {
        return B1.zzc;
    }
    
    public static B1 I() {
        return B1.zzc;
    }
    
    public final a G() {
        a a;
        if ((a = B1.a.c(this.zzf)) == null) {
            a = B1.a.p;
        }
        return a;
    }
    
    public final String J() {
        return this.zzg;
    }
    
    public final List K() {
        return this.zzi;
    }
    
    public final boolean L() {
        return this.zzh;
    }
    
    public final boolean M() {
        return (this.zze & 0x4) != 0x0;
    }
    
    public final boolean N() {
        return (this.zze & 0x2) != 0x0;
    }
    
    public final boolean O() {
        return (this.zze & 0x1) != 0x0;
    }
    
    public final int k() {
        return this.zzi.size();
    }
    
    @Override
    public final Object p(final int n, final Object o, final Object o2) {
        Label_0165: {
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
                    final T4 zzd = B1.zzd;
                    if (zzd == null) {
                        break Label_0165;
                    }
                    return zzd;
                }
                case 4: {
                    break Label_0165;
                }
                case 3: {
                    break Label_0165;
                }
                case 2: {
                    break Label_0165;
                }
                case 1: {
                    // monitorenter(B1.class)
                    while (true) {
                        Label_0174: {
                            break Label_0174;
                            try {
                                T4 zzd2;
                                if ((zzd2 = B1.zzd) == null) {
                                    zzd2 = (B1.zzd = new Y3.a(B1.zzc));
                                }
                                // monitorexit(B1.class)
                                return zzd2;
                                return new b((v1)null);
                                return new B1();
                                return B1.zzc;
                                // monitorexit(B1.class)
                                return Y3.q(B1.zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u180c\u0000\u0002\u1008\u0001\u0003\u1007\u0002\u0004\u001a", new Object[] { "zze", "zzf", a.e(), "zzg", "zzh", "zzi" });
                            }
                            finally {}
                        }
                        continue;
                    }
                }
            }
        }
    }
    
    public enum a implements e4
    {
        p("UNKNOWN_MATCH_TYPE", 0, 0), 
        q("REGEXP", 1, 1), 
        r("BEGINS_WITH", 2, 2), 
        s("ENDS_WITH", 3, 3), 
        t("PARTIAL", 4, 4), 
        u("EXACT", 5, 5), 
        v("IN_LIST", 6, 6);
        
        public static final d4 w;
        public final int o;
        
        static {
            w = new G1();
        }
        
        public a(final String name, final int ordinal, final int o) {
            this.o = o;
        }
        
        public static a c(final int n) {
            switch (n) {
                default: {
                    return null;
                }
                case 6: {
                    return a.v;
                }
                case 5: {
                    return a.u;
                }
                case 4: {
                    return a.t;
                }
                case 3: {
                    return a.s;
                }
                case 2: {
                    return a.r;
                }
                case 1: {
                    return a.q;
                }
                case 0: {
                    return a.p;
                }
            }
        }
        
        public static g4 e() {
            return E1.a;
        }
        
        @Override
        public final int a() {
            return this.o;
        }
        
        @Override
        public final String toString() {
            final StringBuilder sb = new StringBuilder("<");
            sb.append(a.class.getName());
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
    
    public static final class b extends Y3.b implements K4
    {
        public b() {
            super(B1.H());
        }
    }
}
