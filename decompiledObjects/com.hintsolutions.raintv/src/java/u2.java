/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Notification
 *  android.app.NotificationChannel
 *  android.app.NotificationManager
 *  android.content.res.ColorStateList
 *  android.graphics.PorterDuff$Mode
 *  android.location.Location
 *  android.view.MenuItem
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.location.Location;
import android.view.MenuItem;
import java.util.ArrayList;
import java.util.List;

public final class u2 {
    public static /* bridge */ /* synthetic */ CharSequence A(MenuItem menuItem) {
        return menuItem.getTooltipText();
    }

    public static /* bridge */ /* synthetic */ String B(Notification notification) {
        return notification.getChannelId();
    }

    public static /* bridge */ /* synthetic */ void C(NotificationManager notificationManager, ArrayList arrayList) {
        notificationManager.createNotificationChannelGroups((List)arrayList);
    }

    public static /* bridge */ /* synthetic */ void D(NotificationManager notificationManager, List list) {
        notificationManager.createNotificationChannelGroups(list);
    }

    public static /* bridge */ /* synthetic */ float a(Location location) {
        return location.getVerticalAccuracyMeters();
    }

    public static /* bridge */ /* synthetic */ int b(Notification notification) {
        return notification.getBadgeIconType();
    }

    public static /* bridge */ /* synthetic */ int c(MenuItem menuItem) {
        return menuItem.getNumericModifiers();
    }

    public static /* bridge */ /* synthetic */ long d(Notification notification) {
        return notification.getTimeoutAfter();
    }

    public static /* bridge */ /* synthetic */ NotificationChannel e(NotificationManager notificationManager, String string2) {
        return notificationManager.getNotificationChannel(string2);
    }

    public static /* bridge */ /* synthetic */ ColorStateList f(MenuItem menuItem) {
        return menuItem.getIconTintList();
    }

    public static /* bridge */ /* synthetic */ PorterDuff.Mode g(MenuItem menuItem) {
        return menuItem.getIconTintMode();
    }

    public static /* bridge */ /* synthetic */ MenuItem h(MenuItem menuItem, char c2, char c5, int n, int n2) {
        return menuItem.setShortcut(c2, c5, n, n2);
    }

    public static /* bridge */ /* synthetic */ MenuItem i(MenuItem menuItem, char c2, int n) {
        return menuItem.setNumericShortcut(c2, n);
    }

    public static /* bridge */ /* synthetic */ MenuItem j(MenuItem menuItem, ColorStateList colorStateList) {
        return menuItem.setIconTintList(colorStateList);
    }

    public static /* bridge */ /* synthetic */ MenuItem k(MenuItem menuItem, PorterDuff.Mode mode) {
        return menuItem.setIconTintMode(mode);
    }

    public static /* bridge */ /* synthetic */ MenuItem l(MenuItem menuItem, CharSequence charSequence) {
        return menuItem.setContentDescription(charSequence);
    }

    public static /* bridge */ /* synthetic */ CharSequence m(Notification notification) {
        return notification.getSettingsText();
    }

    public static /* bridge */ /* synthetic */ CharSequence n(MenuItem menuItem) {
        return menuItem.getContentDescription();
    }

    public static /* bridge */ /* synthetic */ String o(Notification notification) {
        return notification.getShortcutId();
    }

    public static /* bridge */ /* synthetic */ List p(NotificationManager notificationManager) {
        return notificationManager.getNotificationChannels();
    }

    public static /* bridge */ /* synthetic */ void q(NotificationManager notificationManager, NotificationChannel notificationChannel) {
        notificationManager.createNotificationChannel(notificationChannel);
    }

    public static /* bridge */ /* synthetic */ void r(NotificationManager notificationManager, String string2) {
        notificationManager.deleteNotificationChannelGroup(string2);
    }

    public static /* bridge */ /* synthetic */ void s(NotificationManager notificationManager, ArrayList arrayList) {
        notificationManager.createNotificationChannels((List)arrayList);
    }

    public static /* bridge */ /* synthetic */ void t(NotificationManager notificationManager, List list) {
        notificationManager.createNotificationChannels(list);
    }

    public static /* bridge */ /* synthetic */ void u(Location location, float f2) {
        location.setBearingAccuracyDegrees(f2);
    }

    public static /* bridge */ /* synthetic */ boolean v(Location location) {
        return location.hasSpeedAccuracy();
    }

    public static /* bridge */ /* synthetic */ int w(Notification notification) {
        return notification.getGroupAlertBehavior();
    }

    public static /* bridge */ /* synthetic */ int x(MenuItem menuItem) {
        return menuItem.getAlphabeticModifiers();
    }

    public static /* bridge */ /* synthetic */ MenuItem y(MenuItem menuItem, char c2, int n) {
        return menuItem.setAlphabeticShortcut(c2, n);
    }

    public static /* bridge */ /* synthetic */ MenuItem z(MenuItem menuItem, CharSequence charSequence) {
        return menuItem.setTooltipText(charSequence);
    }
}

