/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Binder
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  java.lang.String
 */
package M2;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class b
extends Binder
implements IInterface {
    public b(String string2) {
        this.attachInterface((IInterface)this, string2);
    }

    public final IBinder asBinder() {
        return this;
    }

    public boolean n(int n8, Parcel parcel, Parcel parcel2, int n9) {
        return false;
    }

    public final boolean onTransact(int n8, Parcel parcel, Parcel parcel2, int n9) {
        if (n8 > 16777215) {
            if (super.onTransact(n8, parcel, parcel2, n9)) {
                return true;
            }
        } else {
            parcel.enforceInterface(this.getInterfaceDescriptor());
        }
        return this.n(n8, parcel, parcel2, n9);
    }
}

