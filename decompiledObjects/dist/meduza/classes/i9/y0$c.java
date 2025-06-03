package i9;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public final class y0$c
  extends SQLiteOpenHelper
{
  public final i a;
  public boolean b;
  
  public y0$c(Context paramContext, i parami, String paramString)
  {
    super(paramContext, paramString, null, 17);
    a = parami;
  }
  
  public final void onConfigure(SQLiteDatabase paramSQLiteDatabase)
  {
    b = true;
    paramSQLiteDatabase.rawQuery("PRAGMA locking_mode = EXCLUSIVE", new String[0]).close();
  }
  
  public final void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    if (!b) {
      onConfigure(paramSQLiteDatabase);
    }
    new h1(paramSQLiteDatabase, a).c(0);
  }
  
  public final void onDowngrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    if (!b) {
      onConfigure(paramSQLiteDatabase);
    }
  }
  
  public final void onOpen(SQLiteDatabase paramSQLiteDatabase)
  {
    if (!b) {
      onConfigure(paramSQLiteDatabase);
    }
  }
  
  public final void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    if (!b) {
      onConfigure(paramSQLiteDatabase);
    }
    new h1(paramSQLiteDatabase, a).c(paramInt1);
  }
}

/* Location:
 * Qualified Name:     i9.y0.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */