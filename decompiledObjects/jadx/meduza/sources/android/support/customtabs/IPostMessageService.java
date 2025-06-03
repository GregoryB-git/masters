package android.support.customtabs;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.support.customtabs.ICustomTabsCallback;

/* loaded from: classes.dex */
public interface IPostMessageService extends IInterface {

    /* renamed from: j, reason: collision with root package name */
    public static final String f414j = "android$support$customtabs$IPostMessageService".replace('$', '.');

    public static abstract class Stub extends Binder implements IPostMessageService {

        public static class a implements IPostMessageService {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f415a;

            public a(IBinder iBinder) {
                this.f415a = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f415a;
            }
        }

        public Stub() {
            attachInterface(this, IPostMessageService.f414j);
        }

        public static IPostMessageService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IPostMessageService.f414j);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IPostMessageService)) ? new a(iBinder) : (IPostMessageService) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            String str = IPostMessageService.f414j;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i10 == 2) {
                ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder());
                P0();
            } else {
                if (i10 != 3) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                ICustomTabsCallback.Stub.asInterface(parcel.readStrongBinder());
                parcel.readString();
                D2();
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void D2();

    void P0();
}
