package com.google.android.gms.internal.p002firebaseauthapi;

import a0.j;
import com.google.android.gms.internal.p002firebaseauthapi.zzdc;
import com.google.android.gms.internal.p002firebaseauthapi.zzdr;
import com.google.android.gms.internal.p002firebaseauthapi.zzit;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzjq extends zzkt {
    private static final Set<zzcg> zza = (Set) zzpw.zza(new zzpz() { // from class: com.google.android.gms.internal.firebase-auth-api.zzjp
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpz
        public final Object zza() {
            return zzjq.zzj();
        }
    });
    private final zza zzb;
    private final zzd zzc;
    private final zzc zzd;
    private final zze zze;
    private final zzcg zzf;
    private final zzzn zzg;

    public static final class zza {
        public static final zza zza = new zza("NIST_P256");
        public static final zza zzb = new zza("NIST_P384");
        public static final zza zzc = new zza("NIST_P521");
        public static final zza zzd = new zza("X25519");
        private final String zze;

        private zza(String str) {
            this.zze = str;
        }

        public final String toString() {
            return this.zze;
        }
    }

    public static final class zzb {
        private zza zza;
        private zzd zzb;
        private zzc zzc;
        private zzcg zzd;
        private zze zze;
        private zzzn zzf;

        private zzb() {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
            this.zzd = null;
            this.zze = zze.zzc;
            this.zzf = null;
        }

        public final zzb zza(zzcg zzcgVar) {
            if (!zzjq.zza.contains(zzcgVar)) {
                throw new GeneralSecurityException(j.j("Invalid DEM parameters ", String.valueOf(zzcgVar), "; only AES128_GCM_RAW, AES256_GCM_RAW, AES128_CTR_HMAC_SHA256_RAW, AES256_CTR_HMAC_SHA256_RAW XCHACHA20_POLY1305_RAW and AES256_SIV_RAW are currently supported."));
            }
            this.zzd = zzcgVar;
            return this;
        }

        public final zzb zza(zza zzaVar) {
            this.zza = zzaVar;
            return this;
        }

        public final zzb zza(zzc zzcVar) {
            this.zzc = zzcVar;
            return this;
        }

        public final zzb zza(zzd zzdVar) {
            this.zzb = zzdVar;
            return this;
        }

        public final zzb zza(zze zzeVar) {
            this.zze = zzeVar;
            return this;
        }

        public final zzb zza(zzzn zzznVar) {
            if (zzznVar.zza() == 0) {
                this.zzf = null;
                return this;
            }
            this.zzf = zzznVar;
            return this;
        }

        public final zzjq zza() {
            zza zzaVar = this.zza;
            if (zzaVar == null) {
                throw new GeneralSecurityException("Elliptic curve type is not set");
            }
            if (this.zzb == null) {
                throw new GeneralSecurityException("Hash type is not set");
            }
            if (this.zzd == null) {
                throw new GeneralSecurityException("DEM parameters are not set");
            }
            if (this.zze == null) {
                throw new GeneralSecurityException("Variant is not set");
            }
            zza zzaVar2 = zza.zzd;
            if (zzaVar != zzaVar2 && this.zzc == null) {
                throw new GeneralSecurityException("Point format is not set");
            }
            if (zzaVar != zzaVar2 || this.zzc == null) {
                return new zzjq(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf);
            }
            throw new GeneralSecurityException("For Curve25519 point format must not be set");
        }
    }

    public static final class zzc {
        public static final zzc zza = new zzc("COMPRESSED");
        public static final zzc zzb = new zzc("UNCOMPRESSED");
        public static final zzc zzc = new zzc("LEGACY_UNCOMPRESSED");
        private final String zzd;

        private zzc(String str) {
            this.zzd = str;
        }

        public final String toString() {
            return this.zzd;
        }
    }

    public static final class zzd {
        public static final zzd zza = new zzd("SHA1");
        public static final zzd zzb = new zzd("SHA224");
        public static final zzd zzc = new zzd("SHA256");
        public static final zzd zzd = new zzd("SHA384");
        public static final zzd zze = new zzd("SHA512");
        private final String zzf;

        private zzd(String str) {
            this.zzf = str;
        }

        public final String toString() {
            return this.zzf;
        }
    }

    public static final class zze {
        public static final zze zza = new zze("TINK");
        public static final zze zzb = new zze("CRUNCHY");
        public static final zze zzc = new zze("NO_PREFIX");
        private final String zzd;

        private zze(String str) {
            this.zzd = str;
        }

        public final String toString() {
            return this.zzd;
        }
    }

    private zzjq(zza zzaVar, zzd zzdVar, zzc zzcVar, zzcg zzcgVar, zze zzeVar, zzzn zzznVar) {
        this.zzb = zzaVar;
        this.zzc = zzdVar;
        this.zzd = zzcVar;
        this.zzf = zzcgVar;
        this.zze = zzeVar;
        this.zzg = zzznVar;
    }

    public static zzb zzc() {
        return new zzb();
    }

    public static /* synthetic */ Set zzj() {
        HashSet hashSet = new HashSet();
        zzdr.zzb zzc2 = zzdr.zze().zza(12).zzb(16).zzc(16);
        zzdr.zza zzaVar = zzdr.zza.zzc;
        hashSet.add(zzc2.zza(zzaVar).zza());
        hashSet.add(zzdr.zze().zza(12).zzb(32).zzc(16).zza(zzaVar).zza());
        zzdc.zzb zzc3 = zzdc.zzf().zza(16).zzb(32).zzd(16).zzc(16);
        zzdc.zza zzaVar2 = zzdc.zza.zzc;
        zzdc.zzb zza2 = zzc3.zza(zzaVar2);
        zzdc.zzc zzcVar = zzdc.zzc.zzc;
        hashSet.add(zza2.zza(zzcVar).zza());
        hashSet.add(zzdc.zzf().zza(32).zzb(32).zzd(32).zzc(16).zza(zzaVar2).zza(zzcVar).zza());
        hashSet.add(zzfy.zzc());
        hashSet.add(zzit.zzc().zza(64).zza(zzit.zza.zzc).zza());
        return Collections.unmodifiableSet(hashSet);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzjq)) {
            return false;
        }
        zzjq zzjqVar = (zzjq) obj;
        return Objects.equals(zzjqVar.zzb, this.zzb) && Objects.equals(zzjqVar.zzc, this.zzc) && Objects.equals(zzjqVar.zzd, this.zzd) && Objects.equals(zzjqVar.zzf, this.zzf) && Objects.equals(zzjqVar.zze, this.zze) && Objects.equals(zzjqVar.zzg, this.zzg);
    }

    public final int hashCode() {
        return Objects.hash(zzjq.class, this.zzb, this.zzc, this.zzd, this.zzf, this.zze, this.zzg);
    }

    public final String toString() {
        return String.format("EciesParameters(curveType=%s, hashType=%s, pointFormat=%s, demParameters=%s, variant=%s, salt=%s)", this.zzb, this.zzc, this.zzd, this.zzf, this.zze, this.zzg);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcg
    public final boolean zza() {
        return this.zze != zze.zzc;
    }

    public final zzcg zzb() {
        return this.zzf;
    }

    public final zza zzd() {
        return this.zzb;
    }

    public final zzd zze() {
        return this.zzc;
    }

    public final zzc zzf() {
        return this.zzd;
    }

    public final zze zzg() {
        return this.zze;
    }

    public final zzzn zzh() {
        return this.zzg;
    }
}
