package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzdr;
import defpackage.f;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzdm extends zzcp {
    private final zzdr zza;
    private final zzzo zzb;
    private final zzzn zzc;
    private final Integer zzd;

    public static class zza {
        private zzdr zza;
        private zzzo zzb;
        private Integer zzc;

        private zza() {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
        }

        public final zza zza(zzdr zzdrVar) {
            this.zza = zzdrVar;
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

        public final zzdm zza() {
            zzzn zzb;
            zzdr zzdrVar = this.zza;
            if (zzdrVar == null || this.zzb == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (zzdrVar.zzc() != this.zzb.zza()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.zza.zza() && this.zzc == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.zza.zza() && this.zzc != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            if (this.zza.zzf() == zzdr.zza.zzc) {
                zzb = zzor.zza;
            } else if (this.zza.zzf() == zzdr.zza.zzb) {
                zzb = zzor.zza(this.zzc.intValue());
            } else {
                if (this.zza.zzf() != zzdr.zza.zza) {
                    throw new IllegalStateException(f.j("Unknown AesGcmParameters.Variant: ", String.valueOf(this.zza.zzf())));
                }
                zzb = zzor.zzb(this.zzc.intValue());
            }
            return new zzdm(this.zza, this.zzb, zzb, this.zzc);
        }
    }

    private zzdm(zzdr zzdrVar, zzzo zzzoVar, zzzn zzznVar, Integer num) {
        this.zza = zzdrVar;
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

    public final zzdr zzc() {
        return this.zza;
    }

    public final zzzn zzd() {
        return this.zzc;
    }

    public final zzzo zze() {
        return this.zzb;
    }
}
