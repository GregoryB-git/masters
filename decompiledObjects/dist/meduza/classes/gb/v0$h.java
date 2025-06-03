package gb;

import eb.s0.c;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;
import x6.b;

public final class v0$h
  implements s0.c<Long>
{
  public final String a(Serializable paramSerializable)
  {
    Object localObject = (Long)paramSerializable;
    TimeUnit localTimeUnit = TimeUnit.NANOSECONDS;
    if (((Long)localObject).longValue() >= 0L)
    {
      if (((Long)localObject).longValue() < 100000000L)
      {
        paramSerializable = new StringBuilder();
        paramSerializable.append(localObject);
        paramSerializable.append("n");
        paramSerializable = paramSerializable.toString();
      }
      else
      {
        if (((Long)localObject).longValue() < 100000000000L)
        {
          paramSerializable = new StringBuilder();
          paramSerializable.append(localTimeUnit.toMicros(((Long)localObject).longValue()));
          localObject = "u";
        }
        else if (((Long)localObject).longValue() < 100000000000000L)
        {
          paramSerializable = new StringBuilder();
          paramSerializable.append(localTimeUnit.toMillis(((Long)localObject).longValue()));
          localObject = "m";
        }
        else if (((Long)localObject).longValue() < 100000000000000000L)
        {
          paramSerializable = new StringBuilder();
          paramSerializable.append(localTimeUnit.toSeconds(((Long)localObject).longValue()));
          localObject = "S";
        }
        else if (((Long)localObject).longValue() < 6000000000000000000L)
        {
          paramSerializable = new StringBuilder();
          paramSerializable.append(localTimeUnit.toMinutes(((Long)localObject).longValue()));
          localObject = "M";
        }
        else
        {
          paramSerializable = new StringBuilder();
          paramSerializable.append(localTimeUnit.toHours(((Long)localObject).longValue()));
          localObject = "H";
        }
        paramSerializable.append((String)localObject);
        paramSerializable = paramSerializable.toString();
      }
      return paramSerializable;
    }
    throw new IllegalArgumentException("Timeout too small");
  }
  
  public final Object b(String paramString)
  {
    boolean bool;
    if (paramString.length() > 0) {
      bool = true;
    } else {
      bool = false;
    }
    b.s("empty timeout", bool);
    if (paramString.length() <= 9) {
      bool = true;
    } else {
      bool = false;
    }
    b.s("bad timeout format", bool);
    long l = Long.parseLong(paramString.substring(0, paramString.length() - 1));
    char c = paramString.charAt(paramString.length() - 1);
    if (c != 'H')
    {
      if (c != 'M')
      {
        if (c != 'S')
        {
          if (c != 'u')
          {
            if (c != 'm')
            {
              if (c == 'n') {
                return Long.valueOf(l);
              }
              throw new IllegalArgumentException(String.format("Invalid timeout unit: %s", new Object[] { Character.valueOf(c) }));
            }
            paramString = TimeUnit.MILLISECONDS;
          }
          else
          {
            paramString = TimeUnit.MICROSECONDS;
          }
        }
        else {
          paramString = TimeUnit.SECONDS;
        }
      }
      else {
        paramString = TimeUnit.MINUTES;
      }
    }
    else {
      paramString = TimeUnit.HOURS;
    }
    paramString = Long.valueOf(paramString.toNanos(l));
    return paramString;
  }
}

/* Location:
 * Qualified Name:     gb.v0.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */