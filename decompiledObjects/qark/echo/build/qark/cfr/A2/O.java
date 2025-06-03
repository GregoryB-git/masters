/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  java.lang.String
 */
package A2;

import A2.N;
import A2.P;
import M2.b;
import android.os.IBinder;
import android.os.IInterface;

public abstract class O
extends b
implements P {
    public static P o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        if (iInterface instanceof P) {
            return (P)iInterface;
        }
        return new N(iBinder);
    }
}

