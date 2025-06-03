/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package w2;

import B2.c;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import w2.d;

public final class a
extends B2.a {
    @NonNull
    public static final Parcelable.Creator<a> CREATOR = new d();
    public Intent o;

    public a(Intent intent) {
        this.o = intent;
    }

    public Intent a() {
        return this.o;
    }

    public void writeToParcel(Parcel parcel, int n8) {
        int n9 = c.a(parcel);
        c.m(parcel, 1, (Parcelable)this.o, n8, false);
        c.b(parcel, n9);
    }
}

