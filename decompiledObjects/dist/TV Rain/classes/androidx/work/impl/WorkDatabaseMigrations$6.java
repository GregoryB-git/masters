package androidx.work.impl;

import androidx.annotation.NonNull;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

class WorkDatabaseMigrations$6
  extends Migration
{
  public WorkDatabaseMigrations$6(int paramInt1, int paramInt2)
  {
    super(paramInt1, paramInt2);
  }
  
  public void migrate(@NonNull SupportSQLiteDatabase paramSupportSQLiteDatabase)
  {
    paramSupportSQLiteDatabase.execSQL("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.WorkDatabaseMigrations.6
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */