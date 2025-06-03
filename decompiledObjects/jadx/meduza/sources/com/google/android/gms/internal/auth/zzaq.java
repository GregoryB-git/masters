package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import b.z;
import m6.j;
import n6.a;

/* loaded from: classes.dex */
public final class zzaq extends a {
    public static final Parcelable.Creator<zzaq> CREATOR = new zzar();
    public final int zza;
    public final String zzb;

    public zzaq(int i10, String str) {
        this.zza = 1;
        j.i(str);
        this.zzb = str;
    }

    public zzaq(String str) {
        this(1, str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = z.J(20293, parcel);
        z.z(parcel, 1, this.zza);
        z.F(parcel, 2, this.zzb, false);
        z.L(J, parcel);
    }
}
