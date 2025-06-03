package vn.hunghd.flutterdownloader;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import ec.i;

/* loaded from: classes.dex */
public final class c extends SQLiteOpenHelper {

    /* renamed from: a, reason: collision with root package name */
    public static c f16137a;

    public static final class a {
        public static c a(Context context) {
            if (c.f16137a == null) {
                i.b(context);
                Context applicationContext = context.getApplicationContext();
                i.d(applicationContext, "getApplicationContext(...)");
                c.f16137a = new c(applicationContext);
            }
            c cVar = c.f16137a;
            i.b(cVar);
            return cVar;
        }
    }

    public c(Context context) {
        super(context, "download_tasks.db", (SQLiteDatabase.CursorFactory) null, 4);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        i.e(sQLiteDatabase, "db");
        sQLiteDatabase.execSQL("CREATE TABLE task (_id INTEGER PRIMARY KEY,task_id VARCHAR(256), url TEXT, status INTEGER DEFAULT 0, progress INTEGER DEFAULT 0, file_name TEXT, saved_dir TEXT, headers TEXT, mime_type VARCHAR(128), resumable TINYINT DEFAULT 0, show_notification TINYINT DEFAULT 0, open_file_from_notification TINYINT DEFAULT 0, time_created INTEGER DEFAULT 0, save_in_public_storage TINYINT DEFAULT 0, allow_cellular TINYINT DEFAULT 1)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        i.e(sQLiteDatabase, "db");
        onUpgrade(sQLiteDatabase, i10, i11);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        String str;
        i.e(sQLiteDatabase, "db");
        if (i11 == 4) {
            str = "ALTER TABLE task ADD COLUMN allow_cellular TINYINT DEFAULT 1";
        } else {
            if (i10 != 2 || i11 != 3) {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS task");
                onCreate(sQLiteDatabase);
                return;
            }
            str = "ALTER TABLE task ADD COLUMN save_in_public_storage TINYINT DEFAULT 0";
        }
        sQLiteDatabase.execSQL(str);
    }
}
