/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.accounts.Account
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 *  java.lang.Runtime
 *  java.lang.RuntimeException
 *  java.lang.String
 */
package A2;

import A2.f;
import B2.c;
import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import x2.d;

public final class d0
implements Parcelable.Creator {
    public static void a(f f8, Parcel parcel, int n8) {
        int n9 = c.a(parcel);
        c.i(parcel, 1, f8.o);
        c.i(parcel, 2, f8.p);
        c.i(parcel, 3, f8.q);
        c.n(parcel, 4, f8.r, false);
        c.h(parcel, 5, f8.s, false);
        c.p(parcel, 6, f8.t, n8, false);
        c.e(parcel, 7, f8.u, false);
        c.m(parcel, 8, (Parcelable)f8.v, n8, false);
        c.p(parcel, 10, f8.w, n8, false);
        c.p(parcel, 11, f8.x, n8, false);
        c.c(parcel, 12, f8.y);
        c.i(parcel, 13, f8.z);
        c.c(parcel, 14, f8.A);
        c.n(parcel, 15, f8.a(), false);
        c.b(parcel, n9);
    }

    public final /* synthetic */ Object[] newArray(int n8) {
        return new f[n8];
    }
}

