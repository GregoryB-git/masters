package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzakg;

/* loaded from: classes.dex */
public final class zztk extends zzakg<zztk, zza> implements zzalp {
    private static final zztk zzc;
    private static volatile zzalw<zztk> zzd;
    private int zze;
    private int zzf;

    public static final class zza extends zzakg.zzb<zztk, zza> implements zzalp {
        private zza() {
            super(zztk.zzc);
        }

        public final zza zza(int i10) {
            zzg();
            ((zztk) this.zza).zze = i10;
            return this;
        }
    }

    static {
        zztk zztkVar = new zztk();
        zzc = zztkVar;
        zzakg.zza((Class<zztk>) zztk.class, zztkVar);
    }

    private zztk() {
    }

    public static zztk zza(zzaiw zzaiwVar, zzajv zzajvVar) {
        return (zztk) zzakg.zza(zzc, zzaiwVar, zzajvVar);
    }

    public static zza zzc() {
        return zzc.zzm();
    }

    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
    public final Object zza(int i10, Object obj, Object obj2) {
        switch (zztj.zza[i10 - 1]) {
            case 1:
                return new zztk();
            case 2:
                return new zza();
            case 3:
                return zzakg.zza(zzc, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzalw<zztk> zzalwVar = zzd;
                if (zzalwVar == null) {
                    synchronized (zztk.class) {
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

    public final int zzb() {
        return this.zzf;
    }
}
