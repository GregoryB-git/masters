package x2;

import p1.j;
import t1.f;

public final class o$a
  extends p1.d
{
  public o$a(j paramj)
  {
    super(paramj, 1);
  }
  
  public final String c()
  {
    return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
  }
  
  public final void e(f paramf, Object paramObject)
  {
    m localm = (m)paramObject;
    paramObject = a;
    if (paramObject == null) {
      paramf.d0(1);
    } else {
      paramf.n(1, (String)paramObject);
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
 * Qualified Name:     x2.o.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */