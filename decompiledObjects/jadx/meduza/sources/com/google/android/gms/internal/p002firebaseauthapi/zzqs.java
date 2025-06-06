package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzqs extends zzqy {
    private final int zza;
    private final int zzb;
    private final zzc zzc;
    private final zza zzd;

    public static final class zza {
        public static final zza zza = new zza("SHA1");
        public static final zza zzb = new zza("SHA224");
        public static final zza zzc = new zza("SHA256");
        public static final zza zzd = new zza("SHA384");
        public static final zza zze = new zza("SHA512");
        private final String zzf;

        private zza(String str) {
            this.zzf = str;
        }

        public final String toString() {
            return this.zzf;
        }
    }

    public static final class zzb {
        private Integer zza;
        private Integer zzb;
        private zza zzc;
        private zzc zzd;

        private zzb() {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
            this.zzd = zzc.zzd;
        }

        public final zzb zza(int i10) {
            this.zza = Integer.valueOf(i10);
            return this;
        }

        public final zzb zza(zza zzaVar) {
            this.zzc = zzaVar;
            return this;
        }

        public final zzb zza(zzc zzcVar) {
            this.zzd = zzcVar;
            return this;
        }

        public final zzqs zza() {
            Integer num = this.zza;
            if (num == null) {
                throw new GeneralSecurityException("key size is not set");
            }
            if (this.zzb == null) {
                throw new GeneralSecurityException("tag size is not set");
            }
            if (this.zzc == null) {
                throw new GeneralSecurityException("hash type is not set");
            }
            if (this.zzd == null) {
                throw new GeneralSecurityException("variant is not set");
            }
            if (num.intValue() < 16) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", this.zza));
            }
            int intValue = this.zzb.intValue();
            zza zzaVar = this.zzc;
            if (intValue < 10) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(intValue)));
            }
            if (zzaVar == zza.zza) {
                if (intValue > 20) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", Integer.valueOf(intValue)));
                }
            } else if (zzaVar == zza.zzb) {
                if (intValue > 28) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", Integer.valueOf(intValue)));
                }
            } else if (zzaVar == zza.zzc) {
                if (intValue > 32) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", Integer.valueOf(intValue)));
                }
            } else if (zzaVar == zza.zzd) {
                if (intValue > 48) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", Integer.valueOf(intValue)));
                }
            } else {
                if (zzaVar != zza.zze) {
                    throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
                }
                if (intValue > 64) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", Integer.valueOf(intValue)));
                }
            }
            return new zzqs(this.zza.intValue(), this.zzb.intValue(), this.zzd, this.zzc);
        }

        public final zzb zzb(int i10) {
            this.zzb = Integer.valueOf(i10);
            return this;
        }
    }

    public static final class zzc {
        public static final zzc zza = new zzc("TINK");
        public static final zzc zzb = new zzc("CRUNCHY");
        public static final zzc zzc = new zzc("LEGACY");
        public static final zzc zzd = new zzc("NO_PREFIX");
        private final String zze;

        private zzc(String str) {
            this.zze = str;
        }

        public final String toString() {
            return this.zze;
        }
    }

    private zzqs(int i10, int i11, zzc zzcVar, zza zzaVar) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = zzcVar;
        this.zzd = zzaVar;
    }

    public static zzb zzd() {
        return new zzb();
    }

    private final int zzg() {
        zzc zzcVar = this.zzc;
        if (zzcVar == zzc.zzd) {
            return this.zzb;
        }
        if (zzcVar == zzc.zza || zzcVar == zzc.zzb || zzcVar == zzc.zzc) {
            return this.zzb + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzqs)) {
            return false;
        }
        zzqs zzqsVar = (zzqs) obj;
        return zzqsVar.zza == this.zza && zzqsVar.zzg() == zzg() && zzqsVar.zzc == this.zzc && zzqsVar.zzd == this.zzd;
    }

    public final int hashCode() {
        return Objects.hash(zzqs.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    public final String toString() {
        return "HMAC Parameters (variant: " + String.valueOf(this.zzc) + ", hashType: " + String.valueOf(this.zzd) + ", " + this.zzb + "-byte tags, and " + this.zza + "-byte key)";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcg
    public final boolean zza() {
        return this.zzc != zzc.zzd;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zza;
    }

    public final zza zze() {
        return this.zzd;
    }

    public final zzc zzf() {
        return this.zzc;
    }
}
