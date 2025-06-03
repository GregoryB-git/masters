// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

public final class V1 extends Y3 implements K4
{
    private static final V1 zzc;
    private static volatile T4 zzd;
    private int zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;
    
    static {
        Y3.t(V1.class, zzc = new V1());
    }
    
    public static a G() {
        return (a)V1.zzc.w();
    }
    
    public static /* synthetic */ V1 J() {
        return V1.zzc;
    }
    
    public static V1 M() {
        return V1.zzc;
    }
    
    public final void I(final boolean zzk) {
        this.zze |= 0x20;
        this.zzk = zzk;
    }
    
    public final void L(final boolean zzj) {
        this.zze |= 0x10;
        this.zzj = zzj;
    }
    
    public final void O(final boolean zzf) {
        this.zze |= 0x1;
        this.zzf = zzf;
    }
    
    public final void Q(final boolean zzl) {
        this.zze |= 0x40;
        this.zzl = zzl;
    }
    
    public final boolean R() {
        return this.zzk;
    }
    
    public final void T(final boolean zzg) {
        this.zze |= 0x2;
        this.zzg = zzg;
    }
    
    public final boolean U() {
        return this.zzj;
    }
    
    public final void W(final boolean zzh) {
        this.zze |= 0x4;
        this.zzh = zzh;
    }
    
    public final boolean X() {
        return this.zzf;
    }
    
    public final void Z(final boolean zzi) {
        this.zze |= 0x8;
        this.zzi = zzi;
    }
    
    public final boolean a0() {
        return this.zzl;
    }
    
    public final boolean b0() {
        return this.zzg;
    }
    
    public final boolean c0() {
        return this.zzh;
    }
    
    public final boolean d0() {
        return this.zzi;
    }
    
    @Override
    public final Object p(final int n, final Object o, final Object o2) {
        Label_0174: {
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
                    final T4 zzd = V1.zzd;
                    if (zzd == null) {
                        break Label_0174;
                    }
                    return zzd;
                }
                case 4: {
                    break Label_0174;
                }
                case 3: {
                    break Label_0174;
                }
                case 2: {
                    break Label_0174;
                }
                case 1: {
                    // monitorenter(V1.class)
                    while (true) {
                        Label_0183: {
                            break Label_0183;
                            try {
                                T4 zzd2;
                                if ((zzd2 = V1.zzd) == null) {
                                    zzd2 = (V1.zzd = new Y3.a(V1.zzc));
                                }
                                // monitorexit(V1.class)
                                return zzd2;
                                return new a((T1)null);
                                return new V1();
                                return V1.zzc;
                                // monitorexit(V1.class)
                                return Y3.q(V1.zzc, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1007\u0001\u0003\u1007\u0002\u0004\u1007\u0003\u0005\u1007\u0004\u0006\u1007\u0005\u0007\u1007\u0006", new Object[] { "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl" });
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
            super(V1.J());
        }
        
        public final a A(final boolean b) {
            ((b)this).s();
            ((V1)super.p).T(b);
            return this;
        }
        
        public final a B(final boolean b) {
            ((b)this).s();
            ((V1)super.p).W(b);
            return this;
        }
        
        public final a C(final boolean b) {
            ((b)this).s();
            ((V1)super.p).Z(b);
            return this;
        }
        
        public final a w(final boolean b) {
            ((b)this).s();
            ((V1)super.p).I(b);
            return this;
        }
        
        public final a x(final boolean b) {
            ((b)this).s();
            ((V1)super.p).L(b);
            return this;
        }
        
        public final a y(final boolean b) {
            ((b)this).s();
            ((V1)super.p).O(b);
            return this;
        }
        
        public final a z(final boolean b) {
            ((b)this).s();
            ((V1)super.p).Q(b);
            return this;
        }
    }
}
