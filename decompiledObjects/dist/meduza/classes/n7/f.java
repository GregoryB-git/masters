package n7;

import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

public class f
{
  public String a;
  
  public f(String paramString)
  {
    paramString.getClass();
    a = paramString;
  }
  
  public final void a(StringBuilder paramStringBuilder, Iterator paramIterator)
  {
    for (;;)
    {
      try
      {
        if (!paramIterator.hasNext()) {
          break;
        }
        localObject = paramIterator.next();
        Objects.requireNonNull(localObject);
        if ((localObject instanceof CharSequence)) {
          localObject = (CharSequence)localObject;
        }
      }
      catch (IOException paramStringBuilder)
      {
        break label73;
      }
      Object localObject = localObject.toString();
      paramStringBuilder.append((CharSequence)localObject);
      if (!paramIterator.hasNext()) {
        break;
      }
      paramStringBuilder.append(a);
    }
    return;
    label73:
    throw new AssertionError(paramStringBuilder);
  }
  
  public String b()
  {
    return a;
  }
}

/* Location:
 * Qualified Name:     n7.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */