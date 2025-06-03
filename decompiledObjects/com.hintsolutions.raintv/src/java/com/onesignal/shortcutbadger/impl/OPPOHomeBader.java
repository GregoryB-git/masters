/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  android.os.Bundle
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Collections
 *  java.util.List
 */
package com.onesignal.shortcutbadger.impl;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.onesignal.shortcutbadger.Badger;
import com.onesignal.shortcutbadger.ShortcutBadgeException;
import com.onesignal.shortcutbadger.util.BroadcastHelper;
import java.util.Collections;
import java.util.List;

public class OPPOHomeBader
implements Badger {
    private static final String INTENT_ACTION = "com.oppo.unsettledevent";
    private static final String INTENT_EXTRA_BADGEUPGRADE_COUNT = "app_badge_count";
    private static final String INTENT_EXTRA_BADGE_COUNT = "number";
    private static final String INTENT_EXTRA_BADGE_UPGRADENUMBER = "upgradeNumber";
    private static final String INTENT_EXTRA_PACKAGENAME = "pakeageName";
    private static final String PROVIDER_CONTENT_URI = "content://com.android.badge/badge";
    private int mCurrentTotalCount = -1;

    private void executeBadgeByBroadcast(Context context, ComponentName componentName, int n) throws ShortcutBadgeException {
        int n2 = n;
        if (n == 0) {
            n2 = -1;
        }
        Intent intent = new Intent(INTENT_ACTION);
        intent.putExtra(INTENT_EXTRA_PACKAGENAME, componentName.getPackageName());
        intent.putExtra(INTENT_EXTRA_BADGE_COUNT, n2);
        intent.putExtra(INTENT_EXTRA_BADGE_UPGRADENUMBER, n2);
        BroadcastHelper.sendIntentExplicitly(context, intent);
    }

    @TargetApi(value=11)
    private void executeBadgeByContentProvider(Context context, int n) throws ShortcutBadgeException {
        try {
            Bundle bundle = new Bundle();
            bundle.putInt(INTENT_EXTRA_BADGEUPGRADE_COUNT, n);
            context.getContentResolver().call(Uri.parse((String)PROVIDER_CONTENT_URI), "setAppBadgeCount", null, bundle);
            return;
        }
        catch (Throwable throwable) {
            throw new ShortcutBadgeException("Unable to execute Badge By Content Provider");
        }
    }

    @Override
    public void executeBadge(Context context, ComponentName componentName, int n) throws ShortcutBadgeException {
        if (this.mCurrentTotalCount == n) {
            return;
        }
        this.mCurrentTotalCount = n;
        this.executeBadgeByContentProvider(context, n);
    }

    @Override
    public List<String> getSupportLaunchers() {
        return Collections.singletonList((Object)"com.oppo.launcher");
    }
}

