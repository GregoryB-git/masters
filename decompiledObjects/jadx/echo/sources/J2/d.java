package J2;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class d extends a implements f {
    public d(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    @Override // J2.f
    public final boolean a0(boolean z7) {
        Parcel n7 = n();
        c.a(n7, true);
        Parcel o7 = o(2, n7);
        boolean b7 = c.b(o7);
        o7.recycle();
        return b7;
    }

    @Override // J2.f
    public final String c() {
        Parcel o7 = o(1, n());
        String readString = o7.readString();
        o7.recycle();
        return readString;
    }
}
