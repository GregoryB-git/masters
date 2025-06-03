package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzakg;

/* loaded from: classes.dex */
public final class zztq extends zzakg<zztq, zza> implements zzalp {
    private static final zztq zzc;
    private static volatile zzalw<zztq> zzd;
    private int zze;
    private int zzf;

    public static final class zza extends zzakg.zzb<zztq, zza> implements zzalp {
        private zza() {
            super(zztq.zzc);
        }

        public final zza zza(int i10) {
            zzg();
            ((zztq) this.zza).zze = i10;
            return this;
        }
    }

    static {
        zztq zztqVar = new zztq();
        zzc = zztqVar;
        zzakg.zza((Class<zztq>) zztq.class, zztqVar);
    }

    private zztq() {
    }

    public static zztq zza(zzaiw zzaiwVar, zzajv zzajvVar) {
        return (zztq) zzakg.zza(zzc, zzaiwVar, zzajvVar);
    }

    public static zza zzc() {
        return zzc.zzm();
    }

    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
    public final Object zza(int i10, Object obj, Object obj2) {
        switch (zztp.zza[i10 - 1]) {
            case 1:
                return new zztq();
            case 2:
                return new zza();
            case 3:
                return zzakg.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzf", "zze"});
            case 4:
                return zzc;
            case 5:
                zzalw<zztq> zzalwVar = zzd;
                if (zzalwVar == null) {
                    synchronized (zztq.class) {
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
