/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.content.IntentSender
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.ClassLoader
 *  java.lang.Object
 */
package androidx.activity.result;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

public final class e
implements Parcelable {
    @NonNull
    public static final Parcelable.Creator<e> CREATOR = new Parcelable.Creator(){

        public e a(Parcel parcel) {
            return new e(parcel);
        }

        public e[] b(int n8) {
            return new e[n8];
        }
    };
    public final IntentSender o;
    public final Intent p;
    public final int q;
    public final int r;

    public e(IntentSender intentSender, Intent intent, int n8, int n9) {
        this.o = intentSender;
        this.p = intent;
        this.q = n8;
        this.r = n9;
    }

    public e(Parcel parcel) {
        this.o = (IntentSender)parcel.readParcelable(IntentSender.class.getClassLoader());
        this.p = (Intent)parcel.readParcelable(Intent.class.getClassLoader());
        this.q = parcel.readInt();
        this.r = parcel.readInt();
    }

    public Intent a() {
        return this.p;
    }

    public int b() {
        return this.q;
    }

    public int c() {
        return this.r;
    }

    public IntentSender d() {
        return this.o;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int n8) {
        parcel.writeParcelable((Parcelable)this.o, n8);
        parcel.writeParcelable((Parcelable)this.p, n8);
        parcel.writeInt(this.q);
        parcel.writeInt(this.r);
    }

    public static final class b {
        public IntentSender a;
        public Intent b;
        public int c;
        public int d;

        public b(IntentSender intentSender) {
            this.a = intentSender;
        }

        public e a() {
            return new e(this.a, this.b, this.c, this.d);
        }

        public b b(Intent intent) {
            this.b = intent;
            return this;
        }

        public b c(int n8, int n9) {
            this.d = n8;
            this.c = n9;
            return this;
        }
    }

}

