/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package androidx.activity.result;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

public final class a
implements Parcelable {
    @NonNull
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator(){

        public a a(Parcel parcel) {
            return new a(parcel);
        }

        public a[] b(int n8) {
            return new a[n8];
        }
    };
    public final int o;
    public final Intent p;

    public a(int n8, Intent intent) {
        this.o = n8;
        this.p = intent;
    }

    public a(Parcel parcel) {
        this.o = parcel.readInt();
        parcel = parcel.readInt() == 0 ? null : (Intent)Intent.CREATOR.createFromParcel(parcel);
        this.p = parcel;
    }

    public static String c(int n8) {
        if (n8 != -1) {
            if (n8 != 0) {
                return String.valueOf((int)n8);
            }
            return "RESULT_CANCELED";
        }
        return "RESULT_OK";
    }

    public Intent a() {
        return this.p;
    }

    public int b() {
        return this.o;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ActivityResult{resultCode=");
        stringBuilder.append(a.c(this.o));
        stringBuilder.append(", data=");
        stringBuilder.append((Object)this.p);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int n8) {
        parcel.writeInt(this.o);
        int n9 = this.p == null ? 0 : 1;
        parcel.writeInt(n9);
        Intent intent = this.p;
        if (intent != null) {
            intent.writeToParcel(parcel, n8);
        }
    }

}

