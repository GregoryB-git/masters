package k7;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class b implements c, IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f9104a;

    public b(IBinder iBinder) {
        this.f9104a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f9104a;
    }

    @Override // k7.c
    public final void c2(String str, Bundle bundle, j7.g gVar) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
        obtain.writeString(str);
        int i10 = a.f9103a;
        obtain.writeInt(1);
        bundle.writeToParcel(obtain, 0);
        obtain.writeStrongBinder(gVar);
        try {
            this.f9104a.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
