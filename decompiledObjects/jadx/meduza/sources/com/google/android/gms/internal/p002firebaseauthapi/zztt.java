package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzakg;

/* loaded from: classes.dex */
public final class zztt extends zzakg<zztt, zza> implements zzalp {
    private static final zztt zzc;
    private static volatile zzalw<zztt> zzd;
    private int zze;
    private zzaiw zzf = zzaiw.zza;

    public static final class zza extends zzakg.zzb<zztt, zza> implements zzalp {
        private zza() {
            super(zztt.zzc);
        }

        public final zza zza(zzaiw zzaiwVar) {
            zzg();
            zztt.zza((zztt) this.zza, zzaiwVar);
            return this;
        }
    }

    static {
        zztt zzttVar = new zztt();
        zzc = zzttVar;
        zzakg.zza((Class<zztt>) zztt.class, zzttVar);
    }

    private zztt() {
    }

    public static zztt zza(zzaiw zzaiwVar, zzajv zzajvVar) {
        return (zztt) zzakg.zza(zzc, zzaiwVar, zzajvVar);
    }

    public static /* synthetic */ void zza(zztt zzttVar, zzaiw zzaiwVar) {
        zzaiwVar.getClass();
        zzttVar.zzf = zzaiwVar;
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    public static zzalw<zztt> zze() {
        return (zzalw) zzc.zza(zzakg.zze.zzg, (Object) null, (Object) null);
    }

    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
    public final Object zza(int i10, Object obj, Object obj2) {
        switch (zzts.zza[i10 - 1]) {
            case 1:
                return new zztt();
            case 2:
                return new zza();
            case 3:
                return zzakg.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzalw<zztt> zzalwVar = zzd;
                if (zzalwVar == null) {
                    synchronized (zztt.class) {
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

    public final zzaiw zzd() {
        return this.zzf;
    }
}
