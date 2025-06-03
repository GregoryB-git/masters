/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 */
package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import v1.c;
import v1.d;

@SuppressLint(value={"BanParcelableUsage"})
public class ParcelImpl
implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new Parcelable.Creator(){

        public ParcelImpl a(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        public ParcelImpl[] b(int n8) {
            return new ParcelImpl[n8];
        }
    };
    public final d o;

    public ParcelImpl(Parcel parcel) {
        this.o = new c(parcel).u();
    }

    public ParcelImpl(d d8) {
        this.o = d8;
    }

    public d a() {
        return this.o;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int n8) {
        new c(parcel).L(this.o);
    }

}

