package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzakg;

/* loaded from: classes.dex */
public final class zzsv extends zzakg<zzsv, zza> implements zzalp {
    private static final zzsv zzc;
    private static volatile zzalw<zzsv> zzd;
    private int zze;

    public static final class zza extends zzakg.zzb<zzsv, zza> implements zzalp {
        private zza() {
            super(zzsv.zzc);
        }

        public final zza zza(int i10) {
            zzg();
            ((zzsv) this.zza).zze = i10;
            return this;
        }
    }

    static {
        zzsv zzsvVar = new zzsv();
        zzc = zzsvVar;
        zzakg.zza((Class<zzsv>) zzsv.class, zzsvVar);
    }

    private zzsv() {
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    public static zzsv zzd() {
        return zzc;
    }

    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
    public final Object zza(int i10, Object obj, Object obj2) {
        switch (zzsu.zza[i10 - 1]) {
            case 1:
                return new zzsv();
            case 2:
                return new zza();
            case 3:
                return zzakg.zza(zzc, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
            case 4:
                return zzc;
            case 5:
                zzalw<zzsv> zzalwVar = zzd;
                if (zzalwVar == null) {
                    synchronized (zzsv.class) {
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
}
