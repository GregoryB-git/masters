/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Parcel
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package A2;

import A2.d0;
import A2.f;
import A2.j;
import A2.k;
import android.os.IBinder;
import android.os.Parcel;

public final class M
implements k {
    public final IBinder b;

    public M(IBinder iBinder) {
        this.b = iBinder;
    }

    public final IBinder asBinder() {
        return this.b;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void h0(j j8, f f8) {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            j8 = j8 != null ? j8.asBinder() : null;
            parcel.writeStrongBinder((IBinder)j8);
            if (f8 != null) {
                parcel.writeInt(1);
                d0.a(f8, parcel, 0);
            } else {
                parcel.writeInt(0);
            }
            this.b.transact(46, parcel, parcel2, 0);
            parcel2.readException();
        }
        catch (Throwable throwable) {}
        parcel2.recycle();
        parcel.recycle();
        return;
        parcel2.recycle();
        parcel.recycle();
        throw throwable;
    }
}

