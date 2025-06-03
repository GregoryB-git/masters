package x2;

import p1.j;
import p1.p;

public final class u$e
  extends p
{
  public u$e(j paramj)
  {
    super(paramj);
  }
  
  public final String c()
  {
    return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
  }
}

/* Location:
 * Qualified Name:     x2.u.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */