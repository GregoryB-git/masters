package androidx.work.impl;

import androidx.annotation.NonNull;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

class WorkDatabaseMigrations$4
  extends Migration
{
  public WorkDatabaseMigrations$4(int paramInt1, int paramInt2)
  {
    super(paramInt1, paramInt2);
  }
  
  public void migrate(@NonNull SupportSQLiteDatabase paramSupportSQLiteDatabase)
  {
    paramSupportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.WorkDatabaseMigrations.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */