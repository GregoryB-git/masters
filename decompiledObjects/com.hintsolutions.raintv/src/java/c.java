/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Dialog
 *  android.content.Context
 *  android.graphics.Typeface
 *  android.graphics.drawable.Icon
 *  android.location.LocationManager
 *  android.media.AudioManager
 *  android.media.session.MediaSessionManager$RemoteUserInfo
 *  android.net.Uri
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.Looper
 *  android.service.media.MediaBrowserService
 *  android.telephony.CellIdentityGsm
 *  android.telephony.CellIdentityLte
 *  android.telephony.CellIdentityWcdma
 *  android.view.View
 *  android.view.accessibility.AccessibilityNodeInfo
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.concurrent.Executor
 */
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Icon;
import android.location.LocationManager;
import android.media.AudioManager;
import android.media.session.MediaSessionManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.service.media.MediaBrowserService;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityWcdma;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.concurrent.Executor;

public final class c {
    public static /* bridge */ /* synthetic */ String A(CellIdentityWcdma cellIdentityWcdma) {
        return cellIdentityWcdma.getMncString();
    }

    public static /* bridge */ /* synthetic */ void B(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setTooltipText(charSequence);
    }

    public static /* bridge */ /* synthetic */ void C(AccessibilityNodeInfo accessibilityNodeInfo, boolean bl) {
        accessibilityNodeInfo.setScreenReaderFocusable(bl);
    }

    public static /* bridge */ /* synthetic */ boolean D(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isHeading();
    }

    public static /* bridge */ /* synthetic */ int a(Icon icon) {
        return icon.getResId();
    }

    public static /* bridge */ /* synthetic */ int b(LocationManager locationManager) {
        return locationManager.getGnssYearOfHardware();
    }

    public static /* bridge */ /* synthetic */ int c(AudioManager audioManager, int n) {
        return audioManager.getStreamMinVolume(n);
    }

    public static /* bridge */ /* synthetic */ Typeface d(Typeface typeface, int n, boolean bl) {
        return Typeface.create((Typeface)typeface, (int)n, (boolean)bl);
    }

    public static /* bridge */ /* synthetic */ MediaSessionManager.RemoteUserInfo e(MediaBrowserService mediaBrowserService) {
        return mediaBrowserService.getCurrentBrowserInfo();
    }

    public static /* bridge */ /* synthetic */ Uri f(Icon icon) {
        return icon.getUri();
    }

    public static /* bridge */ /* synthetic */ Handler g(Looper looper) {
        return Handler.createAsync((Looper)looper);
    }

    public static /* bridge */ /* synthetic */ Handler h(Looper looper, Handler.Callback callback) {
        return Handler.createAsync((Looper)looper, (Handler.Callback)callback);
    }

    public static /* bridge */ /* synthetic */ View i(Activity activity, int n) {
        return activity.requireViewById(n);
    }

    public static /* bridge */ /* synthetic */ View j(Dialog dialog, int n) {
        return dialog.requireViewById(n);
    }

    public static /* bridge */ /* synthetic */ CharSequence k(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getTooltipText();
    }

    public static /* bridge */ /* synthetic */ String l(Icon icon) {
        return icon.getResPackage();
    }

    public static /* bridge */ /* synthetic */ String m(LocationManager locationManager) {
        return locationManager.getGnssHardwareModelName();
    }

    public static /* bridge */ /* synthetic */ String n(CellIdentityGsm cellIdentityGsm) {
        return cellIdentityGsm.getMccString();
    }

    public static /* bridge */ /* synthetic */ String o(CellIdentityLte cellIdentityLte) {
        return cellIdentityLte.getMncString();
    }

    public static /* bridge */ /* synthetic */ String p(CellIdentityWcdma cellIdentityWcdma) {
        return cellIdentityWcdma.getMccString();
    }

    public static /* bridge */ /* synthetic */ Executor q(Context context) {
        return context.getMainExecutor();
    }

    public static /* bridge */ /* synthetic */ void r(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setPaneTitle(charSequence);
    }

    public static /* bridge */ /* synthetic */ void s(AccessibilityNodeInfo accessibilityNodeInfo, boolean bl) {
        accessibilityNodeInfo.setHeading(bl);
    }

    public static /* bridge */ /* synthetic */ boolean t(LocationManager locationManager) {
        return locationManager.isLocationEnabled();
    }

    public static /* bridge */ /* synthetic */ boolean u(Handler handler, Runnable runnable, Object object, long l) {
        return handler.postDelayed(runnable, object, l);
    }

    public static /* bridge */ /* synthetic */ boolean v(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isScreenReaderFocusable();
    }

    public static /* bridge */ /* synthetic */ int w(Icon icon) {
        return icon.getType();
    }

    public static /* bridge */ /* synthetic */ CharSequence x(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getPaneTitle();
    }

    public static /* bridge */ /* synthetic */ String y(CellIdentityGsm cellIdentityGsm) {
        return cellIdentityGsm.getMncString();
    }

    public static /* bridge */ /* synthetic */ String z(CellIdentityLte cellIdentityLte) {
        return cellIdentityLte.getMccString();
    }
}

