// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package M2;

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
    
    public final Parcel n(final int n, final Parcel parcel) {
        final Parcel obtain = Parcel.obtain();
        try {
            try {
                this.b.transact(n, parcel, obtain, 0);
                obtain.readException();
                parcel.recycle();
                return obtain;
            }
            finally {}
        }
        catch (RuntimeException ex) {
            final Parcel parcel2;
            parcel2.recycle();
            throw ex;
        }
        parcel.recycle();
    }
    
    public final Parcel o() {
        final Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.c);
        return obtain;
    }
}
