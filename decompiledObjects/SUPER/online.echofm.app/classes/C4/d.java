package C4;

public final class d
  extends v
{
  public static d a;
  
  public static d e()
  {
    try
    {
      if (a == null)
      {
        d locald1 = new C4/d;
        locald1.<init>();
        a = locald1;
      }
    }
    finally
    {
      break label37;
    }
    d locald2 = a;
    return locald2;
    label37:
    throw locald2;
  }
  
  public String a()
  {
    return "com.google.firebase.perf.ExperimentTTID";
  }
  
  public String b()
  {
    return "experiment_app_start_ttid";
  }
  
  public String c()
  {
    return "fpr_experiment_app_start_ttid";
  }
  
  public Boolean d()
  {
    return Boolean.FALSE;
  }
}

/* Location:
 * Qualified Name:     C4.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */