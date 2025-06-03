package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzakg;

/* loaded from: classes.dex */
public final class zztb extends zzakg<zztb, zza> implements zzalp {
    private static final zztb zzc;
    private static volatile zzalw<zztb> zzd;
    private int zze;
    private zzte zzf;
    private int zzg;

    public static final class zza extends zzakg.zzb<zztb, zza> implements zzalp {
        private zza() {
            super(zztb.zzc);
        }

        public final zza zza(int i10) {
            zzg();
            ((zztb) this.zza).zzg = i10;
            return this;
        }

        public final zza zza(zzte zzteVar) {
            zzg();
            zztb.zza((zztb) this.zza, zzteVar);
            return this;
        }
    }

    static {
        zztb zztbVar = new zztb();
        zzc = zztbVar;
        zzakg.zza((Class<zztb>) zztb.class, zztbVar);
    }

    private zztb() {
    }

    public static zztb zza(zzaiw zzaiwVar, zzajv zzajvVar) {
        return (zztb) zzakg.zza(zzc, zzaiwVar, zzajvVar);
    }

    public static /* synthetic */ void zza(zztb zztbVar, zzte zzteVar) {
        zzteVar.getClass();
        zztbVar.zzf = zzteVar;
        zztbVar.zze |= 1;
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    public final int zza() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
    public final Object zza(int i10, Object obj, Object obj2) {
        switch (zzta.zza[i10 - 1]) {
            case 1:
                return new zztb();
            case 2:
                return new zza();
            case 3:
                return zzakg.zza(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzalw<zztb> zzalwVar = zzd;
                if (zzalwVar == null) {
                    synchronized (zztb.class) {
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

    public final zzte zzd() {
        zzte zzteVar = this.zzf;
        return zzteVar == null ? zzte.zzd() : zzteVar;
    }
}
