package C4;

public final class i
  extends v
{
  public static i a;
  
  public static i f()
  {
    try
    {
      if (a == null)
      {
        i locali1 = new C4/i;
        locali1.<init>();
        a = locali1;
      }
    }
    finally
    {
      break label37;
    }
    i locali2 = a;
    return locali2;
    label37:
    throw locali2;
  }
  
  public String a()
  {
    return "com.google.firebase.perf.NetworkRequestSamplingRate";
  }
  
  public String c()
  {
    return "fpr_vc_network_request_sampling_rate";
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
 * Qualified Name:     C4.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */