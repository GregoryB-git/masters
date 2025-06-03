package C4;

public final class r
  extends v
{
  public static r a;
  
  public static r f()
  {
    try
    {
      if (a == null)
      {
        r localr1 = new C4/r;
        localr1.<init>();
        a = localr1;
      }
    }
    finally
    {
      break label37;
    }
    r localr2 = a;
    return localr2;
    label37:
    throw localr2;
  }
  
  public String a()
  {
    return "com.google.firebase.perf.SessionSamplingRate";
  }
  
  public String b()
  {
    return "sessions_sampling_percentage";
  }
  
  public String c()
  {
    return "fpr_vc_session_sampling_rate";
  }
  
  public Double d()
  {
    return Double.valueOf(0.01D);
  }
  
  public Double e()
  {
    return Double.valueOf(d().doubleValue() / 1000.0D);
  }
}

/* Location:
 * Qualified Name:     C4.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */