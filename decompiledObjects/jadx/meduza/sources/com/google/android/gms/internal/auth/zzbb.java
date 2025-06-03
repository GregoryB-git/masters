package com.google.android.gms.internal.auth;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import b.z;
import m6.j;
import n6.a;

/* loaded from: classes.dex */
public final class zzbb extends a {
    public static final Parcelable.Creator<zzbb> CREATOR = new zzbc();
    public final int zza;
    public final String zzb;
    public final PendingIntent zzc;

    public zzbb(int i10, String str, PendingIntent pendingIntent) {
        this.zza = 1;
        j.i(str);
        this.zzb = str;
        j.i(pendingIntent);
        this.zzc = pendingIntent;
    }

    public zzbb(String str, PendingIntent pendingIntent) {
        this(1, str, pendingIntent);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = z.J(20293, parcel);
        z.z(parcel, 1, this.zza);
        z.F(parcel, 2, this.zzb, false);
        z.E(parcel, 3, this.zzc, i10, false);
        z.L(J, parcel);
    }
}
