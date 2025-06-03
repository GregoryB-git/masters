package com.google.android.gms.internal.p002firebaseauthapi;

import a0.j;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzeg extends zzcr {
    private final zza zza;

    public static final class zza {
        public static final zza zza = new zza("TINK");
        public static final zza zzb = new zza("CRUNCHY");
        public static final zza zzc = new zza("NO_PREFIX");
        private final String zzd;

        private zza(String str) {
            this.zzd = str;
        }

        public final String toString() {
            return this.zzd;
        }
    }

    private zzeg(zza zzaVar) {
        this.zza = zzaVar;
    }

    public static zzeg zza(zza zzaVar) {
        return new zzeg(zzaVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzeg) && ((zzeg) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Objects.hash(zzeg.class, this.zza);
    }

    public final String toString() {
        return j.j("ChaCha20Poly1305 Parameters (variant: ", String.valueOf(this.zza), ")");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcg
    public final boolean zza() {
        return this.zza != zza.zzc;
    }

    public final zza zzb() {
        return this.zza;
    }
}
