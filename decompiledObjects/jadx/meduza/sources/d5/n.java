package d5;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import c8.w;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import io.flutter.plugins.urllauncher.WebViewActivity;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class n implements OnFailureListener, i9.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3531a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3532b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3533c;

    public n() {
        this.f3531a = 3;
        this.f3532b = new HashMap();
        this.f3533c = new HashMap();
    }

    public static ad.b f(Cursor cursor) {
        int i10 = cursor.getInt(cursor.getColumnIndexOrThrow("_id"));
        String string = cursor.getString(cursor.getColumnIndexOrThrow("task_id"));
        int i11 = cursor.getInt(cursor.getColumnIndexOrThrow("status"));
        int i12 = cursor.getInt(cursor.getColumnIndexOrThrow("progress"));
        String string2 = cursor.getString(cursor.getColumnIndexOrThrow(WebViewActivity.URL_EXTRA));
        String string3 = cursor.getString(cursor.getColumnIndexOrThrow("file_name"));
        String string4 = cursor.getString(cursor.getColumnIndexOrThrow("saved_dir"));
        String string5 = cursor.getString(cursor.getColumnIndexOrThrow("headers"));
        String string6 = cursor.getString(cursor.getColumnIndexOrThrow("mime_type"));
        short s10 = cursor.getShort(cursor.getColumnIndexOrThrow("resumable"));
        short s11 = cursor.getShort(cursor.getColumnIndexOrThrow("show_notification"));
        short s12 = cursor.getShort(cursor.getColumnIndexOrThrow("open_file_from_notification"));
        long j10 = cursor.getLong(cursor.getColumnIndexOrThrow("time_created"));
        short s13 = cursor.getShort(cursor.getColumnIndexOrThrow("save_in_public_storage"));
        short s14 = cursor.getShort(cursor.getColumnIndexOrThrow("allow_cellular"));
        ec.i.b(string);
        ad.a aVar = ad.a.values()[i11];
        ec.i.b(string2);
        ec.i.b(string4);
        ec.i.b(string5);
        ec.i.b(string6);
        return new ad.b(i10, string, aVar, i12, string2, string3, string4, string5, string6, s10 == 1, s11 == 1, s12 == 1, j10, s13 == 1, s14 == 1);
    }

    @Override // i9.a
    public final f9.e a(String str) {
        return (f9.e) ((Map) this.f3532b).get(str);
    }

    @Override // i9.a
    public final void b(f9.e eVar) {
        ((Map) this.f3532b).put(eVar.f5490a, eVar);
    }

    @Override // i9.a
    public final void c(f9.j jVar) {
        ((Map) this.f3533c).put(jVar.f5508a, jVar);
    }

    @Override // i9.a
    public final f9.j d(String str) {
        return (f9.j) ((Map) this.f3533c).get(str);
    }

    public final ad.b e(String str) {
        Cursor query = ((vn.hunghd.flutterdownloader.c) this.f3532b).getReadableDatabase().query("task", (String[]) this.f3533c, "task_id = ?", new String[]{str}, null, null, "_id DESC", "1");
        ad.b bVar = null;
        while (query.moveToNext()) {
            bVar = f(query);
        }
        query.close();
        return bVar;
    }

    public final void g(String str, ad.a aVar, int i10) {
        SQLiteDatabase writableDatabase = ((vn.hunghd.flutterdownloader.c) this.f3532b).getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", Integer.valueOf(aVar.ordinal()));
        contentValues.put("progress", Integer.valueOf(i10));
        writableDatabase.beginTransaction();
        try {
            try {
                writableDatabase.update("task", contentValues, "task_id = ?", new String[]{str});
                writableDatabase.setTransactionSuccessful();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } finally {
            writableDatabase.endTransaction();
        }
    }

    public final void h(String str, String str2, ad.a aVar, int i10) {
        SQLiteDatabase writableDatabase = ((vn.hunghd.flutterdownloader.c) this.f3532b).getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("task_id", str2);
        contentValues.put("status", Integer.valueOf(aVar.ordinal()));
        contentValues.put("progress", Integer.valueOf(i10));
        contentValues.put("resumable", (Integer) 0);
        contentValues.put("time_created", Long.valueOf(System.currentTimeMillis()));
        writableDatabase.beginTransaction();
        try {
            try {
                writableDatabase.update("task", contentValues, "task_id = ?", new String[]{str});
                writableDatabase.setTransactionSuccessful();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } finally {
            writableDatabase.endTransaction();
        }
    }

    public final void i(String str, String str2, String str3) {
        SQLiteDatabase writableDatabase = ((vn.hunghd.flutterdownloader.c) this.f3532b).getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("file_name", str2);
        contentValues.put("mime_type", str3);
        writableDatabase.beginTransaction();
        try {
            try {
                writableDatabase.update("task", contentValues, "task_id = ?", new String[]{str});
                writableDatabase.setTransactionSuccessful();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } finally {
            writableDatabase.endTransaction();
        }
    }

    public final void j(String str, boolean z10) {
        SQLiteDatabase writableDatabase = ((vn.hunghd.flutterdownloader.c) this.f3532b).getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("resumable", Integer.valueOf(z10 ? 1 : 0));
        writableDatabase.beginTransaction();
        try {
            try {
                writableDatabase.update("task", contentValues, "task_id = ?", new String[]{str});
                writableDatabase.setTransactionSuccessful();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } finally {
            writableDatabase.endTransaction();
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        ((TaskCompletionSource) this.f3532b).setException(exc);
        w.c((Context) this.f3533c);
    }

    public final String toString() {
        switch (this.f3531a) {
            case 0:
                return ((String) this.f3532b) + ", " + ((String) this.f3533c);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ n(int i10, Object obj, Object obj2) {
        this.f3531a = i10;
        this.f3532b = obj;
        this.f3533c = obj2;
    }

    public n(TaskCompletionSource taskCompletionSource, Context context) {
        this.f3531a = 1;
        this.f3532b = taskCompletionSource;
        this.f3533c = context;
    }

    public n(vn.hunghd.flutterdownloader.c cVar) {
        this.f3531a = 4;
        this.f3532b = cVar;
        this.f3533c = new String[]{"_id", "task_id", "progress", "status", WebViewActivity.URL_EXTRA, "file_name", "saved_dir", "headers", "mime_type", "resumable", "open_file_from_notification", "show_notification", "time_created", "save_in_public_storage", "allow_cellular"};
    }
}
