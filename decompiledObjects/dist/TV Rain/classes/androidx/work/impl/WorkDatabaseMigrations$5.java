package androidx.work.impl;

import androidx.annotation.NonNull;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

class WorkDatabaseMigrations$5
  extends Migration
{
  public WorkDatabaseMigrations$5(int paramInt1, int paramInt2)
  {
    super(paramInt1, paramInt2);
  }
  
  public void migrate(@NonNull SupportSQLiteDatabase paramSupportSQLiteDatabase)
  {
    paramSupportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)");
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.WorkDatabaseMigrations.5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */