package J2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class a implements IInterface {

    /* renamed from: b, reason: collision with root package name */
    public final IBinder f2682b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2683c = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";

    public a(IBinder iBinder, String str) {
        this.f2682b = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f2682b;
    }

    public final Parcel n() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f2683c);
        return obtain;
    }

    public final Parcel o(int i7, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f2682b.transact(i7, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e7) {
                obtain.recycle();
                throw e7;
            }
        } finally {
            parcel.recycle();
        }
    }
}
