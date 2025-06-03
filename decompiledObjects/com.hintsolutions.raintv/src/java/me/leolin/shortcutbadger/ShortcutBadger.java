/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Build
 *  android.util.Log
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.Iterator
 *  java.util.LinkedList
 *  java.util.List
 *  me.leolin.shortcutbadger.impl.AdwHomeBadger
 *  me.leolin.shortcutbadger.impl.ApexHomeBadger
 *  me.leolin.shortcutbadger.impl.AsusHomeLauncher
 *  me.leolin.shortcutbadger.impl.DefaultBadger
 *  me.leolin.shortcutbadger.impl.NewHtcHomeBadger
 *  me.leolin.shortcutbadger.impl.NovaHomeBadger
 *  me.leolin.shortcutbadger.impl.SolidHomeBadger
 *  me.leolin.shortcutbadger.impl.SonyHomeBadger
 *  me.leolin.shortcutbadger.impl.XiaomiHomeBadger
 */
package me.leolin.shortcutbadger;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import me.leolin.shortcutbadger.Badger;
import me.leolin.shortcutbadger.ShortcutBadgeException;
import me.leolin.shortcutbadger.impl.AdwHomeBadger;
import me.leolin.shortcutbadger.impl.ApexHomeBadger;
import me.leolin.shortcutbadger.impl.AsusHomeLauncher;
import me.leolin.shortcutbadger.impl.DefaultBadger;
import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;
import me.leolin.shortcutbadger.impl.NovaHomeBadger;
import me.leolin.shortcutbadger.impl.SolidHomeBadger;
import me.leolin.shortcutbadger.impl.SonyHomeBadger;
import me.leolin.shortcutbadger.impl.XiaomiHomeBadger;

public final class ShortcutBadger {
    private static final List<Class<? extends Badger>> BADGERS;
    private static final String LOG_TAG = "ShortcutBadger";
    private static ComponentName sComponentName;
    private static Badger sShortcutBadger;

    static {
        LinkedList linkedList;
        BADGERS = linkedList = new LinkedList();
        linkedList.add(AdwHomeBadger.class);
        linkedList.add(ApexHomeBadger.class);
        linkedList.add(NewHtcHomeBadger.class);
        linkedList.add(NovaHomeBadger.class);
        linkedList.add(SolidHomeBadger.class);
        linkedList.add(SonyHomeBadger.class);
        linkedList.add(XiaomiHomeBadger.class);
        linkedList.add(AsusHomeLauncher.class);
    }

    private ShortcutBadger() {
    }

    public static boolean applyCount(Context object, int n3) {
        try {
            ShortcutBadger.applyCountOrThrow(object, n3);
            return true;
        }
        catch (ShortcutBadgeException shortcutBadgeException) {
            object = LOG_TAG;
            StringBuilder stringBuilder = z2.t("Unable to execute badge:");
            stringBuilder.append(shortcutBadgeException.getMessage());
            Log.e((String)object, (String)stringBuilder.toString());
            return false;
        }
    }

    public static void applyCountOrThrow(Context context, int n3) throws ShortcutBadgeException {
        if (sShortcutBadger == null) {
            ShortcutBadger.initBadger(context);
        }
        try {
            sShortcutBadger.executeBadge(context, sComponentName, n3);
            return;
        }
        catch (Throwable throwable) {
            StringBuilder stringBuilder = z2.t("Unable to execute badge:");
            stringBuilder.append(throwable.getMessage());
            throw new ShortcutBadgeException(stringBuilder.toString());
        }
    }

    private static void initBadger(Context object) {
        Object object2;
        try {
            sComponentName = object.getPackageManager().getLaunchIntentForPackage(object.getPackageName()).getComponent();
            Log.d((String)LOG_TAG, (String)"Finding badger");
            object2 = new Intent("android.intent.action.MAIN");
            object2.addCategory("android.intent.category.HOME");
            object = object.getPackageManager().resolveActivity((Intent)object2, (int)65536).activityInfo.packageName;
            Iterator iterator = BADGERS.iterator();
            while (iterator.hasNext()) {
                object2 = (Badger)((Class)iterator.next()).newInstance();
                if (!object2.getSupportLaunchers().contains(object)) continue;
                sShortcutBadger = object2;
                break;
            }
            if (sShortcutBadger == null && Build.MANUFACTURER.equalsIgnoreCase("Xiaomi")) {
                object = new XiaomiHomeBadger();
                sShortcutBadger = object;
                return;
            }
        }
        catch (Exception exception) {
            Log.e((String)LOG_TAG, (String)exception.getMessage(), (Throwable)exception);
        }
        if (sShortcutBadger == null) {
            sShortcutBadger = new DefaultBadger();
        }
        object2 = LOG_TAG;
        object = z2.t("Current badger:");
        object.append(sShortcutBadger.getClass().getCanonicalName());
        Log.d((String)object2, (String)object.toString());
    }

    public static boolean removeCount(Context context) {
        return ShortcutBadger.applyCount(context, 0);
    }

    public static void removeCountOrThrow(Context context) throws ShortcutBadgeException {
        ShortcutBadger.applyCountOrThrow(context, 0);
    }
}

