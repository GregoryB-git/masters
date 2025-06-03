// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import android.content.ComponentName;

public final class e5 implements Runnable
{
    public final /* synthetic */ a5 o;
    
    public e5(final a5 o) {
        this.o = o;
    }
    
    @Override
    public final void run() {
        D4.I(this.o.c, new ComponentName(this.o.c.a(), "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
