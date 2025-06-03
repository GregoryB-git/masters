package android.support.customtabs;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.customtabs.ICustomTabsCallback;
import java.util.List;

/* loaded from: classes.dex */
public interface ICustomTabsService extends IInterface {

    /* renamed from: h, reason: collision with root package name */
    public static final String f410h = "android$support$customtabs$ICustomTabsService".replace('$', '.');

    public static abstract class Stub extends Binder implements ICustomTabsService {

        public static class a implements ICustomTabsService {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f411a;

            public a(IBinder iBinder) {
                this.f411a = iBinder;
            }

            @Override // android.support.customtabs.ICustomTabsService
            public final int H1(ICustomTabsCallback iCustomTabsCallback, String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICustomTabsService.f410h);
                    obtain.writeStrongInterface(iCustomTabsCallback);
                    obtain.writeString(str);
                    a.b(obtain, bundle, 0);
                    this.f411a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsService
            public final boolean T(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle, List<Bundle> list) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICustomTabsService.f410h);
                    obtain.writeStrongInterface(iCustomTabsCallback);
                    a.b(obtain, uri, 0);
                    a.b(obtain, bundle, 0);
                    if (list == null) {
                        obtain.writeInt(-1);
                    } else {
                        int size = list.size();
                        obtain.writeInt(size);
                        for (int i10 = 0; i10 < size; i10++) {
                            a.b(obtain, list.get(i10), 0);
                        }
                    }
                    this.f411a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsService
            public final boolean T1(ICustomTabsCallback iCustomTabsCallback) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICustomTabsService.f410h);
                    obtain.writeStrongInterface(iCustomTabsCallback);
                    this.f411a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsService
            public final boolean U1(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICustomTabsService.f410h);
                    obtain.writeStrongInterface(iCustomTabsCallback);
                    a.b(obtain, uri, 0);
                    a.b(obtain, bundle, 0);
                    this.f411a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsService
            public final boolean U2(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICustomTabsService.f410h);
                    obtain.writeStrongInterface(iCustomTabsCallback);
                    a.b(obtain, bundle, 0);
                    this.f411a.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsService
            public final boolean W1(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICustomTabsService.f410h);
                    obtain.writeStrongInterface(iCustomTabsCallback);
                    a.b(obtain, bundle, 0);
                    this.f411a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f411a;
            }

            @Override // android.support.customtabs.ICustomTabsService
            public final boolean d2(ICustomTabsCallback iCustomTabsCallback, IBinder iBinder, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICustomTabsService.f410h);
                    obtain.writeStrongInterface(iCustomTabsCallback);
                    obtain.writeStrongBinder(iBinder);
                    a.b(obtain, bundle, 0);
                    this.f411a.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsService
            public final boolean g1(long j10) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICustomTabsService.f410h);
                    obtain.writeLong(j10);
                    this.f411a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsService
            public final boolean i2(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICustomTabsService.f410h);
                    obtain.writeStrongInterface(iCustomTabsCallback);
                    a.b(obtain, bundle, 0);
                    this.f411a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsService
            public final boolean p0(int i10, Uri uri, Bundle bundle, ICustomTabsCallback iCustomTabsCallback) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICustomTabsService.f410h);
                    obtain.writeStrongInterface(iCustomTabsCallback);
                    obtain.writeInt(i10);
                    a.b(obtain, uri, 0);
                    a.b(obtain, bundle, 0);
                    this.f411a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsService
            public final boolean s2(ICustomTabsCallback iCustomTabsCallback, Uri uri) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICustomTabsService.f410h);
                    obtain.writeStrongInterface(iCustomTabsCallback);
                    a.b(obtain, uri, 0);
                    this.f411a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, ICustomTabsService.f410h);
        }

        public static ICustomTabsService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(ICustomTabsService.f410h);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ICustomTabsService)) ? new a(iBinder) : (ICustomTabsService) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            int i12;
            String str = ICustomTabsService.f410h;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i10) {
                case 2:
                    i12 = g1(parcel.readLong());
                    parcel2.writeNoException();
                    parcel2.writeInt(i12);
                    return true;
                case 3:
                    i12 = T1(ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(i12);
                    return true;
                case 4:
                    ICustomTabsCallback asInterface = ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder());
                    Uri uri = (Uri) a.a(parcel, Uri.CREATOR);
                    Parcelable.Creator creator = Bundle.CREATOR;
                    i12 = T(asInterface, uri, (Bundle) a.a(parcel, creator), parcel.createTypedArrayList(creator));
                    parcel2.writeNoException();
                    parcel2.writeInt(i12);
                    return true;
                case 5:
                    parcel.readString();
                    Bundle t = t();
                    parcel2.writeNoException();
                    a.b(parcel2, t, 1);
                    return true;
                case 6:
                    i12 = i2(ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder()), (Bundle) a.a(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(i12);
                    return true;
                case 7:
                    i12 = s2(ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder()), (Uri) a.a(parcel, Uri.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(i12);
                    return true;
                case 8:
                    i12 = H1(ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), (Bundle) a.a(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(i12);
                    return true;
                case 9:
                    i12 = p0(parcel.readInt(), (Uri) a.a(parcel, Uri.CREATOR), (Bundle) a.a(parcel, Bundle.CREATOR), ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(i12);
                    return true;
                case 10:
                    i12 = W1(ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder()), (Bundle) a.a(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(i12);
                    return true;
                case 11:
                    i12 = U1(ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder()), (Uri) a.a(parcel, Uri.CREATOR), (Bundle) a.a(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(i12);
                    return true;
                case 12:
                    ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder());
                    parcel.readInt();
                    i12 = t0();
                    parcel2.writeNoException();
                    parcel2.writeInt(i12);
                    return true;
                case 13:
                    i12 = U2(ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder()), (Bundle) a.a(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(i12);
                    return true;
                case 14:
                    i12 = d2(ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder()), parcel.readStrongBinder(), (Bundle) a.a(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(i12);
                    return true;
                default:
                    return super.onTransact(i10, parcel, parcel2, i11);
            }
        }
    }

    public static class a {
        public static Object a(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        public static <T extends Parcelable> void b(Parcel parcel, T t, int i10) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i10);
            }
        }
    }

    int H1(ICustomTabsCallback iCustomTabsCallback, String str, Bundle bundle);

    boolean T(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle, List<Bundle> list);

    boolean T1(ICustomTabsCallback iCustomTabsCallback);

    boolean U1(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle);

    boolean U2(ICustomTabsCallback iCustomTabsCallback, Bundle bundle);

    boolean W1(ICustomTabsCallback iCustomTabsCallback, Bundle bundle);

    boolean d2(ICustomTabsCallback iCustomTabsCallback, IBinder iBinder, Bundle bundle);

    boolean g1(long j10);

    boolean i2(ICustomTabsCallback iCustomTabsCallback, Bundle bundle);

    boolean p0(int i10, Uri uri, Bundle bundle, ICustomTabsCallback iCustomTabsCallback);

    boolean s2(ICustomTabsCallback iCustomTabsCallback, Uri uri);

    Bundle t();

    boolean t0();
}
