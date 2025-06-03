package b2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: b2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0789a implements IInterface {

    /* renamed from: b, reason: collision with root package name */
    public final IBinder f9964b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9965c;

    public AbstractC0789a(IBinder iBinder, String str) {
        this.f9964b = iBinder;
        this.f9965c = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f9964b;
    }

    public final Parcel n() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f9965c);
        return obtain;
    }

    public final Parcel o(Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f9964b.transact(1, parcel, obtain, 0);
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
