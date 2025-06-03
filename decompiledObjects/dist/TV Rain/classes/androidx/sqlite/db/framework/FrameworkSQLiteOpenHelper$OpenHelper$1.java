package androidx.sqlite.db.framework;

import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;

class FrameworkSQLiteOpenHelper$OpenHelper$1
  implements DatabaseErrorHandler
{
  public FrameworkSQLiteOpenHelper$OpenHelper$1(SupportSQLiteOpenHelper.Callback paramCallback, FrameworkSQLiteDatabase[] paramArrayOfFrameworkSQLiteDatabase) {}
  
  public void onCorruption(SQLiteDatabase paramSQLiteDatabase)
  {
    val$callback.onCorruption(FrameworkSQLiteOpenHelper.OpenHelper.getWrappedDb(val$dbRef, paramSQLiteDatabase));
  }
}

/* Location:
 * Qualified Name:     androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */