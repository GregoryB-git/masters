package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import b.z;
import m6.j;
import n6.a;

/* loaded from: classes.dex */
public final class zzav extends a {
    public static final Parcelable.Creator<zzav> CREATOR = new zzaw();
    public final int zza;
    public final String zzb;
    public final int zzc;

    public zzav(int i10, String str, int i11) {
        this.zza = 1;
        j.i(str);
        this.zzb = str;
        this.zzc = i11;
    }

    public zzav(String str, int i10) {
        this(1, str, i10);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = z.J(20293, parcel);
        z.z(parcel, 1, this.zza);
        z.F(parcel, 2, this.zzb, false);
        z.z(parcel, 3, this.zzc);
        z.L(J, parcel);
    }
}
