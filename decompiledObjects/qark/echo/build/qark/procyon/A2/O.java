// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package A2;

import android.os.IInterface;
import android.os.IBinder;
import M2.b;

public abstract class O extends b implements P
{
    public static P o(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        if (queryLocalInterface instanceof P) {
            return (P)queryLocalInterface;
        }
        return new N(binder);
    }
}
