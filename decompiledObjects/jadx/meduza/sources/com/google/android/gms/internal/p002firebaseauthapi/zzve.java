package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzakg;

/* loaded from: classes.dex */
public final class zzve extends zzakg<zzve, zza> implements zzalp {
    private static final zzve zzc;
    private static volatile zzalw<zzve> zzd;
    private int zze;
    private zzvh zzf;
    private int zzg;
    private int zzh;

    public static final class zza extends zzakg.zzb<zzve, zza> implements zzalp {
        private zza() {
            super(zzve.zzc);
        }

        public final zza zza(int i10) {
            zzg();
            ((zzve) this.zza).zzg = i10;
            return this;
        }

        public final zza zza(zzvh zzvhVar) {
            zzg();
            zzve.zza((zzve) this.zza, zzvhVar);
            return this;
        }
    }

    static {
        zzve zzveVar = new zzve();
        zzc = zzveVar;
        zzakg.zza((Class<zzve>) zzve.class, zzveVar);
    }

    private zzve() {
    }

    public static zzve zza(zzaiw zzaiwVar, zzajv zzajvVar) {
        return (zzve) zzakg.zza(zzc, zzaiwVar, zzajvVar);
    }

    public static /* synthetic */ void zza(zzve zzveVar, zzvh zzvhVar) {
        zzvhVar.getClass();
        zzveVar.zzf = zzvhVar;
        zzveVar.zze |= 1;
    }

    public static zza zzc() {
        return zzc.zzm();
    }

    public static zzve zze() {
        return zzc;
    }

    public final int zza() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
    public final Object zza(int i10, Object obj, Object obj2) {
        switch (zzvg.zza[i10 - 1]) {
            case 1:
                return new zzve();
            case 2:
                return new zza();
            case 3:
                return zzakg.zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzalw<zzve> zzalwVar = zzd;
                if (zzalwVar == null) {
                    synchronized (zzve.class) {
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

    public final int zzb() {
        return this.zzh;
    }

    public final zzvh zzf() {
        zzvh zzvhVar = this.zzf;
        return zzvhVar == null ? zzvh.zze() : zzvhVar;
    }
}
