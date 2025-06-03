package vn.hunghd.flutterdownloader;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import ec.i;

public final class c
  extends SQLiteOpenHelper
{
  public static c a;
  
  public c(Context paramContext)
  {
    super(paramContext, "download_tasks.db", null, 4);
  }
  
  public final void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    i.e(paramSQLiteDatabase, "db");
    paramSQLiteDatabase.execSQL("CREATE TABLE task (_id INTEGER PRIMARY KEY,task_id VARCHAR(256), url TEXT, status INTEGER DEFAULT 0, progress INTEGER DEFAULT 0, file_name TEXT, saved_dir TEXT, headers TEXT, mime_type VARCHAR(128), resumable TINYINT DEFAULT 0, show_notification TINYINT DEFAULT 0, open_file_from_notification TINYINT DEFAULT 0, time_created INTEGER DEFAULT 0, save_in_public_storage TINYINT DEFAULT 0, allow_cellular TINYINT DEFAULT 1)");
  }
  
  public final void onDowngrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    i.e(paramSQLiteDatabase, "db");
    onUpgrade(paramSQLiteDatabase, paramInt1, paramInt2);
  }
  
  public final void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    i.e(paramSQLiteDatabase, "db");
    if (paramInt2 == 4) {}
    for (String str = "ALTER TABLE task ADD COLUMN allow_cellular TINYINT DEFAULT 1";; str = "ALTER TABLE task ADD COLUMN save_in_public_storage TINYINT DEFAULT 0")
    {
      paramSQLiteDatabase.execSQL(str);
      return;
      if ((paramInt1 != 2) || (paramInt2 != 3)) {
        break;
      }
    }
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS task");
    onCreate(paramSQLiteDatabase);
  }
  
  public static final class a
  {
    public static c a(Context paramContext)
    {
      if (c.a == null)
      {
        i.b(paramContext);
        paramContext = paramContext.getApplicationContext();
        i.d(paramContext, "getApplicationContext(...)");
        c.a = new c(paramContext);
      }
      paramContext = c.a;
      i.b(paramContext);
      return paramContext;
    }
  }
}

/* Location:
 * Qualified Name:     vn.hunghd.flutterdownloader.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */