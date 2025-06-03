package e7;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzcf;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class s {
    public static HashSet a(SQLiteDatabase sQLiteDatabase, String str) {
        HashSet hashSet = new HashSet();
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT * FROM " + str + " LIMIT 0", null);
        try {
            Collections.addAll(hashSet, rawQuery.getColumnNames());
            return hashSet;
        } finally {
            rawQuery.close();
        }
    }

    public static void b(a1 a1Var, SQLiteDatabase sQLiteDatabase) {
        if (a1Var == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        File file = new File(zzcf.zza().zza(sQLiteDatabase.getPath()));
        if (!file.setReadable(false, false)) {
            a1Var.f4063r.b("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            a1Var.f4063r.b("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            a1Var.f4063r.b("Failed to turn on database read permission for owner");
        }
        if (file.setWritable(true, true)) {
            return;
        }
        a1Var.f4063r.b("Failed to turn on database write permission for owner");
    }

    public static void c(a1 a1Var, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) {
        boolean z10;
        if (a1Var == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        Cursor cursor = null;
        try {
            try {
                cursor = sQLiteDatabase.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
                z10 = cursor.moveToFirst();
                cursor.close();
            } catch (SQLiteException e10) {
                a1Var.f4063r.d("Error querying for table", str, e10);
                if (cursor != null) {
                    cursor.close();
                }
                z10 = false;
            }
            if (!z10) {
                sQLiteDatabase.execSQL(str2);
            }
            try {
                HashSet a10 = a(sQLiteDatabase, str);
                for (String str4 : str3.split(",")) {
                    if (!a10.remove(str4)) {
                        throw new SQLiteException("Table " + str + " is missing required column: " + str4);
                    }
                }
                if (strArr != null) {
                    for (int i10 = 0; i10 < strArr.length; i10 += 2) {
                        if (!a10.remove(strArr[i10])) {
                            sQLiteDatabase.execSQL(strArr[i10 + 1]);
                        }
                    }
                }
                if (a10.isEmpty()) {
                    return;
                }
                a1Var.f4063r.d("Table has extra columns. table, columns", str, TextUtils.join(", ", a10));
            } catch (SQLiteException e11) {
                a1Var.f4060o.c("Failed to verify columns on table that was just created", str);
                throw e11;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }
}
