package x2;

import p1.j;
import p1.p;

public final class u$c
  extends p
{
  public u$c(j paramj)
  {
    super(paramj);
  }
  
  public final String c()
  {
    return "UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)";
  }
}

/* Location:
 * Qualified Name:     x2.u.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */