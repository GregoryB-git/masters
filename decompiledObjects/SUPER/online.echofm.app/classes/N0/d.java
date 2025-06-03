package N0;

import F0.C;
import F0.s;
import g0.a;

public final class d
  extends C
{
  public final long b;
  
  public d(s params, long paramLong)
  {
    super(params);
    boolean bool;
    if (params.p() >= paramLong) {
      bool = true;
    } else {
      bool = false;
    }
    a.a(bool);
    b = paramLong;
  }
  
  public long a()
  {
    return super.a() - b;
  }
  
  public long m()
  {
    return super.m() - b;
  }
  
  public long p()
  {
    return super.p() - b;
  }
}

/* Location:
 * Qualified Name:     N0.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */