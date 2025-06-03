// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package io.flutter.plugin.platform;

import android.view.Display;
import androidx.window.layout.d;
import android.view.WindowMetrics;
import t5.b;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import java.util.function.Consumer;
import java.util.concurrent.Executor;
import android.view.WindowManager;

public abstract class x implements WindowManager
{
    public final WindowManager o;
    public s p;
    
    public x(final WindowManager o, final s p2) {
        this.o = o;
        this.p = p2;
    }
    
    public void addCrossWindowBlurEnabledListener(final Executor executor, final Consumer consumer) {
        w.a(this.o, executor, consumer);
    }
    
    public void addCrossWindowBlurEnabledListener(final Consumer consumer) {
        v.a(this.o, consumer);
    }
    
    public void addView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        final s p2 = this.p;
        if (p2 == null) {
            b.g("PlatformViewsController", "Embedded view called addView while detached from presentation");
            return;
        }
        p2.addView(view, viewGroup$LayoutParams);
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
    
    public void removeCrossWindowBlurEnabledListener(final Consumer consumer) {
        u.a(this.o, consumer);
    }
    
    public void removeView(final View view) {
        final s p = this.p;
        if (p == null) {
            b.g("PlatformViewsController", "Embedded view called removeView while detached from presentation");
            return;
        }
        p.removeView(view);
    }
    
    public void removeViewImmediate(final View view) {
        if (this.p == null) {
            b.g("PlatformViewsController", "Embedded view called removeViewImmediate while detached from presentation");
            return;
        }
        view.clearAnimation();
        this.p.removeView(view);
    }
    
    public void updateViewLayout(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        final s p2 = this.p;
        if (p2 == null) {
            b.g("PlatformViewsController", "Embedded view called updateViewLayout while detached from presentation");
            return;
        }
        p2.updateViewLayout(view, viewGroup$LayoutParams);
    }
}
