/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.database.Cursor
 *  android.database.DatabaseUtils
 *  android.database.sqlite.SQLiteDatabase
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.sql.SQLException
 */
package com.yandex.metrica.impl.ob;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import com.yandex.metrica.impl.ob.A2;
import com.yandex.metrica.impl.ob.e6;
import com.yandex.metrica.impl.ob.f8;
import java.sql.SQLException;

public class A8
extends f8 {
    private static final String a;

    static {
        StringBuilder stringBuilder = z2.t("CREATE TABLE IF NOT EXISTS reports (id INTEGER PRIMARY KEY,name TEXT,value TEXT,number INTEGER,type INTEGER,time INTEGER,session_id TEXT,wifi_network_info TEXT DEFAULT '',cell_info TEXT DEFAULT '',location_info TEXT DEFAULT '',error_environment TEXT,user_info TEXT,session_type INTEGER DEFAULT ");
        stringBuilder.append(e6.b.a());
        stringBuilder.append(",");
        stringBuilder.append("app_environment");
        stringBuilder.append(" TEXT DEFAULT '");
        a.C(stringBuilder, "{}", "',", "app_environment_revision", " INTEGER DEFAULT ");
        a = z2.r(stringBuilder, 0L, " )");
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void a(SQLiteDatabase sQLiteDatabase) throws SQLException {
        void var1_4;
        Cursor cursor;
        block5: {
            sQLiteDatabase.execSQL("ALTER TABLE reports ADD COLUMN app_environment TEXT DEFAULT '{}'");
            sQLiteDatabase.execSQL("ALTER TABLE reports ADD COLUMN app_environment_revision INTEGER DEFAULT 0");
            sQLiteDatabase.execSQL("ALTER TABLE reports RENAME TO reports_backup");
            sQLiteDatabase.execSQL(a);
            Cursor cursor2 = null;
            try {
                cursor = sQLiteDatabase.rawQuery("SELECT * FROM reports_backup", null);
            }
            catch (Throwable throwable) {
                cursor = cursor2;
                break block5;
            }
            try {
                while (cursor.moveToNext()) {
                    cursor2 = new ContentValues();
                    DatabaseUtils.cursorRowToContentValues((Cursor)cursor, (ContentValues)cursor2);
                    String string2 = cursor2.getAsString("environment");
                    cursor2.remove("environment");
                    cursor2.put("error_environment", string2);
                    sQLiteDatabase.insert("reports", null, (ContentValues)cursor2);
                }
            }
            catch (Throwable throwable) {
                break block5;
            }
            A2.a(cursor);
            sQLiteDatabase.execSQL("DROP TABLE reports_backup");
            return;
        }
        A2.a(cursor);
        throw var1_4;
    }
}

