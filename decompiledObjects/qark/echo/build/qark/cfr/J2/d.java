/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Parcel
 *  java.lang.String
 */
package J2;

import J2.a;
import J2.c;
import J2.f;
import android.os.IBinder;
import android.os.Parcel;

public final class d
extends a
implements f {
    public d(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    @Override
    public final boolean a0(boolean bl) {
        Parcel parcel = this.n();
        c.a(parcel, true);
        parcel = this.o(2, parcel);
        bl = c.b(parcel);
        parcel.recycle();
        return bl;
    }

    @Override
    public final String c() {
        Parcel parcel = this.o(1, this.n());
        String string2 = parcel.readString();
        parcel.recycle();
        return string2;
    }
}

