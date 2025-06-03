// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.internal.measurement.y0;

public final class N4 implements Runnable
{
    public final /* synthetic */ y0 o;
    public final /* synthetic */ String p;
    public final /* synthetic */ String q;
    public final /* synthetic */ AppMeasurementDynamiteService r;
    
    public N4(final AppMeasurementDynamiteService r, final y0 o, final String p4, final String q) {
        this.r = r;
        this.o = o;
        this.p = p4;
        this.q = q;
    }
    
    @Override
    public final void run() {
        this.r.b.J().N(this.o, this.p, this.q);
    }
}
