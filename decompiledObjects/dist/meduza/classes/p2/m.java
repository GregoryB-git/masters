package p2;

import q1.b;
import u1.c;

public final class m
  extends b
{
  public static final m c = new m();
  
  public m()
  {
    super(7, 8);
  }
  
  public final void a(c paramc)
  {
    paramc.m("\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    ");
  }
}

/* Location:
 * Qualified Name:     p2.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */