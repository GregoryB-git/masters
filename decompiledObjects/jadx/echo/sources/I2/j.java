package I2;

import H2.a;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class j extends M2.a implements IInterface {
    public j(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int Z0(H2.a aVar, String str, boolean z7) {
        Parcel o7 = o();
        M2.c.e(o7, aVar);
        o7.writeString(str);
        M2.c.c(o7, z7);
        Parcel n7 = n(3, o7);
        int readInt = n7.readInt();
        n7.recycle();
        return readInt;
    }

    public final int a1(H2.a aVar, String str, boolean z7) {
        Parcel o7 = o();
        M2.c.e(o7, aVar);
        o7.writeString(str);
        M2.c.c(o7, z7);
        Parcel n7 = n(5, o7);
        int readInt = n7.readInt();
        n7.recycle();
        return readInt;
    }

    public final H2.a b1(H2.a aVar, String str, int i7) {
        Parcel o7 = o();
        M2.c.e(o7, aVar);
        o7.writeString(str);
        o7.writeInt(i7);
        Parcel n7 = n(2, o7);
        H2.a o8 = a.AbstractBinderC0037a.o(n7.readStrongBinder());
        n7.recycle();
        return o8;
    }

    public final H2.a c1(H2.a aVar, String str, int i7, H2.a aVar2) {
        Parcel o7 = o();
        M2.c.e(o7, aVar);
        o7.writeString(str);
        o7.writeInt(i7);
        M2.c.e(o7, aVar2);
        Parcel n7 = n(8, o7);
        H2.a o8 = a.AbstractBinderC0037a.o(n7.readStrongBinder());
        n7.recycle();
        return o8;
    }

    public final H2.a d1(H2.a aVar, String str, int i7) {
        Parcel o7 = o();
        M2.c.e(o7, aVar);
        o7.writeString(str);
        o7.writeInt(i7);
        Parcel n7 = n(4, o7);
        H2.a o8 = a.AbstractBinderC0037a.o(n7.readStrongBinder());
        n7.recycle();
        return o8;
    }

    public final H2.a e1(H2.a aVar, String str, boolean z7, long j7) {
        Parcel o7 = o();
        M2.c.e(o7, aVar);
        o7.writeString(str);
        M2.c.c(o7, z7);
        o7.writeLong(j7);
        Parcel n7 = n(7, o7);
        H2.a o8 = a.AbstractBinderC0037a.o(n7.readStrongBinder());
        n7.recycle();
        return o8;
    }

    public final int v() {
        Parcel n7 = n(6, o());
        int readInt = n7.readInt();
        n7.recycle();
        return readInt;
    }
}
