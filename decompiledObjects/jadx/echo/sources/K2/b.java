package K2;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class b extends Binder implements IInterface {
    public b(String str) {
        attachInterface(this, str);
    }

    public abstract boolean Z0(int i7, Parcel parcel, Parcel parcel2, int i8);

    @Override // android.os.Binder
    public final boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i7, parcel, parcel2, i8)) {
            return true;
        }
        return Z0(i7, parcel, parcel2, i8);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
