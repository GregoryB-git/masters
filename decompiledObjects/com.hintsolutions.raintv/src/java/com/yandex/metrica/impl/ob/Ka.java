/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  androidx.annotation.Nullable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.yandex.metrica.impl.ob;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.ob.ja;

public class ka
implements Parcelable {
    public static final Parcelable.Creator<ka> CREATOR = new Parcelable.Creator<ka>(){

        public Object createFromParcel(Parcel parcel) {
            return new ka(parcel);
        }

        public Object[] newArray(int n4) {
            return new ka[n4];
        }
    };
    @Nullable
    public final ja a;
    @Nullable
    public final ja b;
    @Nullable
    public final ja c;

    public ka() {
        this(null, null, null);
    }

    public ka(Parcel parcel) {
        this.a = (ja)parcel.readParcelable(ja.class.getClassLoader());
        this.b = (ja)parcel.readParcelable(ja.class.getClassLoader());
        this.c = (ja)parcel.readParcelable(ja.class.getClassLoader());
    }

    public ka(@Nullable ja ja2, @Nullable ja ja3, @Nullable ja ja4) {
        this.a = ja2;
        this.b = ja3;
        this.c = ja4;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder stringBuilder = z2.t("DiagnosticsConfigsHolder{activationConfig=");
        stringBuilder.append((Object)this.a);
        stringBuilder.append(", clidsInfoConfig=");
        stringBuilder.append((Object)this.b);
        stringBuilder.append(", preloadInfoConfig=");
        stringBuilder.append((Object)this.c);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int n4) {
        parcel.writeParcelable((Parcelable)this.a, n4);
        parcel.writeParcelable((Parcelable)this.b, n4);
        parcel.writeParcelable((Parcelable)this.c, n4);
    }
}

