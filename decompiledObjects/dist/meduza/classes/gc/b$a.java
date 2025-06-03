package gc;

import java.util.Random;

public final class b$a
  extends ThreadLocal<Random>
{
  public final Object initialValue()
  {
    return new Random();
  }
}

/* Location:
 * Qualified Name:     gc.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */