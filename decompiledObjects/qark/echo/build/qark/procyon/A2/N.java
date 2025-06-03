// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package A2;

import android.os.IInterface;
import x2.J;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import M2.c;
import x2.H;
import x2.F;
import android.os.IBinder;
import M2.a;

public final class N extends a implements P
{
    public N(final IBinder binder) {
        super(binder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }
    
    @Override
    public final H B0(final F f) {
        final Parcel o = this.o();
        M2.c.d(o, (Parcelable)f);
        final Parcel n = this.n(6, o);
        final H h = (H)M2.c.a(n, H.CREATOR);
        n.recycle();
        return h;
    }
    
    @Override
    public final boolean e0(final J j, final H2.a a) {
        final Parcel o = this.o();
        M2.c.d(o, (Parcelable)j);
        M2.c.e(o, (IInterface)a);
        final Parcel n = this.n(5, o);
        final boolean f = M2.c.f(n);
        n.recycle();
        return f;
    }
    
    @Override
    public final boolean h() {
        final Parcel n = this.n(7, this.o());
        final boolean f = M2.c.f(n);
        n.recycle();
        return f;
    }
    
    @Override
    public final H i0(final F f) {
        final Parcel o = this.o();
        M2.c.d(o, (Parcelable)f);
        final Parcel n = this.n(8, o);
        final H h = (H)M2.c.a(n, H.CREATOR);
        n.recycle();
        return h;
    }
}
