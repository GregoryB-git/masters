/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  java.lang.Object
 *  java.lang.String
 */
package I2;

import H2.a;
import M2.a;
import M2.c;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class j
extends a
implements IInterface {
    public j(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int Z0(H2.a a8, String string2, boolean bl) {
        Parcel parcel = this.o();
        c.e(parcel, a8);
        parcel.writeString(string2);
        c.c(parcel, bl);
        a8 = this.n(3, parcel);
        int n8 = a8.readInt();
        a8.recycle();
        return n8;
    }

    public final int a1(H2.a a8, String string2, boolean bl) {
        Parcel parcel = this.o();
        c.e(parcel, a8);
        parcel.writeString(string2);
        c.c(parcel, bl);
        a8 = this.n(5, parcel);
        int n8 = a8.readInt();
        a8.recycle();
        return n8;
    }

    public final H2.a b1(H2.a a8, String object, int n8) {
        Parcel parcel = this.o();
        c.e(parcel, a8);
        parcel.writeString((String)object);
        parcel.writeInt(n8);
        a8 = this.n(2, parcel);
        object = a.a.o(a8.readStrongBinder());
        a8.recycle();
        return object;
    }

    public final H2.a c1(H2.a a8, String object, int n8, H2.a a9) {
        Parcel parcel = this.o();
        c.e(parcel, a8);
        parcel.writeString((String)object);
        parcel.writeInt(n8);
        c.e(parcel, a9);
        a8 = this.n(8, parcel);
        object = a.a.o(a8.readStrongBinder());
        a8.recycle();
        return object;
    }

    public final H2.a d1(H2.a a8, String object, int n8) {
        Parcel parcel = this.o();
        c.e(parcel, a8);
        parcel.writeString((String)object);
        parcel.writeInt(n8);
        a8 = this.n(4, parcel);
        object = a.a.o(a8.readStrongBinder());
        a8.recycle();
        return object;
    }

    public final H2.a e1(H2.a a8, String object, boolean bl, long l8) {
        Parcel parcel = this.o();
        c.e(parcel, a8);
        parcel.writeString((String)object);
        c.c(parcel, bl);
        parcel.writeLong(l8);
        a8 = this.n(7, parcel);
        object = a.a.o(a8.readStrongBinder());
        a8.recycle();
        return object;
    }

    public final int v() {
        Parcel parcel = this.n(6, this.o());
        int n8 = parcel.readInt();
        parcel.recycle();
        return n8;
    }
}

