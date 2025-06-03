package C4;

public final class o
  extends v
{
  public static o a;
  
  public static o e()
  {
    try
    {
      if (a == null)
      {
        o localo1 = new C4/o;
        localo1.<init>();
        a = localo1;
      }
    }
    finally
    {
      break label37;
    }
    o localo2 = a;
    return localo2;
    label37:
    throw localo2;
  }
  
  public String a()
  {
    return "com.google.firebase.perf.SessionsMaxDurationMinutes";
  }
  
  public String b()
  {
    return "sessions_max_length_minutes";
  }
  
  public String c()
  {
    return "fpr_session_max_duration_min";
  }
  
  public Long d()
  {
    return Long.valueOf(240L);
  }
}

/* Location:
 * Qualified Name:     C4.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */