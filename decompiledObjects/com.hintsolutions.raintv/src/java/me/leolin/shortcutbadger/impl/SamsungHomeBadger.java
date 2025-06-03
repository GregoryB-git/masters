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
 *  java.lang.Deprecated
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Arrays
 *  java.util.List
 */
package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.util.Arrays;
import java.util.List;
import me.leolin.shortcutbadger.Badger;
import me.leolin.shortcutbadger.ShortcutBadgeException;
import me.leolin.shortcutbadger.util.CloseHelper;

@Deprecated
public class SamsungHomeBadger
implements Badger {
    private static final String[] CONTENT_PROJECTION = new String[]{"_id", "class"};
    private static final String CONTENT_URI = "content://com.sec.badge/apps?notify=true";

    private ContentValues getContentValues(ComponentName componentName, int n2, boolean bl2) {
        ContentValues contentValues = new ContentValues();
        if (bl2) {
            contentValues.put("package", componentName.getPackageName());
            contentValues.put("class", componentName.getClassName());
        }
        contentValues.put("badgecount", Integer.valueOf((int)n2));
        return contentValues;
    }

    @Override
    public void executeBadge(Context context, ComponentName componentName, int n2) throws ShortcutBadgeException {
        Cursor cursor;
        block10: {
            boolean bl2;
            String string;
            Uri uri = Uri.parse((String)CONTENT_URI);
            ContentResolver contentResolver = context.getContentResolver();
            context = null;
            cursor = contentResolver.query(uri, CONTENT_PROJECTION, "package=?", new String[]{componentName.getPackageName()}, null);
            if (cursor == null) break block10;
            context = cursor;
            try {
                string = componentName.getClassName();
                bl2 = false;
            }
            catch (Throwable throwable) {
                CloseHelper.close((Cursor)context);
                throw throwable;
            }
            while (true) {
                context = cursor;
                if (!cursor.moveToNext()) break;
                context = cursor;
                int n6 = cursor.getInt(0);
                context = cursor;
                contentResolver.update(uri, this.getContentValues(componentName, n2, false), "_id=?", new String[]{String.valueOf((int)n6)});
                context = cursor;
                if (!string.equals((Object)cursor.getString(cursor.getColumnIndex("class")))) continue;
                bl2 = true;
                continue;
                break;
            }
            if (!bl2) {
                context = cursor;
                contentResolver.insert(uri, this.getContentValues(componentName, n2, true));
            }
        }
        CloseHelper.close(cursor);
        return;
    }

    @Override
    public List<String> getSupportLaunchers() {
        return Arrays.asList((Object[])new String[]{"com.sec.android.app.launcher", "com.sec.android.app.twlauncher"});
    }
}

