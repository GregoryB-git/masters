/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.view.MotionEvent
 *  java.lang.Object
 */
package I;

import android.view.MotionEvent;

public abstract class j {
    public static boolean a(MotionEvent motionEvent, int n8) {
        if ((motionEvent.getSource() & n8) == n8) {
            return true;
        }
        return false;
    }
}

