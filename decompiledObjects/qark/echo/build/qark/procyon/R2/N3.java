// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.internal.measurement.y0;

public final class N3 implements Runnable
{
    public final /* synthetic */ y0 o;
    public final /* synthetic */ String p;
    public final /* synthetic */ String q;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ AppMeasurementDynamiteService s;
    
    public N3(final AppMeasurementDynamiteService s, final y0 o, final String p5, final String q, final boolean r) {
        this.s = s;
        this.o = o;
        this.p = p5;
        this.q = q;
        this.r = r;
    }
    
    @Override
    public final void run() {
        this.s.b.J().O(this.o, this.p, this.q, this.r);
    }
}
