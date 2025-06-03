/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Looper
 *  java.lang.String
 */
package R2;

import A2.c;
import R2.R1;
import R2.T1;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

public final class Z1
extends c {
    public Z1(Context context, Looper looper, c.a a8, c.b b8) {
        super(context, looper, 93, a8, b8, null);
    }

    @Override
    public final String E() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override
    public final String F() {
        return "com.google.android.gms.measurement.START";
    }

    @Override
    public final int h() {
        return 12451000;
    }

    @Override
    public final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        if (iInterface instanceof R1) {
            return (R1)iInterface;
        }
        return new T1(iBinder);
    }
}

