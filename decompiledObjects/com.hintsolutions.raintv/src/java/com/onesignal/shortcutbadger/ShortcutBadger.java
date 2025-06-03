/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Notification
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.ResolveInfo
 *  android.os.Build
 *  android.util.Log
 *  com.onesignal.shortcutbadger.impl.AdwHomeBadger
 *  com.onesignal.shortcutbadger.impl.ApexHomeBadger
 *  com.onesignal.shortcutbadger.impl.AsusHomeBadger
 *  com.onesignal.shortcutbadger.impl.DefaultBadger
 *  com.onesignal.shortcutbadger.impl.EverythingMeHomeBadger
 *  com.onesignal.shortcutbadger.impl.HuaweiHomeBadger
 *  com.onesignal.shortcutbadger.impl.NewHtcHomeBadger
 *  com.onesignal.shortcutbadger.impl.NovaHomeBadger
 *  com.onesignal.shortcutbadger.impl.OPPOHomeBader
 *  com.onesignal.shortcutbadger.impl.SamsungHomeBadger
 *  com.onesignal.shortcutbadger.impl.SonyHomeBadger
 *  com.onesignal.shortcutbadger.impl.VivoHomeBadger
 *  com.onesignal.shortcutbadger.impl.ZukHomeBadger
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.LinkedList
 *  java.util.List
 */
package com.onesignal.shortcutbadger;

import android.app.Notification;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.util.Log;
import com.onesignal.shortcutbadger.Badger;
import com.onesignal.shortcutbadger.ShortcutBadgeException;
import com.onesignal.shortcutbadger.impl.AdwHomeBadger;
import com.onesignal.shortcutbadger.impl.ApexHomeBadger;
import com.onesignal.shortcutbadger.impl.AsusHomeBadger;
import com.onesignal.shortcutbadger.impl.DefaultBadger;
import com.onesignal.shortcutbadger.impl.EverythingMeHomeBadger;
import com.onesignal.shortcutbadger.impl.HuaweiHomeBadger;
import com.onesignal.shortcutbadger.impl.NewHtcHomeBadger;
import com.onesignal.shortcutbadger.impl.NovaHomeBadger;
import com.onesignal.shortcutbadger.impl.OPPOHomeBader;
import com.onesignal.shortcutbadger.impl.SamsungHomeBadger;
import com.onesignal.shortcutbadger.impl.SonyHomeBadger;
import com.onesignal.shortcutbadger.impl.VivoHomeBadger;
import com.onesignal.shortcutbadger.impl.ZukHomeBadger;
import java.util.LinkedList;
import java.util.List;

public final class ShortcutBadger {
    private static final List<Class<? extends Badger>> BADGERS;
    private static final String LOG_TAG = "ShortcutBadger";
    private static final int SUPPORTED_CHECK_ATTEMPTS = 3;
    private static ComponentName sComponentName;
    private static final Object sCounterSupportedLock;
    private static volatile Boolean sIsBadgeCounterSupported;
    private static Badger sShortcutBadger;

    static {
        LinkedList linkedList;
        BADGERS = linkedList = new LinkedList();
        sCounterSupportedLock = new Object();
        linkedList.add(AdwHomeBadger.class);
        linkedList.add(ApexHomeBadger.class);
        linkedList.add(NewHtcHomeBadger.class);
        linkedList.add(NovaHomeBadger.class);
        linkedList.add(SonyHomeBadger.class);
        linkedList.add(AsusHomeBadger.class);
        linkedList.add(HuaweiHomeBadger.class);
        linkedList.add(OPPOHomeBader.class);
        linkedList.add(SamsungHomeBadger.class);
        linkedList.add(ZukHomeBadger.class);
        linkedList.add(VivoHomeBadger.class);
        linkedList.add(EverythingMeHomeBadger.class);
    }

    private ShortcutBadger() {
    }

    public static boolean applyCount(Context context, int n) {
        try {
            ShortcutBadger.applyCountOrThrow(context, n);
            return true;
        }
        catch (ShortcutBadgeException shortcutBadgeException) {
            if (Log.isLoggable((String)LOG_TAG, (int)3)) {
                Log.d((String)LOG_TAG, (String)"Unable to execute badge", (Throwable)shortcutBadgeException);
            }
            return false;
        }
    }

    public static void applyCountOrThrow(Context context, int n) throws ShortcutBadgeException {
        if (sShortcutBadger == null && !ShortcutBadger.initBadger(context)) {
            throw new ShortcutBadgeException("No default launcher available");
        }
        try {
            sShortcutBadger.executeBadge(context, sComponentName, n);
            return;
        }
        catch (Exception exception) {
            throw new ShortcutBadgeException("Unable to execute badge", exception);
        }
    }

    public static void applyNotification(Context object, Notification notification, int n) {
        block3: {
            if (Build.MANUFACTURER.equalsIgnoreCase("Xiaomi")) {
                try {
                    object = notification.getClass().getDeclaredField("extraNotification").get((Object)notification);
                    object.getClass().getDeclaredMethod("setMessageCount", new Class[]{Integer.TYPE}).invoke(object, new Object[]{n});
                }
                catch (Exception exception) {
                    if (!Log.isLoggable((String)LOG_TAG, (int)3)) break block3;
                    Log.d((String)LOG_TAG, (String)"Unable to execute badge", (Throwable)exception);
                }
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static boolean initBadger(Context object) {
        Object object22 = object.getPackageManager().getLaunchIntentForPackage(object.getPackageName());
        if (object22 == null) {
            object22 = z2.t("Unable to find launch intent for package ");
            object22.append(object.getPackageName());
            Log.e((String)LOG_TAG, (String)object22.toString());
            return false;
        }
        sComponentName = object22.getComponent();
        object22 = new Intent("android.intent.action.MAIN");
        object22.addCategory("android.intent.category.HOME");
        object = object.getPackageManager().resolveActivity(object22, 65536);
        if (object == null) return false;
        if (((ResolveInfo)object).activityInfo.name.toLowerCase().contains((CharSequence)"resolver")) {
            return false;
        }
        String string2 = ((ResolveInfo)object).activityInfo.packageName;
        for (Object object22 : BADGERS) {
            object = null;
            try {
                object22 = (Badger)object22.newInstance();
                object = object22;
            }
            catch (Exception exception) {}
            if (object == null || !object.getSupportLaunchers().contains((Object)string2)) continue;
            sShortcutBadger = object;
            break;
        }
        if (sShortcutBadger != null) return true;
        object = Build.MANUFACTURER;
        if (object.equalsIgnoreCase("ZUK")) {
            sShortcutBadger = new ZukHomeBadger();
            return true;
        }
        if (object.equalsIgnoreCase("OPPO")) {
            sShortcutBadger = new OPPOHomeBader();
            return true;
        }
        if (object.equalsIgnoreCase("VIVO")) {
            sShortcutBadger = new VivoHomeBadger();
            return true;
        }
        sShortcutBadger = new DefaultBadger();
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean isBadgeCounterSupported(Context context) {
        Object object;
        if (sIsBadgeCounterSupported != null) return sIsBadgeCounterSupported;
        Object object2 = object = sCounterSupportedLock;
        synchronized (object2) {
            Object object3 = sIsBadgeCounterSupported;
            if (object3 != null) return sIsBadgeCounterSupported;
            object3 = null;
            for (int i = 0; i < 3; ++i) {
                try {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Checking if platform supports badge counters, attempt ");
                    stringBuilder.append(String.format((String)"%d/%d.", (Object[])new Object[]{i + 1, 3}));
                    Log.i((String)LOG_TAG, (String)stringBuilder.toString());
                    if (ShortcutBadger.initBadger(context)) {
                        sShortcutBadger.executeBadge(context, sComponentName, 0);
                        sIsBadgeCounterSupported = Boolean.TRUE;
                        Log.i((String)LOG_TAG, (String)"Badge counter is supported in this platform.");
                        break;
                    }
                    object3 = "Failed to initialize the badge counter.";
                    continue;
                }
                catch (Exception exception) {
                    object3 = exception.getMessage();
                }
            }
            if (sIsBadgeCounterSupported != null) return sIsBadgeCounterSupported;
            context = new StringBuilder();
            context.append("Badge counter seems not supported for this platform: ");
            context.append((String)object3);
            Log.w((String)LOG_TAG, (String)context.toString());
            sIsBadgeCounterSupported = Boolean.FALSE;
            return sIsBadgeCounterSupported;
        }
    }

    public static boolean removeCount(Context context) {
        return ShortcutBadger.applyCount(context, 0);
    }

    public static void removeCountOrThrow(Context context) throws ShortcutBadgeException {
        ShortcutBadger.applyCountOrThrow(context, 0);
    }
}

