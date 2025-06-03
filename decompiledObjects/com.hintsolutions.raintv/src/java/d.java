/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.ActivityManager
 *  android.app.Notification$BubbleMetadata
 *  android.app.NotificationChannel
 *  android.app.NotificationManager
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.content.LocusId
 *  android.content.pm.PackageManager
 *  android.content.pm.ShortcutInfo
 *  android.content.res.Resources
 *  android.content.res.loader.ResourcesLoader
 *  android.graphics.Insets
 *  android.graphics.Region
 *  android.graphics.drawable.Icon
 *  android.location.GnssMeasurementsEvent$Callback
 *  android.location.GnssStatus
 *  android.location.GnssStatus$Callback
 *  android.location.LocationManager
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.CancellationSignal
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  android.view.Display
 *  android.view.DisplayCutout
 *  android.view.accessibility.AccessibilityNodeInfo
 *  android.view.accessibility.AccessibilityNodeInfo$ExtraRenderingInfo
 *  android.view.accessibility.AccessibilityWindowInfo
 *  android.view.inputmethod.EditorInfo
 *  java.lang.CharSequence
 *  java.lang.ClassLoader
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 *  java.util.concurrent.Executor
 *  java.util.function.Consumer
 */
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.LocusId;
import android.content.pm.PackageManager;
import android.content.pm.ShortcutInfo;
import android.content.res.Resources;
import android.content.res.loader.ResourcesLoader;
import android.graphics.Insets;
import android.graphics.Region;
import android.graphics.drawable.Icon;
import android.location.GnssMeasurementsEvent;
import android.location.GnssStatus;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityWindowInfo;
import android.view.inputmethod.EditorInfo;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

public final class d {
    public static /* bridge */ /* synthetic */ boolean A(LocationManager locationManager, Executor executor, GnssMeasurementsEvent.Callback callback) {
        return locationManager.registerGnssMeasurementsCallback(executor, callback);
    }

    public static /* bridge */ /* synthetic */ boolean B(LocationManager locationManager, Executor executor, GnssStatus.Callback callback) {
        return locationManager.registerGnssStatusCallback(executor, callback);
    }

    public static /* bridge */ /* synthetic */ CharSequence C(EditorInfo editorInfo, int n, int n2) {
        return editorInfo.getInitialTextBeforeCursor(n, n2);
    }

    public static /* bridge */ /* synthetic */ String D(NotificationChannel notificationChannel) {
        return notificationChannel.getConversationId();
    }

    public static /* bridge */ /* synthetic */ float a(GnssStatus gnssStatus, int n) {
        return gnssStatus.getBasebandCn0DbHz(n);
    }

    public static /* bridge */ /* synthetic */ int b(AccessibilityWindowInfo accessibilityWindowInfo) {
        return accessibilityWindowInfo.getDisplayId();
    }

    public static /* bridge */ /* synthetic */ NotificationChannel c(NotificationManager notificationManager, String string2, String string3) {
        return notificationManager.getNotificationChannel(string2, string3);
    }

    public static /* bridge */ /* synthetic */ Insets d(DisplayCutout displayCutout) {
        return displayCutout.getWaterfallInsets();
    }

    public static /* bridge */ /* synthetic */ Icon e(Uri uri) {
        return Icon.createWithAdaptiveBitmapContentUri((Uri)uri);
    }

    public static /* bridge */ /* synthetic */ Parcelable.Creator f(Parcel parcel, ClassLoader classLoader) {
        return parcel.readParcelableCreator(classLoader);
    }

    public static /* bridge */ /* synthetic */ Display g(ContextWrapper contextWrapper) {
        return contextWrapper.getDisplay();
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.ExtraRenderingInfo h(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getExtraRenderingInfo();
    }

    public static /* bridge */ /* synthetic */ CharSequence i(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    public static /* bridge */ /* synthetic */ CharSequence j(EditorInfo editorInfo, int n) {
        return editorInfo.getInitialSelectedText(n);
    }

    public static /* bridge */ /* synthetic */ CharSequence k(EditorInfo editorInfo, int n, int n2) {
        return editorInfo.getInitialTextAfterCursor(n, n2);
    }

    public static /* bridge */ /* synthetic */ String l(Notification.BubbleMetadata bubbleMetadata) {
        return bubbleMetadata.getShortcutId();
    }

    public static /* bridge */ /* synthetic */ String m(NotificationChannel notificationChannel) {
        return notificationChannel.getParentChannelId();
    }

    public static /* bridge */ /* synthetic */ String n(Context context) {
        return context.getAttributionTag();
    }

    public static /* bridge */ /* synthetic */ List o(ActivityManager activityManager) {
        return activityManager.getHistoricalProcessExitReasons(null, 0, 0);
    }

    public static /* bridge */ /* synthetic */ void p(Activity activity, LocusId locusId, Bundle bundle) {
        activity.setLocusContext(locusId, bundle);
    }

    public static /* bridge */ /* synthetic */ void q(NotificationChannel notificationChannel, String string2, String string3) {
        notificationChannel.setConversationId(string2, string3);
    }

    public static /* bridge */ /* synthetic */ void r(Resources resources, ResourcesLoader[] resourcesLoaderArray) {
        resources.addLoaders(resourcesLoaderArray);
    }

    public static /* bridge */ /* synthetic */ void s(LocationManager locationManager, String string2, CancellationSignal cancellationSignal, Executor executor, v2 v22) {
        locationManager.getCurrentLocation(string2, cancellationSignal, executor, (Consumer)v22);
    }

    public static /* bridge */ /* synthetic */ void t(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }

    public static /* bridge */ /* synthetic */ void u(AccessibilityWindowInfo accessibilityWindowInfo, Region region) {
        accessibilityWindowInfo.getRegionInScreen(region);
    }

    public static /* bridge */ /* synthetic */ void v(EditorInfo editorInfo, CharSequence charSequence, int n) {
        editorInfo.setInitialSurroundingSubText(charSequence, n);
    }

    public static /* bridge */ /* synthetic */ boolean w(NotificationChannel notificationChannel) {
        return notificationChannel.isImportantConversation();
    }

    public static /* bridge */ /* synthetic */ boolean x(PackageManager packageManager) {
        return packageManager.isAutoRevokeWhitelisted();
    }

    public static /* bridge */ /* synthetic */ boolean y(ShortcutInfo shortcutInfo) {
        return shortcutInfo.isCached();
    }

    public static /* bridge */ /* synthetic */ boolean z(GnssStatus gnssStatus, int n) {
        return gnssStatus.hasBasebandCn0DbHz(n);
    }
}

