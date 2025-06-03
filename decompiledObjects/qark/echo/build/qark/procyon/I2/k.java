// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package I2;

import android.os.Parcel;
import M2.c;
import android.os.IBinder;
import android.os.IInterface;
import M2.a;

public final class k extends a implements IInterface
{
    public k(final IBinder binder) {
        super(binder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }
    
    public final H2.a Z0(final H2.a a, final String s, final int n, final H2.a a2) {
        final Parcel o = this.o();
        M2.c.e(o, (IInterface)a);
        o.writeString(s);
        o.writeInt(n);
        M2.c.e(o, (IInterface)a2);
        final Parcel n2 = this.n(3, o);
        final H2.a o2 = a.a.o(n2.readStrongBinder());
        n2.recycle();
        return o2;
    }
    
    public final H2.a v(final H2.a a, final String s, final int n, final H2.a a2) {
        final Parcel o = this.o();
        M2.c.e(o, (IInterface)a);
        o.writeString(s);
        o.writeInt(n);
        M2.c.e(o, (IInterface)a2);
        final Parcel n2 = this.n(2, o);
        final H2.a o2 = a.a.o(n2.readStrongBinder());
        n2.recycle();
        return o2;
    }
}
