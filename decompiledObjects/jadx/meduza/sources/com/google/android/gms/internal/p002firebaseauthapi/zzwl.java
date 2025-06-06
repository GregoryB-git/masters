package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzakg;
import com.google.android.gms.internal.p002firebaseauthapi.zzwb;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes.dex */
public final class zzwl extends zzakg<zzwl, zzb> implements zzalp {
    private static final zzwl zzc;
    private static volatile zzalw<zzwl> zzd;
    private int zze;
    private zzakn<zza> zzf = zzakg.zzp();

    public static final class zza extends zzakg<zza, C0043zza> implements zzalp {
        private static final zza zzc;
        private static volatile zzalw<zza> zzd;
        private int zze;
        private zzwb zzf;
        private int zzg;
        private int zzh;
        private int zzi;

        /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwl$zza$zza, reason: collision with other inner class name */
        public static final class C0043zza extends zzakg.zzb<zza, C0043zza> implements zzalp {
            private C0043zza() {
                super(zza.zzc);
            }

            public final C0043zza zza(int i10) {
                zzg();
                ((zza) this.zza).zzh = i10;
                return this;
            }

            public final C0043zza zza(zzwb.zzb zzbVar) {
                zzg();
                zza.zza((zza) this.zza, (zzwb) ((zzakg) zzbVar.zze()));
                return this;
            }

            public final C0043zza zza(zzwb zzwbVar) {
                zzg();
                zza.zza((zza) this.zza, zzwbVar);
                return this;
            }

            public final C0043zza zza(zzwc zzwcVar) {
                zzg();
                zza.zza((zza) this.zza, zzwcVar);
                return this;
            }

            public final C0043zza zza(zzxd zzxdVar) {
                zzg();
                zza.zza((zza) this.zza, zzxdVar);
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

        public static /* synthetic */ void zza(zza zzaVar, zzwb zzwbVar) {
            zzwbVar.getClass();
            zzaVar.zzf = zzwbVar;
            zzaVar.zze |= 1;
        }

        public static /* synthetic */ void zza(zza zzaVar, zzwc zzwcVar) {
            zzaVar.zzg = zzwcVar.zza();
        }

        public static /* synthetic */ void zza(zza zzaVar, zzxd zzxdVar) {
            zzaVar.zzi = zzxdVar.zza();
        }

        public static C0043zza zzd() {
            return zzc.zzm();
        }

        public final int zza() {
            return this.zzh;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final Object zza(int i10, Object obj, Object obj2) {
            switch (zzwk.zza[i10 - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0043zza();
                case 3:
                    return zzakg.zza(zzc, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
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

        public final zzwb zzb() {
            zzwb zzwbVar = this.zzf;
            return zzwbVar == null ? zzwb.zzd() : zzwbVar;
        }

        public final zzwc zzc() {
            zzwc zza = zzwc.zza(this.zzg);
            return zza == null ? zzwc.UNRECOGNIZED : zza;
        }

        public final zzxd zzf() {
            zzxd zza = zzxd.zza(this.zzi);
            return zza == null ? zzxd.UNRECOGNIZED : zza;
        }

        public final boolean zzg() {
            return (this.zze & 1) != 0;
        }
    }

    public static final class zzb extends zzakg.zzb<zzwl, zzb> implements zzalp {
        private zzb() {
            super(zzwl.zzc);
        }

        public final zzb zza(int i10) {
            zzg();
            ((zzwl) this.zza).zze = i10;
            return this;
        }

        public final zzb zza(zza zzaVar) {
            zzg();
            zzwl.zza((zzwl) this.zza, zzaVar);
            return this;
        }
    }

    static {
        zzwl zzwlVar = new zzwl();
        zzc = zzwlVar;
        zzakg.zza((Class<zzwl>) zzwl.class, zzwlVar);
    }

    private zzwl() {
    }

    public static zzwl zza(InputStream inputStream, zzajv zzajvVar) {
        return (zzwl) zzakg.zza(zzc, inputStream, zzajvVar);
    }

    public static zzwl zza(byte[] bArr, zzajv zzajvVar) {
        return (zzwl) zzakg.zza(zzc, bArr, zzajvVar);
    }

    public static /* synthetic */ void zza(zzwl zzwlVar, zza zzaVar) {
        zzaVar.getClass();
        zzakn<zza> zzaknVar = zzwlVar.zzf;
        if (!zzaknVar.zzc()) {
            zzwlVar.zzf = zzakg.zza(zzaknVar);
        }
        zzwlVar.zzf.add(zzaVar);
    }

    public static zzb zzc() {
        return zzc.zzm();
    }

    public final int zza() {
        return this.zzf.size();
    }

    public final zza zza(int i10) {
        return this.zzf.get(i10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
    public final Object zza(int i10, Object obj, Object obj2) {
        switch (zzwk.zza[i10 - 1]) {
            case 1:
                return new zzwl();
            case 2:
                return new zzb();
            case 3:
                return zzakg.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", zza.class});
            case 4:
                return zzc;
            case 5:
                zzalw<zzwl> zzalwVar = zzd;
                if (zzalwVar == null) {
                    synchronized (zzwl.class) {
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
        return this.zze;
    }

    public final List<zza> zze() {
        return this.zzf;
    }
}
