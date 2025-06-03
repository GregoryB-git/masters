/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.database.Cursor
 *  android.database.DatabaseUtils
 *  android.database.sqlite.SQLiteDatabase
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.sql.SQLException
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.Map$Entry
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.yandex.metrica.impl.ob;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import com.yandex.metrica.impl.ob.A2;
import com.yandex.metrica.impl.ob.e8;
import com.yandex.metrica.impl.ob.f8;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class y8
extends f8 {
    @Override
    public void a(SQLiteDatabase sQLiteDatabase) throws SQLException, JSONException {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS sessions_BACKUP (id INTEGER,start_time INTEGER,connection_type INTEGER,network_type TEXT,country_code INTEGER,operator_id INTEGER,lac INTEGER,report_request_parameters TEXT );");
        StringBuilder stringBuilder = new StringBuilder();
        String string = "id";
        stringBuilder.append("id");
        stringBuilder.append(",");
        stringBuilder.append("start_time");
        a.C(stringBuilder, ",", "connection_type", ",", "network_type");
        a.C(stringBuilder, ",", "country_code", ",", "operator_id");
        stringBuilder.append(",");
        stringBuilder.append("lac");
        stringBuilder.append(",");
        stringBuilder.append("report_request_parameters");
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("INSERT INTO ");
        stringBuilder2.append("sessions_BACKUP");
        stringBuilder2.append(" SELECT ");
        stringBuilder2.append((CharSequence)stringBuilder);
        stringBuilder2.append(" FROM ");
        stringBuilder2.append("sessions");
        stringBuilder2.append(";");
        sQLiteDatabase.execSQL(stringBuilder2.toString());
        sQLiteDatabase.execSQL("DROP TABLE sessions;");
        sQLiteDatabase.execSQL(e8.e.b);
        stringBuilder = null;
        try {
            stringBuilder2 = sQLiteDatabase.rawQuery("SELECT * FROM sessions_BACKUP", null);
        }
        catch (Throwable throwable) {
            A2.a((Cursor)stringBuilder);
            throw throwable;
        }
        while (true) {
            stringBuilder = stringBuilder2;
            if (!stringBuilder2.moveToNext()) break;
            stringBuilder = stringBuilder2;
            stringBuilder = stringBuilder2;
            ContentValues contentValues = new ContentValues();
            stringBuilder = stringBuilder2;
            DatabaseUtils.cursorRowToContentValues((Cursor)stringBuilder2, (ContentValues)contentValues);
            stringBuilder = stringBuilder2;
            stringBuilder = stringBuilder2;
            ArrayList arrayList = new ArrayList();
            stringBuilder = stringBuilder2;
            arrayList.add((Object)string);
            stringBuilder = stringBuilder2;
            arrayList.add((Object)"start_time");
            stringBuilder = stringBuilder2;
            arrayList.add((Object)"report_request_parameters");
            stringBuilder = stringBuilder2;
            stringBuilder = stringBuilder2;
            ContentValues contentValues2 = new ContentValues(contentValues);
            stringBuilder = stringBuilder2;
            Iterator iterator = contentValues.valueSet().iterator();
            while (true) {
                stringBuilder = stringBuilder2;
                if (!iterator.hasNext()) break;
                stringBuilder = stringBuilder2;
                Map.Entry entry = (Map.Entry)iterator.next();
                stringBuilder = stringBuilder2;
                if (arrayList.contains(entry.getKey())) continue;
                stringBuilder = stringBuilder2;
                contentValues2.remove((String)entry.getKey());
                continue;
                break;
            }
            stringBuilder = stringBuilder2;
            iterator = arrayList.iterator();
            while (true) {
                stringBuilder = stringBuilder2;
                if (!iterator.hasNext()) break;
                stringBuilder = stringBuilder2;
                contentValues.remove((String)iterator.next());
                continue;
                break;
            }
            stringBuilder = stringBuilder2;
            stringBuilder = stringBuilder2;
            iterator = new JSONObject();
            stringBuilder = stringBuilder2;
            iterator.put("conn_type", (Object)contentValues.getAsInteger("connection_type"));
            stringBuilder = stringBuilder2;
            iterator.putOpt("net_type", contentValues.get("network_type"));
            stringBuilder = stringBuilder2;
            iterator.putOpt("operator_id", contentValues.get("operator_id"));
            stringBuilder = stringBuilder2;
            iterator.putOpt("lac", contentValues.get("lac"));
            stringBuilder = stringBuilder2;
            iterator.putOpt("country_code", contentValues.get("country_code"));
            stringBuilder = stringBuilder2;
            contentValues2.put("network_info", iterator.toString());
            stringBuilder = stringBuilder2;
            sQLiteDatabase.insertOrThrow("sessions", null, contentValues2);
            continue;
            break;
        }
        A2.a((Cursor)stringBuilder2);
        sQLiteDatabase.execSQL("DROP TABLE sessions_BACKUP;");
        sQLiteDatabase.execSQL("ALTER TABLE reports ADD COLUMN wifi_network_info TEXT DEFAULT ''");
        sQLiteDatabase.execSQL("ALTER TABLE reports ADD COLUMN cell_info TEXT DEFAULT ''");
        sQLiteDatabase.execSQL("ALTER TABLE reports ADD COLUMN location_info TEXT DEFAULT ''");
        return;
    }
}

