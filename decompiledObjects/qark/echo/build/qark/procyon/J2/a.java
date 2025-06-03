// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package J2;

import android.os.Parcel;
import android.os.IBinder;
import android.os.IInterface;

public abstract class a implements IInterface
{
    public final IBinder b;
    public final String c;
    
    public a(final IBinder b, final String s) {
        this.b = b;
        this.c = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";
    }
    
    public final IBinder asBinder() {
        return this.b;
    }
    
    public final Parcel n() {
        final Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.c);
        return obtain;
    }
    
    public final Parcel o(final int n, final Parcel parcel) {
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
}
