package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzju extends zzkt {
    private final zzd zza;
    private final zze zzb;
    private final zza zzc;
    private final zzf zzd;

    public static final class zza extends zzc {
        public static final zza zza = new zza("AES_128_GCM", 1);
        public static final zza zzb = new zza("AES_256_GCM", 2);
        public static final zza zzc = new zza("CHACHA20_POLY1305", 3);

        private zza(String str, int i10) {
            super(str, i10);
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzju.zzc
        public final /* bridge */ /* synthetic */ String toString() {
            return super.toString();
        }
    }

    public static final class zzb {
        private zzd zza;
        private zze zzb;
        private zza zzc;
        private zzf zzd;

        private zzb() {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
            this.zzd = zzf.zzc;
        }

        public final zzb zza(zza zzaVar) {
            this.zzc = zzaVar;
            return this;
        }

        public final zzb zza(zzd zzdVar) {
            this.zza = zzdVar;
            return this;
        }

        public final zzb zza(zze zzeVar) {
            this.zzb = zzeVar;
            return this;
        }

        public final zzb zza(zzf zzfVar) {
            this.zzd = zzfVar;
            return this;
        }

        public final zzju zza() {
            zzd zzdVar = this.zza;
            if (zzdVar == null) {
                throw new GeneralSecurityException("HPKE KEM parameter is not set");
            }
            zze zzeVar = this.zzb;
            if (zzeVar == null) {
                throw new GeneralSecurityException("HPKE KDF parameter is not set");
            }
            zza zzaVar = this.zzc;
            if (zzaVar == null) {
                throw new GeneralSecurityException("HPKE AEAD parameter is not set");
            }
            zzf zzfVar = this.zzd;
            if (zzfVar != null) {
                return new zzju(zzdVar, zzeVar, zzaVar, zzfVar);
            }
            throw new GeneralSecurityException("HPKE variant is not set");
        }
    }

    public static class zzc {
        private final String zza;
        private final int zzb;

        private zzc(String str, int i10) {
            this.zza = str;
            this.zzb = i10;
        }

        public String toString() {
            return String.format("%s(0x%04x)", this.zza, Integer.valueOf(this.zzb));
        }
    }

    public static final class zzd extends zzc {
        public static final zzd zza = new zzd("DHKEM_P256_HKDF_SHA256", 16);
        public static final zzd zzb = new zzd("DHKEM_P384_HKDF_SHA384", 17);
        public static final zzd zzc = new zzd("DHKEM_P521_HKDF_SHA512", 18);
        public static final zzd zzd = new zzd("DHKEM_X25519_HKDF_SHA256", 32);

        private zzd(String str, int i10) {
            super(str, i10);
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzju.zzc
        public final /* bridge */ /* synthetic */ String toString() {
            return super.toString();
        }
    }

    public static final class zze extends zzc {
        public static final zze zza = new zze("HKDF_SHA256", 1);
        public static final zze zzb = new zze("HKDF_SHA384", 2);
        public static final zze zzc = new zze("HKDF_SHA512", 3);

        private zze(String str, int i10) {
            super(str, i10);
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzju.zzc
        public final /* bridge */ /* synthetic */ String toString() {
            return super.toString();
        }
    }

    public static final class zzf {
        public static final zzf zza = new zzf("TINK");
        public static final zzf zzb = new zzf("CRUNCHY");
        public static final zzf zzc = new zzf("NO_PREFIX");
        private final String zzd;

        private zzf(String str) {
            this.zzd = str;
        }

        public final String toString() {
            return this.zzd;
        }
    }

    private zzju(zzd zzdVar, zze zzeVar, zza zzaVar, zzf zzfVar) {
        this.zza = zzdVar;
        this.zzb = zzeVar;
        this.zzc = zzaVar;
        this.zzd = zzfVar;
    }

    public static zzb zzc() {
        return new zzb();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzju)) {
            return false;
        }
        zzju zzjuVar = (zzju) obj;
        return this.zza == zzjuVar.zza && this.zzb == zzjuVar.zzb && this.zzc == zzjuVar.zzc && this.zzd == zzjuVar.zzd;
    }

    public final int hashCode() {
        return Objects.hash(zzju.class, this.zza, this.zzb, this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcg
    public final boolean zza() {
        return this.zzd != zzf.zzc;
    }

    public final zza zzb() {
        return this.zzc;
    }

    public final zze zzd() {
        return this.zzb;
    }

    public final zzd zze() {
        return this.zza;
    }

    public final zzf zzf() {
        return this.zzd;
    }
}
