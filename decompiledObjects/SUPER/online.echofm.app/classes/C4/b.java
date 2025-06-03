package C4;

public final class b
  extends v
{
  public static b a;
  
  public static b e()
  {
    try
    {
      if (a == null)
      {
        b localb1 = new C4/b;
        localb1.<init>();
        a = localb1;
      }
    }
    finally
    {
      break label37;
    }
    b localb2 = a;
    return localb2;
    label37:
    throw localb2;
  }
  
  public String b()
  {
    return "firebase_performance_collection_deactivated";
  }
  
  public Boolean d()
  {
    return Boolean.FALSE;
  }
}

/* Location:
 * Qualified Name:     C4.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */