/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package R2;

import R2.D4;
import R2.a5;
import android.content.ComponentName;
import android.content.Context;

public final class e5
implements Runnable {
    public final /* synthetic */ a5 o;

    public e5(a5 a52) {
        this.o = a52;
    }

    public final void run() {
        D4.I(this.o.c, new ComponentName(this.o.c.a(), "com.google.android.gms.measurement.AppMeasurementService"));
    }
}

