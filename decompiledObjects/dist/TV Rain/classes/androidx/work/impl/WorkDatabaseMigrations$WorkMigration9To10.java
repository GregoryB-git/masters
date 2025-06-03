package androidx.work.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.work.impl.utils.IdGenerator;
import androidx.work.impl.utils.PreferenceUtils;

public class WorkDatabaseMigrations$WorkMigration9To10
  extends Migration
{
  public final Context mContext;
  
  public WorkDatabaseMigrations$WorkMigration9To10(@NonNull Context paramContext)
  {
    super(9, 10);
    mContext = paramContext;
  }
  
  public void migrate(@NonNull SupportSQLiteDatabase paramSupportSQLiteDatabase)
  {
    paramSupportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
    PreferenceUtils.migrateLegacyPreferences(mContext, paramSupportSQLiteDatabase);
    IdGenerator.migrateLegacyIdGenerator(mContext, paramSupportSQLiteDatabase);
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.WorkDatabaseMigrations.WorkMigration9To10
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */