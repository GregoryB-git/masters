/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 */
package b2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class a
implements IInterface {
    public final IBinder b;
    public final String c;

    public a(IBinder iBinder, String string2) {
        this.b = iBinder;
        this.c = string2;
    }

    public final IBinder asBinder() {
        return this.b;
    }

    public final Parcel n() {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken(this.c);
        return parcel;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final Parcel o(Parcel parcel) {
        Throwable throwable222;
        Parcel parcel2 = Parcel.obtain();
        this.b.transact(1, parcel, parcel2, 0);
        parcel2.readException();
        parcel.recycle();
        return parcel2;
        {
            catch (Throwable throwable222) {
            }
            catch (RuntimeException runtimeException) {}
            {
                parcel2.recycle();
                throw runtimeException;
            }
        }
        parcel.recycle();
        throw throwable222;
    }
}

