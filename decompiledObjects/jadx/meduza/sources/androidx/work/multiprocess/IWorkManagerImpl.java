package androidx.work.multiprocess;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.work.multiprocess.IWorkManagerImplCallback;

/* loaded from: classes.dex */
public interface IWorkManagerImpl extends IInterface {

    /* renamed from: s, reason: collision with root package name */
    public static final String f1554s = "androidx$work$multiprocess$IWorkManagerImpl".replace('$', '.');

    public static abstract class Stub extends Binder implements IWorkManagerImpl {

        public static class a implements IWorkManagerImpl {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f1555a;

            public a(IBinder iBinder) {
                this.f1555a = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f1555a;
            }
        }

        public Stub() {
            attachInterface(this, IWorkManagerImpl.f1554s);
        }

        public static IWorkManagerImpl asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IWorkManagerImpl.f1554s);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IWorkManagerImpl)) ? new a(iBinder) : (IWorkManagerImpl) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            String str = IWorkManagerImpl.f1554s;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i10) {
                case 1:
                    parcel.createByteArray();
                    IWorkManagerImplCallback.Stub.asInterface(parcel.readStrongBinder());
                    m0();
                    return true;
                case 2:
                    parcel.readString();
                    parcel.createByteArray();
                    IWorkManagerImplCallback.Stub.asInterface(parcel.readStrongBinder());
                    b1();
                    return true;
                case 3:
                    parcel.createByteArray();
                    IWorkManagerImplCallback.Stub.asInterface(parcel.readStrongBinder());
                    O1();
                    return true;
                case 4:
                    parcel.readString();
                    IWorkManagerImplCallback.Stub.asInterface(parcel.readStrongBinder());
                    f2();
                    return true;
                case 5:
                    parcel.readString();
                    IWorkManagerImplCallback.Stub.asInterface(parcel.readStrongBinder());
                    Q();
                    return true;
                case 6:
                    parcel.readString();
                    IWorkManagerImplCallback.Stub.asInterface(parcel.readStrongBinder());
                    K();
                    return true;
                case 7:
                    IWorkManagerImplCallback.Stub.asInterface(parcel.readStrongBinder());
                    n1();
                    return true;
                case 8:
                    parcel.createByteArray();
                    IWorkManagerImplCallback.Stub.asInterface(parcel.readStrongBinder());
                    T0();
                    return true;
                case 9:
                    parcel.createByteArray();
                    IWorkManagerImplCallback.Stub.asInterface(parcel.readStrongBinder());
                    W();
                    return true;
                case 10:
                    parcel.createByteArray();
                    IWorkManagerImplCallback.Stub.asInterface(parcel.readStrongBinder());
                    w1();
                    return true;
                default:
                    return super.onTransact(i10, parcel, parcel2, i11);
            }
        }
    }

    void K();

    void O1();

    void Q();

    void T0();

    void W();

    void b1();

    void f2();

    void m0();

    void n1();

    void w1();
}
