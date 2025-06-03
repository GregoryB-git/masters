package x2;

import p1.j;
import p1.p;

public final class u$f
  extends p
{
  public u$f(j paramj)
  {
    super(paramj);
  }
  
  public final String c()
  {
    return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
  }
}

/* Location:
 * Qualified Name:     x2.u.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */