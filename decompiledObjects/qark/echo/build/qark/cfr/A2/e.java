/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package A2;

import A2.c0;
import A2.p;
import B2.a;
import B2.c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

public class e
extends a {
    @NonNull
    public static final Parcelable.Creator<e> CREATOR = new c0();
    public final p o;
    public final boolean p;
    public final boolean q;
    public final int[] r;
    public final int s;
    public final int[] t;

    public e(p p8, boolean bl, boolean bl2, int[] arrn, int n8, int[] arrn2) {
        this.o = p8;
        this.p = bl;
        this.q = bl2;
        this.r = arrn;
        this.s = n8;
        this.t = arrn2;
    }

    public int a() {
        return this.s;
    }

    public int[] d() {
        return this.r;
    }

    public int[] f() {
        return this.t;
    }

    public boolean g() {
        return this.p;
    }

    public boolean i() {
        return this.q;
    }

    public final p k() {
        return this.o;
    }

    public final void writeToParcel(Parcel parcel, int n8) {
        int n9 = c.a(parcel);
        c.m(parcel, 1, this.o, n8, false);
        c.c(parcel, 2, this.g());
        c.c(parcel, 3, this.i());
        c.j(parcel, 4, this.d(), false);
        c.i(parcel, 5, this.a());
        c.j(parcel, 6, this.f(), false);
        c.b(parcel, n9);
    }
}

