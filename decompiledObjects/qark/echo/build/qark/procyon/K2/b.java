// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package K2;

import android.os.IBinder;
import android.os.Parcel;
import android.os.IInterface;
import android.os.Binder;

public abstract class b extends Binder implements IInterface
{
    public b(final String s) {
        this.attachInterface((IInterface)this, s);
    }
    
    public abstract boolean Z0(final int p0, final Parcel p1, final Parcel p2, final int p3);
    
    public final IBinder asBinder() {
        return (IBinder)this;
    }
    
    public final boolean onTransact(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        if (n > 16777215) {
            if (super.onTransact(n, parcel, parcel2, n2)) {
                return true;
            }
        }
        else {
            parcel.enforceInterface(this.getInterfaceDescriptor());
        }
        return this.Z0(n, parcel, parcel2, n2);
    }
}
