/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Binder
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package Z1;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface a
extends IInterface {
    public int O(Bundle var1);

    public static abstract class Z1.a$a
    extends Binder
    implements Z1.a {
        public static Z1.a n(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterface = iBinder.queryLocalInterface("com.facebook.ppml.receiver.IReceiverService");
            if (iInterface != null && iInterface instanceof Z1.a) {
                return (Z1.a)iInterface;
            }
            return new a(iBinder);
        }

        public static Z1.a o() {
            return a.c;
        }

        public static class a
        implements Z1.a {
            public static Z1.a c;
            public IBinder b;

            public a(IBinder iBinder) {
                this.b = iBinder;
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            @Override
            public int O(Bundle bundle) {
                Parcel parcel;
                Throwable throwable2;
                Parcel parcel2;
                block5 : {
                    int n8;
                    parcel2 = Parcel.obtain();
                    parcel = Parcel.obtain();
                    try {
                        parcel2.writeInterfaceToken("com.facebook.ppml.receiver.IReceiverService");
                        if (bundle != null) {
                            parcel2.writeInt(1);
                            bundle.writeToParcel(parcel2, 0);
                        } else {
                            parcel2.writeInt(0);
                        }
                        if (this.b.transact(1, parcel2, parcel, 0) || Z1.a$a.o() == null) break block5;
                        n8 = Z1.a$a.o().O(bundle);
                    }
                    catch (Throwable throwable2) {}
                    parcel.recycle();
                    parcel2.recycle();
                    return n8;
                }
                parcel.readException();
                int n9 = parcel.readInt();
                parcel.recycle();
                parcel2.recycle();
                return n9;
                parcel.recycle();
                parcel2.recycle();
                throw throwable2;
            }

            public IBinder asBinder() {
                return this.b;
            }
        }

    }

}

