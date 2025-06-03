package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzakg;

/* loaded from: classes.dex */
public final class zztz extends zzakg<zztz, zza> implements zzalp {
    private static final zztz zzc;
    private static volatile zzalw<zztz> zzd;
    private int zze;
    private zzaiw zzf = zzaiw.zza;

    public static final class zza extends zzakg.zzb<zztz, zza> implements zzalp {
        private zza() {
            super(zztz.zzc);
        }

        public final zza zza(zzaiw zzaiwVar) {
            zzg();
            zztz.zza((zztz) this.zza, zzaiwVar);
            return this;
        }
    }

    static {
        zztz zztzVar = new zztz();
        zzc = zztzVar;
        zzakg.zza((Class<zztz>) zztz.class, zztzVar);
    }

    private zztz() {
    }

    public static zztz zza(zzaiw zzaiwVar, zzajv zzajvVar) {
        return (zztz) zzakg.zza(zzc, zzaiwVar, zzajvVar);
    }

    public static /* synthetic */ void zza(zztz zztzVar, zzaiw zzaiwVar) {
        zzaiwVar.getClass();
        zztzVar.zzf = zzaiwVar;
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    public static zzalw<zztz> zze() {
        return (zzalw) zzc.zza(zzakg.zze.zzg, (Object) null, (Object) null);
    }

    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
    public final Object zza(int i10, Object obj, Object obj2) {
        switch (zzty.zza[i10 - 1]) {
            case 1:
                return new zztz();
            case 2:
                return new zza();
            case 3:
                return zzakg.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzalw<zztz> zzalwVar = zzd;
                if (zzalwVar == null) {
                    synchronized (zztz.class) {
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
