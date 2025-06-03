package android.support.customtabs.trusted;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public interface ITrustedWebActivityService extends IInterface {

    /* renamed from: l, reason: collision with root package name */
    public static final String f418l = "android$support$customtabs$trusted$ITrustedWebActivityService".replace('$', '.');

    public static abstract class Stub extends Binder implements ITrustedWebActivityService {

        public static class a implements ITrustedWebActivityService {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f419a;

            public a(IBinder iBinder) {
                this.f419a = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f419a;
            }
        }

        public Stub() {
            attachInterface(this, ITrustedWebActivityService.f418l);
        }

        public static ITrustedWebActivityService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(ITrustedWebActivityService.f418l);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ITrustedWebActivityService)) ? new a(iBinder) : (ITrustedWebActivityService) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            Bundle J2;
            String str = ITrustedWebActivityService.f418l;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i10) {
                case 2:
                    J2 = J2();
                    parcel2.writeNoException();
                    a.b(parcel2, J2);
                    return true;
                case 3:
                    X0();
                    parcel2.writeNoException();
                    return true;
                case 4:
                    int A1 = A1();
                    parcel2.writeNoException();
                    parcel2.writeInt(A1);
                    return true;
                case 5:
                    J2 = c0();
                    parcel2.writeNoException();
                    a.b(parcel2, J2);
                    return true;
                case 6:
                    J2 = B1();
                    parcel2.writeNoException();
                    a.b(parcel2, J2);
                    return true;
                case 7:
                    J2 = D1();
                    parcel2.writeNoException();
                    a.b(parcel2, J2);
                    return true;
                case 8:
                default:
                    return super.onTransact(i10, parcel, parcel2, i11);
                case 9:
                    parcel.readString();
                    parcel.readStrongBinder();
                    J2 = t();
                    parcel2.writeNoException();
                    a.b(parcel2, J2);
                    return true;
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

        public static void b(Parcel parcel, Bundle bundle) {
            if (bundle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                bundle.writeToParcel(parcel, 1);
            }
        }
    }

    int A1();

    Bundle B1();

    Bundle D1();

    Bundle J2();

    void X0();

    Bundle c0();

    Bundle t();
}
