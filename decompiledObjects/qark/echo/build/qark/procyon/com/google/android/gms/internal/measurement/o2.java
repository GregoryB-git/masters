// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.List;

public final class o2 extends Y3 implements K4
{
    private static final o2 zzc;
    private static volatile T4 zzd;
    private h4 zze;
    
    static {
        Y3.t(o2.class, zzc = new o2());
    }
    
    public o2() {
        this.zze = Y3.B();
    }
    
    public static /* synthetic */ o2 G() {
        return o2.zzc;
    }
    
    public static o2 H() {
        return o2.zzc;
    }
    
    public final List I() {
        return this.zze;
    }
    
    public final int k() {
        return this.zze.size();
    }
    
    @Override
    public final Object p(final int n, final Object o, final Object o2) {
        Label_0141: {
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
                    final T4 zzd = o2.zzd;
                    if (zzd == null) {
                        break Label_0141;
                    }
                    return zzd;
                }
                case 4: {
                    break Label_0141;
                }
                case 3: {
                    break Label_0141;
                }
                case 2: {
                    break Label_0141;
                }
                case 1: {
                    // monitorenter(o2.class)
                    while (true) {
                        Label_0150: {
                            break Label_0150;
                            try {
                                T4 zzd2;
                                if ((zzd2 = o2.zzd) == null) {
                                    zzd2 = (o2.zzd = new Y3.a(o2.zzc));
                                }
                                // monitorexit(o2.class)
                                return zzd2;
                                return o2.zzc;
                                return Y3.q(o2.zzc, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "zze", p2.class });
                                return new a((n2)null);
                                // monitorexit(o2.class)
                                return new o2();
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
            super(o2.G());
        }
    }
}
