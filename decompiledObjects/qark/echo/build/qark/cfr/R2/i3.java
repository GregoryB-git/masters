/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 */
package R2;

import R2.D4;
import R2.N2;
import com.google.android.gms.internal.measurement.y0;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

public final class i3
implements Runnable {
    public final /* synthetic */ y0 o;
    public final /* synthetic */ AppMeasurementDynamiteService p;

    public i3(AppMeasurementDynamiteService appMeasurementDynamiteService, y0 y02) {
        this.p = appMeasurementDynamiteService;
        this.o = y02;
    }

    public final void run() {
        this.p.b.J().L(this.o);
    }
}

