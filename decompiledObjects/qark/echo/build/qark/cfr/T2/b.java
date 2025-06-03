/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package T2;

import B2.a;
import T2.c;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

public final class b
extends a {
    public static final Parcelable.Creator<b> CREATOR = new c();
    public final int o;
    public int p;
    public Intent q;

    public b(int n8, int n9, Intent intent) {
        this.o = n8;
        this.p = n9;
        this.q = intent;
    }

    public final void writeToParcel(Parcel parcel, int n8) {
        int n9 = B2.c.a(parcel);
        B2.c.i(parcel, 1, this.o);
        B2.c.i(parcel, 2, this.p);
        B2.c.m(parcel, 3, (Parcelable)this.q, n8, false);
        B2.c.b(parcel, n9);
    }
}

