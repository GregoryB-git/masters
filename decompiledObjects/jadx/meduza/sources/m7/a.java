package m7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public class a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f10339a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10340b;

    public a(IBinder iBinder, String str) {
        this.f10339a = iBinder;
        this.f10340b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f10339a;
    }

    public final void g(int i10, Parcel parcel) {
        try {
            this.f10339a.transact(i10, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
