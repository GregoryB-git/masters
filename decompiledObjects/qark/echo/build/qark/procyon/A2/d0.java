// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package A2;

import android.os.Parcelable;
import B2.c;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class d0 implements Parcelable$Creator
{
    public static void a(final f f, final Parcel parcel, final int n) {
        final int a = c.a(parcel);
        c.i(parcel, 1, f.o);
        c.i(parcel, 2, f.p);
        c.i(parcel, 3, f.q);
        c.n(parcel, 4, f.r, false);
        c.h(parcel, 5, f.s, false);
        c.p(parcel, 6, (Parcelable[])f.t, n, false);
        c.e(parcel, 7, f.u, false);
        c.m(parcel, 8, (Parcelable)f.v, n, false);
        c.p(parcel, 10, (Parcelable[])f.w, n, false);
        c.p(parcel, 11, (Parcelable[])f.x, n, false);
        c.c(parcel, 12, f.y);
        c.i(parcel, 13, f.z);
        c.c(parcel, 14, f.A);
        c.n(parcel, 15, f.a(), false);
        c.b(parcel, a);
    }
}
