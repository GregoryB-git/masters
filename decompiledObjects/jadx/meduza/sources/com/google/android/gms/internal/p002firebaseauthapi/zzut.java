package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzakg;

/* loaded from: classes.dex */
public final class zzut extends zzakg<zzut, zza> implements zzalp {
    private static final zzut zzc;
    private static volatile zzalw<zzut> zzd;
    private int zze;
    private int zzf;
    private zzaiw zzg = zzaiw.zza;

    public static final class zza extends zzakg.zzb<zzut, zza> implements zzalp {
        private zza() {
            super(zzut.zzc);
        }

        public final zza zza(zzaiw zzaiwVar) {
            zzg();
            zzut.zza((zzut) this.zza, zzaiwVar);
            return this;
        }

        public final zza zza(zzuw zzuwVar) {
            zzg();
            zzut.zza((zzut) this.zza, zzuwVar);
            return this;
        }

        public final zza zza(zzvc zzvcVar) {
            zzg();
            zzut.zza((zzut) this.zza, zzvcVar);
            return this;
        }
    }

    static {
        zzut zzutVar = new zzut();
        zzc = zzutVar;
        zzakg.zza((Class<zzut>) zzut.class, zzutVar);
    }

    private zzut() {
    }

    public static zza zza() {
        return zzc.zzm();
    }

    public static /* synthetic */ void zza(zzut zzutVar, zzaiw zzaiwVar) {
        zzaiwVar.getClass();
        zzutVar.zzg = zzaiwVar;
    }

    public static /* synthetic */ void zza(zzut zzutVar, zzuw zzuwVar) {
        zzutVar.zze = zzuwVar.zza();
    }

    public static /* synthetic */ void zza(zzut zzutVar, zzvc zzvcVar) {
        zzutVar.zzf = zzvcVar.zza();
    }

    public static zzut zzc() {
        return zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
    public final Object zza(int i10, Object obj, Object obj2) {
        switch (zzuv.zza[i10 - 1]) {
            case 1:
                return new zzut();
            case 2:
                return new zza();
            case 3:
                return zzakg.zza(zzc, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzalw<zzut> zzalwVar = zzd;
                if (zzalwVar == null) {
                    synchronized (zzut.class) {
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

    public final zzuw zzd() {
        zzuw zza2 = zzuw.zza(this.zze);
        return zza2 == null ? zzuw.UNRECOGNIZED : zza2;
    }

    public final zzvc zze() {
        zzvc zza2 = zzvc.zza(this.zzf);
        return zza2 == null ? zzvc.UNRECOGNIZED : zza2;
    }

    public final zzaiw zzf() {
        return this.zzg;
    }
}
