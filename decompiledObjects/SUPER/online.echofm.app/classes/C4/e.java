package C4;

public final class e
  extends v
{
  public static e a;
  
  public static e e()
  {
    try
    {
      if (a == null)
      {
        e locale1 = new C4/e;
        locale1.<init>();
        a = locale1;
      }
    }
    finally
    {
      break label37;
    }
    e locale2 = a;
    return locale2;
    label37:
    throw locale2;
  }
  
  public String a()
  {
    return "com.google.firebase.perf.FragmentSamplingRate";
  }
  
  public String b()
  {
    return "fragment_sampling_percentage";
  }
  
  public String c()
  {
    return "fpr_vc_fragment_sampling_rate";
  }
  
  public Double d()
  {
    return Double.valueOf(0.0D);
  }
}

/* Location:
 * Qualified Name:     C4.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */