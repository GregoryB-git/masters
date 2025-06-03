/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Notification$Action
 *  android.app.Notification$Action$Builder
 *  android.app.Notification$BigPictureStyle
 *  android.app.Notification$Builder
 *  android.app.job.JobInfo$Builder
 *  android.content.ClipData$Item
 *  android.graphics.Bitmap
 *  android.graphics.drawable.Icon
 *  android.hardware.HardwareBuffer
 *  android.location.LocationListener
 *  android.location.LocationManager
 *  android.location.LocationRequest
 *  android.os.StrictMode$VmPolicy$Builder
 *  android.view.ContentInfo
 *  android.view.OnReceiveContentListener
 *  android.view.View
 *  android.view.textclassifier.TextLinks
 *  android.widget.EdgeEffect
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.util.concurrent.Executor
 */
import android.app.Activity;
import android.app.Notification;
import android.app.job.JobInfo;
import android.content.ClipData;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.hardware.HardwareBuffer;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.LocationRequest;
import android.os.StrictMode;
import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;
import android.view.textclassifier.TextLinks;
import android.widget.EdgeEffect;
import java.util.concurrent.Executor;

public final class g {
    public static /* bridge */ /* synthetic */ float a(EdgeEffect edgeEffect) {
        return edgeEffect.getDistance();
    }

    public static /* bridge */ /* synthetic */ float b(EdgeEffect edgeEffect, float f2, float f4) {
        return edgeEffect.onPullDistance(f2, f4);
    }

    public static /* bridge */ /* synthetic */ HardwareBuffer c(Bitmap bitmap) {
        return bitmap.getHardwareBuffer();
    }

    public static /* bridge */ /* synthetic */ StrictMode.VmPolicy.Builder d(StrictMode.VmPolicy.Builder builder) {
        return builder.permitUnsafeIntentLaunch();
    }

    public static /* bridge */ /* synthetic */ ContentInfo e(View view, ContentInfo contentInfo) {
        return view.performReceiveContent(contentInfo);
    }

    public static /* bridge */ /* synthetic */ TextLinks f(ClipData.Item item) {
        return item.getTextLinks();
    }

    public static /* bridge */ /* synthetic */ void g(Notification.Action.Builder builder, boolean bl) {
        builder.setAuthenticationRequired(bl);
    }

    public static /* bridge */ /* synthetic */ void h(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
        bigPictureStyle.bigPicture(icon);
    }

    public static /* bridge */ /* synthetic */ void i(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
        bigPictureStyle.setContentDescription(charSequence);
    }

    public static /* bridge */ /* synthetic */ void j(Notification.BigPictureStyle bigPictureStyle, boolean bl) {
        bigPictureStyle.showBigPictureWhenCollapsed(bl);
    }

    public static /* bridge */ /* synthetic */ void k(Notification.Builder builder, int n) {
        builder.setForegroundServiceBehavior(n);
    }

    public static /* bridge */ /* synthetic */ void l(JobInfo.Builder builder) {
        builder.setExpedited(true);
    }

    public static /* bridge */ /* synthetic */ void m(LocationManager locationManager, String string2, LocationRequest locationRequest, Executor executor, LocationListener locationListener) {
        locationManager.requestLocationUpdates(string2, locationRequest, executor, locationListener);
    }

    public static /* bridge */ /* synthetic */ void n(View view, String[] stringArray) {
        view.setOnReceiveContentListener(stringArray, null);
    }

    public static /* bridge */ /* synthetic */ void o(View view, String[] stringArray, OnReceiveContentListener onReceiveContentListener) {
        view.setOnReceiveContentListener(stringArray, onReceiveContentListener);
    }

    public static /* bridge */ /* synthetic */ boolean p(Activity activity) {
        return activity.isLaunchedFromBubble();
    }

    public static /* bridge */ /* synthetic */ boolean q(Notification.Action action) {
        return action.isAuthenticationRequired();
    }

    public static /* bridge */ /* synthetic */ boolean r(LocationManager locationManager, String string2) {
        return locationManager.hasProvider(string2);
    }

    public static /* bridge */ /* synthetic */ String[] s(View view) {
        return view.getReceiveContentMimeTypes();
    }
}

