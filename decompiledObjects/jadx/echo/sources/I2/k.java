package I2;

import H2.a;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class k extends M2.a implements IInterface {
    public k(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final H2.a Z0(H2.a aVar, String str, int i7, H2.a aVar2) {
        Parcel o7 = o();
        M2.c.e(o7, aVar);
        o7.writeString(str);
        o7.writeInt(i7);
        M2.c.e(o7, aVar2);
        Parcel n7 = n(3, o7);
        H2.a o8 = a.AbstractBinderC0037a.o(n7.readStrongBinder());
        n7.recycle();
        return o8;
    }

    public final H2.a v(H2.a aVar, String str, int i7, H2.a aVar2) {
        Parcel o7 = o();
        M2.c.e(o7, aVar);
        o7.writeString(str);
        o7.writeInt(i7);
        M2.c.e(o7, aVar2);
        Parcel n7 = n(2, o7);
        H2.a o8 = a.AbstractBinderC0037a.o(n7.readStrongBinder());
        n7.recycle();
        return o8;
    }
}
