// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

public final class J1 extends Y3 implements K4
{
    private static final J1 zzc;
    private static volatile T4 zzd;
    private int zze;
    private String zzf;
    private h4 zzg;
    private boolean zzh;
    
    static {
        Y3.t(J1.class, zzc = new J1());
    }
    
    public J1() {
        this.zzf = "";
        this.zzg = Y3.B();
    }
    
    public static /* synthetic */ J1 G() {
        return J1.zzc;
    }
    
    public final String H() {
        return this.zzf;
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
                    final T4 zzd = J1.zzd;
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
                    // monitorenter(J1.class)
                    while (true) {
                        Label_0165: {
                            break Label_0165;
                            try {
                                T4 zzd2;
                                if ((zzd2 = J1.zzd) == null) {
                                    zzd2 = (J1.zzd = new Y3.a(J1.zzc));
                                }
                                // monitorexit(J1.class)
                                return zzd2;
                                return new J1();
                                // monitorexit(J1.class)
                                return;
                                return J1.zzc;
                                return Y3.q(J1.zzc, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u001b\u0003\u1007\u0001", new Object[] { "zze", "zzf", "zzg", N1.class, "zzh" });
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
            super(J1.G());
        }
    }
}
