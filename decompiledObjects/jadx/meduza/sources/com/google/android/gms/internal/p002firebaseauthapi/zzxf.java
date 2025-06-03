package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzakg;

/* loaded from: classes.dex */
public final class zzxf extends zzakg<zzxf, zza> implements zzalp {
    private static final zzxf zzc;
    private static volatile zzalw<zzxf> zzd;
    private int zze;
    private int zzf;
    private zzxl zzg;
    private zzaiw zzh = zzaiw.zza;

    public static final class zza extends zzakg.zzb<zzxf, zza> implements zzalp {
        private zza() {
            super(zzxf.zzc);
        }

        public final zza zza(zzaiw zzaiwVar) {
            zzg();
            zzxf.zza((zzxf) this.zza, zzaiwVar);
            return this;
        }

        public final zza zza(zzxl zzxlVar) {
            zzg();
            zzxf.zza((zzxf) this.zza, zzxlVar);
            return this;
        }
    }

    static {
        zzxf zzxfVar = new zzxf();
        zzc = zzxfVar;
        zzakg.zza((Class<zzxf>) zzxf.class, zzxfVar);
    }

    private zzxf() {
    }

    public static zzxf zza(zzaiw zzaiwVar, zzajv zzajvVar) {
        return (zzxf) zzakg.zza(zzc, zzaiwVar, zzajvVar);
    }

    public static /* synthetic */ void zza(zzxf zzxfVar, zzaiw zzaiwVar) {
        zzaiwVar.getClass();
        zzxfVar.zzh = zzaiwVar;
    }

    public static /* synthetic */ void zza(zzxf zzxfVar, zzxl zzxlVar) {
        zzxlVar.getClass();
        zzxfVar.zzg = zzxlVar;
        zzxfVar.zze |= 1;
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    public final int zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
    public final Object zza(int i10, Object obj, Object obj2) {
        switch (zzxh.zza[i10 - 1]) {
            case 1:
                return new zzxf();
            case 2:
                return new zza();
            case 3:
                return zzakg.zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzalw<zzxf> zzalwVar = zzd;
                if (zzalwVar == null) {
                    synchronized (zzxf.class) {
                        zzalwVar = zzd;
                        if (zzalwVar == null) {
                            zzalwVar = new zzakg.zza<>(zzc);
                            zzd = zzalwVar;
                        }
                    }
                }
                return zzalwVar;
            case 6:
                return (byte) 1;
            default:
                throw null;
        }
    }

    public final zzxl zzd() {
        zzxl zzxlVar = this.zzg;
        return zzxlVar == null ? zzxl.zzd() : zzxlVar;
    }

    public final zzaiw zze() {
        return this.zzh;
    }
}
