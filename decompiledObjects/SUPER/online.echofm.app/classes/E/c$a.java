package E;

import android.os.CancellationSignal;

public abstract class c$a
{
  public static void a(Object paramObject)
  {
    ((CancellationSignal)paramObject).cancel();
  }
  
  public static CancellationSignal b()
  {
    return new CancellationSignal();
  }
}

/* Location:
 * Qualified Name:     E.c.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */