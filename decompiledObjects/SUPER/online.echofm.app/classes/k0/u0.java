package k0;

public final class u0
  extends RuntimeException
{
  public final int o;
  
  public u0(int paramInt)
  {
    super(a(paramInt));
    o = paramInt;
  }
  
  public static String a(int paramInt)
  {
    if (paramInt != 1)
    {
      if (paramInt != 2)
      {
        if (paramInt != 3) {
          return "Undefined timeout.";
        }
        return "Detaching surface timed out.";
      }
      return "Setting foreground mode timed out.";
    }
    return "Player release timed out.";
  }
}

/* Location:
 * Qualified Name:     k0.u0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */