/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package R2;

import R2.D4;
import R2.I;
import R2.N2;
import com.google.android.gms.internal.measurement.y0;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

public final class n4
implements Runnable {
    public final /* synthetic */ y0 o;
    public final /* synthetic */ I p;
    public final /* synthetic */ String q;
    public final /* synthetic */ AppMeasurementDynamiteService r;

    public n4(AppMeasurementDynamiteService appMeasurementDynamiteService, y0 y02, I i8, String string2) {
        this.r = appMeasurementDynamiteService;
        this.o = y02;
        this.p = i8;
        this.q = string2;
    }

    public final void run() {
        this.r.b.J().M(this.o, this.p, this.q);
    }
}

