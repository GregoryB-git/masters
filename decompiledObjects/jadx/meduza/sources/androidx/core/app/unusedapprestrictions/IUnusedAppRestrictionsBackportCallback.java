package androidx.core.app.unusedapprestrictions;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public interface IUnusedAppRestrictionsBackportCallback extends IInterface {

    /* renamed from: p, reason: collision with root package name */
    public static final String f937p = "androidx$core$app$unusedapprestrictions$IUnusedAppRestrictionsBackportCallback".replace('$', '.');

    public static abstract class Stub extends Binder implements IUnusedAppRestrictionsBackportCallback {

        public static class a implements IUnusedAppRestrictionsBackportCallback {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f938a;

            public a(IBinder iBinder) {
                this.f938a = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f938a;
            }
        }

        public Stub() {
            attachInterface(this, IUnusedAppRestrictionsBackportCallback.f937p);
        }

        public static IUnusedAppRestrictionsBackportCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IUnusedAppRestrictionsBackportCallback.f937p);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IUnusedAppRestrictionsBackportCallback)) ? new a(iBinder) : (IUnusedAppRestrictionsBackportCallback) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            String str = IUnusedAppRestrictionsBackportCallback.f937p;
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
            parcel.readInt();
            parcel.readInt();
            o0();
            return true;
        }
    }

    void o0();
}
