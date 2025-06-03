// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import android.database.Cursor;
import android.text.TextUtils;
import android.database.sqlite.SQLiteException;
import java.io.File;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import android.database.sqlite.SQLiteDatabase;

public abstract class u
{
    public static Set a(SQLiteDatabase rawQuery, final String str) {
        final HashSet<Object> c = new HashSet<Object>();
        final StringBuilder sb = new StringBuilder("SELECT * FROM ");
        sb.append(str);
        sb.append(" LIMIT 0");
        rawQuery = (SQLiteDatabase)rawQuery.rawQuery(sb.toString(), (String[])null);
        try {
            Collections.addAll(c, ((Cursor)rawQuery).getColumnNames());
            return c;
        }
        finally {
            ((Cursor)rawQuery).close();
        }
    }
    
    public static void b(final Y1 y1, final SQLiteDatabase sqLiteDatabase) {
        if (y1 != null) {
            final File file = new File(sqLiteDatabase.getPath());
            if (!file.setReadable(false, false)) {
                y1.L().a("Failed to turn off database read permission");
            }
            if (!file.setWritable(false, false)) {
                y1.L().a("Failed to turn off database write permission");
            }
            if (!file.setReadable(true, true)) {
                y1.L().a("Failed to turn on database read permission for owner");
            }
            if (!file.setWritable(true, true)) {
                y1.L().a("Failed to turn on database write permission for owner");
            }
            return;
        }
        throw new IllegalArgumentException("Monitor must not be null");
    }
    
    public static void c(final Y1 y1, final SQLiteDatabase sqLiteDatabase, final String str, final String s, String str2, final String[] array) {
        Label_0194: {
            if (y1 == null) {
                break Label_0194;
            }
            if (!d(y1, sqLiteDatabase, str)) {
                sqLiteDatabase.execSQL(s);
            }
            while (true) {
            Label_0156_Outer:
                while (true) {
                    int n2 = 0;
                    Label_0220: {
                        while (true) {
                            int n = 0;
                        Block_8_Outer:
                            while (true) {
                                try {
                                    final Set a = a(sqLiteDatabase, str);
                                    final String[] split = str2.split(",");
                                    final int length = split.length;
                                    n = 0;
                                    Label_0078: {
                                        for (int i = 0; i < length; ++i) {
                                            str2 = split[i];
                                            if (!a.remove(str2)) {
                                                break Label_0078;
                                            }
                                        }
                                        break Block_8_Outer;
                                    }
                                    final StringBuilder sb = new StringBuilder("Table ");
                                    sb.append(str);
                                    sb.append(" is missing required column: ");
                                    sb.append(str2);
                                    throw new SQLiteException(sb.toString());
                                    // iftrue(Label_0156:, n2 >= array.length)
                                    // iftrue(Label_0181:, a.isEmpty())
                                    while (true) {
                                        Block_7: {
                                            break Block_7;
                                            Label_0181: {
                                                return;
                                            }
                                            y1.G().b("Failed to verify columns on table that was just created", str);
                                            throw;
                                            while (true) {
                                                y1.L().c("Table has extra columns. table, columns", str, TextUtils.join((CharSequence)", ", (Iterable)a));
                                                return;
                                                sqLiteDatabase.execSQL(array[n2 + 1]);
                                                break Label_0220;
                                                continue Block_8_Outer;
                                            }
                                            throw new IllegalArgumentException("Monitor must not be null");
                                        }
                                        continue Label_0156_Outer;
                                    }
                                }
                                // iftrue(Label_0220:, a.remove((Object)array[n2]))
                                catch (SQLiteException ex2) {}
                                final SQLiteException ex2;
                                final SQLiteException ex = ex2;
                                continue Label_0156_Outer;
                            }
                            if (array != null) {
                                n2 = n;
                                continue Label_0156_Outer;
                            }
                            continue;
                        }
                    }
                    n2 += 2;
                    continue;
                }
            }
        }
    }
    
    public static boolean d(final Y1 y1, final SQLiteDatabase sqLiteDatabase, final String s) {
        if (y1 != null) {
            Cursor cursor = null;
            Cursor query = null;
            try {
                try {
                    final Cursor cursor2 = cursor = (query = sqLiteDatabase.query("SQLITE_MASTER", new String[] { "name" }, "name=?", new String[] { s }, (String)null, (String)null, (String)null));
                    final boolean moveToFirst = cursor2.moveToFirst();
                    cursor2.close();
                    return moveToFirst;
                }
                finally {
                    if (query != null) {
                        query.close();
                    }
                    cursor.close();
                    return false;
                }
            }
            catch (SQLiteException ex) {}
        }
        throw new IllegalArgumentException("Monitor must not be null");
    }
}
