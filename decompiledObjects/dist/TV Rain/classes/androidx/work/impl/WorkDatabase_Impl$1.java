package androidx.work.impl;

import androidx.room.RoomDatabase.Callback;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class WorkDatabase_Impl$1
  extends RoomOpenHelper.Delegate
{
  public WorkDatabase_Impl$1(WorkDatabase_Impl paramWorkDatabase_Impl, int paramInt)
  {
    super(paramInt);
  }
  
  public void createAllTables(SupportSQLiteDatabase paramSupportSQLiteDatabase)
  {
    paramSupportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
    paramSupportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
    paramSupportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
    paramSupportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
    paramSupportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
    paramSupportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
    paramSupportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
    paramSupportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
    paramSupportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
    paramSupportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
    paramSupportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
    paramSupportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
    paramSupportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
    paramSupportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    paramSupportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
  }
  
  public void dropAllTables(SupportSQLiteDatabase paramSupportSQLiteDatabase)
  {
    paramSupportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `Dependency`");
    paramSupportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `WorkSpec`");
    paramSupportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `WorkTag`");
    paramSupportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `SystemIdInfo`");
    paramSupportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `WorkName`");
    paramSupportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `WorkProgress`");
    paramSupportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `Preference`");
    if (WorkDatabase_Impl.access$000(this$0) != null)
    {
      int i = 0;
      int j = WorkDatabase_Impl.access$100(this$0).size();
      while (i < j)
      {
        ((RoomDatabase.Callback)WorkDatabase_Impl.access$200(this$0).get(i)).onDestructiveMigration(paramSupportSQLiteDatabase);
        i++;
      }
    }
  }
  
  public void onCreate(SupportSQLiteDatabase paramSupportSQLiteDatabase)
  {
    if (WorkDatabase_Impl.access$300(this$0) != null)
    {
      int i = 0;
      int j = WorkDatabase_Impl.access$400(this$0).size();
      while (i < j)
      {
        ((RoomDatabase.Callback)WorkDatabase_Impl.access$500(this$0).get(i)).onCreate(paramSupportSQLiteDatabase);
        i++;
      }
    }
  }
  
  public void onOpen(SupportSQLiteDatabase paramSupportSQLiteDatabase)
  {
    WorkDatabase_Impl.access$602(this$0, paramSupportSQLiteDatabase);
    paramSupportSQLiteDatabase.execSQL("PRAGMA foreign_keys = ON");
    WorkDatabase_Impl.access$700(this$0, paramSupportSQLiteDatabase);
    if (WorkDatabase_Impl.access$800(this$0) != null)
    {
      int i = 0;
      int j = WorkDatabase_Impl.access$900(this$0).size();
      while (i < j)
      {
        ((RoomDatabase.Callback)WorkDatabase_Impl.access$1000(this$0).get(i)).onOpen(paramSupportSQLiteDatabase);
        i++;
      }
    }
  }
  
  public void onPostMigrate(SupportSQLiteDatabase paramSupportSQLiteDatabase) {}
  
  public void onPreMigrate(SupportSQLiteDatabase paramSupportSQLiteDatabase)
  {
    DBUtil.dropFtsSyncTriggers(paramSupportSQLiteDatabase);
  }
  
  public RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase paramSupportSQLiteDatabase)
  {
    Object localObject1 = new HashMap(2);
    ((HashMap)localObject1).put("work_spec_id", new TableInfo.Column("work_spec_id", "TEXT", true, 1, null, 1));
    ((HashMap)localObject1).put("prerequisite_id", new TableInfo.Column("prerequisite_id", "TEXT", true, 2, null, 1));
    Object localObject2 = new HashSet(2);
    ((HashSet)localObject2).add(new TableInfo.ForeignKey("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[] { "work_spec_id" }), Arrays.asList(new String[] { "id" })));
    ((HashSet)localObject2).add(new TableInfo.ForeignKey("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[] { "prerequisite_id" }), Arrays.asList(new String[] { "id" })));
    Object localObject3 = new HashSet(2);
    ((HashSet)localObject3).add(new TableInfo.Index("index_Dependency_work_spec_id", false, Arrays.asList(new String[] { "work_spec_id" })));
    ((HashSet)localObject3).add(new TableInfo.Index("index_Dependency_prerequisite_id", false, Arrays.asList(new String[] { "prerequisite_id" })));
    localObject3 = new TableInfo("Dependency", (Map)localObject1, (Set)localObject2, (Set)localObject3);
    localObject1 = TableInfo.read(paramSupportSQLiteDatabase, "Dependency");
    if (!((TableInfo)localObject3).equals(localObject1))
    {
      paramSupportSQLiteDatabase = new StringBuilder();
      paramSupportSQLiteDatabase.append("Dependency(androidx.work.impl.model.Dependency).\n Expected:\n");
      paramSupportSQLiteDatabase.append(localObject3);
      paramSupportSQLiteDatabase.append("\n Found:\n");
      paramSupportSQLiteDatabase.append(localObject1);
      return new RoomOpenHelper.ValidationResult(false, paramSupportSQLiteDatabase.toString());
    }
    localObject2 = new HashMap(25);
    ((HashMap)localObject2).put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
    ((HashMap)localObject2).put("state", new TableInfo.Column("state", "INTEGER", true, 0, null, 1));
    ((HashMap)localObject2).put("worker_class_name", new TableInfo.Column("worker_class_name", "TEXT", true, 0, null, 1));
    ((HashMap)localObject2).put("input_merger_class_name", new TableInfo.Column("input_merger_class_name", "TEXT", false, 0, null, 1));
    ((HashMap)localObject2).put("input", new TableInfo.Column("input", "BLOB", true, 0, null, 1));
    ((HashMap)localObject2).put("output", new TableInfo.Column("output", "BLOB", true, 0, null, 1));
    ((HashMap)localObject2).put("initial_delay", new TableInfo.Column("initial_delay", "INTEGER", true, 0, null, 1));
    ((HashMap)localObject2).put("interval_duration", new TableInfo.Column("interval_duration", "INTEGER", true, 0, null, 1));
    ((HashMap)localObject2).put("flex_duration", new TableInfo.Column("flex_duration", "INTEGER", true, 0, null, 1));
    ((HashMap)localObject2).put("run_attempt_count", new TableInfo.Column("run_attempt_count", "INTEGER", true, 0, null, 1));
    ((HashMap)localObject2).put("backoff_policy", new TableInfo.Column("backoff_policy", "INTEGER", true, 0, null, 1));
    ((HashMap)localObject2).put("backoff_delay_duration", new TableInfo.Column("backoff_delay_duration", "INTEGER", true, 0, null, 1));
    ((HashMap)localObject2).put("period_start_time", new TableInfo.Column("period_start_time", "INTEGER", true, 0, null, 1));
    ((HashMap)localObject2).put("minimum_retention_duration", new TableInfo.Column("minimum_retention_duration", "INTEGER", true, 0, null, 1));
    ((HashMap)localObject2).put("schedule_requested_at", new TableInfo.Column("schedule_requested_at", "INTEGER", true, 0, null, 1));
    ((HashMap)localObject2).put("run_in_foreground", new TableInfo.Column("run_in_foreground", "INTEGER", true, 0, null, 1));
    ((HashMap)localObject2).put("out_of_quota_policy", new TableInfo.Column("out_of_quota_policy", "INTEGER", true, 0, null, 1));
    ((HashMap)localObject2).put("required_network_type", new TableInfo.Column("required_network_type", "INTEGER", false, 0, null, 1));
    ((HashMap)localObject2).put("requires_charging", new TableInfo.Column("requires_charging", "INTEGER", true, 0, null, 1));
    ((HashMap)localObject2).put("requires_device_idle", new TableInfo.Column("requires_device_idle", "INTEGER", true, 0, null, 1));
    ((HashMap)localObject2).put("requires_battery_not_low", new TableInfo.Column("requires_battery_not_low", "INTEGER", true, 0, null, 1));
    ((HashMap)localObject2).put("requires_storage_not_low", new TableInfo.Column("requires_storage_not_low", "INTEGER", true, 0, null, 1));
    ((HashMap)localObject2).put("trigger_content_update_delay", new TableInfo.Column("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
    ((HashMap)localObject2).put("trigger_max_content_delay", new TableInfo.Column("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
    ((HashMap)localObject2).put("content_uri_triggers", new TableInfo.Column("content_uri_triggers", "BLOB", false, 0, null, 1));
    localObject3 = new HashSet(0);
    localObject1 = new HashSet(2);
    ((HashSet)localObject1).add(new TableInfo.Index("index_WorkSpec_schedule_requested_at", false, Arrays.asList(new String[] { "schedule_requested_at" })));
    ((HashSet)localObject1).add(new TableInfo.Index("index_WorkSpec_period_start_time", false, Arrays.asList(new String[] { "period_start_time" })));
    localObject1 = new TableInfo("WorkSpec", (Map)localObject2, (Set)localObject3, (Set)localObject1);
    localObject3 = TableInfo.read(paramSupportSQLiteDatabase, "WorkSpec");
    if (!((TableInfo)localObject1).equals(localObject3))
    {
      paramSupportSQLiteDatabase = new StringBuilder();
      paramSupportSQLiteDatabase.append("WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n");
      paramSupportSQLiteDatabase.append(localObject1);
      paramSupportSQLiteDatabase.append("\n Found:\n");
      paramSupportSQLiteDatabase.append(localObject3);
      return new RoomOpenHelper.ValidationResult(false, paramSupportSQLiteDatabase.toString());
    }
    localObject2 = new HashMap(2);
    ((HashMap)localObject2).put("tag", new TableInfo.Column("tag", "TEXT", true, 1, null, 1));
    ((HashMap)localObject2).put("work_spec_id", new TableInfo.Column("work_spec_id", "TEXT", true, 2, null, 1));
    localObject1 = new HashSet(1);
    ((HashSet)localObject1).add(new TableInfo.ForeignKey("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[] { "work_spec_id" }), Arrays.asList(new String[] { "id" })));
    localObject3 = new HashSet(1);
    ((HashSet)localObject3).add(new TableInfo.Index("index_WorkTag_work_spec_id", false, Arrays.asList(new String[] { "work_spec_id" })));
    localObject1 = new TableInfo("WorkTag", (Map)localObject2, (Set)localObject1, (Set)localObject3);
    localObject3 = TableInfo.read(paramSupportSQLiteDatabase, "WorkTag");
    if (!((TableInfo)localObject1).equals(localObject3))
    {
      paramSupportSQLiteDatabase = new StringBuilder();
      paramSupportSQLiteDatabase.append("WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n");
      paramSupportSQLiteDatabase.append(localObject1);
      paramSupportSQLiteDatabase.append("\n Found:\n");
      paramSupportSQLiteDatabase.append(localObject3);
      return new RoomOpenHelper.ValidationResult(false, paramSupportSQLiteDatabase.toString());
    }
    localObject1 = new HashMap(2);
    ((HashMap)localObject1).put("work_spec_id", new TableInfo.Column("work_spec_id", "TEXT", true, 1, null, 1));
    ((HashMap)localObject1).put("system_id", new TableInfo.Column("system_id", "INTEGER", true, 0, null, 1));
    localObject3 = new HashSet(1);
    ((HashSet)localObject3).add(new TableInfo.ForeignKey("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[] { "work_spec_id" }), Arrays.asList(new String[] { "id" })));
    localObject3 = new TableInfo("SystemIdInfo", (Map)localObject1, (Set)localObject3, new HashSet(0));
    localObject1 = TableInfo.read(paramSupportSQLiteDatabase, "SystemIdInfo");
    if (!((TableInfo)localObject3).equals(localObject1))
    {
      paramSupportSQLiteDatabase = new StringBuilder();
      paramSupportSQLiteDatabase.append("SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n");
      paramSupportSQLiteDatabase.append(localObject3);
      paramSupportSQLiteDatabase.append("\n Found:\n");
      paramSupportSQLiteDatabase.append(localObject1);
      return new RoomOpenHelper.ValidationResult(false, paramSupportSQLiteDatabase.toString());
    }
    localObject2 = new HashMap(2);
    ((HashMap)localObject2).put("name", new TableInfo.Column("name", "TEXT", true, 1, null, 1));
    ((HashMap)localObject2).put("work_spec_id", new TableInfo.Column("work_spec_id", "TEXT", true, 2, null, 1));
    localObject1 = new HashSet(1);
    ((HashSet)localObject1).add(new TableInfo.ForeignKey("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[] { "work_spec_id" }), Arrays.asList(new String[] { "id" })));
    localObject3 = new HashSet(1);
    ((HashSet)localObject3).add(new TableInfo.Index("index_WorkName_work_spec_id", false, Arrays.asList(new String[] { "work_spec_id" })));
    localObject3 = new TableInfo("WorkName", (Map)localObject2, (Set)localObject1, (Set)localObject3);
    localObject1 = TableInfo.read(paramSupportSQLiteDatabase, "WorkName");
    if (!((TableInfo)localObject3).equals(localObject1))
    {
      paramSupportSQLiteDatabase = new StringBuilder();
      paramSupportSQLiteDatabase.append("WorkName(androidx.work.impl.model.WorkName).\n Expected:\n");
      paramSupportSQLiteDatabase.append(localObject3);
      paramSupportSQLiteDatabase.append("\n Found:\n");
      paramSupportSQLiteDatabase.append(localObject1);
      return new RoomOpenHelper.ValidationResult(false, paramSupportSQLiteDatabase.toString());
    }
    localObject3 = new HashMap(2);
    ((HashMap)localObject3).put("work_spec_id", new TableInfo.Column("work_spec_id", "TEXT", true, 1, null, 1));
    ((HashMap)localObject3).put("progress", new TableInfo.Column("progress", "BLOB", true, 0, null, 1));
    localObject1 = new HashSet(1);
    ((HashSet)localObject1).add(new TableInfo.ForeignKey("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[] { "work_spec_id" }), Arrays.asList(new String[] { "id" })));
    localObject3 = new TableInfo("WorkProgress", (Map)localObject3, (Set)localObject1, new HashSet(0));
    localObject1 = TableInfo.read(paramSupportSQLiteDatabase, "WorkProgress");
    if (!((TableInfo)localObject3).equals(localObject1))
    {
      paramSupportSQLiteDatabase = new StringBuilder();
      paramSupportSQLiteDatabase.append("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n");
      paramSupportSQLiteDatabase.append(localObject3);
      paramSupportSQLiteDatabase.append("\n Found:\n");
      paramSupportSQLiteDatabase.append(localObject1);
      return new RoomOpenHelper.ValidationResult(false, paramSupportSQLiteDatabase.toString());
    }
    localObject3 = new HashMap(2);
    ((HashMap)localObject3).put("key", new TableInfo.Column("key", "TEXT", true, 1, null, 1));
    ((HashMap)localObject3).put("long_value", new TableInfo.Column("long_value", "INTEGER", false, 0, null, 1));
    localObject3 = new TableInfo("Preference", (Map)localObject3, new HashSet(0), new HashSet(0));
    localObject1 = TableInfo.read(paramSupportSQLiteDatabase, "Preference");
    if (!((TableInfo)localObject3).equals(localObject1))
    {
      paramSupportSQLiteDatabase = new StringBuilder();
      paramSupportSQLiteDatabase.append("Preference(androidx.work.impl.model.Preference).\n Expected:\n");
      paramSupportSQLiteDatabase.append(localObject3);
      paramSupportSQLiteDatabase.append("\n Found:\n");
      paramSupportSQLiteDatabase.append(localObject1);
      return new RoomOpenHelper.ValidationResult(false, paramSupportSQLiteDatabase.toString());
    }
    return new RoomOpenHelper.ValidationResult(true, null);
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.WorkDatabase_Impl.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */