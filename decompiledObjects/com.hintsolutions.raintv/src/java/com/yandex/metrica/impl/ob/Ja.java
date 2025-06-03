/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.yandex.metrica.impl.ob;

import android.os.Parcel;
import android.os.Parcelable;

public class ja
implements Parcelable {
    public static final Parcelable.Creator<ja> CREATOR = new Parcelable.Creator<ja>(){

        public Object createFromParcel(Parcel parcel) {
            return new ja(parcel);
        }

        public Object[] newArray(int n4) {
            return new ja[n4];
        }
    };
    public final long a;
    public final int b;

    public ja(long l5, int n4) {
        this.a = l5;
        this.b = n4;
    }

    public ja(Parcel parcel) {
        this.a = parcel.readLong();
        this.b = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder stringBuilder = z2.t("DiagnosticsConfig{expirationTimestampSeconds=");
        stringBuilder.append(this.a);
        stringBuilder.append(", intervalSeconds=");
        return a.n(stringBuilder, this.b, '}');
    }

    public void writeToParcel(Parcel parcel, int n4) {
        parcel.writeLong(this.a);
        parcel.writeInt(this.b);
    }
}

