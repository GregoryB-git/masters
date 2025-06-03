package android.support.v4.os;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public interface IResultReceiver2 extends IInterface {

    /* renamed from: n, reason: collision with root package name */
    public static final String f540n = "android$support$v4$os$IResultReceiver2".replace('$', '.');

    public static abstract class Stub extends Binder implements IResultReceiver2 {

        public static class a implements IResultReceiver2 {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f541a;

            public a(IBinder iBinder) {
                this.f541a = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f541a;
            }
        }

        public Stub() {
            attachInterface(this, IResultReceiver2.f540n);
        }

        public static IResultReceiver2 asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IResultReceiver2.f540n);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IResultReceiver2)) ? new a(iBinder) : (IResultReceiver2) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            String str = IResultReceiver2.f540n;
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
            parcel.readInt();
            Q1();
            return true;
        }
    }

    void Q1();
}
