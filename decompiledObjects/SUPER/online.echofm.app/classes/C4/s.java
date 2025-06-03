package C4;

public final class s
  extends v
{
  public static s a;
  
  public static s e()
  {
    try
    {
      if (a == null)
      {
        s locals1 = new C4/s;
        locals1.<init>();
        a = locals1;
      }
    }
    finally
    {
      break label37;
    }
    s locals2 = a;
    return locals2;
    label37:
    throw locals2;
  }
  
  public String a()
  {
    return "com.google.firebase.perf.TraceEventCountBackground";
  }
  
  public String c()
  {
    return "fpr_rl_trace_event_count_bg";
  }
  
  public Long d()
  {
    return Long.valueOf(30L);
  }
}

/* Location:
 * Qualified Name:     C4.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */