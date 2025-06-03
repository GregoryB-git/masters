package p2;

import q1.b;
import u1.c;

public final class g
  extends b
{
  public static final g c = new g();
  
  public g()
  {
    super(15, 16);
  }
  
  public final void a(c paramc)
  {
    paramc.m("DELETE FROM SystemIdInfo WHERE work_spec_id IN (SELECT work_spec_id FROM SystemIdInfo LEFT JOIN WorkSpec ON work_spec_id = id WHERE WorkSpec.id IS NULL)");
    paramc.m("ALTER TABLE `WorkSpec` ADD COLUMN `generation` INTEGER NOT NULL DEFAULT 0");
    paramc.m("CREATE TABLE IF NOT EXISTS `_new_SystemIdInfo` (\n            `work_spec_id` TEXT NOT NULL, \n            `generation` INTEGER NOT NULL DEFAULT 0, \n            `system_id` INTEGER NOT NULL, \n            PRIMARY KEY(`work_spec_id`, `generation`), \n            FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) \n                ON UPDATE CASCADE ON DELETE CASCADE )");
    paramc.m("INSERT INTO `_new_SystemIdInfo` (`work_spec_id`,`system_id`) SELECT `work_spec_id`,`system_id` FROM `SystemIdInfo`");
    paramc.m("DROP TABLE `SystemIdInfo`");
    paramc.m("ALTER TABLE `_new_SystemIdInfo` RENAME TO `SystemIdInfo`");
  }
}

/* Location:
 * Qualified Name:     p2.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */