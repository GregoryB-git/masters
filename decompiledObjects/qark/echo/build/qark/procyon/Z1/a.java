// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Z1;

import android.os.Parcel;
import android.os.IBinder;
import android.os.Binder;
import android.os.Bundle;
import android.os.IInterface;

public interface a extends IInterface
{
    int O(final Bundle p0);
    
    public abstract static class a extends Binder implements a
    {
        public static a n(final IBinder binder) {
            if (binder == null) {
                return null;
            }
            final IInterface queryLocalInterface = binder.queryLocalInterface("com.facebook.ppml.receiver.IReceiverService");
            if (queryLocalInterface != null && queryLocalInterface instanceof a) {
                return (a)queryLocalInterface;
            }
            return new a(binder);
        }
        
        public static a o() {
            return a.c;
        }
        
        public static class a implements Z1.a
        {
            public static Z1.a c;
            public IBinder b;
            
            public a(final IBinder b) {
                this.b = b;
            }
            
            @Override
            public int O(final Bundle bundle) {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                while (true) {
                    try {
                        obtain.writeInterfaceToken("com.facebook.ppml.receiver.IReceiverService");
                        if (bundle != null) {
                            obtain.writeInt(1);
                            bundle.writeToParcel(obtain, 0);
                        }
                        else {
                            obtain.writeInt(0);
                        }
                        if (!this.b.transact(1, obtain, obtain2, 0) && Z1.a.a.o() != null) {
                            final int o = Z1.a.a.o().O(bundle);
                            obtain2.recycle();
                            obtain.recycle();
                            return o;
                        }
                        obtain2.readException();
                        final int int1 = obtain2.readInt();
                        obtain2.recycle();
                        obtain.recycle();
                        return int1;
                        obtain2.recycle();
                        obtain.recycle();
                        throw;
                    }
                    finally {
                        continue;
                    }
                    break;
                }
            }
            
            public IBinder asBinder() {
                return this.b;
            }
        }
    }
}
