// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.List;

public final class I1 extends Y3 implements K4
{
    private static final I1 zzc;
    private static volatile T4 zzd;
    private int zze;
    private h4 zzf;
    private h4 zzg;
    private h4 zzh;
    private boolean zzi;
    private h4 zzj;
    
    static {
        Y3.t(I1.class, zzc = new I1());
    }
    
    public I1() {
        this.zzf = Y3.B();
        this.zzg = Y3.B();
        this.zzh = Y3.B();
        this.zzj = Y3.B();
    }
    
    public static /* synthetic */ I1 G() {
        return I1.zzc;
    }
    
    public static I1 H() {
        return I1.zzc;
    }
    
    public final List I() {
        return this.zzh;
    }
    
    public final List J() {
        return this.zzf;
    }
    
    public final List K() {
        return this.zzg;
    }
    
    public final boolean L() {
        return this.zzi;
    }
    
    public final boolean M() {
        return (this.zze & 0x1) != 0x0;
    }
    
    @Override
    public final Object p(final int n, final Object o, final Object o2) {
        Label_0186: {
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
                    final T4 zzd = I1.zzd;
                    if (zzd == null) {
                        break Label_0186;
                    }
                    return zzd;
                }
                case 4: {
                    break Label_0186;
                }
                case 3: {
                    break Label_0186;
                }
                case 2: {
                    break Label_0186;
                }
                case 1: {
                    // monitorenter(I1.class)
                    while (true) {
                        Label_0195: {
                            break Label_0195;
                            try {
                                T4 zzd2;
                                if ((zzd2 = I1.zzd) == null) {
                                    zzd2 = (I1.zzd = new Y3.a(I1.zzc));
                                }
                                // monitorexit(I1.class)
                                return zzd2;
                                // monitorexit(I1.class)
                                return I1.zzc;
                                return new a((H1)null);
                                return new I1();
                                return Y3.q(I1.zzc, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004\u1007\u0000\u0005\u001b", new Object[] { "zze", "zzf", b.class, "zzg", c.class, "zzh", f.class, "zzi", "zzj", b.class });
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
            super(I1.G());
        }
    }
    
    public static final class b extends Y3 implements K4
    {
        private static final b zzc;
        private static volatile T4 zzd;
        private int zze;
        private int zzf;
        private int zzg;
        
        static {
            Y3.t(b.class, zzc = new b());
        }
        
        public static /* synthetic */ b G() {
            return b.zzc;
        }
        
        public final I1.d H() {
            I1.d d;
            if ((d = I1.d.c(this.zzg)) == null) {
                d = I1.d.p;
            }
            return d;
        }
        
        public final e I() {
            e e;
            if ((e = I1.e.c(this.zzf)) == null) {
                e = I1.e.p;
            }
            return e;
        }
        
        @Override
        public final Object p(final int n, final Object o, final Object o2) {
            Label_0162: {
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
                        final T4 zzd = b.zzd;
                        if (zzd == null) {
                            break Label_0162;
                        }
                        return zzd;
                    }
                    case 4: {
                        break Label_0162;
                    }
                    case 3: {
                        break Label_0162;
                    }
                    case 2: {
                        break Label_0162;
                    }
                    case 1: {
                        // monitorenter(b.class)
                        while (true) {
                            Label_0171: {
                                break Label_0171;
                                try {
                                    T4 zzd2;
                                    if ((zzd2 = b.zzd) == null) {
                                        zzd2 = (b.zzd = new Y3.a(b.zzc));
                                    }
                                    // monitorexit(b.class)
                                    return zzd2;
                                    return new b();
                                    return Y3.q(b.zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u180c\u0000\u0002\u180c\u0001", new Object[] { "zze", "zzf", e.e(), "zzg", I1.d.e() });
                                    // monitorexit(b.class)
                                    return b.zzc;
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
        
        public static final class a extends Y3.b implements K4
        {
            public a() {
                super(I1.b.G());
            }
        }
    }
    
    public static final class c extends Y3 implements K4
    {
        private static final c zzc;
        private static volatile T4 zzd;
        private int zze;
        private int zzf;
        private int zzg;
        
        static {
            Y3.t(c.class, zzc = new c());
        }
        
        public static /* synthetic */ c G() {
            return c.zzc;
        }
        
        public final e H() {
            e e;
            if ((e = I1.e.c(this.zzg)) == null) {
                e = I1.e.p;
            }
            return e;
        }
        
        public final e I() {
            e e;
            if ((e = I1.e.c(this.zzf)) == null) {
                e = I1.e.p;
            }
            return e;
        }
        
        @Override
        public final Object p(final int n, final Object o, final Object o2) {
            Label_0162: {
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
                        final T4 zzd = c.zzd;
                        if (zzd == null) {
                            break Label_0162;
                        }
                        return zzd;
                    }
                    case 4: {
                        break Label_0162;
                    }
                    case 3: {
                        break Label_0162;
                    }
                    case 2: {
                        break Label_0162;
                    }
                    case 1: {
                        // monitorenter(c.class)
                        while (true) {
                            Label_0171: {
                                break Label_0171;
                                try {
                                    T4 zzd2;
                                    if ((zzd2 = c.zzd) == null) {
                                        zzd2 = (c.zzd = new Y3.a(c.zzc));
                                    }
                                    // monitorexit(c.class)
                                    return zzd2;
                                    return c.zzc;
                                    return new a((H1)null);
                                    return Y3.q(c.zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u180c\u0000\u0002\u180c\u0001", new Object[] { "zze", "zzf", e.e(), "zzg", e.e() });
                                    // monitorexit(c.class)
                                    return;
                                    return new c();
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
                super(I1.c.G());
            }
        }
    }
    
    public enum d implements e4
    {
        p("CONSENT_STATUS_UNSPECIFIED", 0, 0), 
        q("GRANTED", 1, 1), 
        r("DENIED", 2, 2);
        
        public static final d4 s;
        public final int o;
        
        static {
            s = new P1();
        }
        
        public d(final String name, final int ordinal, final int o) {
            this.o = o;
        }
        
        public static d c(final int n) {
            if (n == 0) {
                return d.p;
            }
            if (n == 1) {
                return d.q;
            }
            if (n != 2) {
                return null;
            }
            return d.r;
        }
        
        public static g4 e() {
            return Q1.a;
        }
        
        @Override
        public final int a() {
            return this.o;
        }
        
        @Override
        public final String toString() {
            final StringBuilder sb = new StringBuilder("<");
            sb.append(d.class.getName());
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
    
    public enum e implements e4
    {
        p("CONSENT_TYPE_UNSPECIFIED", 0, 0), 
        q("AD_STORAGE", 1, 1), 
        r("ANALYTICS_STORAGE", 2, 2), 
        s("AD_USER_DATA", 3, 3), 
        t("AD_PERSONALIZATION", 4, 4);
        
        public static final d4 u;
        public final int o;
        
        static {
            u = new S1();
        }
        
        public e(final String name, final int ordinal, final int o) {
            this.o = o;
        }
        
        public static e c(final int n) {
            if (n == 0) {
                return e.p;
            }
            if (n == 1) {
                return e.q;
            }
            if (n == 2) {
                return e.r;
            }
            if (n == 3) {
                return e.s;
            }
            if (n != 4) {
                return null;
            }
            return e.t;
        }
        
        public static g4 e() {
            return R1.a;
        }
        
        @Override
        public final int a() {
            return this.o;
        }
        
        @Override
        public final String toString() {
            final StringBuilder sb = new StringBuilder("<");
            sb.append(e.class.getName());
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
    
    public static final class f extends Y3 implements K4
    {
        private static final f zzc;
        private static volatile T4 zzd;
        private int zze;
        private String zzf;
        private String zzg;
        
        static {
            Y3.t(f.class, zzc = new f());
        }
        
        public f() {
            this.zzf = "";
            this.zzg = "";
        }
        
        public static /* synthetic */ f G() {
            return f.zzc;
        }
        
        public final String H() {
            return this.zzf;
        }
        
        @Override
        public final Object p(final int n, final Object o, final Object o2) {
            Label_0146: {
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
                        final T4 zzd = f.zzd;
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
                        // monitorenter(f.class)
                        while (true) {
                            Label_0155: {
                                break Label_0155;
                                try {
                                    T4 zzd2;
                                    if ((zzd2 = f.zzd) == null) {
                                        zzd2 = (f.zzd = new Y3.a(f.zzc));
                                    }
                                    // monitorexit(f.class)
                                    return zzd2;
                                    return Y3.q(f.zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001", new Object[] { "zze", "zzf", "zzg" });
                                    // monitorexit(f.class)
                                    return new f();
                                    return f.zzc;
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
        
        public static final class a extends Y3.b implements K4
        {
            public a() {
                super(f.G());
            }
        }
    }
}
