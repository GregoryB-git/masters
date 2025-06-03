/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  java.lang.String
 */
package J2;

import J2.b;
import J2.d;
import J2.f;
import android.os.IBinder;
import android.os.IInterface;

public abstract class e
extends b
implements f {
    public static f n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        if (iInterface instanceof f) {
            return (f)iInterface;
        }
        return new d(iBinder);
    }
}

