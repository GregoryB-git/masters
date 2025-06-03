// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package I2;

import android.os.Parcel;
import M2.c;
import android.os.IBinder;
import android.os.IInterface;
import M2.a;

public final class j extends a implements IInterface
{
    public j(final IBinder binder) {
        super(binder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }
    
    public final int Z0(final H2.a a, final String s, final boolean b) {
        final Parcel o = this.o();
        M2.c.e(o, (IInterface)a);
        o.writeString(s);
        M2.c.c(o, b);
        final Parcel n = this.n(3, o);
        final int int1 = n.readInt();
        n.recycle();
        return int1;
    }
    
    public final int a1(final H2.a a, final String s, final boolean b) {
        final Parcel o = this.o();
        M2.c.e(o, (IInterface)a);
        o.writeString(s);
        M2.c.c(o, b);
        final Parcel n = this.n(5, o);
        final int int1 = n.readInt();
        n.recycle();
        return int1;
    }
    
    public final H2.a b1(final H2.a a, final String s, final int n) {
        final Parcel o = this.o();
        M2.c.e(o, (IInterface)a);
        o.writeString(s);
        o.writeInt(n);
        final Parcel n2 = this.n(2, o);
        final H2.a o2 = a.a.o(n2.readStrongBinder());
        n2.recycle();
        return o2;
    }
    
    public final H2.a c1(final H2.a a, final String s, final int n, final H2.a a2) {
        final Parcel o = this.o();
        M2.c.e(o, (IInterface)a);
        o.writeString(s);
        o.writeInt(n);
        M2.c.e(o, (IInterface)a2);
        final Parcel n2 = this.n(8, o);
        final H2.a o2 = a.a.o(n2.readStrongBinder());
        n2.recycle();
        return o2;
    }
    
    public final H2.a d1(final H2.a a, final String s, final int n) {
        final Parcel o = this.o();
        M2.c.e(o, (IInterface)a);
        o.writeString(s);
        o.writeInt(n);
        final Parcel n2 = this.n(4, o);
        final H2.a o2 = a.a.o(n2.readStrongBinder());
        n2.recycle();
        return o2;
    }
    
    public final H2.a e1(final H2.a a, final String s, final boolean b, final long n) {
        final Parcel o = this.o();
        M2.c.e(o, (IInterface)a);
        o.writeString(s);
        M2.c.c(o, b);
        o.writeLong(n);
        final Parcel n2 = this.n(7, o);
        final H2.a o2 = a.a.o(n2.readStrongBinder());
        n2.recycle();
        return o2;
    }
    
    public final int v() {
        final Parcel n = this.n(6, this.o());
        final int int1 = n.readInt();
        n.recycle();
        return int1;
    }
}
