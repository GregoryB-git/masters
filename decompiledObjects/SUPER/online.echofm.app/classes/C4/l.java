package C4;

public final class l
  extends v
{
  public static l a;
  
  public static l e()
  {
    try
    {
      if (a == null)
      {
        l locall1 = new C4/l;
        locall1.<init>();
        a = locall1;
      }
    }
    finally
    {
      break label37;
    }
    l locall2 = a;
    return locall2;
    label37:
    throw locall2;
  }
  
  public String a()
  {
    return "com.google.firebase.perf.SdkEnabled";
  }
  
  public String c()
  {
    return "fpr_enabled";
  }
  
  public Boolean d()
  {
    return Boolean.TRUE;
  }
}

/* Location:
 * Qualified Name:     C4.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */