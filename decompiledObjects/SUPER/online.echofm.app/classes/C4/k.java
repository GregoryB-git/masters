package C4;

public final class k
  extends v
{
  public static k a;
  
  public static k e()
  {
    try
    {
      if (a == null)
      {
        k localk1 = new C4/k;
        localk1.<init>();
        a = localk1;
      }
    }
    finally
    {
      break label37;
    }
    k localk2 = a;
    return localk2;
    label37:
    throw localk2;
  }
  
  public String a()
  {
    return "com.google.firebase.perf.SdkDisabledVersions";
  }
  
  public String c()
  {
    return "fpr_disabled_android_versions";
  }
  
  public String d()
  {
    return "";
  }
}

/* Location:
 * Qualified Name:     C4.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */