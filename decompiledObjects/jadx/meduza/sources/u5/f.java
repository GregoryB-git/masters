package u5;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f15006c = {"name", "length", "last_touch_timestamp"};

    /* renamed from: a, reason: collision with root package name */
    public final y3.b f15007a;

    /* renamed from: b, reason: collision with root package name */
    public String f15008b;

    public f(y3.c cVar) {
        this.f15007a = cVar;
    }

    public final HashMap a() {
        try {
            this.f15008b.getClass();
            Cursor query = this.f15007a.getReadableDatabase().query(this.f15008b, f15006c, null, null, null, null, null);
            try {
                HashMap hashMap = new HashMap(query.getCount());
                while (query.moveToNext()) {
                    String string = query.getString(0);
                    string.getClass();
                    hashMap.put(string, new e(query.getLong(1), query.getLong(2)));
                }
                query.close();
                return hashMap;
            } finally {
            }
        } catch (SQLException e10) {
            throw new y3.a(e10);
        }
    }

    public final void b(long j10) {
        try {
            String hexString = Long.toHexString(j10);
            this.f15008b = "ExoPlayerCacheFileMetadata" + hexString;
            if (y3.e.a(this.f15007a.getReadableDatabase(), 2, hexString) != 1) {
                SQLiteDatabase writableDatabase = this.f15007a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    y3.e.b(writableDatabase, 2, hexString);
                    writableDatabase.execSQL("DROP TABLE IF EXISTS " + this.f15008b);
                    writableDatabase.execSQL("CREATE TABLE " + this.f15008b + " (name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
        } catch (SQLException e10) {
            throw new y3.a(e10);
        }
    }

    public final void c(Set<String> set) {
        this.f15008b.getClass();
        try {
            SQLiteDatabase writableDatabase = this.f15007a.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    writableDatabase.delete(this.f15008b, "name = ?", new String[]{it.next()});
                }
                writableDatabase.setTransactionSuccessful();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e10) {
            throw new y3.a(e10);
        }
    }

    public final void d(long j10, long j11, String str) {
        this.f15008b.getClass();
        try {
            SQLiteDatabase writableDatabase = this.f15007a.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str);
            contentValues.put("length", Long.valueOf(j10));
            contentValues.put("last_touch_timestamp", Long.valueOf(j11));
            writableDatabase.replaceOrThrow(this.f15008b, null, contentValues);
        } catch (SQLException e10) {
            throw new y3.a(e10);
        }
    }
}
