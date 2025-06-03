/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 *  java.lang.String
 */
package W0;

import R0.b;
import android.os.Parcel;
import android.os.Parcelable;

public final class a
extends b {
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator(){

        public a a(Parcel parcel) {
            return new a(parcel);
        }

        public a[] b(int n8) {
            return new a[n8];
        }
    };

    public a(Parcel parcel) {
        super(parcel);
    }

    public a(String string2, String string3) {
        super(string2, string3);
    }

}

