package l4;

import j4.a;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

public class d$a
  implements a
{
  public d$a(d paramd) {}
  
  public String a(Object paramObject)
  {
    StringWriter localStringWriter = new StringWriter();
    try
    {
      b(paramObject, localStringWriter);
      return localStringWriter.toString();
    }
    catch (IOException paramObject)
    {
      for (;;) {}
    }
  }
  
  public void b(Object paramObject, Writer paramWriter)
  {
    paramWriter = new e(paramWriter, d.e(a), d.f(a), d.g(a), d.h(a));
    paramWriter.k(paramObject, false);
    paramWriter.u();
  }
}

/* Location:
 * Qualified Name:     l4.d.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */