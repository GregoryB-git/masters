package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzakg;

/* loaded from: classes.dex */
public final class zzsg extends zzakg<zzsg, zza> implements zzalp {
    private static final zzsg zzc;
    private static volatile zzalw<zzsg> zzd;
    private int zze;

    public static final class zza extends zzakg.zzb<zzsg, zza> implements zzalp {
        private zza() {
            super(zzsg.zzc);
        }

        public final zza zza(int i10) {
            zzg();
            ((zzsg) this.zza).zze = i10;
            return this;
        }
    }

    static {
        zzsg zzsgVar = new zzsg();
        zzc = zzsgVar;
        zzakg.zza((Class<zzsg>) zzsg.class, zzsgVar);
    }

    private zzsg() {
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    public static zzsg zzd() {
        return zzc;
    }

    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
    public final Object zza(int i10, Object obj, Object obj2) {
        switch (zzsf.zza[i10 - 1]) {
            case 1:
                return new zzsg();
            case 2:
                return new zza();
            case 3:
                return zzakg.zza(zzc, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
            case 4:
                return zzc;
            case 5:
                zzalw<zzsg> zzalwVar = zzd;
                if (zzalwVar == null) {
                    synchronized (zzsg.class) {
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
