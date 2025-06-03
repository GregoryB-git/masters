package A2;

public final class o
{
  public static o b;
  public static final p c = new p(0, false, false, 0, 0);
  public p a;
  
  public static o b()
  {
    try
    {
      if (b == null)
      {
        o localo1 = new A2/o;
        localo1.<init>();
        b = localo1;
      }
    }
    finally
    {
      break label37;
    }
    o localo2 = b;
    return localo2;
    label37:
    throw localo2;
  }
  
  public p a()
  {
    return a;
  }
  
  public final void c(p paramp)
  {
    if (paramp == null) {
      try
      {
        a = c;
        return;
      }
      finally
      {
        break label60;
      }
    }
    p localp = a;
    if (localp != null)
    {
      int i = localp.i();
      int j = paramp.i();
      if (i >= j) {
        return;
      }
    }
    a = paramp;
    return;
    label60:
    throw paramp;
  }
}

/* Location:
 * Qualified Name:     A2.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */