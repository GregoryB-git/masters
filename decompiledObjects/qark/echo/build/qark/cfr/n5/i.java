/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.database.Cursor
 *  android.database.sqlite.SQLiteCursorDriver
 *  android.database.sqlite.SQLiteDatabase
 *  android.database.sqlite.SQLiteDatabase$CursorFactory
 *  android.database.sqlite.SQLiteQuery
 *  java.lang.Object
 *  java.lang.String
 */
package n5;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import n5.F;
import n5.k;

public final class i
implements SQLiteDatabase.CursorFactory {
    public final /* synthetic */ F a;

    public /* synthetic */ i(F f8) {
        this.a = f8;
    }

    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String string2, SQLiteQuery sQLiteQuery) {
        return k.f(this.a, sQLiteDatabase, sQLiteCursorDriver, string2, sQLiteQuery);
    }
}

