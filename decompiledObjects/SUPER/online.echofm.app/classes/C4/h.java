package C4;

public final class h
  extends v
{
  public static h a;
  
  public static h e()
  {
    try
    {
      if (a == null)
      {
        h localh1 = new C4/h;
        localh1.<init>();
        a = localh1;
      }
    }
    finally
    {
      break label37;
    }
    h localh2 = a;
    return localh2;
    label37:
    throw localh2;
  }
  
  public String a()
  {
    return "com.google.firebase.perf.NetworkEventCountForeground";
  }
  
  public String c()
  {
    return "fpr_rl_network_event_count_fg";
  }
  
  public Long d()
  {
    return Long.valueOf(700L);
  }
}

/* Location:
 * Qualified Name:     C4.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */