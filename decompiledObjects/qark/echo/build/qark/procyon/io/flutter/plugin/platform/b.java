// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package io.flutter.plugin.platform;

import android.view.MotionEvent;
import android.content.Context;
import u5.r;

public class b extends r
{
    public a u;
    
    public b(final Context context, final int n, final int n2, final a u) {
        super(context, n, n2, u5.r.b.p);
        this.u = u;
    }
    
    public boolean onHoverEvent(final MotionEvent motionEvent) {
        final a u = this.u;
        return (u != null && u.a(motionEvent, true)) || super.onHoverEvent(motionEvent);
    }
}
