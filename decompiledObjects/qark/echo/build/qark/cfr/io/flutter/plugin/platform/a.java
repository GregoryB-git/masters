/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.view.MotionEvent
 *  java.lang.Object
 */
package io.flutter.plugin.platform;

import android.view.MotionEvent;
import io.flutter.view.i;

public class a {
    public i a;

    public boolean a(MotionEvent motionEvent, boolean bl) {
        i i8 = this.a;
        if (i8 == null) {
            return false;
        }
        return i8.L(motionEvent, bl);
    }

    public void b(i i8) {
        this.a = i8;
    }
}

