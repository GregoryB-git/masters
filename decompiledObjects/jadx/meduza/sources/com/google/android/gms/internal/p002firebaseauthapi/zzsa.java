package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzakg;

/* loaded from: classes.dex */
public final class zzsa extends zzakg<zzsa, zza> implements zzalp {
    private static final zzsa zzc;
    private static volatile zzalw<zzsa> zzd;
    private int zze;
    private int zzf;
    private zzaiw zzg = zzaiw.zza;
    private zzsg zzh;

    public static final class zza extends zzakg.zzb<zzsa, zza> implements zzalp {
        private zza() {
            super(zzsa.zzc);
        }

        public final zza zza(zzaiw zzaiwVar) {
            zzg();
            zzsa.zza((zzsa) this.zza, zzaiwVar);
            return this;
        }

        public final zza zza(zzsg zzsgVar) {
            zzg();
            zzsa.zza((zzsa) this.zza, zzsgVar);
            return this;
        }
    }

    static {
        zzsa zzsaVar = new zzsa();
        zzc = zzsaVar;
        zzakg.zza((Class<zzsa>) zzsa.class, zzsaVar);
    }

    private zzsa() {
    }

    public static zzsa zza(zzaiw zzaiwVar, zzajv zzajvVar) {
        return (zzsa) zzakg.zza(zzc, zzaiwVar, zzajvVar);
    }

    public static /* synthetic */ void zza(zzsa zzsaVar, zzaiw zzaiwVar) {
        zzaiwVar.getClass();
        zzsaVar.zzg = zzaiwVar;
    }

    public static /* synthetic */ void zza(zzsa zzsaVar, zzsg zzsgVar) {
        zzsgVar.getClass();
        zzsaVar.zzh = zzsgVar;
        zzsaVar.zze |= 1;
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    public static zzalw<zzsa> zzf() {
        return (zzalw) zzc.zza(zzakg.zze.zzg, (Object) null, (Object) null);
    }

    public final int zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
    public final Object zza(int i10, Object obj, Object obj2) {
        switch (zzrz.zza[i10 - 1]) {
            case 1:
                return new zzsa();
            case 2:
                return new zza();
            case 3:
                return zzakg.zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzalw<zzsa> zzalwVar = zzd;
                if (zzalwVar == null) {
                    synchronized (zzsa.class) {
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

    public final zzsg zzd() {
        zzsg zzsgVar = this.zzh;
        return zzsgVar == null ? zzsg.zzd() : zzsgVar;
    }

    public final zzaiw zze() {
        return this.zzg;
    }
}
