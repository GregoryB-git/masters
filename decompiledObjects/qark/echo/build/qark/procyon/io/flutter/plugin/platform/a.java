// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package io.flutter.plugin.platform;

import android.view.MotionEvent;
import io.flutter.view.i;

public class a
{
    public i a;
    
    public boolean a(final MotionEvent motionEvent, final boolean b) {
        final i a = this.a;
        return a != null && a.L(motionEvent, b);
    }
    
    public void b(final i a) {
        this.a = a;
    }
}
