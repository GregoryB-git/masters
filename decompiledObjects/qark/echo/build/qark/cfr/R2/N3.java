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
import R2.N2;
import com.google.android.gms.internal.measurement.y0;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

public final class N3
implements Runnable {
    public final /* synthetic */ y0 o;
    public final /* synthetic */ String p;
    public final /* synthetic */ String q;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ AppMeasurementDynamiteService s;

    public N3(AppMeasurementDynamiteService appMeasurementDynamiteService, y0 y02, String string2, String string3, boolean bl) {
        this.s = appMeasurementDynamiteService;
        this.o = y02;
        this.p = string2;
        this.q = string3;
        this.r = bl;
    }

    public final void run() {
        this.s.b.J().O(this.o, this.p, this.q, this.r);
    }
}

