package R2;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: R2.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0608u {
    public static Set a(SQLiteDatabase sQLiteDatabase, String str) {
        HashSet hashSet = new HashSet();
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT * FROM " + str + " LIMIT 0", null);
        try {
            Collections.addAll(hashSet, rawQuery.getColumnNames());
            return hashSet;
        } finally {
            rawQuery.close();
        }
    }

    public static void b(Y1 y12, SQLiteDatabase sQLiteDatabase) {
        if (y12 == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        File file = new File(sQLiteDatabase.getPath());
        if (!file.setReadable(false, false)) {
            y12.L().a("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            y12.L().a("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            y12.L().a("Failed to turn on database read permission for owner");
        }
        if (file.setWritable(true, true)) {
            return;
        }
        y12.L().a("Failed to turn on database write permission for owner");
    }

    public static void c(Y1 y12, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) {
        if (y12 == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        if (!d(y12, sQLiteDatabase, str)) {
            sQLiteDatabase.execSQL(str2);
        }
        try {
            Set a7 = a(sQLiteDatabase, str);
            for (String str4 : str3.split(",")) {
                if (!a7.remove(str4)) {
                    throw new SQLiteException("Table " + str + " is missing required column: " + str4);
                }
            }
            if (strArr != null) {
                for (int i7 = 0; i7 < strArr.length; i7 += 2) {
                    if (!a7.remove(strArr[i7])) {
                        sQLiteDatabase.execSQL(strArr[i7 + 1]);
                    }
                }
            }
            if (a7.isEmpty()) {
                return;
            }
            y12.L().c("Table has extra columns. table, columns", str, TextUtils.join(", ", a7));
        } catch (SQLiteException e7) {
            y12.G().b("Failed to verify columns on table that was just created", str);
            throw e7;
        }
    }

    public static boolean d(Y1 y12, SQLiteDatabase sQLiteDatabase, String str) {
        if (y12 == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        Cursor cursor = null;
        try {
            try {
                cursor = sQLiteDatabase.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
                boolean moveToFirst = cursor.moveToFirst();
                cursor.close();
                return moveToFirst;
            } catch (SQLiteException e7) {
                y12.L().c("Error querying for table", str, e7);
                if (cursor != null) {
                    cursor.close();
                }
                return false;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }
}
