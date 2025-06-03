package androidx.sqlite.db.framework;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteQuery;
import androidx.sqlite.db.SupportSQLiteQuery;

class FrameworkSQLiteDatabase$1
  implements SQLiteDatabase.CursorFactory
{
  public FrameworkSQLiteDatabase$1(FrameworkSQLiteDatabase paramFrameworkSQLiteDatabase, SupportSQLiteQuery paramSupportSQLiteQuery) {}
  
  public Cursor newCursor(SQLiteDatabase paramSQLiteDatabase, SQLiteCursorDriver paramSQLiteCursorDriver, String paramString, SQLiteQuery paramSQLiteQuery)
  {
    val$supportQuery.bindTo(new FrameworkSQLiteProgram(paramSQLiteQuery));
    return new SQLiteCursor(paramSQLiteCursorDriver, paramString, paramSQLiteQuery);
  }
}

/* Location:
 * Qualified Name:     androidx.sqlite.db.framework.FrameworkSQLiteDatabase.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */