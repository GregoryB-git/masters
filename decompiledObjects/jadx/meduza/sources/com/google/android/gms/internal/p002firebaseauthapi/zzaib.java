package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import n6.b;

/* loaded from: classes.dex */
public final class zzaib implements Parcelable.Creator<zzaic> {
    @Override // android.os.Parcelable.Creator
    public final zzaic createFromParcel(Parcel parcel) {
        int u10 = b.u(parcel);
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        while (parcel.dataPosition() < u10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = b.f(readInt, parcel);
                    break;
                case 3:
                    str2 = b.f(readInt, parcel);
                    break;
                case 4:
                    str3 = b.f(readInt, parcel);
                    break;
                case 5:
                    str4 = b.f(readInt, parcel);
                    break;
                case 6:
                    str5 = b.f(readInt, parcel);
                    break;
                case 7:
                    str6 = b.f(readInt, parcel);
                    break;
                case '\b':
                    str7 = b.f(readInt, parcel);
                    break;
                case '\t':
                    str8 = b.f(readInt, parcel);
                    break;
                case '\n':
                    z10 = b.k(readInt, parcel);
                    break;
                case 11:
                    z11 = b.k(readInt, parcel);
                    break;
                case '\f':
                    str9 = b.f(readInt, parcel);
                    break;
                case '\r':
                    str10 = b.f(readInt, parcel);
                    break;
                case 14:
                    str11 = b.f(readInt, parcel);
                    break;
                case 15:
                    str12 = b.f(readInt, parcel);
                    break;
                case 16:
                    z12 = b.k(readInt, parcel);
                    break;
                case 17:
                    str13 = b.f(readInt, parcel);
                    break;
                default:
                    b.t(readInt, parcel);
                    break;
            }
        }
        b.j(u10, parcel);
        return new zzaic(str, str2, str3, str4, str5, str6, str7, str8, z10, z11, str9, str10, str11, str12, z12, str13);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaic[] newArray(int i10) {
        return new zzaic[i10];
    }
}
