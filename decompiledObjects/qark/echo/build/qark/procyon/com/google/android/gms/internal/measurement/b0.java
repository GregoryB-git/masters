// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Binder;

public abstract class b0 extends Binder implements IInterface
{
    public b0(final String s) {
        this.attachInterface((IInterface)this, s);
    }
    
    public IBinder asBinder() {
        return (IBinder)this;
    }
    
    public abstract boolean n(final int p0, final Parcel p1, final Parcel p2, final int p3);
    
    public boolean onTransact(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        if (n > 16777215) {
            if (super.onTransact(n, parcel, parcel2, n2)) {
                return true;
            }
        }
        else {
            parcel.enforceInterface(this.getInterfaceDescriptor());
        }
        return this.n(n, parcel, parcel2, n2);
    }
}
