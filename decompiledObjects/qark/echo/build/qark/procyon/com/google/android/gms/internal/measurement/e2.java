// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

public final class e2 extends Y3 implements K4
{
    private static final e2 zzc;
    private static volatile T4 zzd;
    private int zze;
    private int zzf;
    private h4 zzg;
    
    static {
        Y3.t(e2.class, zzc = new e2());
    }
    
    public e2() {
        this.zzf = 1;
        this.zzg = Y3.B();
    }
    
    public static b G() {
        return (b)e2.zzc.w();
    }
    
    public static /* synthetic */ e2 J() {
        return e2.zzc;
    }
    
    public final void H(final Z1 z1) {
        z1.getClass();
        final h4 zzg = this.zzg;
        if (!zzg.c()) {
            this.zzg = Y3.n(zzg);
        }
        this.zzg.add(z1);
    }
    
    @Override
    public final Object p(final int n, final Object o, final Object o2) {
        Label_0159: {
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
                    final T4 zzd = e2.zzd;
                    if (zzd == null) {
                        break Label_0159;
                    }
                    return zzd;
                }
                case 4: {
                    break Label_0159;
                }
                case 3: {
                    break Label_0159;
                }
                case 2: {
                    break Label_0159;
                }
                case 1: {
                    // monitorenter(e2.class)
                    while (true) {
                        Label_0168: {
                            break Label_0168;
                            try {
                                T4 zzd2;
                                if ((zzd2 = e2.zzd) == null) {
                                    zzd2 = (e2.zzd = new Y3.a(e2.zzc));
                                }
                                // monitorexit(e2.class)
                                return zzd2;
                                return new e2();
                                return new b((T1)null);
                                return e2.zzc;
                                return Y3.q(e2.zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u180c\u0000\u0002\u001b", new Object[] { "zze", "zzf", a.e(), "zzg", Z1.class });
                            }
                            // monitorexit(e2.class)
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
        p("RADS", 0, 1), 
        q("PROVISIONING", 1, 2);
        
        public static final d4 r;
        public final int o;
        
        static {
            r = new m2();
        }
        
        public a(final String name, final int ordinal, final int o) {
            this.o = o;
        }
        
        public static a c(final int n) {
            if (n == 1) {
                return a.p;
            }
            if (n != 2) {
                return null;
            }
            return a.q;
        }
        
        public static g4 e() {
            return l2.a;
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
            super(e2.J());
        }
        
        public final b w(final Z1.a a) {
            ((Y3.b)this).s();
            ((e2)super.p).H((Z1)((Y3.b)a).p());
            return this;
        }
    }
}
