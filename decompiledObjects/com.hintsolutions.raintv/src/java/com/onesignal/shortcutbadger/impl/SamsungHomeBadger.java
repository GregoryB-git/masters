/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.ContentResolver
 *  android.content.ContentValues
 *  android.content.Context
 *  android.database.Cursor
 *  android.net.Uri
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Arrays
 *  java.util.List
 */
package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.onesignal.shortcutbadger.Badger;
import com.onesignal.shortcutbadger.ShortcutBadgeException;
import com.onesignal.shortcutbadger.impl.DefaultBadger;
import com.onesignal.shortcutbadger.util.CloseHelper;
import java.util.Arrays;
import java.util.List;

public class SamsungHomeBadger
implements Badger {
    private static final String[] CONTENT_PROJECTION = new String[]{"_id", "class"};
    private static final String CONTENT_URI = "content://com.sec.badge/apps?notify=true";
    private DefaultBadger defaultBadger = new DefaultBadger();

    private ContentValues getContentValues(ComponentName componentName, int n, boolean bl) {
        ContentValues contentValues = new ContentValues();
        if (bl) {
            contentValues.put("package", componentName.getPackageName());
            contentValues.put("class", componentName.getClassName());
        }
        contentValues.put("badgecount", Integer.valueOf((int)n));
        return contentValues;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void executeBadge(Context object, ComponentName componentName, int n) throws ShortcutBadgeException {
        DefaultBadger defaultBadger;
        block11: {
            boolean bl;
            String string2;
            defaultBadger = this.defaultBadger;
            if (defaultBadger != null && defaultBadger.isSupported((Context)object)) {
                this.defaultBadger.executeBadge((Context)object, componentName, n);
                return;
            }
            Uri uri = Uri.parse((String)CONTENT_URI);
            ContentResolver contentResolver = object.getContentResolver();
            object = null;
            defaultBadger = contentResolver.query(uri, CONTENT_PROJECTION, "package=?", new String[]{componentName.getPackageName()}, null);
            if (defaultBadger == null) break block11;
            object = defaultBadger;
            try {
                string2 = componentName.getClassName();
                bl = false;
            }
            catch (Throwable throwable) {
                CloseHelper.close((Cursor)object);
                throw throwable;
            }
            while (true) {
                object = defaultBadger;
                if (!defaultBadger.moveToNext()) break;
                object = defaultBadger;
                int n2 = defaultBadger.getInt(0);
                object = defaultBadger;
                contentResolver.update(uri, this.getContentValues(componentName, n, false), "_id=?", new String[]{String.valueOf((int)n2)});
                object = defaultBadger;
                if (!string2.equals((Object)defaultBadger.getString(defaultBadger.getColumnIndex("class")))) continue;
                bl = true;
                continue;
                break;
            }
            if (!bl) {
                object = defaultBadger;
                contentResolver.insert(uri, this.getContentValues(componentName, n, true));
            }
        }
        CloseHelper.close((Cursor)defaultBadger);
        return;
    }

    @Override
    public List<String> getSupportLaunchers() {
        return Arrays.asList((Object[])new String[]{"com.sec.android.app.launcher", "com.sec.android.app.twlauncher"});
    }
}

