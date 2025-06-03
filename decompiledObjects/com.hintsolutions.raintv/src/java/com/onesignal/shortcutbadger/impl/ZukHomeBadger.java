/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.content.ComponentName
 *  android.content.Context
 *  android.net.Uri
 *  android.os.Bundle
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.Collections
 *  java.util.List
 */
package com.onesignal.shortcutbadger.impl;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.onesignal.shortcutbadger.Badger;
import com.onesignal.shortcutbadger.ShortcutBadgeException;
import java.util.Collections;
import java.util.List;

public class ZukHomeBadger
implements Badger {
    private final Uri CONTENT_URI = Uri.parse((String)"content://com.android.badge/badge");

    @Override
    @TargetApi(value=11)
    public void executeBadge(Context context, ComponentName componentName, int n) throws ShortcutBadgeException {
        componentName = new Bundle();
        componentName.putInt("app_badge_count", n);
        context.getContentResolver().call(this.CONTENT_URI, "setAppBadgeCount", null, (Bundle)componentName);
    }

    @Override
    public List<String> getSupportLaunchers() {
        return Collections.singletonList((Object)"com.zui.launcher");
    }
}

