/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package A2;

import A2.T;
import B2.a;
import B2.c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

public class p
extends a {
    @NonNull
    public static final Parcelable.Creator<p> CREATOR = new T();
    public final int o;
    public final boolean p;
    public final boolean q;
    public final int r;
    public final int s;

    public p(int n8, boolean bl, boolean bl2, int n9, int n10) {
        this.o = n8;
        this.p = bl;
        this.q = bl2;
        this.r = n9;
        this.s = n10;
    }

    public int a() {
        return this.r;
    }

    public int d() {
        return this.s;
    }

    public boolean f() {
        return this.p;
    }

    public boolean g() {
        return this.q;
    }

    public int i() {
        return this.o;
    }

    public final void writeToParcel(Parcel parcel, int n8) {
        n8 = c.a(parcel);
        c.i(parcel, 1, this.i());
        c.c(parcel, 2, this.f());
        c.c(parcel, 3, this.g());
        c.i(parcel, 4, this.a());
        c.i(parcel, 5, this.d());
        c.b(parcel, n8);
    }
}

