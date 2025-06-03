package p2;

import q1.b;
import u1.c;

public final class k
  extends b
{
  public static final k c = new k();
  
  public k()
  {
    super(4, 5);
  }
  
  public final void a(c paramc)
  {
    paramc.m("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
    paramc.m("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
  }
}

/* Location:
 * Qualified Name:     p2.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */