package x2;

import p1.j;
import p1.p;

public final class u$m
  extends p
{
  public u$m(j paramj)
  {
    super(paramj);
  }
  
  public final String c()
  {
    return "UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?";
  }
}

/* Location:
 * Qualified Name:     x2.u.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */