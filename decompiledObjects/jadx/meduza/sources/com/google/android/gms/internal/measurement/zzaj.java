package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class zzaj implements zzaq {
    private final zzaq zza;
    private final String zzb;

    public zzaj() {
        this.zza = zzaq.zzc;
        this.zzb = "return";
    }

    public zzaj(String str) {
        this.zza = zzaq.zzc;
        this.zzb = str;
    }

    public zzaj(String str, zzaq zzaqVar) {
        this.zza = zzaqVar;
        this.zzb = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzaj)) {
            return false;
        }
        zzaj zzajVar = (zzaj) obj;
        return this.zzb.equals(zzajVar.zzb) && this.zza.equals(zzajVar.zza);
    }

    public final int hashCode() {
        return this.zza.hashCode() + (this.zzb.hashCode() * 31);
    }

    public final zzaq zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final zzaq zza(String str, zzh zzhVar, List<zzaq> list) {
        throw new IllegalStateException("Control does not have functions");
    }

    public final String zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final zzaq zzc() {
        return new zzaj(this.zzb, this.zza.zzc());
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Boolean zzd() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Double zze() {
        throw new IllegalStateException("Control is not a double");
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final String zzf() {
        throw new IllegalStateException("Control is not a String");
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Iterator<zzaq> zzh() {
        return null;
    }
}
