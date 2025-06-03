package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzakg;

/* loaded from: classes.dex */
public final class zzss extends zzakg<zzss, zza> implements zzalp {
    private static final zzss zzc;
    private static volatile zzalw<zzss> zzd;
    private int zze;
    private zzsv zzf;
    private int zzg;

    public static final class zza extends zzakg.zzb<zzss, zza> implements zzalp {
        private zza() {
            super(zzss.zzc);
        }

        public final zza zza(int i10) {
            zzg();
            ((zzss) this.zza).zzg = i10;
            return this;
        }

        public final zza zza(zzsv zzsvVar) {
            zzg();
            zzss.zza((zzss) this.zza, zzsvVar);
            return this;
        }
    }

    static {
        zzss zzssVar = new zzss();
        zzc = zzssVar;
        zzakg.zza((Class<zzss>) zzss.class, zzssVar);
    }

    private zzss() {
    }

    public static /* synthetic */ void zza(zzss zzssVar, zzsv zzsvVar) {
        zzsvVar.getClass();
        zzssVar.zzf = zzsvVar;
        zzssVar.zze |= 1;
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    public static zzss zzd() {
        return zzc;
    }

    public final int zza() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
    public final Object zza(int i10, Object obj, Object obj2) {
        switch (zzsr.zza[i10 - 1]) {
            case 1:
                return new zzss();
            case 2:
                return new zza();
            case 3:
                return zzakg.zza(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzalw<zzss> zzalwVar = zzd;
                if (zzalwVar == null) {
                    synchronized (zzss.class) {
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

    public final zzsv zze() {
        zzsv zzsvVar = this.zzf;
        return zzsvVar == null ? zzsv.zzd() : zzsvVar;
    }
}
