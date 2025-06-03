package io.flutter.plugin.platform;

import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowMetrics;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import t5.AbstractC1995b;

/* loaded from: classes.dex */
public abstract class x implements WindowManager {

    /* renamed from: o, reason: collision with root package name */
    public final WindowManager f15113o;

    /* renamed from: p, reason: collision with root package name */
    public s f15114p;

    public x(WindowManager windowManager, s sVar) {
        this.f15113o = windowManager;
        this.f15114p = sVar;
    }

    @Override // android.view.WindowManager
    public void addCrossWindowBlurEnabledListener(Executor executor, Consumer consumer) {
        this.f15113o.addCrossWindowBlurEnabledListener(executor, consumer);
    }

    @Override // android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        s sVar = this.f15114p;
        if (sVar == null) {
            AbstractC1995b.g("PlatformViewsController", "Embedded view called addView while detached from presentation");
        } else {
            sVar.addView(view, layoutParams);
        }
    }

    @Override // android.view.WindowManager
    public WindowMetrics getCurrentWindowMetrics() {
        WindowMetrics currentWindowMetrics;
        currentWindowMetrics = this.f15113o.getCurrentWindowMetrics();
        return currentWindowMetrics;
    }

    @Override // android.view.WindowManager
    public Display getDefaultDisplay() {
        return this.f15113o.getDefaultDisplay();
    }

    @Override // android.view.WindowManager
    public WindowMetrics getMaximumWindowMetrics() {
        WindowMetrics maximumWindowMetrics;
        maximumWindowMetrics = this.f15113o.getMaximumWindowMetrics();
        return maximumWindowMetrics;
    }

    @Override // android.view.WindowManager
    public boolean isCrossWindowBlurEnabled() {
        boolean isCrossWindowBlurEnabled;
        isCrossWindowBlurEnabled = this.f15113o.isCrossWindowBlurEnabled();
        return isCrossWindowBlurEnabled;
    }

    @Override // android.view.WindowManager
    public void removeCrossWindowBlurEnabledListener(Consumer consumer) {
        this.f15113o.removeCrossWindowBlurEnabledListener(consumer);
    }

    @Override // android.view.ViewManager
    public void removeView(View view) {
        s sVar = this.f15114p;
        if (sVar == null) {
            AbstractC1995b.g("PlatformViewsController", "Embedded view called removeView while detached from presentation");
        } else {
            sVar.removeView(view);
        }
    }

    @Override // android.view.WindowManager
    public void removeViewImmediate(View view) {
        if (this.f15114p == null) {
            AbstractC1995b.g("PlatformViewsController", "Embedded view called removeViewImmediate while detached from presentation");
        } else {
            view.clearAnimation();
            this.f15114p.removeView(view);
        }
    }

    @Override // android.view.ViewManager
    public void updateViewLayout(View view, ViewGroup.LayoutParams layoutParams) {
        s sVar = this.f15114p;
        if (sVar == null) {
            AbstractC1995b.g("PlatformViewsController", "Embedded view called updateViewLayout while detached from presentation");
        } else {
            sVar.updateViewLayout(view, layoutParams);
        }
    }

    @Override // android.view.WindowManager
    public void addCrossWindowBlurEnabledListener(Consumer consumer) {
        this.f15113o.addCrossWindowBlurEnabledListener(consumer);
    }
}
