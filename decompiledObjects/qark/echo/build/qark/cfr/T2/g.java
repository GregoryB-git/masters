/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  java.lang.String
 */
package T2;

import K2.a;
import K2.c;
import T2.f;
import T2.j;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class g
extends a
implements IInterface {
    public g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void Z0(j j8, f f8) {
        Parcel parcel = this.n();
        c.c(parcel, j8);
        c.d(parcel, f8);
        this.o(12, parcel);
    }
}

