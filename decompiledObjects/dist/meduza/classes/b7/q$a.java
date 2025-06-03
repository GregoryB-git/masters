package b7;

import java.util.Locale;

public final class q$a
  extends Exception
{
  public q$a(int paramInt)
  {
    super(String.format(Locale.US, "Error code %d is not supported", new Object[] { Integer.valueOf(paramInt) }));
  }
}

/* Location:
 * Qualified Name:     b7.q.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */