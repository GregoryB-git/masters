// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.internal.measurement.y0;

public final class O5 implements Runnable
{
    public final /* synthetic */ y0 o;
    public final /* synthetic */ AppMeasurementDynamiteService p;
    
    public O5(final AppMeasurementDynamiteService p2, final y0 o) {
        this.p = p2;
        this.o = o;
    }
    
    @Override
    public final void run() {
        this.p.b.L().X(this.o, this.p.b.o());
    }
}
