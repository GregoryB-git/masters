/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.AsyncQueryHandler
 *  android.content.ComponentName
 *  android.content.ContentValues
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.Arrays
 *  java.util.List
 */
package me.leolin.shortcutbadger.impl;

import android.content.AsyncQueryHandler;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.Arrays;
import java.util.List;
import me.leolin.shortcutbadger.Badger;
import me.leolin.shortcutbadger.ShortcutBadgeException;

public class SonyHomeBadger
implements Badger {
    private static final String INTENT_ACTION = "com.sonyericsson.home.action.UPDATE_BADGE";
    private static final String INTENT_EXTRA_ACTIVITY_NAME = "com.sonyericsson.home.intent.extra.badge.ACTIVITY_NAME";
    private static final String INTENT_EXTRA_MESSAGE = "com.sonyericsson.home.intent.extra.badge.MESSAGE";
    private static final String INTENT_EXTRA_PACKAGE_NAME = "com.sonyericsson.home.intent.extra.badge.PACKAGE_NAME";
    private static final String INTENT_EXTRA_SHOW_MESSAGE = "com.sonyericsson.home.intent.extra.badge.SHOW_MESSAGE";
    private static final String PROVIDER_COLUMNS_ACTIVITY_NAME = "activity_name";
    private static final String PROVIDER_COLUMNS_BADGE_COUNT = "badge_count";
    private static final String PROVIDER_COLUMNS_PACKAGE_NAME = "package_name";
    private static final String PROVIDER_CONTENT_URI = "content://com.sonymobile.home.resourceprovider/badge";
    private static final String SONY_HOME_PROVIDER_NAME = "com.sonymobile.home.resourceprovider";
    private final Uri BADGE_CONTENT_URI = Uri.parse((String)"content://com.sonymobile.home.resourceprovider/badge");
    private AsyncQueryHandler mQueryHandler;

    private static void executeBadgeByBroadcast(Context context, ComponentName componentName, int n2) {
        Intent intent = new Intent(INTENT_ACTION);
        intent.putExtra(INTENT_EXTRA_PACKAGE_NAME, componentName.getPackageName());
        intent.putExtra(INTENT_EXTRA_ACTIVITY_NAME, componentName.getClassName());
        intent.putExtra(INTENT_EXTRA_MESSAGE, String.valueOf((int)n2));
        boolean bl2 = n2 > 0;
        intent.putExtra(INTENT_EXTRA_SHOW_MESSAGE, bl2);
        context.sendBroadcast(intent);
    }

    private void executeBadgeByContentProvider(Context context, ComponentName componentName, int n2) {
        if (n2 < 0) {
            return;
        }
        if (this.mQueryHandler == null) {
            this.mQueryHandler = new AsyncQueryHandler(this, context.getApplicationContext().getContentResolver()){
                public final SonyHomeBadger this$0;
                {
                    this.this$0 = sonyHomeBadger;
                    super(contentResolver);
                }
            };
        }
        this.insertBadgeAsync(n2, componentName.getPackageName(), componentName.getClassName());
    }

    private void insertBadgeAsync(int n2, String string, String string2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(PROVIDER_COLUMNS_BADGE_COUNT, Integer.valueOf((int)n2));
        contentValues.put(PROVIDER_COLUMNS_PACKAGE_NAME, string);
        contentValues.put(PROVIDER_COLUMNS_ACTIVITY_NAME, string2);
        this.mQueryHandler.startInsert(0, null, this.BADGE_CONTENT_URI, contentValues);
    }

    private static boolean sonyBadgeContentProviderExists(Context context) {
        context = context.getPackageManager();
        boolean bl2 = false;
        if (context.resolveContentProvider(SONY_HOME_PROVIDER_NAME, 0) != null) {
            bl2 = true;
        }
        return bl2;
    }

    @Override
    public void executeBadge(Context context, ComponentName componentName, int n2) throws ShortcutBadgeException {
        if (SonyHomeBadger.sonyBadgeContentProviderExists(context)) {
            this.executeBadgeByContentProvider(context, componentName, n2);
        } else {
            SonyHomeBadger.executeBadgeByBroadcast(context, componentName, n2);
        }
    }

    @Override
    public List<String> getSupportLaunchers() {
        return Arrays.asList((Object[])new String[]{"com.sonyericsson.home"});
    }
}

