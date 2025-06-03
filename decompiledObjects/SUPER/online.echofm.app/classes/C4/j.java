package C4;

public final class j
  extends v
{
  public static j a;
  
  public static j e()
  {
    try
    {
      if (a == null)
      {
        j localj1 = new C4/j;
        localj1.<init>();
        a = localj1;
      }
    }
    finally
    {
      break label37;
    }
    j localj2 = a;
    return localj2;
    label37:
    throw localj2;
  }
  
  public String a()
  {
    return "com.google.firebase.perf.TimeLimitSec";
  }
  
  public String c()
  {
    return "fpr_rl_time_limit_sec";
  }
  
  public Long d()
  {
    return Long.valueOf(600L);
  }
}

/* Location:
 * Qualified Name:     C4.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */