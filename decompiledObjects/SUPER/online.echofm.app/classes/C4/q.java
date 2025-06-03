package C4;

public final class q
  extends v
{
  public static q a;
  
  public static q f()
  {
    try
    {
      if (a == null)
      {
        q localq1 = new C4/q;
        localq1.<init>();
        a = localq1;
      }
    }
    finally
    {
      break label37;
    }
    q localq2 = a;
    return localq2;
    label37:
    throw localq2;
  }
  
  public String a()
  {
    return "com.google.firebase.perf.SessionsMemoryCaptureFrequencyForegroundMs";
  }
  
  public String b()
  {
    return "sessions_memory_capture_frequency_fg_ms";
  }
  
  public String c()
  {
    return "fpr_session_gauge_memory_capture_frequency_fg_ms";
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
 * Qualified Name:     C4.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */