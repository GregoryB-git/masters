package x2;

import p1.j;
import t1.f;

public final class k$a
  extends p1.d
{
  public k$a(j paramj)
  {
    super(paramj, 1);
  }
  
  public final String c()
  {
    return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
  }
  
  public final void e(f paramf, Object paramObject)
  {
    paramObject = (i)paramObject;
    String str = a;
    if (str == null) {
      paramf.d0(1);
    } else {
      paramf.n(1, str);
    }
    paramf.F(2, b);
    paramf.F(3, c);
  }
}

/* Location:
 * Qualified Name:     x2.k.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */