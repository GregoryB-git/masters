package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzakg;

/* loaded from: classes.dex */
public final class zzuh extends zzakg<zzuh, zza> implements zzalp {
    private static final zzuh zzc;
    private static volatile zzalw<zzuh> zzd;
    private int zze;
    private zzuk zzf;

    public static final class zza extends zzakg.zzb<zzuh, zza> implements zzalp {
        private zza() {
            super(zzuh.zzc);
        }

        public final zza zza(zzuk zzukVar) {
            zzg();
            zzuh.zza((zzuh) this.zza, zzukVar);
            return this;
        }
    }

    static {
        zzuh zzuhVar = new zzuh();
        zzc = zzuhVar;
        zzakg.zza((Class<zzuh>) zzuh.class, zzuhVar);
    }

    private zzuh() {
    }

    public static zza zza() {
        return zzc.zzm();
    }

    public static zzuh zza(zzaiw zzaiwVar, zzajv zzajvVar) {
        return (zzuh) zzakg.zza(zzc, zzaiwVar, zzajvVar);
    }

    public static /* synthetic */ void zza(zzuh zzuhVar, zzuk zzukVar) {
        zzukVar.getClass();
        zzuhVar.zzf = zzukVar;
        zzuhVar.zze |= 1;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
    public final Object zza(int i10, Object obj, Object obj2) {
        switch (zzuj.zza[i10 - 1]) {
            case 1:
                return new zzuh();
            case 2:
                return new zza();
            case 3:
                return zzakg.zza(zzc, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzalw<zzuh> zzalwVar = zzd;
                if (zzalwVar == null) {
                    synchronized (zzuh.class) {
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

    public final zzuk zzc() {
        zzuk zzukVar = this.zzf;
        return zzukVar == null ? zzuk.zze() : zzukVar;
    }
}
