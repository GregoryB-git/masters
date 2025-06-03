package w6;

import p6.M;

public final class k
  extends h
{
  public final Runnable q;
  
  public k(Runnable paramRunnable, long paramLong, i parami)
  {
    super(paramLong, parami);
    q = paramRunnable;
  }
  
  public void run()
  {
    try
    {
      q.run();
      return;
    }
    finally
    {
      p.a();
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Task[");
    localStringBuilder.append(M.a(q));
    localStringBuilder.append('@');
    localStringBuilder.append(M.b(q));
    localStringBuilder.append(", ");
    localStringBuilder.append(o);
    localStringBuilder.append(", ");
    localStringBuilder.append(p);
    localStringBuilder.append(']');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     w6.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */