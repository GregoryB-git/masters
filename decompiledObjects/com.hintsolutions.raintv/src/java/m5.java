/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.ActivityManager
 *  android.app.usage.UsageStatsManager
 *  android.telephony.CellIdentityLte
 *  android.view.DisplayCutout
 *  android.view.View
 *  android.view.View$OnUnhandledKeyEventListener
 *  android.view.ViewConfiguration
 *  android.view.Window
 *  android.view.WindowInsets
 *  java.lang.CharSequence
 *  java.lang.Object
 */
import android.app.ActivityManager;
import android.app.usage.UsageStatsManager;
import android.telephony.CellIdentityLte;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.Window;
import android.view.WindowInsets;

public final class m5 {
    public static /* bridge */ /* synthetic */ int a(UsageStatsManager usageStatsManager) {
        return usageStatsManager.getAppStandbyBucket();
    }

    public static /* bridge */ /* synthetic */ int b(CellIdentityLte cellIdentityLte) {
        return cellIdentityLte.getBandwidth();
    }

    public static /* bridge */ /* synthetic */ int c(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHoverSlop();
    }

    public static /* bridge */ /* synthetic */ DisplayCutout d(WindowInsets windowInsets) {
        return windowInsets.getDisplayCutout();
    }

    public static /* bridge */ /* synthetic */ View e(int n, View view) {
        return view.requireViewById(n);
    }

    public static /* bridge */ /* synthetic */ View f(Window window, int n) {
        return window.requireViewById(n);
    }

    public static /* bridge */ /* synthetic */ WindowInsets g(WindowInsets windowInsets) {
        return windowInsets.consumeDisplayCutout();
    }

    public static /* bridge */ /* synthetic */ CharSequence h(View view) {
        return view.getAccessibilityPaneTitle();
    }

    public static /* bridge */ /* synthetic */ void i(View view, View.OnUnhandledKeyEventListener onUnhandledKeyEventListener) {
        view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
    }

    public static /* bridge */ /* synthetic */ void j(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    public static /* bridge */ /* synthetic */ void k(View view, boolean bl) {
        view.setAccessibilityHeading(bl);
    }

    public static /* bridge */ /* synthetic */ boolean l(ActivityManager activityManager) {
        return activityManager.isBackgroundRestricted();
    }

    public static /* bridge */ /* synthetic */ boolean m(View view) {
        return view.isAccessibilityHeading();
    }

    public static /* bridge */ /* synthetic */ boolean n(ViewConfiguration viewConfiguration) {
        return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
    }
}

