/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.String
 *  java.util.List
 */
package T2;

import B2.a;
import B2.c;
import T2.i;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public final class h
extends a {
    public static final Parcelable.Creator<h> CREATOR = new i();
    public final List o;
    public final String p;

    public h(List list, String string2) {
        this.o = list;
        this.p = string2;
    }

    public final void writeToParcel(Parcel parcel, int n8) {
        n8 = c.a(parcel);
        c.o(parcel, 1, this.o, false);
        c.n(parcel, 2, this.p, false);
        c.b(parcel, n8);
    }
}

