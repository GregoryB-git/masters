/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.MotionEvent
 *  android.view.View
 */
package io.flutter.plugin.platform;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import io.flutter.plugin.platform.a;
import u5.r;

public class b
extends r {
    public a u;

    public b(Context context, int n8, int n9, a a8) {
        super(context, n8, n9, r.b.p);
        this.u = a8;
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        a a8 = this.u;
        if (a8 != null && a8.a(motionEvent, true)) {
            return true;
        }
        return View.super.onHoverEvent(motionEvent);
    }
}

