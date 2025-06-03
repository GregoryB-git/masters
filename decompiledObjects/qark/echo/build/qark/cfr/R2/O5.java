/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 */
package R2;

import R2.N2;
import R2.S5;
import com.google.android.gms.internal.measurement.y0;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

public final class O5
implements Runnable {
    public final /* synthetic */ y0 o;
    public final /* synthetic */ AppMeasurementDynamiteService p;

    public O5(AppMeasurementDynamiteService appMeasurementDynamiteService, y0 y02) {
        this.p = appMeasurementDynamiteService;
        this.o = y02;
    }

    public final void run() {
        this.p.b.L().X(this.o, this.p.b.o());
    }
}

