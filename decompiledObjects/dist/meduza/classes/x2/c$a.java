package x2;

import p1.j;
import t1.f;

public final class c$a
  extends p1.d
{
  public c$a(j paramj)
  {
    super(paramj, 1);
  }
  
  public final String c()
  {
    return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
  }
  
  public final void e(f paramf, Object paramObject)
  {
    paramObject = (a)paramObject;
    String str = a;
    if (str == null) {
      paramf.d0(1);
    } else {
      paramf.n(1, str);
    }
    paramObject = b;
    if (paramObject == null) {
      paramf.d0(2);
    } else {
      paramf.n(2, (String)paramObject);
    }
  }
}

/* Location:
 * Qualified Name:     x2.c.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */