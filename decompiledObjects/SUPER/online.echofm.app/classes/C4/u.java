package C4;

public final class u
  extends v
{
  public static u a;
  
  public static u f()
  {
    try
    {
      if (a == null)
      {
        u localu1 = new C4/u;
        localu1.<init>();
        a = localu1;
      }
    }
    finally
    {
      break label37;
    }
    u localu2 = a;
    return localu2;
    label37:
    throw localu2;
  }
  
  public String a()
  {
    return "com.google.firebase.perf.TraceSamplingRate";
  }
  
  public String c()
  {
    return "fpr_vc_trace_sampling_rate";
  }
  
  public Double d()
  {
    return Double.valueOf(1.0D);
  }
  
  public Double e()
  {
    return Double.valueOf(d().doubleValue() / 1000.0D);
  }
}

/* Location:
 * Qualified Name:     C4.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */