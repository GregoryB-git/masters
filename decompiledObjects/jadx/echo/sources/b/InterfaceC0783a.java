package b;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: b.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0783a extends IInterface {

    /* renamed from: a, reason: collision with root package name */
    public static final String f9947a = "android$support$v4$os$IResultReceiver".replace('$', '.');

    /* renamed from: b.a$b */
    public static class b {
        public static Object c(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        public static void d(Parcel parcel, Parcelable parcelable, int i7) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, i7);
            }
        }
    }

    void T0(int i7, Bundle bundle);

    /* renamed from: b.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0165a extends Binder implements InterfaceC0783a {

        /* renamed from: b.a$a$a, reason: collision with other inner class name */
        public static class C0166a implements InterfaceC0783a {

            /* renamed from: b, reason: collision with root package name */
            public IBinder f9948b;

            public C0166a(IBinder iBinder) {
                this.f9948b = iBinder;
            }

            @Override // b.InterfaceC0783a
            public void T0(int i7, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(InterfaceC0783a.f9947a);
                    obtain.writeInt(i7);
                    b.d(obtain, bundle, 0);
                    this.f9948b.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f9948b;
            }
        }

        public AbstractBinderC0165a() {
            attachInterface(this, InterfaceC0783a.f9947a);
        }

        public static InterfaceC0783a n(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(InterfaceC0783a.f9947a);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC0783a)) ? new C0166a(iBinder) : (InterfaceC0783a) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i8) {
            String str = InterfaceC0783a.f9947a;
            if (i7 >= 1 && i7 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i7 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i7 != 1) {
                return super.onTransact(i7, parcel, parcel2, i8);
            }
            T0(parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
