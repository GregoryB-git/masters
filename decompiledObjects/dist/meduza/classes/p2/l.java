package p2;

import q1.b;
import u1.c;

public final class l
  extends b
{
  public static final l c = new l();
  
  public l()
  {
    super(6, 7);
  }
  
  public final void a(c paramc)
  {
    paramc.m("\n    CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress`\n    BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
  }
}

/* Location:
 * Qualified Name:     p2.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */