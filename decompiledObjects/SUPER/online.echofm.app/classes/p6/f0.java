package p6;

import java.util.concurrent.CancellationException;

public abstract class f0
{
  public static final CancellationException a(String paramString, Throwable paramThrowable)
  {
    paramString = new CancellationException(paramString);
    paramString.initCause(paramThrowable);
    return paramString;
  }
}

/* Location:
 * Qualified Name:     p6.f0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */