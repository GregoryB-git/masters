package android.support.v4.os;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.support.v4.os.a;

/* loaded from: classes.dex */
public interface IResultReceiver extends IInterface {

    /* renamed from: o, reason: collision with root package name */
    public static final String f538o = "android$support$v4$os$IResultReceiver".replace('$', '.');

    public static abstract class Stub extends Binder implements IResultReceiver {

        public static class a implements IResultReceiver {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f539a;

            public a(IBinder iBinder) {
                this.f539a = iBinder;
            }

            @Override // android.support.v4.os.IResultReceiver
            public final void a3(int i10, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IResultReceiver.f538o);
                    obtain.writeInt(i10);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f539a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f539a;
            }
        }

        public Stub() {
            attachInterface(this, IResultReceiver.f538o);
        }

        public static IResultReceiver asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IResultReceiver.f538o);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IResultReceiver)) ? new a(iBinder) : (IResultReceiver) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            String str = IResultReceiver.f538o;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i10 != 1) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            ((a.b) this).a3(parcel.readInt(), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
            return true;
        }
    }

    void a3(int i10, Bundle bundle);
}
