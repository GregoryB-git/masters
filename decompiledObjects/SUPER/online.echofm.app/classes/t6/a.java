package t6;

import java.util.concurrent.CancellationException;
import s6.c;

public final class a
  extends CancellationException
{
  public final transient c o;
  
  public a(c paramc)
  {
    super("Flow was aborted, no more elements needed");
    o = paramc;
  }
  
  public Throwable fillInStackTrace()
  {
    setStackTrace(new StackTraceElement[0]);
    return this;
  }
}

/* Location:
 * Qualified Name:     t6.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */