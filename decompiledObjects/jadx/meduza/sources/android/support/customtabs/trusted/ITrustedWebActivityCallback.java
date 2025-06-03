package android.support.customtabs.trusted;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public interface ITrustedWebActivityCallback extends IInterface {

    /* renamed from: k, reason: collision with root package name */
    public static final String f416k = "android$support$customtabs$trusted$ITrustedWebActivityCallback".replace('$', '.');

    public static abstract class Stub extends Binder implements ITrustedWebActivityCallback {

        public static class a implements ITrustedWebActivityCallback {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f417a;

            public a(IBinder iBinder) {
                this.f417a = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f417a;
            }
        }

        public Stub() {
            attachInterface(this, ITrustedWebActivityCallback.f416k);
        }

        public static ITrustedWebActivityCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(ITrustedWebActivityCallback.f416k);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ITrustedWebActivityCallback)) ? new a(iBinder) : (ITrustedWebActivityCallback) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            String str = ITrustedWebActivityCallback.f416k;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i10 != 2) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            parcel.readString();
            I();
            parcel2.writeNoException();
            return true;
        }
    }

    void I();
}
