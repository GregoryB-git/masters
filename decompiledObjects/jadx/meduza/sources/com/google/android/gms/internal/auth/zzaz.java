package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import b.z;
import m6.j;
import n6.a;

/* loaded from: classes.dex */
public final class zzaz extends a {
    public static final Parcelable.Creator<zzaz> CREATOR = new zzba();
    public final int zza;
    public final String zzb;
    public final byte[] zzc;

    public zzaz(int i10, String str, byte[] bArr) {
        this.zza = 1;
        j.i(str);
        this.zzb = str;
        j.i(bArr);
        this.zzc = bArr;
    }

    public zzaz(String str, byte[] bArr) {
        this(1, str, bArr);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = z.J(20293, parcel);
        z.z(parcel, 1, this.zza);
        z.F(parcel, 2, this.zzb, false);
        z.w(parcel, 3, this.zzc, false);
        z.L(J, parcel);
    }
}
