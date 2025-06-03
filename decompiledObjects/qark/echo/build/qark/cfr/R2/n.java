/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package R2;

import B2.a;
import B2.c;
import R2.m;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public final class n
extends a {
    public static final Parcelable.Creator<n> CREATOR = new m();
    public final Bundle o;

    public n(Bundle bundle) {
        this.o = bundle;
    }

    public final void writeToParcel(Parcel parcel, int n8) {
        n8 = c.a(parcel);
        c.e(parcel, 1, this.o, false);
        c.b(parcel, n8);
    }
}

