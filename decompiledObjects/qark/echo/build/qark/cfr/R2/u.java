/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.database.Cursor
 *  android.database.sqlite.SQLiteDatabase
 *  android.database.sqlite.SQLiteException
 *  android.text.TextUtils
 *  java.io.File
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.HashSet
 *  java.util.Set
 */
package R2;

import R2.Y1;
import R2.a2;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import java.io.File;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public abstract class u {
    public static Set a(SQLiteDatabase sQLiteDatabase, String string2) {
        HashSet hashSet = new HashSet();
        StringBuilder stringBuilder = new StringBuilder("SELECT * FROM ");
        stringBuilder.append(string2);
        stringBuilder.append(" LIMIT 0");
        sQLiteDatabase = sQLiteDatabase.rawQuery(stringBuilder.toString(), null);
        try {
            Collections.addAll((Collection)hashSet, (Object[])sQLiteDatabase.getColumnNames());
            return hashSet;
        }
        finally {
            sQLiteDatabase.close();
        }
    }

    public static void b(Y1 y12, SQLiteDatabase sQLiteDatabase) {
        if (y12 != null) {
            if (!(sQLiteDatabase = new File(sQLiteDatabase.getPath())).setReadable(false, false)) {
                y12.L().a("Failed to turn off database read permission");
            }
            if (!sQLiteDatabase.setWritable(false, false)) {
                y12.L().a("Failed to turn off database write permission");
            }
            if (!sQLiteDatabase.setReadable(true, true)) {
                y12.L().a("Failed to turn on database read permission for owner");
            }
            if (!sQLiteDatabase.setWritable(true, true)) {
                y12.L().a("Failed to turn on database write permission for owner");
            }
            return;
        }
        throw new IllegalArgumentException("Monitor must not be null");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void c(Y1 y12, SQLiteDatabase sQLiteDatabase, String string2, String string3, String string4, String[] arrstring) {
        int n8;
        if (y12 == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        if (!u.d(y12, sQLiteDatabase, string2)) {
            sQLiteDatabase.execSQL(string3);
        }
        string3 = u.a(sQLiteDatabase, string2);
        String[] arrstring2 = string4.split(",");
        int n9 = arrstring2.length;
        int n10 = 0;
        for (n8 = 0; n8 < n9; ++n8) {
            SQLiteException sQLiteException2;
            block10 : {
                string4 = arrstring2[n8];
                try {
                    if (!string3.remove((Object)string4)) break block10;
                    continue;
                }
                catch (SQLiteException sQLiteException2) {}
            }
            sQLiteDatabase = new StringBuilder("Table ");
            sQLiteDatabase.append(string2);
            sQLiteDatabase.append(" is missing required column: ");
            sQLiteDatabase.append(string4);
            throw new SQLiteException(sQLiteDatabase.toString());
            y12.G().b("Failed to verify columns on table that was just created", string2);
            throw sQLiteException2;
        }
        if (arrstring != null) {
            for (n8 = n10; n8 < arrstring.length; n8 += 2) {
                if (string3.remove((Object)arrstring[n8])) continue;
                sQLiteDatabase.execSQL(arrstring[n8 + 1]);
            }
        }
        if (!string3.isEmpty()) {
            y12.L().c("Table has extra columns. table, columns", string2, TextUtils.join((CharSequence)", ", (Iterable)string3));
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static boolean d(Y1 y12, SQLiteDatabase sQLiteDatabase, String string2) {
        Throwable throwable222;
        if (y12 == null) throw new IllegalArgumentException("Monitor must not be null");
        SQLiteDatabase sQLiteDatabase2 = null;
        SQLiteDatabase sQLiteDatabase3 = null;
        sQLiteDatabase3 = sQLiteDatabase = sQLiteDatabase.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{string2}, null, null, null);
        sQLiteDatabase2 = sQLiteDatabase;
        boolean bl = sQLiteDatabase.moveToFirst();
        sQLiteDatabase.close();
        return bl;
        {
            catch (Throwable throwable222) {
            }
            catch (SQLiteException sQLiteException) {}
            sQLiteDatabase3 = sQLiteDatabase2;
            {
                y12.L().c("Error querying for table", string2, (Object)sQLiteException);
                if (sQLiteDatabase2 == null) return false;
            }
            sQLiteDatabase2.close();
            return false;
        }
        if (sQLiteDatabase3 == null) throw throwable222;
        sQLiteDatabase3.close();
        throw throwable222;
    }
}

