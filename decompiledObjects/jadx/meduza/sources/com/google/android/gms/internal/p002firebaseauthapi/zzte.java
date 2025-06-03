package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzakg;

/* loaded from: classes.dex */
public final class zzte extends zzakg<zzte, zza> implements zzalp {
    private static final zzte zzc;
    private static volatile zzalw<zzte> zzd;
    private int zze;

    public static final class zza extends zzakg.zzb<zzte, zza> implements zzalp {
        private zza() {
            super(zzte.zzc);
        }

        public final zza zza(int i10) {
            zzg();
            ((zzte) this.zza).zze = i10;
            return this;
        }
    }

    static {
        zzte zzteVar = new zzte();
        zzc = zzteVar;
        zzakg.zza((Class<zzte>) zzte.class, zzteVar);
    }

    private zzte() {
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    public static zzte zzd() {
        return zzc;
    }

    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
    public final Object zza(int i10, Object obj, Object obj2) {
        switch (zztd.zza[i10 - 1]) {
            case 1:
                return new zzte();
            case 2:
                return new zza();
            case 3:
                return zzakg.zza(zzc, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
            case 4:
                return zzc;
            case 5:
                zzalw<zzte> zzalwVar = zzd;
                if (zzalwVar == null) {
                    synchronized (zzte.class) {
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
