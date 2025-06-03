package K2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class a implements IInterface {

    /* renamed from: b, reason: collision with root package name */
    public final IBinder f3183b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3184c;

    public a(IBinder iBinder, String str) {
        this.f3183b = iBinder;
        this.f3184c = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f3183b;
    }

    public final Parcel n() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f3184c);
        return obtain;
    }

    public final void o(int i7, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f3183b.transact(i7, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public final void v(int i7, Parcel parcel) {
        try {
            this.f3183b.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
