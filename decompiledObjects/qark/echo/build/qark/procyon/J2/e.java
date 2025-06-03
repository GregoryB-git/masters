// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package J2;

import android.os.IInterface;
import android.os.IBinder;

public abstract class e extends b implements f
{
    public static f n(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        if (queryLocalInterface instanceof f) {
            return (f)queryLocalInterface;
        }
        return new d(binder);
    }
}
