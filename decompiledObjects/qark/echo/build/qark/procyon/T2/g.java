// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package T2;

import android.os.Parcel;
import android.os.Parcelable;
import K2.c;
import android.os.IBinder;
import android.os.IInterface;
import K2.a;

public final class g extends a implements IInterface
{
    public g(final IBinder binder) {
        super(binder, "com.google.android.gms.signin.internal.ISignInService");
    }
    
    public final void Z0(final j j, final f f) {
        final Parcel n = this.n();
        K2.c.c(n, (Parcelable)j);
        K2.c.d(n, (IInterface)f);
        this.o(12, n);
    }
}
