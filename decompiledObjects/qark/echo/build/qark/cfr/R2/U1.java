/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.database.sqlite.SQLiteDatabase
 *  android.database.sqlite.SQLiteDatabase$CursorFactory
 *  android.database.sqlite.SQLiteDatabaseLockedException
 *  android.database.sqlite.SQLiteException
 *  android.database.sqlite.SQLiteOpenHelper
 *  java.io.File
 *  java.lang.Object
 *  java.lang.String
 */
package R2;

import R2.V1;
import R2.Y1;
import R2.a2;
import R2.u;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.File;

public final class U1
extends SQLiteOpenHelper {
    public final /* synthetic */ V1 o;

    public U1(V1 v12, Context context, String string2) {
        this.o = v12;
        super(context, string2, null, 1);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        }
        catch (SQLiteDatabaseLockedException sQLiteDatabaseLockedException) {
            throw sQLiteDatabaseLockedException;
        }
        catch (SQLiteException sQLiteException) {}
        this.o.j().G().a("Opening the local database failed, dropping and recreating it");
        if (!this.o.a().getDatabasePath("google_app_measurement_local.db").delete()) {
            this.o.j().G().b("Failed to delete corrupted local db file", "google_app_measurement_local.db");
        }
        try {
            return super.getWritableDatabase();
        }
        catch (SQLiteException sQLiteException) {
            this.o.j().G().b("Failed to open local database. Events will bypass local storage", (Object)sQLiteException);
            return null;
        }
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        u.b(this.o.j(), sQLiteDatabase);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int n8, int n9) {
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        u.c(this.o.j(), sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", null);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int n8, int n9) {
    }
}

