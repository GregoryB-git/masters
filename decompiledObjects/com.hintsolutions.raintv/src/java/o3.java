/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.app.Notification$Action$Builder
 *  android.app.Notification$BubbleMetadata
 *  android.app.Notification$Builder
 *  android.app.NotificationManager
 *  android.app.Person
 *  android.app.RemoteInput$Builder
 *  android.content.Context
 *  android.content.LocusId
 *  android.content.pm.ShortcutInfo
 *  android.content.pm.ShortcutInfo$Builder
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.content.res.TypedArray
 *  android.graphics.BlendMode
 *  android.graphics.Paint
 *  android.os.Parcel
 *  android.os.Trace
 *  android.telephony.SubscriptionManager
 *  android.util.AttributeSet
 *  android.view.Display
 *  android.view.DisplayCutout
 *  android.view.View
 *  android.view.View$AccessibilityDelegate
 *  android.view.ViewGroup
 *  android.view.accessibility.AccessibilityManager
 *  android.widget.AutoCompleteTextView
 *  java.lang.ClassLoader
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
import android.app.Activity;
import android.app.Application;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.content.pm.ShortcutInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.BlendMode;
import android.graphics.Paint;
import android.os.Parcel;
import android.os.Trace;
import android.telephony.SubscriptionManager;
import android.util.AttributeSet;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import java.util.List;

public final class o3 {
    public static /* bridge */ /* synthetic */ void A(String string2, long l) {
        Trace.setCounter((String)string2, (long)l);
    }

    public static /* bridge */ /* synthetic */ boolean B() {
        return Trace.isEnabled();
    }

    public static /* bridge */ /* synthetic */ void C(NotificationManager notificationManager) {
        notificationManager.setNotificationDelegate(null);
    }

    public static /* bridge */ /* synthetic */ void D(String string2, int n) {
        Trace.endAsyncSection((String)string2, (int)n);
    }

    public static /* bridge */ /* synthetic */ float a(Resources resources, int n) {
        return resources.getFloat(n);
    }

    public static /* bridge */ /* synthetic */ int b(int n) {
        return SubscriptionManager.getSlotIndex((int)n);
    }

    public static /* bridge */ /* synthetic */ int c(ViewGroup viewGroup, int n) {
        return viewGroup.getChildDrawingOrder(n);
    }

    public static /* bridge */ /* synthetic */ int d(AccessibilityManager accessibilityManager, int n, int n2) {
        return accessibilityManager.getRecommendedTimeoutMillis(n, n2);
    }

    public static /* bridge */ /* synthetic */ RemoteInput.Builder e(RemoteInput.Builder builder, int n) {
        return builder.setEditChoicesBeforeSending(n);
    }

    public static /* bridge */ /* synthetic */ LocusId f(ShortcutInfo shortcutInfo) {
        return shortcutInfo.getLocusId();
    }

    public static /* bridge */ /* synthetic */ DisplayCutout g(Display display) {
        return display.getCutout();
    }

    public static /* bridge */ /* synthetic */ View.AccessibilityDelegate h(View view) {
        return view.getAccessibilityDelegate();
    }

    public static /* bridge */ /* synthetic */ String i(NotificationManager notificationManager) {
        return notificationManager.getNotificationDelegate();
    }

    public static /* bridge */ /* synthetic */ List j(Parcel parcel, List list, ClassLoader classLoader) {
        return parcel.readParcelableList(list, classLoader);
    }

    public static /* bridge */ /* synthetic */ List k(View view) {
        return view.getSystemGestureExclusionRects();
    }

    public static /* bridge */ /* synthetic */ void l(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
    }

    public static /* bridge */ /* synthetic */ void m(Notification.Action.Builder builder, boolean bl) {
        builder.setContextual(bl);
    }

    public static /* bridge */ /* synthetic */ void n(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
        builder.setBubbleMetadata(bubbleMetadata);
    }

    public static /* bridge */ /* synthetic */ void o(Notification.Builder builder, LocusId locusId) {
        builder.setLocusId(locusId);
    }

    public static /* bridge */ /* synthetic */ void p(Notification.Builder builder, boolean bl) {
        builder.setAllowSystemGeneratedContextualActions(bl);
    }

    public static /* bridge */ /* synthetic */ void q(NotificationManager notificationManager) {
        notificationManager.setNotificationDelegate("com.google.android.gms");
    }

    public static /* bridge */ /* synthetic */ void r(ShortcutInfo.Builder builder, LocusId locusId) {
        builder.setLocusId(locusId);
    }

    public static /* bridge */ /* synthetic */ void s(ShortcutInfo.Builder builder, boolean bl) {
        builder.setLongLived(bl);
    }

    public static /* bridge */ /* synthetic */ void t(ShortcutInfo.Builder builder, Person[] personArray) {
        builder.setPersons(personArray);
    }

    public static /* bridge */ /* synthetic */ void u(Resources.Theme theme) {
        theme.rebase();
    }

    public static /* bridge */ /* synthetic */ void v(Paint paint, BlendMode blendMode) {
        paint.setBlendMode(blendMode);
    }

    public static /* bridge */ /* synthetic */ void w(View view, Context context, int[] nArray, AttributeSet attributeSet, TypedArray typedArray, int n, int n2) {
        view.saveAttributeDataForStyleable(context, nArray, attributeSet, typedArray, n, n2);
    }

    public static /* bridge */ /* synthetic */ void x(View view, List list) {
        view.setSystemGestureExclusionRects(list);
    }

    public static /* bridge */ /* synthetic */ void y(AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.refreshAutoCompleteResults();
    }

    public static /* bridge */ /* synthetic */ void z(String string2, int n) {
        Trace.beginAsyncSection((String)string2, (int)n);
    }
}

