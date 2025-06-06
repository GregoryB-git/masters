package androidx.work.impl;

import android.database.Cursor;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomDatabase.Callback;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration.Builder;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Factory;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.DependencyDao_Impl;
import androidx.work.impl.model.PreferenceDao;
import androidx.work.impl.model.PreferenceDao_Impl;
import androidx.work.impl.model.RawWorkInfoDao;
import androidx.work.impl.model.RawWorkInfoDao_Impl;
import androidx.work.impl.model.SystemIdInfoDao;
import androidx.work.impl.model.SystemIdInfoDao_Impl;
import androidx.work.impl.model.WorkNameDao;
import androidx.work.impl.model.WorkNameDao_Impl;
import androidx.work.impl.model.WorkProgressDao;
import androidx.work.impl.model.WorkProgressDao_Impl;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkSpecDao_Impl;
import androidx.work.impl.model.WorkTagDao;
import androidx.work.impl.model.WorkTagDao_Impl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class WorkDatabase_Impl
  extends WorkDatabase
{
  private volatile DependencyDao _dependencyDao;
  private volatile PreferenceDao _preferenceDao;
  private volatile RawWorkInfoDao _rawWorkInfoDao;
  private volatile SystemIdInfoDao _systemIdInfoDao;
  private volatile WorkNameDao _workNameDao;
  private volatile WorkProgressDao _workProgressDao;
  private volatile WorkSpecDao _workSpecDao;
  private volatile WorkTagDao _workTagDao;
  
  public void clearAllTables()
  {
    super.assertNotMainThread();
    SupportSQLiteDatabase localSupportSQLiteDatabase = super.getOpenHelper().getWritableDatabase();
    try
    {
      super.beginTransaction();
      localSupportSQLiteDatabase.execSQL("PRAGMA defer_foreign_keys = TRUE");
      localSupportSQLiteDatabase.execSQL("DELETE FROM `Dependency`");
      localSupportSQLiteDatabase.execSQL("DELETE FROM `WorkSpec`");
      localSupportSQLiteDatabase.execSQL("DELETE FROM `WorkTag`");
      localSupportSQLiteDatabase.execSQL("DELETE FROM `SystemIdInfo`");
      localSupportSQLiteDatabase.execSQL("DELETE FROM `WorkName`");
      localSupportSQLiteDatabase.execSQL("DELETE FROM `WorkProgress`");
      localSupportSQLiteDatabase.execSQL("DELETE FROM `Preference`");
      super.setTransactionSuccessful();
      return;
    }
    finally
    {
      super.endTransaction();
      localSupportSQLiteDatabase.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!localSupportSQLiteDatabase.inTransaction()) {
        localSupportSQLiteDatabase.execSQL("VACUUM");
      }
    }
  }
  
  public InvalidationTracker createInvalidationTracker()
  {
    return new InvalidationTracker(this, new HashMap(0), new HashMap(0), new String[] { "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference" });
  }
  
  public SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration paramDatabaseConfiguration)
  {
    Object localObject = new RoomOpenHelper(paramDatabaseConfiguration, new RoomOpenHelper.Delegate(12)
    {
      public void createAllTables(SupportSQLiteDatabase paramAnonymousSupportSQLiteDatabase)
      {
        paramAnonymousSupportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        paramAnonymousSupportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        paramAnonymousSupportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        paramAnonymousSupportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
        paramAnonymousSupportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        paramAnonymousSupportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
        paramAnonymousSupportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        paramAnonymousSupportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        paramAnonymousSupportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        paramAnonymousSupportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        paramAnonymousSupportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        paramAnonymousSupportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        paramAnonymousSupportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        paramAnonymousSupportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        paramAnonymousSupportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
      }
      
      public void dropAllTables(SupportSQLiteDatabase paramAnonymousSupportSQLiteDatabase)
      {
        paramAnonymousSupportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `Dependency`");
        paramAnonymousSupportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `WorkSpec`");
        paramAnonymousSupportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `WorkTag`");
        paramAnonymousSupportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `SystemIdInfo`");
        paramAnonymousSupportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `WorkName`");
        paramAnonymousSupportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `WorkProgress`");
        paramAnonymousSupportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `Preference`");
        if (WorkDatabase_Impl.access$000(WorkDatabase_Impl.this) != null)
        {
          int i = 0;
          int j = WorkDatabase_Impl.access$100(WorkDatabase_Impl.this).size();
          while (i < j)
          {
            ((RoomDatabase.Callback)WorkDatabase_Impl.access$200(WorkDatabase_Impl.this).get(i)).onDestructiveMigration(paramAnonymousSupportSQLiteDatabase);
            i++;
          }
        }
      }
      
      public void onCreate(SupportSQLiteDatabase paramAnonymousSupportSQLiteDatabase)
      {
        if (WorkDatabase_Impl.access$300(WorkDatabase_Impl.this) != null)
        {
          int i = 0;
          int j = WorkDatabase_Impl.access$400(WorkDatabase_Impl.this).size();
          while (i < j)
          {
            ((RoomDatabase.Callback)WorkDatabase_Impl.access$500(WorkDatabase_Impl.this).get(i)).onCreate(paramAnonymousSupportSQLiteDatabase);
            i++;
          }
        }
      }
      
      public void onOpen(SupportSQLiteDatabase paramAnonymousSupportSQLiteDatabase)
      {
        WorkDatabase_Impl.access$602(WorkDatabase_Impl.this, paramAnonymousSupportSQLiteDatabase);
        paramAnonymousSupportSQLiteDatabase.execSQL("PRAGMA foreign_keys = ON");
        WorkDatabase_Impl.access$700(WorkDatabase_Impl.this, paramAnonymousSupportSQLiteDatabase);
        if (WorkDatabase_Impl.access$800(WorkDatabase_Impl.this) != null)
        {
          int i = 0;
          int j = WorkDatabase_Impl.access$900(WorkDatabase_Impl.this).size();
          while (i < j)
          {
            ((RoomDatabase.Callback)WorkDatabase_Impl.access$1000(WorkDatabase_Impl.this).get(i)).onOpen(paramAnonymousSupportSQLiteDatabase);
            i++;
          }
        }
      }
      
      public void onPostMigrate(SupportSQLiteDatabase paramAnonymousSupportSQLiteDatabase) {}
      
      public void onPreMigrate(SupportSQLiteDatabase paramAnonymousSupportSQLiteDatabase)
      {
        DBUtil.dropFtsSyncTriggers(paramAnonymousSupportSQLiteDatabase);
      }
      
      public RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase paramAnonymousSupportSQLiteDatabase)
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
        localObject1 = TableInfo.read(paramAnonymousSupportSQLiteDatabase, "Dependency");
        if (!((TableInfo)localObject3).equals(localObject1))
        {
          paramAnonymousSupportSQLiteDatabase = new StringBuilder();
          paramAnonymousSupportSQLiteDatabase.append("Dependency(androidx.work.impl.model.Dependency).\n Expected:\n");
          paramAnonymousSupportSQLiteDatabase.append(localObject3);
          paramAnonymousSupportSQLiteDatabase.append("\n Found:\n");
          paramAnonymousSupportSQLiteDatabase.append(localObject1);
          return new RoomOpenHelper.ValidationResult(false, paramAnonymousSupportSQLiteDatabase.toString());
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
        localObject3 = TableInfo.read(paramAnonymousSupportSQLiteDatabase, "WorkSpec");
        if (!((TableInfo)localObject1).equals(localObject3))
        {
          paramAnonymousSupportSQLiteDatabase = new StringBuilder();
          paramAnonymousSupportSQLiteDatabase.append("WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n");
          paramAnonymousSupportSQLiteDatabase.append(localObject1);
          paramAnonymousSupportSQLiteDatabase.append("\n Found:\n");
          paramAnonymousSupportSQLiteDatabase.append(localObject3);
          return new RoomOpenHelper.ValidationResult(false, paramAnonymousSupportSQLiteDatabase.toString());
        }
        localObject2 = new HashMap(2);
        ((HashMap)localObject2).put("tag", new TableInfo.Column("tag", "TEXT", true, 1, null, 1));
        ((HashMap)localObject2).put("work_spec_id", new TableInfo.Column("work_spec_id", "TEXT", true, 2, null, 1));
        localObject1 = new HashSet(1);
        ((HashSet)localObject1).add(new TableInfo.ForeignKey("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[] { "work_spec_id" }), Arrays.asList(new String[] { "id" })));
        localObject3 = new HashSet(1);
        ((HashSet)localObject3).add(new TableInfo.Index("index_WorkTag_work_spec_id", false, Arrays.asList(new String[] { "work_spec_id" })));
        localObject1 = new TableInfo("WorkTag", (Map)localObject2, (Set)localObject1, (Set)localObject3);
        localObject3 = TableInfo.read(paramAnonymousSupportSQLiteDatabase, "WorkTag");
        if (!((TableInfo)localObject1).equals(localObject3))
        {
          paramAnonymousSupportSQLiteDatabase = new StringBuilder();
          paramAnonymousSupportSQLiteDatabase.append("WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n");
          paramAnonymousSupportSQLiteDatabase.append(localObject1);
          paramAnonymousSupportSQLiteDatabase.append("\n Found:\n");
          paramAnonymousSupportSQLiteDatabase.append(localObject3);
          return new RoomOpenHelper.ValidationResult(false, paramAnonymousSupportSQLiteDatabase.toString());
        }
        localObject1 = new HashMap(2);
        ((HashMap)localObject1).put("work_spec_id", new TableInfo.Column("work_spec_id", "TEXT", true, 1, null, 1));
        ((HashMap)localObject1).put("system_id", new TableInfo.Column("system_id", "INTEGER", true, 0, null, 1));
        localObject3 = new HashSet(1);
        ((HashSet)localObject3).add(new TableInfo.ForeignKey("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[] { "work_spec_id" }), Arrays.asList(new String[] { "id" })));
        localObject3 = new TableInfo("SystemIdInfo", (Map)localObject1, (Set)localObject3, new HashSet(0));
        localObject1 = TableInfo.read(paramAnonymousSupportSQLiteDatabase, "SystemIdInfo");
        if (!((TableInfo)localObject3).equals(localObject1))
        {
          paramAnonymousSupportSQLiteDatabase = new StringBuilder();
          paramAnonymousSupportSQLiteDatabase.append("SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n");
          paramAnonymousSupportSQLiteDatabase.append(localObject3);
          paramAnonymousSupportSQLiteDatabase.append("\n Found:\n");
          paramAnonymousSupportSQLiteDatabase.append(localObject1);
          return new RoomOpenHelper.ValidationResult(false, paramAnonymousSupportSQLiteDatabase.toString());
        }
        localObject2 = new HashMap(2);
        ((HashMap)localObject2).put("name", new TableInfo.Column("name", "TEXT", true, 1, null, 1));
        ((HashMap)localObject2).put("work_spec_id", new TableInfo.Column("work_spec_id", "TEXT", true, 2, null, 1));
        localObject1 = new HashSet(1);
        ((HashSet)localObject1).add(new TableInfo.ForeignKey("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[] { "work_spec_id" }), Arrays.asList(new String[] { "id" })));
        localObject3 = new HashSet(1);
        ((HashSet)localObject3).add(new TableInfo.Index("index_WorkName_work_spec_id", false, Arrays.asList(new String[] { "work_spec_id" })));
        localObject3 = new TableInfo("WorkName", (Map)localObject2, (Set)localObject1, (Set)localObject3);
        localObject1 = TableInfo.read(paramAnonymousSupportSQLiteDatabase, "WorkName");
        if (!((TableInfo)localObject3).equals(localObject1))
        {
          paramAnonymousSupportSQLiteDatabase = new StringBuilder();
          paramAnonymousSupportSQLiteDatabase.append("WorkName(androidx.work.impl.model.WorkName).\n Expected:\n");
          paramAnonymousSupportSQLiteDatabase.append(localObject3);
          paramAnonymousSupportSQLiteDatabase.append("\n Found:\n");
          paramAnonymousSupportSQLiteDatabase.append(localObject1);
          return new RoomOpenHelper.ValidationResult(false, paramAnonymousSupportSQLiteDatabase.toString());
        }
        localObject3 = new HashMap(2);
        ((HashMap)localObject3).put("work_spec_id", new TableInfo.Column("work_spec_id", "TEXT", true, 1, null, 1));
        ((HashMap)localObject3).put("progress", new TableInfo.Column("progress", "BLOB", true, 0, null, 1));
        localObject1 = new HashSet(1);
        ((HashSet)localObject1).add(new TableInfo.ForeignKey("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[] { "work_spec_id" }), Arrays.asList(new String[] { "id" })));
        localObject3 = new TableInfo("WorkProgress", (Map)localObject3, (Set)localObject1, new HashSet(0));
        localObject1 = TableInfo.read(paramAnonymousSupportSQLiteDatabase, "WorkProgress");
        if (!((TableInfo)localObject3).equals(localObject1))
        {
          paramAnonymousSupportSQLiteDatabase = new StringBuilder();
          paramAnonymousSupportSQLiteDatabase.append("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n");
          paramAnonymousSupportSQLiteDatabase.append(localObject3);
          paramAnonymousSupportSQLiteDatabase.append("\n Found:\n");
          paramAnonymousSupportSQLiteDatabase.append(localObject1);
          return new RoomOpenHelper.ValidationResult(false, paramAnonymousSupportSQLiteDatabase.toString());
        }
        localObject3 = new HashMap(2);
        ((HashMap)localObject3).put("key", new TableInfo.Column("key", "TEXT", true, 1, null, 1));
        ((HashMap)localObject3).put("long_value", new TableInfo.Column("long_value", "INTEGER", false, 0, null, 1));
        localObject3 = new TableInfo("Preference", (Map)localObject3, new HashSet(0), new HashSet(0));
        localObject1 = TableInfo.read(paramAnonymousSupportSQLiteDatabase, "Preference");
        if (!((TableInfo)localObject3).equals(localObject1))
        {
          paramAnonymousSupportSQLiteDatabase = new StringBuilder();
          paramAnonymousSupportSQLiteDatabase.append("Preference(androidx.work.impl.model.Preference).\n Expected:\n");
          paramAnonymousSupportSQLiteDatabase.append(localObject3);
          paramAnonymousSupportSQLiteDatabase.append("\n Found:\n");
          paramAnonymousSupportSQLiteDatabase.append(localObject1);
          return new RoomOpenHelper.ValidationResult(false, paramAnonymousSupportSQLiteDatabase.toString());
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "c103703e120ae8cc73c9248622f3cd1e", "49f946663a8deb7054212b8adda248c6");
    localObject = SupportSQLiteOpenHelper.Configuration.builder(context).name(name).callback((SupportSQLiteOpenHelper.Callback)localObject).build();
    return sqliteOpenHelperFactory.create((SupportSQLiteOpenHelper.Configuration)localObject);
  }
  
  public DependencyDao dependencyDao()
  {
    if (_dependencyDao != null) {
      return _dependencyDao;
    }
    try
    {
      if (_dependencyDao == null)
      {
        localObject1 = new androidx/work/impl/model/DependencyDao_Impl;
        ((DependencyDao_Impl)localObject1).<init>(this);
        _dependencyDao = ((DependencyDao)localObject1);
      }
      Object localObject1 = _dependencyDao;
      return (DependencyDao)localObject1;
    }
    finally {}
  }
  
  public PreferenceDao preferenceDao()
  {
    if (_preferenceDao != null) {
      return _preferenceDao;
    }
    try
    {
      if (_preferenceDao == null)
      {
        localObject1 = new androidx/work/impl/model/PreferenceDao_Impl;
        ((PreferenceDao_Impl)localObject1).<init>(this);
        _preferenceDao = ((PreferenceDao)localObject1);
      }
      Object localObject1 = _preferenceDao;
      return (PreferenceDao)localObject1;
    }
    finally {}
  }
  
  public RawWorkInfoDao rawWorkInfoDao()
  {
    if (_rawWorkInfoDao != null) {
      return _rawWorkInfoDao;
    }
    try
    {
      if (_rawWorkInfoDao == null)
      {
        localObject1 = new androidx/work/impl/model/RawWorkInfoDao_Impl;
        ((RawWorkInfoDao_Impl)localObject1).<init>(this);
        _rawWorkInfoDao = ((RawWorkInfoDao)localObject1);
      }
      Object localObject1 = _rawWorkInfoDao;
      return (RawWorkInfoDao)localObject1;
    }
    finally {}
  }
  
  public SystemIdInfoDao systemIdInfoDao()
  {
    if (_systemIdInfoDao != null) {
      return _systemIdInfoDao;
    }
    try
    {
      if (_systemIdInfoDao == null)
      {
        localObject1 = new androidx/work/impl/model/SystemIdInfoDao_Impl;
        ((SystemIdInfoDao_Impl)localObject1).<init>(this);
        _systemIdInfoDao = ((SystemIdInfoDao)localObject1);
      }
      Object localObject1 = _systemIdInfoDao;
      return (SystemIdInfoDao)localObject1;
    }
    finally {}
  }
  
  public WorkNameDao workNameDao()
  {
    if (_workNameDao != null) {
      return _workNameDao;
    }
    try
    {
      if (_workNameDao == null)
      {
        localObject1 = new androidx/work/impl/model/WorkNameDao_Impl;
        ((WorkNameDao_Impl)localObject1).<init>(this);
        _workNameDao = ((WorkNameDao)localObject1);
      }
      Object localObject1 = _workNameDao;
      return (WorkNameDao)localObject1;
    }
    finally {}
  }
  
  public WorkProgressDao workProgressDao()
  {
    if (_workProgressDao != null) {
      return _workProgressDao;
    }
    try
    {
      if (_workProgressDao == null)
      {
        localObject1 = new androidx/work/impl/model/WorkProgressDao_Impl;
        ((WorkProgressDao_Impl)localObject1).<init>(this);
        _workProgressDao = ((WorkProgressDao)localObject1);
      }
      Object localObject1 = _workProgressDao;
      return (WorkProgressDao)localObject1;
    }
    finally {}
  }
  
  public WorkSpecDao workSpecDao()
  {
    if (_workSpecDao != null) {
      return _workSpecDao;
    }
    try
    {
      if (_workSpecDao == null)
      {
        localObject1 = new androidx/work/impl/model/WorkSpecDao_Impl;
        ((WorkSpecDao_Impl)localObject1).<init>(this);
        _workSpecDao = ((WorkSpecDao)localObject1);
      }
      Object localObject1 = _workSpecDao;
      return (WorkSpecDao)localObject1;
    }
    finally {}
  }
  
  public WorkTagDao workTagDao()
  {
    if (_workTagDao != null) {
      return _workTagDao;
    }
    try
    {
      if (_workTagDao == null)
      {
        localObject1 = new androidx/work/impl/model/WorkTagDao_Impl;
        ((WorkTagDao_Impl)localObject1).<init>(this);
        _workTagDao = ((WorkTagDao)localObject1);
      }
      Object localObject1 = _workTagDao;
      return (WorkTagDao)localObject1;
    }
    finally {}
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.WorkDatabase_Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */