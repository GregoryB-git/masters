// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package A2;

import android.os.IInterface;
import android.os.Parcel;
import android.os.IBinder;

public final class M implements k
{
    public final IBinder b;
    
    public M(final IBinder b) {
        this.b = b;
    }
    
    public final IBinder asBinder() {
        return this.b;
    }
    
    @Override
    public final void h0(final j j, final f f) {
        while (true) {
            final Parcel obtain = Parcel.obtain();
            final Parcel obtain2 = Parcel.obtain();
            while (true) {
                Label_0103: {
                    while (true) {
                        try {
                            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                            if (j != null) {
                                final IBinder binder = ((IInterface)j).asBinder();
                                obtain.writeStrongBinder(binder);
                                if (f != null) {
                                    obtain.writeInt(1);
                                    d0.a(f, obtain, 0);
                                }
                                else {
                                    obtain.writeInt(0);
                                }
                                this.b.transact(46, obtain, obtain2, 0);
                                obtain2.readException();
                                obtain2.recycle();
                                obtain.recycle();
                                return;
                            }
                            break Label_0103;
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
                final IBinder binder = null;
                continue;
            }
        }
    }
}
