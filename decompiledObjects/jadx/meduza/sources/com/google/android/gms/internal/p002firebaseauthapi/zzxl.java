package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzakg;

/* loaded from: classes.dex */
public final class zzxl extends zzakg<zzxl, zza> implements zzalp {
    private static final zzxl zzc;
    private static volatile zzalw<zzxl> zzd;
    private int zze;

    public static final class zza extends zzakg.zzb<zzxl, zza> implements zzalp {
        private zza() {
            super(zzxl.zzc);
        }

        public final zza zza(int i10) {
            zzg();
            ((zzxl) this.zza).zze = i10;
            return this;
        }
    }

    static {
        zzxl zzxlVar = new zzxl();
        zzc = zzxlVar;
        zzakg.zza((Class<zzxl>) zzxl.class, zzxlVar);
    }

    private zzxl() {
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    public static zzxl zzd() {
        return zzc;
    }

    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
    public final Object zza(int i10, Object obj, Object obj2) {
        switch (zzxn.zza[i10 - 1]) {
            case 1:
                return new zzxl();
            case 2:
                return new zza();
            case 3:
                return zzakg.zza(zzc, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
            case 4:
                return zzc;
            case 5:
                zzalw<zzxl> zzalwVar = zzd;
                if (zzalwVar == null) {
                    synchronized (zzxl.class) {
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
}
