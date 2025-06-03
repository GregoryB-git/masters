package sc;

import ub.h;

public final class f
  extends RuntimeException
{
  public final transient h a;
  
  public f(h paramh)
  {
    a = paramh;
  }
  
  public final Throwable fillInStackTrace()
  {
    setStackTrace(new StackTraceElement[0]);
    return this;
  }
  
  public final String getLocalizedMessage()
  {
    return a.toString();
  }
}

/* Location:
 * Qualified Name:     sc.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */