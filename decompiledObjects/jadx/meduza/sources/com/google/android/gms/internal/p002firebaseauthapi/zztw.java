package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzakg;

/* loaded from: classes.dex */
public final class zztw extends zzakg<zztw, zza> implements zzalp {
    private static final zztw zzc;
    private static volatile zzalw<zztw> zzd;
    private int zze;
    private int zzf;

    public static final class zza extends zzakg.zzb<zztw, zza> implements zzalp {
        private zza() {
            super(zztw.zzc);
        }

        public final zza zza(int i10) {
            zzg();
            ((zztw) this.zza).zze = i10;
            return this;
        }
    }

    static {
        zztw zztwVar = new zztw();
        zzc = zztwVar;
        zzakg.zza((Class<zztw>) zztw.class, zztwVar);
    }

    private zztw() {
    }

    public static zztw zza(zzaiw zzaiwVar, zzajv zzajvVar) {
        return (zztw) zzakg.zza(zzc, zzaiwVar, zzajvVar);
    }

    public static zza zzc() {
        return zzc.zzm();
    }

    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
    public final Object zza(int i10, Object obj, Object obj2) {
        switch (zztv.zza[i10 - 1]) {
            case 1:
                return new zztw();
            case 2:
                return new zza();
            case 3:
                return zzakg.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzalw<zztw> zzalwVar = zzd;
                if (zzalwVar == null) {
                    synchronized (zztw.class) {
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
