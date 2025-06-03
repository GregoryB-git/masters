package p2;

import q1.b;
import u1.c;

public final class g0
  extends b
{
  public g0()
  {
    super(17, 18);
  }
  
  public final void a(c paramc)
  {
    paramc.m("ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807");
    paramc.m("ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0");
  }
}

/* Location:
 * Qualified Name:     p2.g0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */