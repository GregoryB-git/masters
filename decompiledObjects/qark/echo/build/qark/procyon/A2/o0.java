// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package A2;

import android.os.Parcel;
import android.os.IBinder;
import M2.a;

public final class o0 extends a implements q0
{
    public o0(final IBinder binder) {
        super(binder, "com.google.android.gms.common.internal.ICertData");
    }
    
    @Override
    public final int c() {
        final Parcel n = this.n(2, this.o());
        final int int1 = n.readInt();
        n.recycle();
        return int1;
    }
    
    @Override
    public final H2.a d() {
        final Parcel n = this.n(1, this.o());
        final H2.a o = H2.a.a.o(n.readStrongBinder());
        n.recycle();
        return o;
    }
}
