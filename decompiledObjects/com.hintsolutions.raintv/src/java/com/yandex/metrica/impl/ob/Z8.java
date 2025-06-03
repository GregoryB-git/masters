/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.sqlite.SQLiteDatabase
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.StringBuilder
 *  java.sql.SQLException
 */
package com.yandex.metrica.impl.ob;

import android.database.sqlite.SQLiteDatabase;
import com.yandex.metrica.impl.ob.e6;
import com.yandex.metrica.impl.ob.f8;
import java.sql.SQLException;

public class z8
extends f8 {
    @Override
    public void a(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("ALTER TABLE reports ADD COLUMN environment TEXT ");
        sQLiteDatabase.execSQL("ALTER TABLE reports ADD COLUMN user_info TEXT ");
        Object object = new StringBuilder();
        object.append("ALTER TABLE ");
        object.append("reports");
        object.append(" ADD COLUMN ");
        object.append("session_type");
        object.append(" INTEGER DEFAULT ");
        e6 e62 = e6.b;
        object.append(e62.a());
        sQLiteDatabase.execSQL(object.toString());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("UPDATE ");
        stringBuilder.append("reports");
        stringBuilder.append(" SET ");
        stringBuilder.append("session_type");
        stringBuilder.append(" = ");
        object = e6.c;
        stringBuilder.append(((e6)((Object)object)).a());
        stringBuilder.append(" WHERE ");
        stringBuilder.append("session_id");
        stringBuilder.append(" = ");
        stringBuilder.append(-2L);
        sQLiteDatabase.execSQL(stringBuilder.toString());
        sQLiteDatabase.execSQL("ALTER TABLE sessions ADD COLUMN server_time_offset INTEGER ");
        stringBuilder = new StringBuilder();
        a.C(stringBuilder, "ALTER TABLE ", "sessions", " ADD COLUMN ", "type");
        stringBuilder.append(" INTEGER DEFAULT ");
        stringBuilder.append(e62.a());
        sQLiteDatabase.execSQL(stringBuilder.toString());
        e62 = new StringBuilder();
        e62.append("UPDATE ");
        a.C((StringBuilder)e62, "sessions", " SET ", "type", " = ");
        e62.append(((e6)((Object)object)).a());
        e62.append(" WHERE ");
        e62.append("id");
        e62.append(" = ");
        e62.append(-2L);
        sQLiteDatabase.execSQL(e62.toString());
    }
}

