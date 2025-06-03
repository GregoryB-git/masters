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
package K2;

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

    public abstract boolean Z0(int var1, Parcel var2, Parcel var3, int var4);

    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int n8, Parcel parcel, Parcel parcel2, int n9) {
        if (n8 > 16777215) {
            if (super.onTransact(n8, parcel, parcel2, n9)) {
                return true;
            }
        } else {
            parcel.enforceInterface(this.getInterfaceDescriptor());
        }
        return this.Z0(n8, parcel, parcel2, n9);
    }
}

