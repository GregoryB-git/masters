/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Notification
 *  android.app.Notification$Action
 *  android.app.Notification$BubbleMetadata
 *  android.app.NotificationChannel
 *  android.app.RemoteInput
 *  android.content.Context
 *  android.content.Intent
 *  android.content.LocusId
 *  android.content.ServiceConnection
 *  android.graphics.Canvas
 *  android.graphics.Insets
 *  android.graphics.Matrix
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.media.session.MediaController
 *  android.media.session.MediaController$TransportControls
 *  android.os.Bundle
 *  android.os.Handler
 *  android.telephony.SubscriptionInfo
 *  android.text.TextDirectionHeuristic
 *  android.view.accessibility.AccessibilityNodeInfo
 *  android.view.accessibility.AccessibilityNodeInfo$TouchDelegateInfo
 *  android.widget.ImageView
 *  android.widget.PopupWindow
 *  android.widget.TextView
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.concurrent.Executor
 *  javax.net.ssl.SSLParameters
 *  javax.net.ssl.SSLSocket
 */
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.RemoteInput;
import android.content.Context;
import android.content.Intent;
import android.content.LocusId;
import android.content.ServiceConnection;
import android.graphics.Canvas;
import android.graphics.Insets;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.session.MediaController;
import android.os.Bundle;
import android.os.Handler;
import android.telephony.SubscriptionInfo;
import android.text.TextDirectionHeuristic;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.util.concurrent.Executor;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

public final class e {
    public static /* bridge */ /* synthetic */ boolean A(TextView textView) {
        return textView.isHorizontallyScrollable();
    }

    public static /* bridge */ /* synthetic */ String B(SubscriptionInfo subscriptionInfo) {
        return subscriptionInfo.getMncString();
    }

    public static /* bridge */ /* synthetic */ void C(Canvas canvas) {
        canvas.disableZ();
    }

    public static /* bridge */ /* synthetic */ void D(PopupWindow popupWindow, boolean bl) {
        popupWindow.setTouchModal(bl);
    }

    public static /* bridge */ /* synthetic */ int a(RemoteInput remoteInput) {
        return remoteInput.getEditChoicesBeforeSending();
    }

    public static /* bridge */ /* synthetic */ Notification.BubbleMetadata b(Notification notification) {
        return notification.getBubbleMetadata();
    }

    public static /* bridge */ /* synthetic */ Intent c(Intent intent, String string2) {
        return intent.setIdentifier(string2);
    }

    public static /* bridge */ /* synthetic */ LocusId d(Notification notification) {
        return notification.getLocusId();
    }

    public static /* bridge */ /* synthetic */ Insets e(Drawable drawable2) {
        return drawable2.getOpticalInsets();
    }

    public static /* bridge */ /* synthetic */ Bundle f(MediaController mediaController) {
        return mediaController.getSessionInfo();
    }

    public static /* bridge */ /* synthetic */ TextDirectionHeuristic g(TextView textView) {
        return textView.getTextDirectionHeuristic();
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.TouchDelegateInfo h(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getTouchDelegateInfo();
    }

    public static /* bridge */ /* synthetic */ String i(Context context) {
        return context.getOpPackageName();
    }

    public static /* bridge */ /* synthetic */ String j(Intent intent) {
        return intent.getIdentifier();
    }

    public static /* bridge */ /* synthetic */ String k(SubscriptionInfo subscriptionInfo) {
        return subscriptionInfo.getMccString();
    }

    public static /* bridge */ /* synthetic */ String l(SSLSocket sSLSocket) {
        return sSLSocket.getApplicationProtocol();
    }

    public static /* bridge */ /* synthetic */ void m(Canvas canvas) {
        canvas.enableZ();
    }

    public static /* bridge */ /* synthetic */ void n(MediaController.TransportControls transportControls, float f2) {
        transportControls.setPlaybackSpeed(f2);
    }

    public static /* bridge */ /* synthetic */ void o(AccessibilityNodeInfo accessibilityNodeInfo, AccessibilityNodeInfo.TouchDelegateInfo touchDelegateInfo) {
        accessibilityNodeInfo.setTouchDelegateInfo(touchDelegateInfo);
    }

    public static /* bridge */ /* synthetic */ void p(AccessibilityNodeInfo accessibilityNodeInfo, boolean bl) {
        accessibilityNodeInfo.setTextEntryKey(bl);
    }

    public static /* bridge */ /* synthetic */ void q(ImageView imageView, Matrix matrix) {
        imageView.animateTransform(matrix);
    }

    public static /* bridge */ /* synthetic */ void r(PopupWindow popupWindow, Rect rect) {
        popupWindow.setEpicenterBounds(rect);
    }

    public static /* bridge */ /* synthetic */ void s(PopupWindow popupWindow, boolean bl) {
        popupWindow.setIsClippedToScreen(bl);
    }

    public static /* bridge */ /* synthetic */ void t(SSLParameters sSLParameters, String[] stringArray) {
        sSLParameters.setApplicationProtocols(stringArray);
    }

    public static /* bridge */ /* synthetic */ boolean u(Notification.Action action) {
        return action.isContextual();
    }

    public static /* bridge */ /* synthetic */ boolean v(Notification notification) {
        return notification.getAllowSystemGeneratedContextualActions();
    }

    public static /* bridge */ /* synthetic */ boolean w(NotificationChannel notificationChannel) {
        return notificationChannel.canBubble();
    }

    public static /* bridge */ /* synthetic */ boolean x(Context context, Intent intent, ServiceConnection serviceConnection, int n, Executor executor) {
        return context.bindService(intent, n, executor, serviceConnection);
    }

    public static /* bridge */ /* synthetic */ boolean y(Handler handler, Runnable runnable) {
        return handler.hasCallbacks(runnable);
    }

    public static /* bridge */ /* synthetic */ boolean z(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextEntryKey();
    }
}

