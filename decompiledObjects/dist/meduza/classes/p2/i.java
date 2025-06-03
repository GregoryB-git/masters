package p2;

import q1.b;
import u1.c;

public final class i
  extends b
{
  public static final i c = new i();
  
  public i()
  {
    super(1, 2);
  }
  
  public final void a(c paramc)
  {
    paramc.m("\n    CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id`\n    INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
    paramc.m("\n    INSERT INTO SystemIdInfo(work_spec_id, system_id)\n    SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo\n    ");
    paramc.m("DROP TABLE IF EXISTS alarmInfo");
    paramc.m("\n                INSERT OR IGNORE INTO worktag(tag, work_spec_id)\n                SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec\n                ");
  }
}

/* Location:
 * Qualified Name:     p2.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */