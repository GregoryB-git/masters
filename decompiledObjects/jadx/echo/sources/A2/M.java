package A2;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class M implements InterfaceC0325k {

    /* renamed from: b, reason: collision with root package name */
    public final IBinder f388b;

    public M(IBinder iBinder) {
        this.f388b = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f388b;
    }

    @Override // A2.InterfaceC0325k
    public final void h0(InterfaceC0324j interfaceC0324j, C0320f c0320f) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(interfaceC0324j != null ? interfaceC0324j.asBinder() : null);
            if (c0320f != null) {
                obtain.writeInt(1);
                d0.a(c0320f, obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f388b.transact(46, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }
}
