package tc;

import f;
import nc.g0;

public final class i
  extends g
{
  public final Runnable c;
  
  public i(Runnable paramRunnable, long paramLong, h paramh)
  {
    super(paramLong, paramh);
    c = paramRunnable;
  }
  
  public final void run()
  {
    try
    {
      c.run();
      return;
    }
    finally
    {
      b.a();
    }
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("Task[");
    localStringBuilder.append(c.getClass().getSimpleName());
    localStringBuilder.append('@');
    localStringBuilder.append(g0.b(c));
    localStringBuilder.append(", ");
    localStringBuilder.append(a);
    localStringBuilder.append(", ");
    localStringBuilder.append(b);
    localStringBuilder.append(']');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     tc.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */