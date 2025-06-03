/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.ShortcutInfo
 *  android.content.pm.ShortcutManager
 *  android.graphics.Insets
 *  android.telephony.TelephonyManager
 *  android.view.Display
 *  android.view.View
 *  android.view.Window
 *  android.view.WindowInsets
 *  android.view.WindowInsets$Builder
 *  android.view.WindowInsetsAnimation$Callback
 *  android.view.WindowInsetsController
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.util.List
 */
import android.content.Context;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Insets;
import android.telephony.TelephonyManager;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsController;
import java.util.List;

public final class l4 {
    public static /* bridge */ /* synthetic */ int a(TelephonyManager telephonyManager) {
        return telephonyManager.getSubscriptionId();
    }

    public static /* bridge */ /* synthetic */ Insets b(WindowInsets windowInsets, int n) {
        return windowInsets.getInsetsIgnoringVisibility(n);
    }

    public static /* bridge */ /* synthetic */ Display c(Context context) {
        return context.getDisplay();
    }

    public static /* bridge */ /* synthetic */ WindowInsetsController d(View view) {
        return view.getWindowInsetsController();
    }

    public static /* bridge */ /* synthetic */ WindowInsetsController e(Window window) {
        return window.getInsetsController();
    }

    public static /* bridge */ /* synthetic */ CharSequence f(View view) {
        return view.getStateDescription();
    }

    public static /* bridge */ /* synthetic */ List g(ShortcutManager shortcutManager, int n) {
        return shortcutManager.getShortcuts(n);
    }

    public static /* bridge */ /* synthetic */ void h(ShortcutManager shortcutManager, ShortcutInfo shortcutInfo) {
        shortcutManager.pushDynamicShortcut(shortcutInfo);
    }

    public static /* bridge */ /* synthetic */ void i(ShortcutManager shortcutManager, List list) {
        shortcutManager.removeLongLivedShortcuts(list);
    }

    public static /* bridge */ /* synthetic */ void j(View view, WindowInsetsAnimation.Callback callback) {
        view.setWindowInsetsAnimationCallback(callback);
    }

    public static /* bridge */ /* synthetic */ void k(View view, CharSequence charSequence) {
        view.setStateDescription(charSequence);
    }

    public static /* bridge */ /* synthetic */ void l(Window window, boolean bl) {
        window.setDecorFitsSystemWindows(bl);
    }

    public static /* bridge */ /* synthetic */ void m(WindowInsets.Builder builder, int n, Insets insets) {
        builder.setInsetsIgnoringVisibility(n, insets);
    }

    public static /* bridge */ /* synthetic */ void n(WindowInsets.Builder builder, int n, boolean bl) {
        builder.setVisible(n, bl);
    }

    public static /* bridge */ /* synthetic */ boolean o(WindowInsets windowInsets, int n) {
        return windowInsets.isVisible(n);
    }

    public static /* bridge */ /* synthetic */ Insets p(WindowInsets windowInsets, int n) {
        return windowInsets.getInsets(n);
    }

    public static /* bridge */ /* synthetic */ void q(WindowInsets.Builder builder, int n, Insets insets) {
        builder.setInsets(n, insets);
    }
}

