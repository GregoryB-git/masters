package D6;

public abstract class e
{
  public static d a;
  public static long b;
  
  public static void a(d paramd)
  {
    if ((f == null) && (g == null))
    {
      if (d) {
        return;
      }
      label82:
      try
      {
        l = b;
        if (l + 8192L > 65536L) {
          return;
        }
      }
      finally
      {
        long l;
        break label82;
        b = l + 8192L;
        f = a;
        c = 0;
        b = 0;
        a = paramd;
        return;
      }
    }
    throw new IllegalArgumentException();
  }
  
  public static d b()
  {
    label53:
    try
    {
      d locald = a;
      if (locald != null)
      {
        a = f;
        f = null;
        b -= 8192L;
        return locald;
      }
    }
    finally
    {
      break label53;
      return new d();
    }
  }
}

/* Location:
 * Qualified Name:     D6.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */