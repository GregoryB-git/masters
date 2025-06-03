/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.app.Notification$Action
 *  android.app.Notification$Action$Builder
 *  android.app.Notification$Builder
 *  android.app.NotificationChannelGroup
 *  android.app.NotificationManager
 *  android.app.Person
 *  android.app.RemoteAction
 *  android.app.RemoteInput
 *  android.app.job.JobInfo$Builder
 *  android.app.job.JobParameters
 *  android.content.Intent
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PermissionInfo
 *  android.content.pm.ShortcutInfo
 *  android.database.sqlite.SQLiteCursor
 *  android.graphics.Bitmap
 *  android.graphics.Picture
 *  android.icu.text.DecimalFormatSymbols
 *  android.media.session.MediaSession
 *  android.media.session.MediaSessionManager$RemoteUserInfo
 *  android.net.Network
 *  android.net.NetworkRequest
 *  android.text.PrecomputedText$Params
 *  android.view.Menu
 *  android.view.View
 *  android.view.View$OnUnhandledKeyEventListener
 *  android.widget.TextView
 *  java.lang.Object
 *  java.lang.String
 */
import android.app.Application;
import android.app.Notification;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.app.Person;
import android.app.RemoteAction;
import android.app.RemoteInput;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PermissionInfo;
import android.content.pm.ShortcutInfo;
import android.database.sqlite.SQLiteCursor;
import android.graphics.Bitmap;
import android.graphics.Picture;
import android.icu.text.DecimalFormatSymbols;
import android.media.session.MediaSession;
import android.media.session.MediaSessionManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.text.PrecomputedText;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public final class a3 {
    public static /* bridge */ /* synthetic */ boolean A(PackageManager packageManager, String string2, byte[] byArray, int n) {
        return packageManager.hasSigningCertificate(string2, byArray, n);
    }

    public static /* bridge */ /* synthetic */ boolean B(View view) {
        return view.isScreenReaderFocusable();
    }

    public static /* bridge */ /* synthetic */ String[] C(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    public static /* bridge */ /* synthetic */ int D(PermissionInfo permissionInfo) {
        return permissionInfo.getProtectionFlags();
    }

    public static /* bridge */ /* synthetic */ int a(Notification.Action action) {
        return action.getSemanticAction();
    }

    public static /* bridge */ /* synthetic */ int b(Intent intent) {
        return RemoteInput.getResultsSource((Intent)intent);
    }

    public static /* bridge */ /* synthetic */ int c(PermissionInfo permissionInfo) {
        return permissionInfo.getProtection();
    }

    public static /* bridge */ /* synthetic */ int d(ShortcutInfo shortcutInfo) {
        return shortcutInfo.getDisabledReason();
    }

    public static /* bridge */ /* synthetic */ long e(PackageInfo packageInfo) {
        return packageInfo.getLongVersionCode();
    }

    public static /* bridge */ /* synthetic */ NotificationChannelGroup f(NotificationManager notificationManager, String string2) {
        return notificationManager.getNotificationChannelGroup(string2);
    }

    public static /* bridge */ /* synthetic */ Bitmap g(Picture picture) {
        return Bitmap.createBitmap((Picture)picture);
    }

    public static /* bridge */ /* synthetic */ MediaSessionManager.RemoteUserInfo h(MediaSession mediaSession) {
        return mediaSession.getCurrentControllerInfo();
    }

    public static /* bridge */ /* synthetic */ Network i(JobParameters jobParameters) {
        return jobParameters.getNetwork();
    }

    public static /* bridge */ /* synthetic */ PrecomputedText.Params j(TextView textView) {
        return textView.getTextMetricsParams();
    }

    public static /* bridge */ /* synthetic */ String k() {
        return Application.getProcessName();
    }

    public static /* bridge */ /* synthetic */ String l(NotificationChannelGroup notificationChannelGroup) {
        return notificationChannelGroup.getDescription();
    }

    public static /* bridge */ /* synthetic */ void m(Notification.Action.Builder builder, int n) {
        builder.setSemanticAction(n);
    }

    public static /* bridge */ /* synthetic */ void n(Notification.Builder builder, Person person) {
        builder.addPerson(person);
    }

    public static /* bridge */ /* synthetic */ void o(NotificationChannelGroup notificationChannelGroup, String string2) {
        notificationChannelGroup.setDescription(string2);
    }

    public static /* bridge */ /* synthetic */ void p(RemoteAction remoteAction, boolean bl) {
        remoteAction.setShouldShowIcon(bl);
    }

    public static /* bridge */ /* synthetic */ void q(JobInfo.Builder builder) {
        builder.setImportantWhileForeground(true);
    }

    public static /* bridge */ /* synthetic */ void r(JobInfo.Builder builder, NetworkRequest networkRequest) {
        builder.setRequiredNetwork(networkRequest);
    }

    public static /* bridge */ /* synthetic */ void s(Intent intent, int n) {
        RemoteInput.setResultsSource((Intent)intent, (int)n);
    }

    public static /* bridge */ /* synthetic */ void t(SQLiteCursor sQLiteCursor, boolean bl) {
        sQLiteCursor.setFillWindowForwardOnly(bl);
    }

    public static /* bridge */ /* synthetic */ void u(Menu menu2, boolean bl) {
        menu2.setGroupDividerEnabled(bl);
    }

    public static /* bridge */ /* synthetic */ void v(View view, n5 n52) {
        view.addOnUnhandledKeyEventListener((View.OnUnhandledKeyEventListener)n52);
    }

    public static /* bridge */ /* synthetic */ void w(View view, boolean bl) {
        view.setScreenReaderFocusable(bl);
    }

    public static /* bridge */ /* synthetic */ void x(TextView textView, int n) {
        textView.setFirstBaselineToTopHeight(n);
    }

    public static /* bridge */ /* synthetic */ boolean y(NotificationChannelGroup notificationChannelGroup) {
        return notificationChannelGroup.isBlocked();
    }

    public static /* bridge */ /* synthetic */ boolean z(RemoteAction remoteAction) {
        return remoteAction.shouldShowIcon();
    }
}

