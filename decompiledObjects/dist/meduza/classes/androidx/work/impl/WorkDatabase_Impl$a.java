package androidx.work.impl;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import p1.k.a;
import p1.k.b;
import r1.a;
import r1.a.a;
import r1.a.b;
import r1.a.d;
import u1.c;

public final class WorkDatabase_Impl$a
  extends k.a
{
  public WorkDatabase_Impl$a(WorkDatabase_Impl paramWorkDatabase_Impl) {}
  
  public final void a(c paramc)
  {
    paramc.m("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
    paramc.m("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
    paramc.m("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
    paramc.m("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
    paramc.m("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
    paramc.m("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
    paramc.m("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
    paramc.m("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
    paramc.m("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
    paramc.m("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
    paramc.m("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
    paramc.m("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
    paramc.m("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
    paramc.m("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    paramc.m("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '7d73d21f1bd82c9e5268b6dcf9fde2cb')");
  }
  
  public final k.b b(c paramc)
  {
    Object localObject1 = new HashMap(2);
    ((HashMap)localObject1).put("work_spec_id", new a.a(1, 1, "work_spec_id", "TEXT", null, true));
    ((HashMap)localObject1).put("prerequisite_id", new a.a(2, 1, "prerequisite_id", "TEXT", null, true));
    Object localObject2 = new HashSet(2);
    ((HashSet)localObject2).add(new a.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[] { "work_spec_id" }), Arrays.asList(new String[] { "id" })));
    ((HashSet)localObject2).add(new a.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[] { "prerequisite_id" }), Arrays.asList(new String[] { "id" })));
    Object localObject3 = new HashSet(2);
    ((HashSet)localObject3).add(new a.d("index_Dependency_work_spec_id", false, Arrays.asList(new String[] { "work_spec_id" }), Arrays.asList(new String[] { "ASC" })));
    ((HashSet)localObject3).add(new a.d("index_Dependency_prerequisite_id", false, Arrays.asList(new String[] { "prerequisite_id" }), Arrays.asList(new String[] { "ASC" })));
    localObject3 = new a("Dependency", (Map)localObject1, (AbstractSet)localObject2, (AbstractSet)localObject3);
    localObject2 = a.a(paramc, "Dependency");
    if (!((a)localObject3).equals(localObject2))
    {
      paramc = new StringBuilder();
      paramc.append("Dependency(androidx.work.impl.model.Dependency).\n Expected:\n");
      paramc.append(localObject3);
      paramc.append("\n Found:\n");
      paramc.append(localObject2);
      return new k.b(paramc.toString(), false);
    }
    localObject3 = new HashMap(30);
    ((HashMap)localObject3).put("id", new a.a(1, 1, "id", "TEXT", null, true));
    ((HashMap)localObject3).put("state", new a.a(0, 1, "state", "INTEGER", null, true));
    ((HashMap)localObject3).put("worker_class_name", new a.a(0, 1, "worker_class_name", "TEXT", null, true));
    ((HashMap)localObject3).put("input_merger_class_name", new a.a(0, 1, "input_merger_class_name", "TEXT", null, true));
    ((HashMap)localObject3).put("input", new a.a(0, 1, "input", "BLOB", null, true));
    ((HashMap)localObject3).put("output", new a.a(0, 1, "output", "BLOB", null, true));
    ((HashMap)localObject3).put("initial_delay", new a.a(0, 1, "initial_delay", "INTEGER", null, true));
    ((HashMap)localObject3).put("interval_duration", new a.a(0, 1, "interval_duration", "INTEGER", null, true));
    ((HashMap)localObject3).put("flex_duration", new a.a(0, 1, "flex_duration", "INTEGER", null, true));
    ((HashMap)localObject3).put("run_attempt_count", new a.a(0, 1, "run_attempt_count", "INTEGER", null, true));
    ((HashMap)localObject3).put("backoff_policy", new a.a(0, 1, "backoff_policy", "INTEGER", null, true));
    ((HashMap)localObject3).put("backoff_delay_duration", new a.a(0, 1, "backoff_delay_duration", "INTEGER", null, true));
    ((HashMap)localObject3).put("last_enqueue_time", new a.a(0, 1, "last_enqueue_time", "INTEGER", "-1", true));
    ((HashMap)localObject3).put("minimum_retention_duration", new a.a(0, 1, "minimum_retention_duration", "INTEGER", null, true));
    ((HashMap)localObject3).put("schedule_requested_at", new a.a(0, 1, "schedule_requested_at", "INTEGER", null, true));
    ((HashMap)localObject3).put("run_in_foreground", new a.a(0, 1, "run_in_foreground", "INTEGER", null, true));
    ((HashMap)localObject3).put("out_of_quota_policy", new a.a(0, 1, "out_of_quota_policy", "INTEGER", null, true));
    ((HashMap)localObject3).put("period_count", new a.a(0, 1, "period_count", "INTEGER", "0", true));
    ((HashMap)localObject3).put("generation", new a.a(0, 1, "generation", "INTEGER", "0", true));
    ((HashMap)localObject3).put("next_schedule_time_override", new a.a(0, 1, "next_schedule_time_override", "INTEGER", "9223372036854775807", true));
    ((HashMap)localObject3).put("next_schedule_time_override_generation", new a.a(0, 1, "next_schedule_time_override_generation", "INTEGER", "0", true));
    ((HashMap)localObject3).put("stop_reason", new a.a(0, 1, "stop_reason", "INTEGER", "-256", true));
    ((HashMap)localObject3).put("required_network_type", new a.a(0, 1, "required_network_type", "INTEGER", null, true));
    ((HashMap)localObject3).put("requires_charging", new a.a(0, 1, "requires_charging", "INTEGER", null, true));
    ((HashMap)localObject3).put("requires_device_idle", new a.a(0, 1, "requires_device_idle", "INTEGER", null, true));
    ((HashMap)localObject3).put("requires_battery_not_low", new a.a(0, 1, "requires_battery_not_low", "INTEGER", null, true));
    ((HashMap)localObject3).put("requires_storage_not_low", new a.a(0, 1, "requires_storage_not_low", "INTEGER", null, true));
    ((HashMap)localObject3).put("trigger_content_update_delay", new a.a(0, 1, "trigger_content_update_delay", "INTEGER", null, true));
    ((HashMap)localObject3).put("trigger_max_content_delay", new a.a(0, 1, "trigger_max_content_delay", "INTEGER", null, true));
    ((HashMap)localObject3).put("content_uri_triggers", new a.a(0, 1, "content_uri_triggers", "BLOB", null, true));
    localObject1 = new HashSet(0);
    localObject2 = new HashSet(2);
    ((HashSet)localObject2).add(new a.d("index_WorkSpec_schedule_requested_at", false, Arrays.asList(new String[] { "schedule_requested_at" }), Arrays.asList(new String[] { "ASC" })));
    ((HashSet)localObject2).add(new a.d("index_WorkSpec_last_enqueue_time", false, Arrays.asList(new String[] { "last_enqueue_time" }), Arrays.asList(new String[] { "ASC" })));
    localObject2 = new a("WorkSpec", (Map)localObject3, (AbstractSet)localObject1, (AbstractSet)localObject2);
    localObject3 = a.a(paramc, "WorkSpec");
    if (!((a)localObject2).equals(localObject3))
    {
      paramc = new StringBuilder();
      paramc.append("WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n");
      paramc.append(localObject2);
      paramc.append("\n Found:\n");
      paramc.append(localObject3);
      return new k.b(paramc.toString(), false);
    }
    localObject1 = new HashMap(2);
    ((HashMap)localObject1).put("tag", new a.a(1, 1, "tag", "TEXT", null, true));
    ((HashMap)localObject1).put("work_spec_id", new a.a(2, 1, "work_spec_id", "TEXT", null, true));
    localObject2 = new HashSet(1);
    ((HashSet)localObject2).add(new a.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[] { "work_spec_id" }), Arrays.asList(new String[] { "id" })));
    localObject3 = new HashSet(1);
    ((HashSet)localObject3).add(new a.d("index_WorkTag_work_spec_id", false, Arrays.asList(new String[] { "work_spec_id" }), Arrays.asList(new String[] { "ASC" })));
    localObject2 = new a("WorkTag", (Map)localObject1, (AbstractSet)localObject2, (AbstractSet)localObject3);
    localObject3 = a.a(paramc, "WorkTag");
    if (!((a)localObject2).equals(localObject3))
    {
      paramc = new StringBuilder();
      paramc.append("WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n");
      paramc.append(localObject2);
      paramc.append("\n Found:\n");
      paramc.append(localObject3);
      return new k.b(paramc.toString(), false);
    }
    localObject2 = new HashMap(3);
    ((HashMap)localObject2).put("work_spec_id", new a.a(1, 1, "work_spec_id", "TEXT", null, true));
    ((HashMap)localObject2).put("generation", new a.a(2, 1, "generation", "INTEGER", "0", true));
    ((HashMap)localObject2).put("system_id", new a.a(0, 1, "system_id", "INTEGER", null, true));
    localObject3 = new HashSet(1);
    ((HashSet)localObject3).add(new a.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[] { "work_spec_id" }), Arrays.asList(new String[] { "id" })));
    localObject3 = new a("SystemIdInfo", (Map)localObject2, (AbstractSet)localObject3, new HashSet(0));
    localObject2 = a.a(paramc, "SystemIdInfo");
    if (!((a)localObject3).equals(localObject2))
    {
      paramc = new StringBuilder();
      paramc.append("SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n");
      paramc.append(localObject3);
      paramc.append("\n Found:\n");
      paramc.append(localObject2);
      return new k.b(paramc.toString(), false);
    }
    localObject1 = new HashMap(2);
    ((HashMap)localObject1).put("name", new a.a(1, 1, "name", "TEXT", null, true));
    ((HashMap)localObject1).put("work_spec_id", new a.a(2, 1, "work_spec_id", "TEXT", null, true));
    localObject3 = new HashSet(1);
    ((HashSet)localObject3).add(new a.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[] { "work_spec_id" }), Arrays.asList(new String[] { "id" })));
    localObject2 = new HashSet(1);
    ((HashSet)localObject2).add(new a.d("index_WorkName_work_spec_id", false, Arrays.asList(new String[] { "work_spec_id" }), Arrays.asList(new String[] { "ASC" })));
    localObject3 = new a("WorkName", (Map)localObject1, (AbstractSet)localObject3, (AbstractSet)localObject2);
    localObject2 = a.a(paramc, "WorkName");
    if (!((a)localObject3).equals(localObject2))
    {
      paramc = new StringBuilder();
      paramc.append("WorkName(androidx.work.impl.model.WorkName).\n Expected:\n");
      paramc.append(localObject3);
      paramc.append("\n Found:\n");
      paramc.append(localObject2);
      return new k.b(paramc.toString(), false);
    }
    localObject3 = new HashMap(2);
    ((HashMap)localObject3).put("work_spec_id", new a.a(1, 1, "work_spec_id", "TEXT", null, true));
    ((HashMap)localObject3).put("progress", new a.a(0, 1, "progress", "BLOB", null, true));
    localObject2 = new HashSet(1);
    ((HashSet)localObject2).add(new a.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[] { "work_spec_id" }), Arrays.asList(new String[] { "id" })));
    localObject2 = new a("WorkProgress", (Map)localObject3, (AbstractSet)localObject2, new HashSet(0));
    localObject3 = a.a(paramc, "WorkProgress");
    if (!((a)localObject2).equals(localObject3))
    {
      paramc = new StringBuilder();
      paramc.append("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n");
      paramc.append(localObject2);
      paramc.append("\n Found:\n");
      paramc.append(localObject3);
      return new k.b(paramc.toString(), false);
    }
    localObject2 = new HashMap(2);
    ((HashMap)localObject2).put("key", new a.a(1, 1, "key", "TEXT", null, true));
    ((HashMap)localObject2).put("long_value", new a.a(0, 1, "long_value", "INTEGER", null, false));
    localObject2 = new a("Preference", (Map)localObject2, new HashSet(0), new HashSet(0));
    localObject3 = a.a(paramc, "Preference");
    if (!((a)localObject2).equals(localObject3))
    {
      paramc = new StringBuilder();
      paramc.append("Preference(androidx.work.impl.model.Preference).\n Expected:\n");
      paramc.append(localObject2);
      paramc.append("\n Found:\n");
      paramc.append(localObject3);
      return new k.b(paramc.toString(), false);
    }
    return new k.b(null, true);
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.WorkDatabase_Impl.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */