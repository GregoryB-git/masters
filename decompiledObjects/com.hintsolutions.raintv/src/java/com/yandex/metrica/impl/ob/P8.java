/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.sqlite.SQLiteDatabase
 *  java.lang.Object
 *  java.lang.Override
 *  java.sql.SQLException
 */
package com.yandex.metrica.impl.ob;

import android.database.sqlite.SQLiteDatabase;
import com.yandex.metrica.impl.ob.e8;
import com.yandex.metrica.impl.ob.f8;
import java.sql.SQLException;

public class p8
extends f8 {
    @Override
    public void a(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS device_id_info");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS api_level_info");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS preferences");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS startup");
        sQLiteDatabase.execSQL(e8.a.b.b);
        sQLiteDatabase.execSQL(e8.a.a.b);
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS permissions");
    }
}

