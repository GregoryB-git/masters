/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.ResolveInfo
 *  java.lang.Object
 *  java.util.Collections
 *  java.util.List
 */
package com.onesignal.shortcutbadger.util;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import com.onesignal.shortcutbadger.ShortcutBadgeException;
import java.util.Collections;
import java.util.List;

public class BroadcastHelper {
    public static boolean canResolveBroadcast(Context context, Intent intent) {
        context = context.getPackageManager();
        boolean bl = false;
        context = context.queryBroadcastReceivers(intent, 0);
        boolean bl2 = bl;
        if (context != null) {
            bl2 = bl;
            if (context.size() > 0) {
                bl2 = true;
            }
        }
        return bl2;
    }

    public static List<ResolveInfo> resolveBroadcast(Context context, Intent intent) {
        if ((context = context.getPackageManager().queryBroadcastReceivers(intent, 0)) == null) {
            context = Collections.emptyList();
        }
        return context;
    }

    public static void sendIntentExplicitly(Context context, Intent intent) throws ShortcutBadgeException {
        ResolveInfo resolveInfo2 = BroadcastHelper.resolveBroadcast(context, intent);
        if (resolveInfo2.size() != 0) {
            for (ResolveInfo resolveInfo2 : resolveInfo2) {
                Intent intent2 = new Intent(intent);
                if (resolveInfo2 == null) continue;
                intent2.setPackage(resolveInfo2.resolvePackageName);
                context.sendBroadcast(intent2);
            }
            return;
        }
        context = z2.t("unable to resolve intent: ");
        context.append(intent.toString());
        throw new ShortcutBadgeException(context.toString());
    }
}

