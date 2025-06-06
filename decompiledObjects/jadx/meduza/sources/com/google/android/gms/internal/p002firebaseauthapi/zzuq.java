package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzakg;

/* loaded from: classes.dex */
public final class zzuq extends zzakg<zzuq, zza> implements zzalp {
    private static final zzuq zzc;
    private static volatile zzalw<zzuq> zzd;
    private int zze;
    private int zzf;
    private zzuk zzg;
    private zzaiw zzh;
    private zzaiw zzi;

    public static final class zza extends zzakg.zzb<zzuq, zza> implements zzalp {
        private zza() {
            super(zzuq.zzc);
        }

        public final zza zza(int i10) {
            zzg();
            ((zzuq) this.zza).zzf = 0;
            return this;
        }

        public final zza zza(zzaiw zzaiwVar) {
            zzg();
            zzuq.zza((zzuq) this.zza, zzaiwVar);
            return this;
        }

        public final zza zza(zzuk zzukVar) {
            zzg();
            zzuq.zza((zzuq) this.zza, zzukVar);
            return this;
        }

        public final zza zzb(zzaiw zzaiwVar) {
            zzg();
            zzuq.zzb((zzuq) this.zza, zzaiwVar);
            return this;
        }
    }

    static {
        zzuq zzuqVar = new zzuq();
        zzc = zzuqVar;
        zzakg.zza((Class<zzuq>) zzuq.class, zzuqVar);
    }

    private zzuq() {
        zzaiw zzaiwVar = zzaiw.zza;
        this.zzh = zzaiwVar;
        this.zzi = zzaiwVar;
    }

    public static zzuq zza(zzaiw zzaiwVar, zzajv zzajvVar) {
        return (zzuq) zzakg.zza(zzc, zzaiwVar, zzajvVar);
    }

    public static /* synthetic */ void zza(zzuq zzuqVar, zzaiw zzaiwVar) {
        zzaiwVar.getClass();
        zzuqVar.zzh = zzaiwVar;
    }

    public static /* synthetic */ void zza(zzuq zzuqVar, zzuk zzukVar) {
        zzukVar.getClass();
        zzuqVar.zzg = zzukVar;
        zzuqVar.zze |= 1;
    }

    public static /* synthetic */ void zzb(zzuq zzuqVar, zzaiw zzaiwVar) {
        zzaiwVar.getClass();
        zzuqVar.zzi = zzaiwVar;
    }

    public static zza zzc() {
        return zzc.zzm();
    }

    public static zzuq zze() {
        return zzc;
    }

    public static zzalw<zzuq> zzh() {
        return (zzalw) zzc.zza(zzakg.zze.zzg, (Object) null, (Object) null);
    }

    public final int zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
    public final Object zza(int i10, Object obj, Object obj2) {
        switch (zzus.zza[i10 - 1]) {
            case 1:
                return new zzuq();
            case 2:
                return new zza();
            case 3:
                return zzakg.zza(zzc, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                zzalw<zzuq> zzalwVar = zzd;
                if (zzalwVar == null) {
                    synchronized (zzuq.class) {
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

    public final zzuk zzb() {
        zzuk zzukVar = this.zzg;
        return zzukVar == null ? zzuk.zze() : zzukVar;
    }

    public final zzaiw zzf() {
        return this.zzh;
    }

    public final zzaiw zzg() {
        return this.zzi;
    }
}
