package androidx.work.impl;

import androidx.annotation.NonNull;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

class WorkDatabaseMigrations$1
  extends Migration
{
  public WorkDatabaseMigrations$1(int paramInt1, int paramInt2)
  {
    super(paramInt1, paramInt2);
  }
  
  public void migrate(@NonNull SupportSQLiteDatabase paramSupportSQLiteDatabase)
  {
    paramSupportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
    paramSupportSQLiteDatabase.execSQL("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
    paramSupportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS alarmInfo");
    paramSupportSQLiteDatabase.execSQL("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.WorkDatabaseMigrations.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */