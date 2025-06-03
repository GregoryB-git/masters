package androidx.work.multiprocess;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public interface IWorkManagerImplCallback extends IInterface {
    public static final String t = "androidx$work$multiprocess$IWorkManagerImplCallback".replace('$', '.');

    public static abstract class Stub extends Binder implements IWorkManagerImplCallback {

        public static class a implements IWorkManagerImplCallback {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f1556a;

            public a(IBinder iBinder) {
                this.f1556a = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f1556a;
            }
        }

        public Stub() {
            attachInterface(this, IWorkManagerImplCallback.t);
        }

        public static IWorkManagerImplCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IWorkManagerImplCallback.t);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IWorkManagerImplCallback)) ? new a(iBinder) : (IWorkManagerImplCallback) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            String str = IWorkManagerImplCallback.t;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i10 == 1) {
                parcel.createByteArray();
                k();
            } else {
                if (i10 != 2) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                parcel.readString();
                i();
            }
            return true;
        }
    }

    void i();

    void k();
}
