package M2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class a implements IInterface {

    /* renamed from: b, reason: collision with root package name */
    public final IBinder f3500b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3501c;

    public a(IBinder iBinder, String str) {
        this.f3500b = iBinder;
        this.f3501c = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f3500b;
    }

    public final Parcel n(int i7, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f3500b.transact(i7, parcel, obtain, 0);
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

    public final Parcel o() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f3501c);
        return obtain;
    }
}
