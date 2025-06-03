package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzqs;
import defpackage.f;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzql extends zzqv {
    private final zzqs zza;
    private final zzzo zzb;
    private final zzzn zzc;
    private final Integer zzd;

    public static class zza {
        private zzqs zza;
        private zzzo zzb;
        private Integer zzc;

        private zza() {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
        }

        public final zza zza(zzqs zzqsVar) {
            this.zza = zzqsVar;
            return this;
        }

        public final zza zza(zzzo zzzoVar) {
            this.zzb = zzzoVar;
            return this;
        }

        public final zza zza(Integer num) {
            this.zzc = num;
            return this;
        }

        public final zzql zza() {
            zzzn zza;
            zzqs zzqsVar = this.zza;
            if (zzqsVar == null || this.zzb == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (zzqsVar.zzc() != this.zzb.zza()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.zza.zza() && this.zzc == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.zza.zza() && this.zzc != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            if (this.zza.zzf() == zzqs.zzc.zzd) {
                zza = zzor.zza;
            } else if (this.zza.zzf() == zzqs.zzc.zzc || this.zza.zzf() == zzqs.zzc.zzb) {
                zza = zzor.zza(this.zzc.intValue());
            } else {
                if (this.zza.zzf() != zzqs.zzc.zza) {
                    throw new IllegalStateException(f.j("Unknown HmacParameters.Variant: ", String.valueOf(this.zza.zzf())));
                }
                zza = zzor.zzb(this.zzc.intValue());
            }
            return new zzql(this.zza, this.zzb, zza, this.zzc);
        }
    }

    private zzql(zzqs zzqsVar, zzzo zzzoVar, zzzn zzznVar, Integer num) {
        this.zza = zzqsVar;
        this.zzb = zzzoVar;
        this.zzc = zzznVar;
        this.zzd = num;
    }

    public static zza zzb() {
        return new zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbo
    public final Integer zza() {
        return this.zzd;
    }

    public final zzqs zzc() {
        return this.zza;
    }

    public final zzzn zzd() {
        return this.zzc;
    }

    public final zzzo zze() {
        return this.zzb;
    }
}
