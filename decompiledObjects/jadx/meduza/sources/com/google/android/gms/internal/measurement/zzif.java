package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import n7.e;

/* loaded from: classes.dex */
public final class zzif {
    public final String zza;
    public final Uri zzb;
    public final String zzc;
    public final String zzd;
    public final boolean zze;
    public final boolean zzf;
    public final boolean zzg;
    public final e<Context, Boolean> zzh;
    private final boolean zzi;

    public zzif(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }

    private zzif(String str, Uri uri, String str2, String str3, boolean z10, boolean z11, boolean z12, boolean z13, e<Context, Boolean> eVar) {
        this.zza = str;
        this.zzb = uri;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = z10;
        this.zzf = z11;
        this.zzi = z12;
        this.zzg = z13;
        this.zzh = eVar;
    }

    public final zzhx<Double> zza(String str, double d10) {
        return zzhx.zza(this, str, Double.valueOf(-3.0d), true);
    }

    public final zzhx<Long> zza(String str, long j10) {
        return zzhx.zza(this, str, Long.valueOf(j10), true);
    }

    public final zzhx<String> zza(String str, String str2) {
        return zzhx.zza(this, str, str2, true);
    }

    public final zzhx<Boolean> zza(String str, boolean z10) {
        return zzhx.zza(this, str, Boolean.valueOf(z10), true);
    }

    public final zzif zza() {
        return new zzif(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, true, this.zzg, this.zzh);
    }

    public final zzif zzb() {
        if (!this.zzc.isEmpty()) {
            throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
        }
        e<Context, Boolean> eVar = this.zzh;
        if (eVar == null) {
            return new zzif(this.zza, this.zzb, this.zzc, this.zzd, true, this.zzf, this.zzi, this.zzg, eVar);
        }
        throw new IllegalStateException("Cannot skip gservices both always and conditionally");
    }
}
