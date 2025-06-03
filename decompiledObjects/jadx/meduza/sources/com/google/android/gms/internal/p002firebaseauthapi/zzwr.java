package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzakg;

/* loaded from: classes.dex */
public final class zzwr extends zzakg<zzwr, zza> implements zzalp {
    private static final zzwr zzc;
    private static volatile zzalw<zzwr> zzd;
    private int zze;
    private int zzf;
    private zzwu zzg;

    public static final class zza extends zzakg.zzb<zzwr, zza> implements zzalp {
        private zza() {
            super(zzwr.zzc);
        }

        public final zza zza(zzwu zzwuVar) {
            zzg();
            zzwr.zza((zzwr) this.zza, zzwuVar);
            return this;
        }
    }

    static {
        zzwr zzwrVar = new zzwr();
        zzc = zzwrVar;
        zzakg.zza((Class<zzwr>) zzwr.class, zzwrVar);
    }

    private zzwr() {
    }

    public static zzwr zza(zzaiw zzaiwVar, zzajv zzajvVar) {
        return (zzwr) zzakg.zza(zzc, zzaiwVar, zzajvVar);
    }

    public static /* synthetic */ void zza(zzwr zzwrVar, zzwu zzwuVar) {
        zzwuVar.getClass();
        zzwrVar.zzg = zzwuVar;
        zzwrVar.zze |= 1;
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    public static zzalw<zzwr> zze() {
        return (zzalw) zzc.zza(zzakg.zze.zzg, (Object) null, (Object) null);
    }

    public final int zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
    public final Object zza(int i10, Object obj, Object obj2) {
        switch (zzwq.zza[i10 - 1]) {
            case 1:
                return new zzwr();
            case 2:
                return new zza();
            case 3:
                return zzakg.zza(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzalw<zzwr> zzalwVar = zzd;
                if (zzalwVar == null) {
                    synchronized (zzwr.class) {
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

    public final zzwu zzd() {
        zzwu zzwuVar = this.zzg;
        return zzwuVar == null ? zzwu.zzc() : zzwuVar;
    }
}
