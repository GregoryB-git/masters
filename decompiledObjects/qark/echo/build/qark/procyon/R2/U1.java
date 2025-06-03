// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase$CursorFactory;
import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;

public final class U1 extends SQLiteOpenHelper
{
    public final /* synthetic */ V1 o;
    
    public U1(final V1 o, final Context context, final String s) {
        this.o = o;
        super(context, s, (SQLiteDatabase$CursorFactory)null, 1);
    }
    
    public final SQLiteDatabase getWritableDatabase() {
    Label_0007_Outer:
        while (true) {
            while (true) {
                try {
                    return super.getWritableDatabase();
                    // iftrue(Label_0057:, this.o.a().getDatabasePath("google_app_measurement_local.db").delete())
                Block_3:
                    while (true) {
                        this.o.j().G().b("Failed to delete corrupted local db file", "google_app_measurement_local.db");
                        break Block_3;
                        this.o.j().G().a("Opening the local database failed, dropping and recreating it");
                        continue Label_0007_Outer;
                    }
                    try {
                        Label_0057: {
                            return super.getWritableDatabase();
                        }
                    }
                    catch (SQLiteException ex) {
                        this.o.j().G().b("Failed to open local database. Events will bypass local storage", ex);
                        return null;
                    }
                }
                catch (SQLiteDatabaseLockedException ex2) {
                    throw ex2;
                }
                catch (SQLiteException ex3) {}
                continue;
            }
        }
    }
    
    public final void onCreate(final SQLiteDatabase sqLiteDatabase) {
        u.b(this.o.j(), sqLiteDatabase);
    }
    
    public final void onDowngrade(final SQLiteDatabase sqLiteDatabase, final int n, final int n2) {
    }
    
    public final void onOpen(final SQLiteDatabase sqLiteDatabase) {
        u.c(this.o.j(), sqLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", null);
    }
    
    public final void onUpgrade(final SQLiteDatabase sqLiteDatabase, final int n, final int n2) {
    }
}
