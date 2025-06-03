package A2;

import H2.a;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class o0 extends M2.a implements q0 {
    public o0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // A2.q0
    public final int c() {
        Parcel n7 = n(2, o());
        int readInt = n7.readInt();
        n7.recycle();
        return readInt;
    }

    @Override // A2.q0
    public final H2.a d() {
        Parcel n7 = n(1, o());
        H2.a o7 = a.AbstractBinderC0037a.o(n7.readStrongBinder());
        n7.recycle();
        return o7;
    }
}
