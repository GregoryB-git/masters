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
package K2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class a
implements IInterface {
    public final IBinder b;
    public final String c;

    public a(IBinder iBinder, String string2) {
        this.b = iBinder;
        this.c = string2;
    }

    public final IBinder asBinder() {
        return this.b;
    }

    public final Parcel n() {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken(this.c);
        return parcel;
    }

    public final void o(int n8, Parcel parcel) {
        Parcel parcel2 = Parcel.obtain();
        try {
            this.b.transact(n8, parcel, parcel2, 0);
            parcel2.readException();
            return;
        }
        finally {
            parcel.recycle();
            parcel2.recycle();
        }
    }

    public final void v(int n8, Parcel parcel) {
        try {
            this.b.transact(1, parcel, null, 1);
            return;
        }
        finally {
            parcel.recycle();
        }
    }
}

