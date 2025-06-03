package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzakg;

/* loaded from: classes.dex */
public final class zzvb extends zzakg<zzvb, zza> implements zzalp {
    private static final zzvb zzc;
    private static volatile zzalw<zzvb> zzd;
    private int zze;
    private int zzf;
    private zzvh zzg;
    private zzaiw zzh = zzaiw.zza;

    public static final class zza extends zzakg.zzb<zzvb, zza> implements zzalp {
        private zza() {
            super(zzvb.zzc);
        }

        public final zza zza(zzaiw zzaiwVar) {
            zzg();
            zzvb.zza((zzvb) this.zza, zzaiwVar);
            return this;
        }

        public final zza zza(zzvh zzvhVar) {
            zzg();
            zzvb.zza((zzvb) this.zza, zzvhVar);
            return this;
        }
    }

    static {
        zzvb zzvbVar = new zzvb();
        zzc = zzvbVar;
        zzakg.zza((Class<zzvb>) zzvb.class, zzvbVar);
    }

    private zzvb() {
    }

    public static zzvb zza(zzaiw zzaiwVar, zzajv zzajvVar) {
        return (zzvb) zzakg.zza(zzc, zzaiwVar, zzajvVar);
    }

    public static /* synthetic */ void zza(zzvb zzvbVar, zzaiw zzaiwVar) {
        zzaiwVar.getClass();
        zzvbVar.zzh = zzaiwVar;
    }

    public static /* synthetic */ void zza(zzvb zzvbVar, zzvh zzvhVar) {
        zzvhVar.getClass();
        zzvbVar.zzg = zzvhVar;
        zzvbVar.zze |= 1;
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    public static zzvb zzd() {
        return zzc;
    }

    public static zzalw<zzvb> zzg() {
        return (zzalw) zzc.zza(zzakg.zze.zzg, (Object) null, (Object) null);
    }

    public final int zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
    public final Object zza(int i10, Object obj, Object obj2) {
        switch (zzvd.zza[i10 - 1]) {
            case 1:
                return new zzvb();
            case 2:
                return new zza();
            case 3:
                return zzakg.zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzalw<zzvb> zzalwVar = zzd;
                if (zzalwVar == null) {
                    synchronized (zzvb.class) {
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

    public final zzvh zze() {
        zzvh zzvhVar = this.zzg;
        return zzvhVar == null ? zzvh.zze() : zzvhVar;
    }

    public final zzaiw zzf() {
        return this.zzh;
    }
}
