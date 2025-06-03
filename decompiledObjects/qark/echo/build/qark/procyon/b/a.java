// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package b;

import android.os.Parcelable$Creator;
import android.os.Parcelable;
import android.os.Parcel;
import android.os.IBinder;
import android.os.Binder;
import android.os.Bundle;
import android.os.IInterface;

public interface a extends IInterface
{
    public static final String a = "android$support$v4$os$IResultReceiver".replace('$', '.');
    
    void T0(final int p0, final Bundle p1);
    
    public abstract static class a extends Binder implements a
    {
        public a() {
            this.attachInterface((IInterface)this, a.a);
        }
        
        public static a n(final IBinder binder) {
            if (binder == null) {
                return null;
            }
            final IInterface queryLocalInterface = binder.queryLocalInterface(a.a);
            if (queryLocalInterface != null && queryLocalInterface instanceof a) {
                return (a)queryLocalInterface;
            }
            return new a(binder);
        }
        
        public IBinder asBinder() {
            return (IBinder)this;
        }
        
        public boolean onTransact(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
            final String a = b.a.a;
            if (n >= 1 && n <= 16777215) {
                parcel.enforceInterface(a);
            }
            if (n == 1598968902) {
                parcel2.writeString(a);
                return true;
            }
            if (n != 1) {
                return super.onTransact(n, parcel, parcel2, n2);
            }
            this.T0(parcel.readInt(), (Bundle)c(parcel, Bundle.CREATOR));
            return true;
        }
        
        public static class a implements b.a
        {
            public IBinder b;
            
            public a(final IBinder b) {
                this.b = b;
            }
            
            @Override
            public void T0(final int n, final Bundle bundle) {
                final Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.a.a);
                    obtain.writeInt(n);
                    d(obtain, (Parcelable)bundle, 0);
                    this.b.transact(1, obtain, (Parcel)null, 1);
                }
                finally {
                    obtain.recycle();
                }
            }
            
            public IBinder asBinder() {
                return this.b;
            }
        }
    }
    
    public abstract static class b
    {
        public static Object c(final Parcel parcel, final Parcelable$Creator parcelable$Creator) {
            if (parcel.readInt() != 0) {
                return parcelable$Creator.createFromParcel(parcel);
            }
            return null;
        }
        
        public static void d(final Parcel parcel, final Parcelable parcelable, final int n) {
            if (parcelable != null) {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, n);
                return;
            }
            parcel.writeInt(0);
        }
    }
}
