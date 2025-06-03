package x2;

import androidx.work.c;
import p1.j;
import t1.f;

public final class r$a
  extends p1.d
{
  public r$a(j paramj)
  {
    super(paramj, 1);
  }
  
  public final String c()
  {
    return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
  }
  
  public final void e(f paramf, Object paramObject)
  {
    paramObject = (p)paramObject;
    paramf.d0(1);
    paramObject = c.e(null);
    if (paramObject == null) {
      paramf.d0(2);
    } else {
      paramf.T((byte[])paramObject, 2);
    }
  }
}

/* Location:
 * Qualified Name:     x2.r.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */