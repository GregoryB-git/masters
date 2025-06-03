package gb;

import eb.b0;
import eb.b0.a;
import eb.d;
import eb.f0;
import g;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import x6.b;

public final class p
{
  public static final Logger c = Logger.getLogger(d.class.getName());
  public final Object a = new Object();
  public final f0 b;
  
  public p(f0 paramf0, long paramLong, String paramString)
  {
    b.y(paramString, "description");
    b = paramf0;
    paramf0 = g.d(paramString, " created");
    b0.a locala = b0.a.a;
    paramString = Long.valueOf(paramLong);
    b.y(paramf0, "description");
    b.y(paramString, "timestampNanos");
    b(new b0(paramf0, locala, paramString.longValue(), null));
  }
  
  public static void a(f0 paramf0, Level paramLevel, String paramString)
  {
    Logger localLogger = c;
    if (localLogger.isLoggable(paramLevel))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("[");
      localStringBuilder.append(paramf0);
      localStringBuilder.append("] ");
      localStringBuilder.append(paramString);
      paramf0 = new LogRecord(paramLevel, localStringBuilder.toString());
      paramf0.setLoggerName(localLogger.getName());
      paramf0.setSourceClassName(localLogger.getName());
      paramf0.setSourceMethodName("log");
      localLogger.log(paramf0);
    }
  }
  
  public final void b(b0 paramb0)
  {
    int i = b.ordinal();
    Level localLevel;
    if (i != 2)
    {
      if (i != 3) {
        localLevel = Level.FINEST;
      } else {
        localLevel = Level.FINE;
      }
    }
    else {
      localLevel = Level.FINER;
    }
    synchronized (a)
    {
      a(b, localLevel, a);
    }
    throw paramb0;
  }
}

/* Location:
 * Qualified Name:     gb.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */