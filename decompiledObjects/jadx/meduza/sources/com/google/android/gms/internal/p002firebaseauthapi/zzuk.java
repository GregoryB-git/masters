package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzakg;

/* loaded from: classes.dex */
public final class zzuk extends zzakg<zzuk, zza> implements zzalp {
    private static final zzuk zzc;
    private static volatile zzalw<zzuk> zzd;
    private int zze;
    private zzut zzf;
    private zzue zzg;
    private int zzh;

    public static final class zza extends zzakg.zzb<zzuk, zza> implements zzalp {
        private zza() {
            super(zzuk.zzc);
        }

        public final zza zza(zzue zzueVar) {
            zzg();
            zzuk.zza((zzuk) this.zza, zzueVar);
            return this;
        }

        public final zza zza(zzuf zzufVar) {
            zzg();
            zzuk.zza((zzuk) this.zza, zzufVar);
            return this;
        }

        public final zza zza(zzut zzutVar) {
            zzg();
            zzuk.zza((zzuk) this.zza, zzutVar);
            return this;
        }
    }

    static {
        zzuk zzukVar = new zzuk();
        zzc = zzukVar;
        zzakg.zza((Class<zzuk>) zzuk.class, zzukVar);
    }

    private zzuk() {
    }

    public static /* synthetic */ void zza(zzuk zzukVar, zzue zzueVar) {
        zzueVar.getClass();
        zzukVar.zzg = zzueVar;
        zzukVar.zze |= 2;
    }

    public static /* synthetic */ void zza(zzuk zzukVar, zzuf zzufVar) {
        zzukVar.zzh = zzufVar.zza();
    }

    public static /* synthetic */ void zza(zzuk zzukVar, zzut zzutVar) {
        zzutVar.getClass();
        zzukVar.zzf = zzutVar;
        zzukVar.zze |= 1;
    }

    public static zza zzc() {
        return zzc.zzm();
    }

    public static zzuk zze() {
        return zzc;
    }

    public final zzuf zza() {
        zzuf zza2 = zzuf.zza(this.zzh);
        return zza2 == null ? zzuf.UNRECOGNIZED : zza2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
    public final Object zza(int i10, Object obj, Object obj2) {
        switch (zzum.zza[i10 - 1]) {
            case 1:
                return new zzuk();
            case 2:
                return new zza();
            case 3:
                return zzakg.zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzalw<zzuk> zzalwVar = zzd;
                if (zzalwVar == null) {
                    synchronized (zzuk.class) {
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

    public final zzue zzb() {
        zzue zzueVar = this.zzg;
        return zzueVar == null ? zzue.zzc() : zzueVar;
    }

    public final zzut zzf() {
        zzut zzutVar = this.zzf;
        return zzutVar == null ? zzut.zzc() : zzutVar;
    }
}
