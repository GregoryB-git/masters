/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  java.lang.Object
 *  java.lang.String
 */
package I2;

import H2.a;
import M2.a;
import M2.c;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class k
extends a
implements IInterface {
    public k(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final H2.a Z0(H2.a a8, String object, int n8, H2.a a9) {
        Parcel parcel = this.o();
        c.e(parcel, a8);
        parcel.writeString((String)object);
        parcel.writeInt(n8);
        c.e(parcel, a9);
        a8 = this.n(3, parcel);
        object = a.a.o(a8.readStrongBinder());
        a8.recycle();
        return object;
    }

    public final H2.a v(H2.a a8, String object, int n8, H2.a a9) {
        Parcel parcel = this.o();
        c.e(parcel, a8);
        parcel.writeString((String)object);
        parcel.writeInt(n8);
        c.e(parcel, a9);
        a8 = this.n(2, parcel);
        object = a.a.o(a8.readStrongBinder());
        a8.recycle();
        return object;
    }
}

