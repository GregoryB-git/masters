package W2;

import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

public class h
{
  public final String a;
  
  public h(String paramString)
  {
    a = ((String)m.j(paramString));
  }
  
  public static h f(char paramChar)
  {
    return new h(String.valueOf(paramChar));
  }
  
  public static h g(String paramString)
  {
    return new h(paramString);
  }
  
  public Appendable a(Appendable paramAppendable, Iterator paramIterator)
  {
    m.j(paramAppendable);
    if (paramIterator.hasNext()) {
      for (;;)
      {
        paramAppendable.append(h(paramIterator.next()));
        if (!paramIterator.hasNext()) {
          break;
        }
        paramAppendable.append(a);
      }
    }
    return paramAppendable;
  }
  
  public final StringBuilder b(StringBuilder paramStringBuilder, Iterable paramIterable)
  {
    return c(paramStringBuilder, paramIterable.iterator());
  }
  
  public final StringBuilder c(StringBuilder paramStringBuilder, Iterator paramIterator)
  {
    try
    {
      a(paramStringBuilder, paramIterator);
      return paramStringBuilder;
    }
    catch (IOException paramStringBuilder)
    {
      throw new AssertionError(paramStringBuilder);
    }
  }
  
  public final String d(Iterable paramIterable)
  {
    return e(paramIterable.iterator());
  }
  
  public final String e(Iterator paramIterator)
  {
    return c(new StringBuilder(), paramIterator).toString();
  }
  
  public CharSequence h(Object paramObject)
  {
    Objects.requireNonNull(paramObject);
    if ((paramObject instanceof CharSequence)) {
      paramObject = (CharSequence)paramObject;
    } else {
      paramObject = paramObject.toString();
    }
    return (CharSequence)paramObject;
  }
}

/* Location:
 * Qualified Name:     W2.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */