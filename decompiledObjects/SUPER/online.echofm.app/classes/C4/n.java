package C4;

public final class n
  extends v
{
  public static n a;
  
  public static n f()
  {
    try
    {
      if (a == null)
      {
        n localn1 = new C4/n;
        localn1.<init>();
        a = localn1;
      }
    }
    finally
    {
      break label37;
    }
    n localn2 = a;
    return localn2;
    label37:
    throw localn2;
  }
  
  public String a()
  {
    return "com.google.firebase.perf.SessionsCpuCaptureFrequencyForegroundMs";
  }
  
  public String b()
  {
    return "sessions_cpu_capture_frequency_fg_ms";
  }
  
  public String c()
  {
    return "fpr_session_gauge_cpu_capture_frequency_fg_ms";
  }
  
  public Long d()
  {
    return Long.valueOf(100L);
  }
  
  public Long e()
  {
    return Long.valueOf(d().longValue() * 3L);
  }
}

/* Location:
 * Qualified Name:     C4.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */