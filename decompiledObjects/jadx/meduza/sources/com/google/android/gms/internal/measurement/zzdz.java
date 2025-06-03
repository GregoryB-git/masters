package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import b.z;
import n6.a;

/* loaded from: classes.dex */
public final class zzdz extends a {
    public static final Parcelable.Creator<zzdz> CREATOR = new zzec();
    public final long zza;
    public final long zzb;
    public final boolean zzc;
    public final String zzd;
    public final String zze;
    public final String zzf;
    public final Bundle zzg;
    public final String zzh;

    public zzdz(long j10, long j11, boolean z10, String str, String str2, String str3, Bundle bundle, String str4) {
        this.zza = j10;
        this.zzb = j11;
        this.zzc = z10;
        this.zzd = str;
        this.zze = str2;
        this.zzf = str3;
        this.zzg = bundle;
        this.zzh = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = z.J(20293, parcel);
        z.C(parcel, 1, this.zza);
        z.C(parcel, 2, this.zzb);
        z.t(parcel, 3, this.zzc);
        z.F(parcel, 4, this.zzd, false);
        z.F(parcel, 5, this.zze, false);
        z.F(parcel, 6, this.zzf, false);
        z.v(parcel, 7, this.zzg, false);
        z.F(parcel, 8, this.zzh, false);
        z.L(J, parcel);
    }
}
