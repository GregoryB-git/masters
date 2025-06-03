package C4;

public final class p
  extends v
{
  public static p a;
  
  public static p e()
  {
    try
    {
      if (a == null)
      {
        p localp1 = new C4/p;
        localp1.<init>();
        a = localp1;
      }
    }
    finally
    {
      break label37;
    }
    p localp2 = a;
    return localp2;
    label37:
    throw localp2;
  }
  
  public String a()
  {
    return "com.google.firebase.perf.SessionsMemoryCaptureFrequencyBackgroundMs";
  }
  
  public String b()
  {
    return "sessions_memory_capture_frequency_bg_ms";
  }
  
  public String c()
  {
    return "fpr_session_gauge_memory_capture_frequency_bg_ms";
  }
  
  public Long d()
  {
    return Long.valueOf(0L);
  }
}

/* Location:
 * Qualified Name:     C4.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */