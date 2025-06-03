package C4;

public final class g
  extends v
{
  public static g a;
  
  public static g e()
  {
    try
    {
      if (a == null)
      {
        g localg1 = new C4/g;
        localg1.<init>();
        a = localg1;
      }
    }
    finally
    {
      break label37;
    }
    g localg2 = a;
    return localg2;
    label37:
    throw localg2;
  }
  
  public String a()
  {
    return "com.google.firebase.perf.NetworkEventCountBackground";
  }
  
  public String c()
  {
    return "fpr_rl_network_event_count_bg";
  }
  
  public Long d()
  {
    return Long.valueOf(70L);
  }
}

/* Location:
 * Qualified Name:     C4.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */