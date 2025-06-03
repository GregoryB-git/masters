package x2;

import androidx.work.impl.WorkDatabase;

public final class f
  extends p1.d
{
  public f(WorkDatabase paramWorkDatabase)
  {
    super(paramWorkDatabase, 1);
  }
  
  public final String c()
  {
    return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
  }
  
  public final void e(t1.f paramf, Object paramObject)
  {
    d locald = (d)paramObject;
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
      paramf.F(2, ((Long)paramObject).longValue());
    }
  }
}

/* Location:
 * Qualified Name:     x2.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */