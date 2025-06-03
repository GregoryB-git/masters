/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.NotificationChannelGroup
 *  android.app.NotificationManager
 *  android.app.RemoteInput
 *  android.app.RemoteInput$Builder
 *  android.app.job.JobInfo$Builder
 *  android.content.Intent
 *  android.content.IntentSender
 *  android.content.pm.PackageManager
 *  android.content.pm.ShortcutInfo
 *  android.content.pm.ShortcutManager
 *  android.content.res.TypedArray
 *  android.graphics.Path
 *  android.graphics.Typeface
 *  android.telephony.TelephonyManager
 *  android.text.TextPaint
 *  android.view.View
 *  android.widget.TextView
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 *  java.util.Map
 *  java.util.Set
 */
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.app.RemoteInput;
import android.app.job.JobInfo;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.Typeface;
import android.telephony.TelephonyManager;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class p3 {
    public static /* bridge */ /* synthetic */ void A(JobInfo.Builder builder, boolean bl) {
        builder.setRequiresStorageNotLow(bl);
    }

    public static /* bridge */ /* synthetic */ void B(View view, boolean bl) {
        view.setFocusedByDefault(bl);
    }

    public static /* bridge */ /* synthetic */ boolean C(View view) {
        return view.isImportantForAutofill();
    }

    public static /* bridge */ /* synthetic */ int D(TextView textView) {
        return textView.getAutoSizeMinTextSize();
    }

    public static /* bridge */ /* synthetic */ int a(View view) {
        return view.getImportantForAutofill();
    }

    public static /* bridge */ /* synthetic */ int b(TextView textView) {
        return textView.getAutoSizeTextType();
    }

    public static /* bridge */ /* synthetic */ RemoteInput.Builder c(RemoteInput.Builder builder, String string2, boolean bl) {
        return builder.setAllowDataType(string2, bl);
    }

    public static /* bridge */ /* synthetic */ Intent d(ShortcutManager shortcutManager, ShortcutInfo shortcutInfo) {
        return shortcutManager.createShortcutResultIntent(shortcutInfo);
    }

    public static /* bridge */ /* synthetic */ Typeface e(TypedArray typedArray, int n) {
        return typedArray.getFont(n);
    }

    public static /* bridge */ /* synthetic */ View f(View view, View view2, int n) {
        return view.keyboardNavigationClusterSearch(view2, n);
    }

    public static /* bridge */ /* synthetic */ String g(TelephonyManager telephonyManager) {
        return telephonyManager.getImei();
    }

    public static /* bridge */ /* synthetic */ String h(TextPaint textPaint) {
        return textPaint.getFontVariationSettings();
    }

    public static /* bridge */ /* synthetic */ List i(NotificationManager notificationManager) {
        return notificationManager.getNotificationChannelGroups();
    }

    public static /* bridge */ /* synthetic */ Map j(Intent intent, String string2) {
        return RemoteInput.getDataResultsFromIntent((Intent)intent, (String)string2);
    }

    public static /* bridge */ /* synthetic */ Set k(RemoteInput remoteInput) {
        return remoteInput.getAllowedDataTypes();
    }

    public static /* bridge */ /* synthetic */ void l(NotificationManager notificationManager, NotificationChannelGroup notificationChannelGroup) {
        notificationManager.createNotificationChannelGroup(notificationChannelGroup);
    }

    public static /* bridge */ /* synthetic */ void m(NotificationManager notificationManager, String string2) {
        notificationManager.deleteNotificationChannel(string2);
    }

    public static /* bridge */ /* synthetic */ void n(RemoteInput remoteInput, Intent intent, Map map) {
        RemoteInput.addDataResultToIntent((RemoteInput)remoteInput, (Intent)intent, (Map)map);
    }

    public static /* bridge */ /* synthetic */ void o(JobInfo.Builder builder, boolean bl) {
        builder.setRequiresBatteryNotLow(bl);
    }

    public static /* bridge */ /* synthetic */ void p(View view, CharSequence charSequence) {
        view.setTooltipText(charSequence);
    }

    public static /* bridge */ /* synthetic */ void q(View view, boolean bl) {
        view.setKeyboardNavigationCluster(bl);
    }

    public static /* bridge */ /* synthetic */ void r(TextView textView, int n) {
        textView.setAutoSizeTextTypeWithDefaults(n);
    }

    public static /* bridge */ /* synthetic */ boolean s(PackageManager packageManager, String string2) {
        return packageManager.isInstantApp(string2);
    }

    public static /* bridge */ /* synthetic */ boolean t(ShortcutManager shortcutManager) {
        return shortcutManager.isRequestPinShortcutSupported();
    }

    public static /* bridge */ /* synthetic */ boolean u(ShortcutManager shortcutManager, ShortcutInfo shortcutInfo, IntentSender intentSender) {
        return shortcutManager.requestPinShortcut(shortcutInfo, intentSender);
    }

    public static /* bridge */ /* synthetic */ boolean v(View view) {
        return view.restoreDefaultFocus();
    }

    public static /* bridge */ /* synthetic */ float[] w(Path path, float f2) {
        return path.approximate(f2);
    }

    public static /* bridge */ /* synthetic */ int[] x(TextView textView) {
        return textView.getAutoSizeTextAvailableSizes();
    }

    public static /* bridge */ /* synthetic */ int y(View view) {
        return view.getNextClusterForwardId();
    }

    public static /* bridge */ /* synthetic */ int z(TextView textView) {
        return textView.getAutoSizeMaxTextSize();
    }
}

