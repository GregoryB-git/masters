package Z1;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: Z1.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0136a extends Binder implements a {

        /* renamed from: Z1.a$a$a, reason: collision with other inner class name */
        public static class C0137a implements a {

            /* renamed from: c, reason: collision with root package name */
            public static a f7829c;

            /* renamed from: b, reason: collision with root package name */
            public IBinder f7830b;

            public C0137a(IBinder iBinder) {
                this.f7830b = iBinder;
            }

            @Override // Z1.a
            public int O(Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.ppml.receiver.IReceiverService");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f7830b.transact(1, obtain, obtain2, 0) && AbstractBinderC0136a.o() != null) {
                        int O6 = AbstractBinderC0136a.o().O(bundle);
                        obtain2.recycle();
                        obtain.recycle();
                        return O6;
                    }
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    obtain2.recycle();
                    obtain.recycle();
                    return readInt;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f7830b;
            }
        }

        public static a n(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.facebook.ppml.receiver.IReceiverService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0137a(iBinder) : (a) queryLocalInterface;
        }

        public static a o() {
            return C0137a.f7829c;
        }
    }

    int O(Bundle bundle);
}
