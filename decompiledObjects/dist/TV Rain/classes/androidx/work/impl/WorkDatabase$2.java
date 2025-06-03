package androidx.work.impl;

import androidx.annotation.NonNull;
import androidx.room.RoomDatabase.Callback;
import androidx.sqlite.db.SupportSQLiteDatabase;

class WorkDatabase$2
  extends RoomDatabase.Callback
{
  public void onOpen(@NonNull SupportSQLiteDatabase paramSupportSQLiteDatabase)
  {
    super.onOpen(paramSupportSQLiteDatabase);
    paramSupportSQLiteDatabase.beginTransaction();
    try
    {
      paramSupportSQLiteDatabase.execSQL(WorkDatabase.getPruneSQL());
      paramSupportSQLiteDatabase.setTransactionSuccessful();
      return;
    }
    finally
    {
      paramSupportSQLiteDatabase.endTransaction();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.WorkDatabase.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */