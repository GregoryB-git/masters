package u6;

import X5.g;

public final class i
  extends RuntimeException
{
  public final transient g o;
  
  public i(g paramg)
  {
    o = paramg;
  }
  
  public Throwable fillInStackTrace()
  {
    setStackTrace(new StackTraceElement[0]);
    return this;
  }
  
  public String getLocalizedMessage()
  {
    return o.toString();
  }
}

/* Location:
 * Qualified Name:     u6.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */