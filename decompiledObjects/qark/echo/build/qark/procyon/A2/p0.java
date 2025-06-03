// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package A2;

import H2.a;
import M2.c;
import android.os.Parcel;
import android.os.IInterface;
import android.os.IBinder;
import M2.b;

public abstract class p0 extends b implements q0
{
    public p0() {
        super("com.google.android.gms.common.internal.ICertData");
    }
    
    public static q0 o(final IBinder binder) {
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        if (queryLocalInterface instanceof q0) {
            return (q0)queryLocalInterface;
        }
        return new o0(binder);
    }
    
    @Override
    public final boolean n(int c, final Parcel parcel, final Parcel parcel2, final int n) {
        if (c == 1) {
            final a d = this.d();
            parcel2.writeNoException();
            c.e(parcel2, (IInterface)d);
            return true;
        }
        if (c != 2) {
            return false;
        }
        c = this.c();
        parcel2.writeNoException();
        parcel2.writeInt(c);
        return true;
    }
}
