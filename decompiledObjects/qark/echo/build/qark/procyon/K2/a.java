// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package K2;

import android.os.Parcel;
import android.os.IBinder;
import android.os.IInterface;

public abstract class a implements IInterface
{
    public final IBinder b;
    public final String c;
    
    public a(final IBinder b, final String c) {
        this.b = b;
        this.c = c;
    }
    
    public final IBinder asBinder() {
        return this.b;
    }
    
    public final Parcel n() {
        final Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.c);
        return obtain;
    }
    
    public final void o(final int n, final Parcel parcel) {
        final Parcel obtain = Parcel.obtain();
        try {
            this.b.transact(n, parcel, obtain, 0);
            obtain.readException();
        }
        finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
    
    public final void v(final int n, final Parcel parcel) {
        try {
            this.b.transact(1, parcel, (Parcel)null, 1);
        }
        finally {
            parcel.recycle();
        }
    }
}
