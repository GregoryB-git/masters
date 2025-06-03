package C4;

public final class m
  extends v
{
  public static m a;
  
  public static m e()
  {
    try
    {
      if (a == null)
      {
        m localm1 = new C4/m;
        localm1.<init>();
        a = localm1;
      }
    }
    finally
    {
      break label37;
    }
    m localm2 = a;
    return localm2;
    label37:
    throw localm2;
  }
  
  public String a()
  {
    return "com.google.firebase.perf.SessionsCpuCaptureFrequencyBackgroundMs";
  }
  
  public String b()
  {
    return "sessions_cpu_capture_frequency_bg_ms";
  }
  
  public String c()
  {
    return "fpr_session_gauge_cpu_capture_frequency_bg_ms";
  }
  
  public Long d()
  {
    return Long.valueOf(0L);
  }
}

/* Location:
 * Qualified Name:     C4.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */