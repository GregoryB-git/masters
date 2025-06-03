package androidx.media2.session;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.media2.session.IMediaController;
import androidx.versionedparcelable.ParcelImpl;

/* loaded from: classes.dex */
public interface IMediaSessionService extends IInterface {

    public static abstract class Stub extends Binder implements IMediaSessionService {

        public static class a implements IMediaSessionService {

            /* renamed from: b, reason: collision with root package name */
            public static IMediaSessionService f1084b;

            /* renamed from: a, reason: collision with root package name */
            public IBinder f1085a;

            public a(IBinder iBinder) {
                this.f1085a = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f1085a;
            }
        }

        public Stub() {
            attachInterface(this, "androidx.media2.session.IMediaSessionService");
        }

        public static IMediaSessionService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.media2.session.IMediaSessionService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IMediaSessionService)) ? new a(iBinder) : (IMediaSessionService) queryLocalInterface;
        }

        public static IMediaSessionService getDefaultImpl() {
            return a.f1084b;
        }

        public static boolean setDefaultImpl(IMediaSessionService iMediaSessionService) {
            if (a.f1084b != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iMediaSessionService == null) {
                return false;
            }
            a.f1084b = iMediaSessionService;
            return true;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 != 1) {
                if (i10 != 1598968902) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                parcel2.writeString("androidx.media2.session.IMediaSessionService");
                return true;
            }
            parcel.enforceInterface("androidx.media2.session.IMediaSessionService");
            IMediaController.Stub.asInterface(parcel.readStrongBinder());
            if (parcel.readInt() != 0) {
                ParcelImpl.CREATOR.createFromParcel(parcel);
            }
            n();
            return true;
        }
    }

    void n();
}
