// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package I;

import android.view.MotionEvent;

public abstract class j
{
    public static boolean a(final MotionEvent motionEvent, final int n) {
        return (motionEvent.getSource() & n) == n;
    }
}
