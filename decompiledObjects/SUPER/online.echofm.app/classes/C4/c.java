package C4;

public final class c
  extends v
{
  public static c a;
  
  public static c d()
  {
    try
    {
      if (a == null)
      {
        c localc1 = new C4/c;
        localc1.<init>();
        a = localc1;
      }
    }
    finally
    {
      break label37;
    }
    c localc2 = a;
    return localc2;
    label37:
    throw localc2;
  }
  
  public String a()
  {
    return "isEnabled";
  }
  
  public String b()
  {
    return "firebase_performance_collection_enabled";
  }
}

/* Location:
 * Qualified Name:     C4.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */