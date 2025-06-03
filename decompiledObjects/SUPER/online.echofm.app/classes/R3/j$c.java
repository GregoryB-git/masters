package R3;

import Y3.m;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class j$c
  extends SQLiteOpenHelper
{
  public j$c(Context paramContext, String paramString)
  {
    super(paramContext, paramString, null, 2);
  }
  
  public final void a(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("DROP TABLE IF EXISTS ");
    localStringBuilder.append(paramString);
    paramSQLiteDatabase.execSQL(localStringBuilder.toString());
  }
  
  public void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("CREATE TABLE serverCache (path TEXT PRIMARY KEY, value BLOB);");
    paramSQLiteDatabase.execSQL("CREATE TABLE writes (id INTEGER, path TEXT, type TEXT, part INTEGER, node BLOB, UNIQUE (id, part));");
    paramSQLiteDatabase.execSQL("CREATE TABLE trackedQueries (id INTEGER PRIMARY KEY, path TEXT, queryParams TEXT, lastUse INTEGER, complete INTEGER, active INTEGER);");
    paramSQLiteDatabase.execSQL("CREATE TABLE trackedKeys (id INTEGER, key TEXT);");
  }
  
  public void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    boolean bool;
    if (paramInt2 == 2) {
      bool = true;
    } else {
      bool = false;
    }
    m.g(bool, "Why is onUpgrade() called with a different version?");
    if (paramInt1 <= 1)
    {
      a(paramSQLiteDatabase, "serverCache");
      paramSQLiteDatabase.execSQL("CREATE TABLE serverCache (path TEXT PRIMARY KEY, value BLOB);");
      a(paramSQLiteDatabase, "complete");
      paramSQLiteDatabase.execSQL("CREATE TABLE trackedKeys (id INTEGER, key TEXT);");
      paramSQLiteDatabase.execSQL("CREATE TABLE trackedQueries (id INTEGER PRIMARY KEY, path TEXT, queryParams TEXT, lastUse INTEGER, complete INTEGER, active INTEGER);");
      return;
    }
    paramSQLiteDatabase = new StringBuilder();
    paramSQLiteDatabase.append("We don't handle upgrading to ");
    paramSQLiteDatabase.append(paramInt2);
    throw new AssertionError(paramSQLiteDatabase.toString());
  }
}

/* Location:
 * Qualified Name:     R3.j.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */