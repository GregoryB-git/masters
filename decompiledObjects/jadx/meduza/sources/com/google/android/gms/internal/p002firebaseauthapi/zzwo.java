package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzakg;

/* loaded from: classes.dex */
public final class zzwo extends zzakg<zzwo, zzb> implements zzalp {
    private static final zzwo zzc;
    private static volatile zzalw<zzwo> zzd;
    private int zze;
    private zzakn<zza> zzf = zzakg.zzp();

    public static final class zza extends zzakg<zza, C0044zza> implements zzalp {
        private static final zza zzc;
        private static volatile zzalw<zza> zzd;
        private String zze = "";
        private int zzf;
        private int zzg;
        private int zzh;

        /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwo$zza$zza, reason: collision with other inner class name */
        public static final class C0044zza extends zzakg.zzb<zza, C0044zza> implements zzalp {
            private C0044zza() {
                super(zza.zzc);
            }

            public final C0044zza zza(int i10) {
                zzg();
                ((zza) this.zza).zzg = i10;
                return this;
            }

            public final C0044zza zza(zzwc zzwcVar) {
                zzg();
                zza.zza((zza) this.zza, zzwcVar);
                return this;
            }

            public final C0044zza zza(zzxd zzxdVar) {
                zzg();
                zza.zza((zza) this.zza, zzxdVar);
                return this;
            }

            public final C0044zza zza(String str) {
                zzg();
                zza.zza((zza) this.zza, str);
                return this;
            }
        }

        static {
            zza zzaVar = new zza();
            zzc = zzaVar;
            zzakg.zza((Class<zza>) zza.class, zzaVar);
        }

        private zza() {
        }

        public static C0044zza zza() {
            return zzc.zzm();
        }

        public static /* synthetic */ void zza(zza zzaVar, zzwc zzwcVar) {
            zzaVar.zzf = zzwcVar.zza();
        }

        public static /* synthetic */ void zza(zza zzaVar, zzxd zzxdVar) {
            zzaVar.zzh = zzxdVar.zza();
        }

        public static /* synthetic */ void zza(zza zzaVar, String str) {
            str.getClass();
            zzaVar.zze = str;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final Object zza(int i10, Object obj, Object obj2) {
            switch (zzwn.zza[i10 - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0044zza();
                case 3:
                    return zzakg.zza(zzc, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
                case 4:
                    return zzc;
                case 5:
                    zzalw<zza> zzalwVar = zzd;
                    if (zzalwVar == null) {
                        synchronized (zza.class) {
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

    public static final class zzb extends zzakg.zzb<zzwo, zzb> implements zzalp {
        private zzb() {
            super(zzwo.zzc);
        }

        public final zzb zza(int i10) {
            zzg();
            ((zzwo) this.zza).zze = i10;
            return this;
        }

        public final zzb zza(zza zzaVar) {
            zzg();
            zzwo.zza((zzwo) this.zza, zzaVar);
            return this;
        }
    }

    static {
        zzwo zzwoVar = new zzwo();
        zzc = zzwoVar;
        zzakg.zza((Class<zzwo>) zzwo.class, zzwoVar);
    }

    private zzwo() {
    }

    public static zzb zza() {
        return zzc.zzm();
    }

    public static /* synthetic */ void zza(zzwo zzwoVar, zza zzaVar) {
        zzaVar.getClass();
        zzakn<zza> zzaknVar = zzwoVar.zzf;
        if (!zzaknVar.zzc()) {
            zzwoVar.zzf = zzakg.zza(zzaknVar);
        }
        zzwoVar.zzf.add(zzaVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
    public final Object zza(int i10, Object obj, Object obj2) {
        switch (zzwn.zza[i10 - 1]) {
            case 1:
                return new zzwo();
            case 2:
                return new zzb();
            case 3:
                return zzakg.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", zza.class});
            case 4:
                return zzc;
            case 5:
                zzalw<zzwo> zzalwVar = zzd;
                if (zzalwVar == null) {
                    synchronized (zzwo.class) {
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
