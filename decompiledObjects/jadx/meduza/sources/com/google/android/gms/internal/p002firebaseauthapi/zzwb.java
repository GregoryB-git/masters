package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzakg;

/* loaded from: classes.dex */
public final class zzwb extends zzakg<zzwb, zzb> implements zzalp {
    private static final zzwb zzc;
    private static volatile zzalw<zzwb> zzd;
    private String zze = "";
    private zzaiw zzf = zzaiw.zza;
    private int zzg;

    public enum zza implements zzakl {
        UNKNOWN_KEYMATERIAL(0),
        SYMMETRIC(1),
        ASYMMETRIC_PRIVATE(2),
        ASYMMETRIC_PUBLIC(3),
        REMOTE(4),
        UNRECOGNIZED(-1);

        private final int zzh;

        zza(int i10) {
            this.zzh = i10;
        }

        public static zza zza(int i10) {
            if (i10 == 0) {
                return UNKNOWN_KEYMATERIAL;
            }
            if (i10 == 1) {
                return SYMMETRIC;
            }
            if (i10 == 2) {
                return ASYMMETRIC_PRIVATE;
            }
            if (i10 == 3) {
                return ASYMMETRIC_PUBLIC;
            }
            if (i10 != 4) {
                return null;
            }
            return REMOTE;
        }

        @Override // java.lang.Enum
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("<");
            sb2.append(zza.class.getName());
            sb2.append('@');
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            if (this != UNRECOGNIZED) {
                sb2.append(" number=");
                sb2.append(zza());
            }
            sb2.append(" name=");
            sb2.append(name());
            sb2.append('>');
            return sb2.toString();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakl
        public final int zza() {
            if (this != UNRECOGNIZED) {
                return this.zzh;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    public static final class zzb extends zzakg.zzb<zzwb, zzb> implements zzalp {
        private zzb() {
            super(zzwb.zzc);
        }

        public final zzb zza(zzaiw zzaiwVar) {
            zzg();
            zzwb.zza((zzwb) this.zza, zzaiwVar);
            return this;
        }

        public final zzb zza(zza zzaVar) {
            zzg();
            zzwb.zza((zzwb) this.zza, zzaVar);
            return this;
        }

        public final zzb zza(String str) {
            zzg();
            zzwb.zza((zzwb) this.zza, str);
            return this;
        }
    }

    static {
        zzwb zzwbVar = new zzwb();
        zzc = zzwbVar;
        zzakg.zza((Class<zzwb>) zzwb.class, zzwbVar);
    }

    private zzwb() {
    }

    public static zzb zza() {
        return zzc.zzm();
    }

    public static /* synthetic */ void zza(zzwb zzwbVar, zzaiw zzaiwVar) {
        zzaiwVar.getClass();
        zzwbVar.zzf = zzaiwVar;
    }

    public static /* synthetic */ void zza(zzwb zzwbVar, zza zzaVar) {
        zzwbVar.zzg = zzaVar.zza();
    }

    public static /* synthetic */ void zza(zzwb zzwbVar, String str) {
        str.getClass();
        zzwbVar.zze = str;
    }

    public static zzwb zzd() {
        return zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
    public final Object zza(int i10, Object obj, Object obj2) {
        switch (zzwa.zza[i10 - 1]) {
            case 1:
                return new zzwb();
            case 2:
                return new zzb();
            case 3:
                return zzakg.zza(zzc, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzalw<zzwb> zzalwVar = zzd;
                if (zzalwVar == null) {
                    synchronized (zzwb.class) {
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

    public final zza zzb() {
        zza zza2 = zza.zza(this.zzg);
        return zza2 == null ? zza.UNRECOGNIZED : zza2;
    }

    public final zzaiw zze() {
        return this.zzf;
    }

    public final String zzf() {
        return this.zze;
    }
}
