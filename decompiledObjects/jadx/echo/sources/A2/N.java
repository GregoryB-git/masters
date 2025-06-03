package A2;

import android.os.IBinder;
import android.os.Parcel;
import x2.C2176F;
import x2.C2178H;
import x2.C2180J;

/* loaded from: classes.dex */
public final class N extends M2.a implements P {
    public N(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // A2.P
    public final C2178H B0(C2176F c2176f) {
        Parcel o7 = o();
        M2.c.d(o7, c2176f);
        Parcel n7 = n(6, o7);
        C2178H c2178h = (C2178H) M2.c.a(n7, C2178H.CREATOR);
        n7.recycle();
        return c2178h;
    }

    @Override // A2.P
    public final boolean e0(C2180J c2180j, H2.a aVar) {
        Parcel o7 = o();
        M2.c.d(o7, c2180j);
        M2.c.e(o7, aVar);
        Parcel n7 = n(5, o7);
        boolean f7 = M2.c.f(n7);
        n7.recycle();
        return f7;
    }

    @Override // A2.P
    public final boolean h() {
        Parcel n7 = n(7, o());
        boolean f7 = M2.c.f(n7);
        n7.recycle();
        return f7;
    }

    @Override // A2.P
    public final C2178H i0(C2176F c2176f) {
        Parcel o7 = o();
        M2.c.d(o7, c2176f);
        Parcel n7 = n(8, o7);
        C2178H c2178h = (C2178H) M2.c.a(n7, C2178H.CREATOR);
        n7.recycle();
        return c2178h;
    }
}
