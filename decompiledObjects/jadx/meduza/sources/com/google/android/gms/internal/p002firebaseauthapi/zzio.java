package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzit;
import defpackage.f;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzio extends zziy {
    private final zzit zza;
    private final zzzo zzb;
    private final zzzn zzc;
    private final Integer zzd;

    public static class zza {
        private zzit zza;
        private zzzo zzb;
        private Integer zzc;

        private zza() {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
        }

        public final zza zza(zzit zzitVar) {
            this.zza = zzitVar;
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

        public final zzio zza() {
            zzzn zzb;
            zzit zzitVar = this.zza;
            if (zzitVar == null || this.zzb == null) {
                throw new IllegalArgumentException("Cannot build without parameters and/or key material");
            }
            if (zzitVar.zzb() != this.zzb.zza()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.zza.zza() && this.zzc == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.zza.zza() && this.zzc != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            if (this.zza.zzd() == zzit.zza.zzc) {
                zzb = zzor.zza;
            } else if (this.zza.zzd() == zzit.zza.zzb) {
                zzb = zzor.zza(this.zzc.intValue());
            } else {
                if (this.zza.zzd() != zzit.zza.zza) {
                    throw new IllegalStateException(f.j("Unknown AesSivParameters.Variant: ", String.valueOf(this.zza.zzd())));
                }
                zzb = zzor.zzb(this.zzc.intValue());
            }
            return new zzio(this.zza, this.zzb, zzb, this.zzc);
        }
    }

    private zzio(zzit zzitVar, zzzo zzzoVar, zzzn zzznVar, Integer num) {
        this.zza = zzitVar;
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

    public final zzit zzc() {
        return this.zza;
    }

    public final zzzn zzd() {
        return this.zzc;
    }

    public final zzzo zze() {
        return this.zzb;
    }
}
