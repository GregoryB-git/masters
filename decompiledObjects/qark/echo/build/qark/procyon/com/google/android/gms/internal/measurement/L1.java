// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

public final class L1 extends Y3 implements K4
{
    private static final L1 zzc;
    private static volatile T4 zzd;
    private int zze;
    private long zzf;
    private String zzg;
    private int zzh;
    private h4 zzi;
    private h4 zzj;
    private h4 zzk;
    private String zzl;
    private boolean zzm;
    private h4 zzn;
    private h4 zzo;
    private String zzp;
    private String zzq;
    private String zzr;
    private String zzs;
    private I1 zzt;
    private M1 zzu;
    
    static {
        Y3.t(L1.class, zzc = new L1());
    }
    
    public L1() {
        this.zzg = "";
        this.zzi = Y3.B();
        this.zzj = Y3.B();
        this.zzk = Y3.B();
        this.zzl = "";
        this.zzn = Y3.B();
        this.zzo = Y3.B();
        this.zzp = "";
        this.zzq = "";
        this.zzr = "";
        this.zzs = "";
    }
    
    public static a N() {
        return (a)L1.zzc.w();
    }
    
    public static /* synthetic */ L1 O() {
        return L1.zzc;
    }
    
    public static L1 P() {
        return L1.zzc;
    }
    
    public final K1 G(final int n) {
        return this.zzj.get(n);
    }
    
    public final void H(final int n, final K1 k1) {
        k1.getClass();
        final h4 zzj = this.zzj;
        if (!zzj.c()) {
            this.zzj = Y3.n(zzj);
        }
        this.zzj.set(n, k1);
    }
    
    public final int K() {
        return this.zzj.size();
    }
    
    public final long L() {
        return this.zzf;
    }
    
    public final I1 M() {
        I1 i1;
        if ((i1 = this.zzt) == null) {
            i1 = I1.H();
        }
        return i1;
    }
    
    public final String Q() {
        return this.zzg;
    }
    
    public final String R() {
        return this.zzr;
    }
    
    public final String S() {
        return this.zzq;
    }
    
    public final String T() {
        return this.zzp;
    }
    
    public final List U() {
        return this.zzk;
    }
    
    public final List V() {
        return this.zzo;
    }
    
    public final List W() {
        return this.zzn;
    }
    
    public final List X() {
        return this.zzi;
    }
    
    public final boolean Y() {
        return this.zzm;
    }
    
    public final boolean Z() {
        return (this.zze & 0x200) != 0x0;
    }
    
    public final boolean a0() {
        return (this.zze & 0x2) != 0x0;
    }
    
    public final boolean b0() {
        return (this.zze & 0x1) != 0x0;
    }
    
    public final void c0() {
        this.zzk = Y3.B();
    }
    
    public final int k() {
        return this.zzn.size();
    }
    
    @Override
    public final Object p(final int n, final Object o, final Object o2) {
        Label_0258: {
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
                    final T4 zzd = L1.zzd;
                    if (zzd == null) {
                        break Label_0258;
                    }
                    return zzd;
                }
                case 4: {
                    break Label_0258;
                }
                case 3: {
                    break Label_0258;
                }
                case 2: {
                    break Label_0258;
                }
                case 1: {
                    // monitorenter(L1.class)
                    while (true) {
                        Label_0267: {
                            break Label_0267;
                            try {
                                T4 zzd2;
                                if ((zzd2 = L1.zzd) == null) {
                                    zzd2 = (L1.zzd = new Y3.a(L1.zzc));
                                }
                                // monitorexit(L1.class)
                                return zzd2;
                                // monitorexit(L1.class)
                                return new L1();
                                return Y3.q(L1.zzc, "\u0001\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0005\u0000\u0001\u1002\u0000\u0002\u1008\u0001\u0003\u1004\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007\u1008\u0003\b\u1007\u0004\t\u001b\n\u001b\u000b\u1008\u0005\f\u1008\u0006\r\u1008\u0007\u000e\u1008\b\u000f\u1009\t\u0010\u1009\n", new Object[] { "zze", "zzf", "zzg", "zzh", "zzi", O1.class, "zzj", K1.class, "zzk", w1.class, "zzl", "zzm", "zzn", q2.class, "zzo", J1.class, "zzp", "zzq", "zzr", "zzs", "zzt", "zzu" });
                                return new a((H1)null);
                                return L1.zzc;
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
            super(L1.O());
        }
        
        public final String A() {
            return ((L1)super.p).T();
        }
        
        public final List B() {
            return Collections.unmodifiableList((List<?>)((L1)super.p).U());
        }
        
        public final List C() {
            return Collections.unmodifiableList((List<?>)((L1)super.p).V());
        }
        
        public final int w() {
            return ((L1)super.p).K();
        }
        
        public final K1 x(final int n) {
            return ((L1)super.p).G(n);
        }
        
        public final a y(final int n, final K1.a a) {
            ((b)this).s();
            ((L1)super.p).H(n, (K1)((b)a).p());
            return this;
        }
        
        public final a z() {
            ((b)this).s();
            ((L1)super.p).c0();
            return this;
        }
    }
}
