package androidx.work.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.work.impl.utils.IdGenerator;
import androidx.work.impl.utils.PreferenceUtils;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class WorkDatabaseMigrations
{
  private static final String CREATE_INDEX_PERIOD_START_TIME = "CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)";
  private static final String CREATE_OUT_OF_QUOTA_POLICY = "ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0";
  private static final String CREATE_PREFERENCE = "CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))";
  private static final String CREATE_RUN_IN_FOREGROUND = "ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0";
  private static final String CREATE_SYSTEM_ID_INFO = "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )";
  private static final String CREATE_WORK_PROGRESS = "CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )";
  public static final String INSERT_PREFERENCE = "INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)";
  private static final String MIGRATE_ALARM_INFO_TO_SYSTEM_ID_INFO = "INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo";
  @NonNull
  public static Migration MIGRATION_11_12 = new Migration(11, 12)
  {
    public void migrate(@NonNull SupportSQLiteDatabase paramAnonymousSupportSQLiteDatabase)
    {
      paramAnonymousSupportSQLiteDatabase.execSQL("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
    }
  };
  @NonNull
  public static Migration MIGRATION_1_2 = new Migration(1, 2)
  {
    public void migrate(@NonNull SupportSQLiteDatabase paramAnonymousSupportSQLiteDatabase)
    {
      paramAnonymousSupportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
      paramAnonymousSupportSQLiteDatabase.execSQL("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
      paramAnonymousSupportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS alarmInfo");
      paramAnonymousSupportSQLiteDatabase.execSQL("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
    }
  };
  @NonNull
  public static Migration MIGRATION_3_4 = new Migration(3, 4)
  {
    public void migrate(@NonNull SupportSQLiteDatabase paramAnonymousSupportSQLiteDatabase)
    {
      paramAnonymousSupportSQLiteDatabase.execSQL("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
    }
  };
  @NonNull
  public static Migration MIGRATION_4_5 = new Migration(4, 5)
  {
    public void migrate(@NonNull SupportSQLiteDatabase paramAnonymousSupportSQLiteDatabase)
    {
      paramAnonymousSupportSQLiteDatabase.execSQL("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
      paramAnonymousSupportSQLiteDatabase.execSQL("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
    }
  };
  @NonNull
  public static Migration MIGRATION_6_7 = new Migration(6, 7)
  {
    public void migrate(@NonNull SupportSQLiteDatabase paramAnonymousSupportSQLiteDatabase)
    {
      paramAnonymousSupportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
    }
  };
  @NonNull
  public static Migration MIGRATION_7_8 = new Migration(7, 8)
  {
    public void migrate(@NonNull SupportSQLiteDatabase paramAnonymousSupportSQLiteDatabase)
    {
      paramAnonymousSupportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)");
    }
  };
  @NonNull
  public static Migration MIGRATION_8_9 = new Migration(8, 9)
  {
    public void migrate(@NonNull SupportSQLiteDatabase paramAnonymousSupportSQLiteDatabase)
    {
      paramAnonymousSupportSQLiteDatabase.execSQL("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
    }
  };
  private static final String PERIODIC_WORK_SET_SCHEDULE_REQUESTED_AT = "UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0";
  private static final String REMOVE_ALARM_INFO = "DROP TABLE IF EXISTS alarmInfo";
  public static final int VERSION_1 = 1;
  public static final int VERSION_10 = 10;
  public static final int VERSION_11 = 11;
  public static final int VERSION_12 = 12;
  public static final int VERSION_2 = 2;
  public static final int VERSION_3 = 3;
  public static final int VERSION_4 = 4;
  public static final int VERSION_5 = 5;
  public static final int VERSION_6 = 6;
  public static final int VERSION_7 = 7;
  public static final int VERSION_8 = 8;
  public static final int VERSION_9 = 9;
  private static final String WORKSPEC_ADD_TRIGGER_MAX_CONTENT_DELAY = "ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1";
  private static final String WORKSPEC_ADD_TRIGGER_UPDATE_DELAY = "ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1";
  
  public static class RescheduleMigration
    extends Migration
  {
    public final Context mContext;
    
    public RescheduleMigration(@NonNull Context paramContext, int paramInt1, int paramInt2)
    {
      super(paramInt2);
      mContext = paramContext;
    }
    
    public void migrate(@NonNull SupportSQLiteDatabase paramSupportSQLiteDatabase)
    {
      if (endVersion >= 10) {
        paramSupportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[] { "reschedule_needed", Integer.valueOf(1) });
      } else {
        mContext.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
      }
    }
  }
  
  public static class WorkMigration9To10
    extends Migration
  {
    public final Context mContext;
    
    public WorkMigration9To10(@NonNull Context paramContext)
    {
      super(10);
      mContext = paramContext;
    }
    
    public void migrate(@NonNull SupportSQLiteDatabase paramSupportSQLiteDatabase)
    {
      paramSupportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
      PreferenceUtils.migrateLegacyPreferences(mContext, paramSupportSQLiteDatabase);
      IdGenerator.migrateLegacyIdGenerator(mContext, paramSupportSQLiteDatabase);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.WorkDatabaseMigrations
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */