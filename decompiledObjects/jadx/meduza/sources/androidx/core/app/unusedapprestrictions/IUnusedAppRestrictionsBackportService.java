package androidx.core.app.unusedapprestrictions;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback;

/* loaded from: classes.dex */
public interface IUnusedAppRestrictionsBackportService extends IInterface {

    /* renamed from: q, reason: collision with root package name */
    public static final String f939q = "androidx$core$app$unusedapprestrictions$IUnusedAppRestrictionsBackportService".replace('$', '.');

    public static abstract class Stub extends Binder implements IUnusedAppRestrictionsBackportService {

        public static class a implements IUnusedAppRestrictionsBackportService {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f940a;

            public a(IBinder iBinder) {
                this.f940a = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f940a;
            }
        }

        public Stub() {
            attachInterface(this, IUnusedAppRestrictionsBackportService.f939q);
        }

        public static IUnusedAppRestrictionsBackportService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IUnusedAppRestrictionsBackportService.f939q);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IUnusedAppRestrictionsBackportService)) ? new a(iBinder) : (IUnusedAppRestrictionsBackportService) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            String str = IUnusedAppRestrictionsBackportService.f939q;
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
            IUnusedAppRestrictionsBackportCallback.Stub.asInterface(parcel.readStrongBinder());
            W0();
            return true;
        }
    }

    void W0();
}
