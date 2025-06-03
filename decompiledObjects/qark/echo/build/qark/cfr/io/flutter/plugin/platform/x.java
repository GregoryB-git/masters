/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.view.Display
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.WindowManager
 *  android.view.WindowMetrics
 *  java.lang.Object
 *  java.util.concurrent.Executor
 *  java.util.function.Consumer
 */
package io.flutter.plugin.platform;

import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowMetrics;
import androidx.window.layout.d;
import io.flutter.plugin.platform.s;
import io.flutter.plugin.platform.t;
import io.flutter.plugin.platform.u;
import io.flutter.plugin.platform.v;
import io.flutter.plugin.platform.w;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import t5.b;

public abstract class x
implements WindowManager {
    public final WindowManager o;
    public s p;

    public x(WindowManager windowManager, s s8) {
        this.o = windowManager;
        this.p = s8;
    }

    public void addCrossWindowBlurEnabledListener(Executor executor, Consumer consumer) {
        w.a(this.o, executor, consumer);
    }

    public void addCrossWindowBlurEnabledListener(Consumer consumer) {
        v.a(this.o, consumer);
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        s s8 = this.p;
        if (s8 == null) {
            b.g("PlatformViewsController", "Embedded view called addView while detached from presentation");
            return;
        }
        s8.addView(view, layoutParams);
    }

    public WindowMetrics getCurrentWindowMetrics() {
        return d.a(this.o);
    }

    public Display getDefaultDisplay() {
        return this.o.getDefaultDisplay();
    }

    public WindowMetrics getMaximumWindowMetrics() {
        return androidx.window.layout.b.a(this.o);
    }

    public boolean isCrossWindowBlurEnabled() {
        return t.a(this.o);
    }

    public void removeCrossWindowBlurEnabledListener(Consumer consumer) {
        u.a(this.o, consumer);
    }

    public void removeView(View view) {
        s s8 = this.p;
        if (s8 == null) {
            b.g("PlatformViewsController", "Embedded view called removeView while detached from presentation");
            return;
        }
        s8.removeView(view);
    }

    public void removeViewImmediate(View view) {
        if (this.p == null) {
            b.g("PlatformViewsController", "Embedded view called removeViewImmediate while detached from presentation");
            return;
        }
        view.clearAnimation();
        this.p.removeView(view);
    }

    public void updateViewLayout(View view, ViewGroup.LayoutParams layoutParams) {
        s s8 = this.p;
        if (s8 == null) {
            b.g("PlatformViewsController", "Embedded view called updateViewLayout while detached from presentation");
            return;
        }
        s8.updateViewLayout(view, layoutParams);
    }
}

