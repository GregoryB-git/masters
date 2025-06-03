package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import b.z;
import n6.a;

/* loaded from: classes.dex */
public final class zzbw extends a {
    public static final Parcelable.Creator<zzbw> CREATOR = new zzbx();
    public final int zza;
    public String zzb;

    public zzbw() {
        this.zza = 1;
    }

    public zzbw(int i10, String str) {
        this.zza = i10;
        this.zzb = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = z.J(20293, parcel);
        z.z(parcel, 1, this.zza);
        z.F(parcel, 2, this.zzb, false);
        z.L(J, parcel);
    }

    public final zzbw zza(String str) {
        this.zzb = str;
        return this;
    }
}
