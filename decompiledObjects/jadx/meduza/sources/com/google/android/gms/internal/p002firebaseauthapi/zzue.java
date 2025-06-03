package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzakg;

/* loaded from: classes.dex */
public final class zzue extends zzakg<zzue, zza> implements zzalp {
    private static final zzue zzc;
    private static volatile zzalw<zzue> zzd;
    private int zze;
    private zzwf zzf;

    public static final class zza extends zzakg.zzb<zzue, zza> implements zzalp {
        private zza() {
            super(zzue.zzc);
        }

        public final zza zza(zzwf zzwfVar) {
            zzg();
            zzue.zza((zzue) this.zza, zzwfVar);
            return this;
        }
    }

    static {
        zzue zzueVar = new zzue();
        zzc = zzueVar;
        zzakg.zza((Class<zzue>) zzue.class, zzueVar);
    }

    private zzue() {
    }

    public static zza zza() {
        return zzc.zzm();
    }

    public static /* synthetic */ void zza(zzue zzueVar, zzwf zzwfVar) {
        zzwfVar.getClass();
        zzueVar.zzf = zzwfVar;
        zzueVar.zze |= 1;
    }

    public static zzue zzc() {
        return zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
    public final Object zza(int i10, Object obj, Object obj2) {
        switch (zzug.zza[i10 - 1]) {
            case 1:
                return new zzue();
            case 2:
                return new zza();
            case 3:
                return zzakg.zza(zzc, "\u0000\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzalw<zzue> zzalwVar = zzd;
                if (zzalwVar == null) {
                    synchronized (zzue.class) {
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

    public final zzwf zzd() {
        zzwf zzwfVar = this.zzf;
        return zzwfVar == null ? zzwf.zzc() : zzwfVar;
    }
}
