/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Binder
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 *  java.lang.String
 */
package b;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

public interface a
extends IInterface {
    public static final String a = "android$support$v4$os$IResultReceiver".replace('$', '.');

    public void T0(int var1, Bundle var2);

    public static abstract class b.a$a
    extends Binder
    implements b.a {
        public b.a$a() {
            this.attachInterface((IInterface)this, b.a.a);
        }

        public static b.a n(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterface = iBinder.queryLocalInterface(b.a.a);
            if (iInterface != null && iInterface instanceof b.a) {
                return (b.a)iInterface;
            }
            return new a(iBinder);
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int n8, Parcel parcel, Parcel parcel2, int n9) {
            String string2 = b.a.a;
            if (n8 >= 1 && n8 <= 16777215) {
                parcel.enforceInterface(string2);
            }
            if (n8 != 1598968902) {
                if (n8 != 1) {
                    return super.onTransact(n8, parcel, parcel2, n9);
                }
                this.T0(parcel.readInt(), (Bundle)b.c(parcel, Bundle.CREATOR));
                return true;
            }
            parcel2.writeString(string2);
            return true;
        }

        public static class a
        implements b.a {
            public IBinder b;

            public a(IBinder iBinder) {
                this.b = iBinder;
            }

            @Override
            public void T0(int n8, Bundle bundle) {
                Parcel parcel = Parcel.obtain();
                try {
                    parcel.writeInterfaceToken(b.a.a);
                    parcel.writeInt(n8);
                    b.d(parcel, (Parcelable)bundle, 0);
                    this.b.transact(1, parcel, null, 1);
                    return;
                }
                finally {
                    parcel.recycle();
                }
            }

            public IBinder asBinder() {
                return this.b;
            }
        }

    }

    public static abstract class b {
        public static Object c(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        public static void d(Parcel parcel, Parcelable parcelable, int n8) {
            if (parcelable != null) {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, n8);
                return;
            }
            parcel.writeInt(0);
        }
    }

}

