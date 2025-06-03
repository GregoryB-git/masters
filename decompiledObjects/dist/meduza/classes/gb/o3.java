package gb;

import java.util.concurrent.TimeUnit;

public abstract interface o3
{
  public static final a a = new a();
  
  public abstract long a();
  
  public final class a
    implements o3
  {
    public final long a()
    {
      return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }
  }
}

/* Location:
 * Qualified Name:     gb.o3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */