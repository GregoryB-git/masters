package androidx.work.multiprocess;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.work.multiprocess.IWorkManagerImplCallback;

/* loaded from: classes.dex */
public interface IListenableWorkerImpl extends IInterface {

    /* renamed from: r, reason: collision with root package name */
    public static final String f1552r = "androidx$work$multiprocess$IListenableWorkerImpl".replace('$', '.');

    public static abstract class Stub extends Binder implements IListenableWorkerImpl {

        public static class a implements IListenableWorkerImpl {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f1553a;

            public a(IBinder iBinder) {
                this.f1553a = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f1553a;
            }
        }

        public Stub() {
            attachInterface(this, IListenableWorkerImpl.f1552r);
        }

        public static IListenableWorkerImpl asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IListenableWorkerImpl.f1552r);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IListenableWorkerImpl)) ? new a(iBinder) : (IListenableWorkerImpl) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            String str = IListenableWorkerImpl.f1552r;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i10 == 1) {
                parcel.createByteArray();
                IWorkManagerImplCallback.Stub.asInterface(parcel.readStrongBinder());
                j1();
            } else {
                if (i10 != 2) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                parcel.createByteArray();
                IWorkManagerImplCallback.Stub.asInterface(parcel.readStrongBinder());
                N2();
            }
            return true;
        }
    }

    void N2();

    void j1();
}
