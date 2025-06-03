package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import n6.b;

/* loaded from: classes.dex */
public final class zzec implements Parcelable.Creator<zzdz> {
    @Override // android.os.Parcelable.Creator
    public final zzdz createFromParcel(Parcel parcel) {
        int u10 = b.u(parcel);
        long j10 = 0;
        long j11 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        String str4 = null;
        boolean z10 = false;
        while (parcel.dataPosition() < u10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    j10 = b.q(readInt, parcel);
                    break;
                case 2:
                    j11 = b.q(readInt, parcel);
                    break;
                case 3:
                    z10 = b.k(readInt, parcel);
                    break;
                case 4:
                    str = b.f(readInt, parcel);
                    break;
                case 5:
                    str2 = b.f(readInt, parcel);
                    break;
                case 6:
                    str3 = b.f(readInt, parcel);
                    break;
                case 7:
                    bundle = b.b(readInt, parcel);
                    break;
                case '\b':
                    str4 = b.f(readInt, parcel);
                    break;
                default:
                    b.t(readInt, parcel);
                    break;
            }
        }
        b.j(u10, parcel);
        return new zzdz(j10, j11, z10, str, str2, str3, bundle, str4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzdz[] newArray(int i10) {
        return new zzdz[i10];
    }
}
