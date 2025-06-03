// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package J2;

import android.os.Parcel;
import android.os.IBinder;

public final class d extends a implements f
{
    public d(final IBinder binder) {
        super(binder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }
    
    @Override
    public final boolean a0(final boolean b) {
        final Parcel n = this.n();
        J2.c.a(n, true);
        final Parcel o = this.o(2, n);
        final boolean b2 = J2.c.b(o);
        o.recycle();
        return b2;
    }
    
    @Override
    public final String c() {
        final Parcel o = this.o(1, this.n());
        final String string = o.readString();
        o.recycle();
        return string;
    }
}
