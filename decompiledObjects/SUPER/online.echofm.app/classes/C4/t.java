package C4;

public final class t
  extends v
{
  public static t a;
  
  public static t e()
  {
    try
    {
      if (a == null)
      {
        t localt1 = new C4/t;
        localt1.<init>();
        a = localt1;
      }
    }
    finally
    {
      break label37;
    }
    t localt2 = a;
    return localt2;
    label37:
    throw localt2;
  }
  
  public String a()
  {
    return "com.google.firebase.perf.TraceEventCountForeground";
  }
  
  public String c()
  {
    return "fpr_rl_trace_event_count_fg";
  }
  
  public Long d()
  {
    return Long.valueOf(300L);
  }
}

/* Location:
 * Qualified Name:     C4.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */